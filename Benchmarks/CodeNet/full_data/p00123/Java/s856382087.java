

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	/*

	 * AAA 35b50 1ª11b00 AA 37b50 1ª17b00 A 40b00 1ª23b00 B 43b00 1ª29b00 C

	 * 50b00 1ª45b00 D 55b00 1ª56b00 E 1ª10b00 2ª28b00

	 */

	double[] s = { 35.50, 37.50, 40, 43, 50, 55, 70 ,Double.MAX_VALUE};

	double[] l = { 71, 77, 93, 99, 105, 116, 148 ,Double.MAX_VALUE};

	String[] gm = {"AAA","AA","A","B","C","D","E","NA"};

	void run() {

		for (; sc.hasNextDouble();) {

			double ts = sc.nextDouble();

			double tl = sc.nextDouble();

			int gs = 0;

			int gl = 0;

			for(;s[gs] <= ts;gs++);

			for(;l[gl] <= tl;gl++);

//			System.out.println(gs+","+gl);

			int g = Math.max(gs, gl);

			System.out.println(gm[g]);

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}