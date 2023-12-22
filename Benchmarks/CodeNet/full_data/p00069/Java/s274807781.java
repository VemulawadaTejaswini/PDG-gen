import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run() {

		for (;;) {

			int n = Integer.valueOf(sc.nextLine());

			if (n == 0)

				break;

			int m = Integer.valueOf(sc.nextLine()) - 1;

			int g = Integer.valueOf(sc.nextLine()) - 1;

			int d = Integer.valueOf(sc.nextLine());

			int[][] map = new int[n][d + 1];

			boolean[][] nSwap = new boolean[n + 2][d + 1];

			for (int i = 0; i < n; i++)

				map[i][0] = i;

			for (int i = 1; i < d + 1; i++) {

				String buffer = sc.nextLine();

				for (int j = 0; j < n; j++)

					map[j][i] = map[j][i - 1];

				for (int j = 0; j < n - 1; j++) {

					if (buffer.charAt(j) == '1') {

						map[j][i] = map[j + 1][i - 1];

						map[j + 1][i] = map[j][i - 1];

						nSwap[j][i] = nSwap[j + 1][i] = nSwap[j + 2][i] = true;

					}

				}

			}

			if (map[m][d] == g) {

				System.out.println("0");

				continue;

			}

			boolean c = false;

			for (int i = 1; i < d + 1 && !c; i++) {

				for (int p = 0; p < n - 1 && !c; p++) {

					if (map[p][i] == g) {

						if (map[p + 1][i] == m && !nSwap[p+1][i]) {

							System.out.println(i+" "+(p+1));

							c=true;

							break;

						}

						continue;

					}

					if (map[p][i] == m) {

						if (map[p + 1][i] == g && !nSwap[p+1][i]) {

							System.out.println(i+" "+(p+1));

							c=true;

							break;

						}

						continue;

					}

				}

			}

			if (c)

				continue;

			System.out.println(1);

		}



	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}