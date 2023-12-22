//package _0136;



import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		int[] dp = new int[6];

		int n = sc.nextInt();

		for(int i = 0 ; i < n;i++){

			double value = sc.nextDouble();

			int grade = (int)(value-160)/5;

			grade = Math.max(0, grade);

			grade = Math.min(grade,5);

			dp[grade]++;

		}

		for(int i=0; i < 6; i++){

			System.out.print((i+1)+":");

			for(int j = 0; j < dp[i]; j++){

				System.out.print("*");

			}

			System.out.println();

		}

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}