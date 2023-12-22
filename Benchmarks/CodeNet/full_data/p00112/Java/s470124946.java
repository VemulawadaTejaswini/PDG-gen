import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		for(;;){

			int n= sc.nextInt();

			if(n==0)break;

			int[] a = new int[n];

			int[] p = new int[n];

			int k = 0;

			for(;n --> 0;){

				a[n] = sc.nextInt();

				p[n] = k;

				k++;

			}

			Arrays.sort(a);

			long sum = 0;

			for(int i=0;i<a.length;i++){

				sum += a[i]*p[i];

			}

			System.out.println(sum);

		}

		

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}