import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	class b {

		int i;

		int j;



		b(int a, int c) {

			i = a;

			j = c;

		}



		boolean reachable(b o) {

			return this.i == o.i || this.j == o.j;

		}

	}



	void run() {

		for (;;) {

			int w = sc.nextInt();

			int h = sc.nextInt();

			if ((h | w) == 0) {

				break;

			}

			LinkedList<b> list = new LinkedList<Main.b>();

			b start = null;

			int[][] map = new int[h][w];

			int id = 1;

			for (int i = 0; i < h; i++) {

				for (int j = 0; j < w; j++) {

					map[i][j] = -1;

					int z = sc.nextInt();

					if (z == 1) {

						list.addLast(new b(i, j));

						map[i][j] = id;

						id++;

					}

					if (z == 2) {

						start = new b(i, j);

						list.addFirst(start);

						map[i][j] = 0;

					}

				}

			}

			int n = list.size();

			long dp[][] = new long[1 << n][n];

			boolean[][] reachableS = new boolean[n][n];

			int[][] reachableP = new int[n][n];



			for (int i = 0; i < h; i++) {

				for (int j = 0; j < w; j++) {

					if (map[i][j] != -1) {

						int dst = map[i][j];

						int rP = 0;

						for (int k = j + 1; k < w; k++) {

							if (map[i][k] != -1) {

								int dpt = map[i][k];

								reachableS[dpt][dst] = true;

								reachableS[dst][dpt] = true;

								reachableP[dpt][dst] = rP;

								reachableP[dst][dpt] = rP;

								rP |= (1 << map[i][k]);

							}

						}

					}

				}

			}

			for (int j = 0; j < w; j++) {

				for (int i = 0; i < h; i++) {

					if (map[i][j] != -1) {

						int dst = map[i][j];

						int rP = 0;

						for (int k = i + 1; k < h; k++) {

							if (map[k][j] != -1) {

								int dpt = map[k][j];

								reachableS[dpt][dst] = true;

								reachableS[dst][dpt] = true;

								reachableP[dpt][dst] = rP;

								reachableP[dst][dpt] = rP;

								rP |= (1 << map[k][j]);

							}

						}

					}

				}

			}



			dp[0][0] = 1;

			for (int i = 0; i < 1 << n; i++) {

				for (int j = 0; j < n; j++) {

					int sh = (1 << j);

					if ((i & sh) == 0)

						continue;

					int sum = 0;

					for (int k = 0; k < n; k++) {

						// System.out.println(i+" "+(i^sh)+" "+j+" ,"+k+" reachable = "+reachable[j][k]+" "+dp[i^sh][k]);

						if (!reachableS[j][k])

							continue;

						if ((reachableP[j][k] & i) != 0)

							continue;



						sum += dp[i ^ sh][k];

					}

					dp[i][j] = sum;

				}

				// System.out.printf("%o"+Arrays.toString(dp[i])+"\n",i);

			}



			System.out.println(dp[(1 << n) - 1][0]);

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}