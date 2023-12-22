import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		for(;sc.hasNextInt();){

			int a = sc.nextInt();

			int b = sc.nextInt();

			int n = sc.nextInt();

			a = a%b;

			int sum=0;

			for(int i=0;i<n;i++){

				sum+=a*10/b;

				a = a*10%b;

			}

			System.out.println(sum);

		}

		

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

		

	}

}