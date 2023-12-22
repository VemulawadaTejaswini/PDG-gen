

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		long sum = 0;

		int num = sc.nextInt();

		for(int i = 0;i<num;i++){

			sum += sc.nextInt();

		}

		System.out.println(sum/num);

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}