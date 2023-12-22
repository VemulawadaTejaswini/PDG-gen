package com.hiroki;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while(true){
			Dice dice = new Dice();
			int sum = dice.roll("None");
			String n = scan.next();

			if(Integer.parseInt(n) == 0) break;

			for(int i = 0; i < Integer.parseInt(n); i ++){
				sum += dice.roll(scan.next());
			}

			System.out.println(sum);
		}

		scan.close();
	}
}

class Dice {
	HashMap<String, Integer> dc = new HashMap<String, Integer>();

	Dice(){
		dc.put("TOP", 1);
		dc.put("E", 3);
		dc.put("N", 5);
		dc.put("W", 4);
		dc.put("S", 2);
		dc.put("BTM", 6);
	}

	public int roll(String direction) {
		switch (direction) {
			case "None":
				break;
			case "North":
				dc.put("TOP", dc.put("S", dc.put("BTM", dc.put("N", dc.get("TOP"))))); break;
			case "East":
				dc.put("TOP", dc.put("W", dc.put("BTM", dc.put("E", dc.get("TOP"))))); break;
			case "West":
				dc.put("TOP", dc.put("E", dc.put("BTM", dc.put("W", dc.get("TOP"))))); break;
			case "South":
				dc.put("TOP", dc.put("N", dc.put("BTM", dc.put("S", dc.get("TOP"))))); break;
			case "Right":
				dc.put("S", dc.put("E", dc.put("N", dc.put("W", dc.get("S"))))); break;
			case "Left":
				dc.put("S", dc.put("W", dc.put("N", dc.put("E", dc.get("S"))))); break;
			default:
				return -1;
		}
		return dc.get("TOP");
	}
}