package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double min = Integer.MAX_VALUE;
		double max = Integer.MIN_VALUE;
		while(sc.hasNext()){
			double x = sc.nextDouble();
			min = Math.min(min, x);
			max = Math.max(max, x);
		}
		System.out.println(max-min);
	}

}