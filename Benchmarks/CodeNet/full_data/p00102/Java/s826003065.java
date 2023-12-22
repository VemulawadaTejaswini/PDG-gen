import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run() {

		for (;;) {

			int n = sc.nextInt();

			if(n==0) break;

			int[] sum = new int[n + 1];

			for (int i = 0; i < n; i++) {

				int sum2 = 0;

				for (int j = 0; j < n; j++) {

					int in = sc.nextInt();

					sum[j] += in;

					sum[n] += in;

					sum2 += in;

					System.out.printf("%5d", in);

				}

				System.out.printf("%5d\n", sum2);

			}

			for (int i = 0; i < n + 1; i++) {

				System.out.printf("%5d", sum[i]);

			}

			System.out.println();



		}



	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}