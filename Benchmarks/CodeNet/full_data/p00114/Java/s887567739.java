import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	class p {

		int a;

		int m;

		int freq;

		p(int a, int m) {

			this.a = a;

			this.m = m;

		}

		int freq(){

			if(freq!=0){

				return freq;

			}

			int k=a;

			for(int i = 1; ;i++){

				if(k%m == 1){

					freq = i;

					return i;

				}

				k*=a;

				k%=m;

			}

		}

	}



	void run() {

		for (;;) {

			p[] data = new p[3];

			BigInteger lcm = BigInteger.ONE;

			for (int i = 0; i < 3; i++) {

				int a = sc.nextInt();

				if(a==0) return;

				int m = sc.nextInt();

				data[i] = new p(a, m);

				

				lcm = BigInteger.valueOf(data[i].freq()).multiply(lcm).divide(BigInteger.valueOf(data[i].freq()).gcd(lcm));

			}

			System.out.println(lcm);

		}



	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}