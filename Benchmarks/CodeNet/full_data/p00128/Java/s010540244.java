

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	char[][] chm = new char[8][5];



	void run() {

		for (boolean first = true; sc.hasNextInt(); first = false) {

			if (!first) {

				System.out.println();

			}



			for (int i = 0; i < 8; i++) {

				Arrays.fill(chm[i], '*');

			}

			Arrays.fill(chm[2], '=');



			int d = sc.nextInt();

			for (int i = 0; i < 5; i++) {

				int m = d % 5;

				chm[3 + m][4 - i] = ' ';

				int m2 = (d %10)/ 5;

				chm[m2][4 - i] = ' ';

				d /= 10;

			}

			for (int i = 0; i < 8; i++) {

				System.out.println(new String(chm[i]));

			}

		}



	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}