//package manju;

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double d = scan.nextDouble();
		double t = scan.nextDouble();
		double s = scan.nextDouble();
		if(d/s <= t) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}
}
