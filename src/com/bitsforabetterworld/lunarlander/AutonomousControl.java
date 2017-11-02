package com.bitsforabetterworld.lunarlander;

import java.util.EnumSet;

public class AutonomousControl implements Control {
	public EnumSet<Command> getCommand(Position position, Velocity velocity) {
		Command thrustCommand = Command.None;
		Command rotateCommand = Command.None;
		
		// TODO: write code to decide if we should thrust (by setting thrustCommand = Command.Thrust) or
		// turn on the rotation motors (by settings rotateCommand = Command.RollClockwise 
		// or Command.RollCounterclockwise)
		//
		// Use the Position and Velocity of the lander to decide what action (if any) to take.
		//
		// The goal is to have a successful landing, which means that your lander gets to a Y position of 0
		// with the following requirements:
		//
		// - Vertical velocity (dy) less than 8 m/s
		// - Horizontal velocity (dx) between -5 and 5 m/s
		// - Angle (theta) between -0.3 and 0.3 radians
		// - Change in angle (dtheta) between -0.2 and 0.2 radians/second
		
		return EnumSet.of(thrustCommand, rotateCommand);
	}
}
