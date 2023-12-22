import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	void run(){

		for(;;){

			

			int n = sc.nextInt();

			if(n == 0)break;

			char[] map = new char[256];

			for(int i = 0; i < 256; i++){

				map[i] = (char) i;

			}

			for(int i = 0; i < n; i++){

				map[sc.next().charAt(0)] = sc.next().charAt(0);

			}

			long m  = sc.nextLong();

			String ret = "";

			for(long i = 0; i < m; i++){

				ret += map[sc.next().charAt(0)];

			}

			

			System.out.println(ret);

			

		}

		

	}

	public static void main(String[] args){

		Main m = new Main();

		m.run();

	}

}