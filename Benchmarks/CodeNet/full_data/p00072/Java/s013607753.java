import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run() {

		for (;;) {

			int n = sc.nextInt();

			if (n == 0)

				break;

			int m = sc.nextInt();

			int[][] cost = new int[n][n];

			for (int i = 0; i < n; i++) {

				Arrays.fill(cost[i], Integer.MAX_VALUE);

			}

			for (int i = 0; i < m; i++) {

				String buffer;

				for (buffer = sc.nextLine(); buffer.length() == 0; buffer = sc

						.nextLine())

					;

				Scanner in = new Scanner(buffer.replace(',', ' '));

				int from = in.nextInt();

				int to = in.nextInt();

				int c = in.nextInt() / 100 - 1;

				cost[from][to] = cost[to][from] = Math.min(c, cost[from][to]);

			}

			boolean[] end = new boolean[n];

			end[0] = true;

			int sum =0;

			for (;;) {

				int un = 0;

				int min = Integer.MAX_VALUE;

				int mini = 0;

				int minj = 0;

				for (int i = 0; i < n; i++) {

					if (end[i])

						continue;

					un++;

					for (int j = 0; j < n; j++) {

						if (!end[j])

							continue;

						if(min > cost[i][j]){

							mini=i;

							minj=j;

							min = cost[i][j];

						}

					}

				}

				if (un == 0)

					break;

				sum += min;

				end[mini] = true;

			}

			System.out.println(sum);

		}



	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}