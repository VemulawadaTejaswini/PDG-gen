

import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	int[][] inv;



	boolean isok(int i, int j) {

		return i >= 0 && i < 10 && j >= 0 && j < 10;

	}



	void setTrans(int d[], int p) { // only for size == 100

		int i = p / 10;

		int j = p % 10;

		Arrays.fill(d, 0);

		int[] di = { 0, 0, 0, 1, -1 };

		int[] dj = { 0, 1, -1, 0, 0 };

		for (int z = 0; z < 5; z++) {

			int ni = i + di[z];

			int nj = j + dj[z];

			if (!isok(ni, nj))

				continue;

			d[10 * ni + nj] = 1;

		}

	}



	void add(int[] to, int[] from) { // only for size==100

		for (int i = 0; i < to.length; i++) {

			to[i] = from[i] ^ to[i];

		}

	}



	void swap(int[] a, int[] b) {

		int piv;

		for (int i = 0; i < 100; i++) {

			piv = a[i];

			a[i] = b[i];

			b[i] = piv;

		}

	}



	void init() { // set inv[][]

		inv = new int[100][100];

		int[][] trans = new int[100][100];

		for (int i = 0; i < 100; i++) {

			setTrans(trans[i], i);



			inv[i][i] = 1;

		}

		for (int i = 0; i < 100; i++) {

			if (trans[i][i] == 0) {

				for (int j = i + 1; j < 100; j++) {

					if (trans[j][i] == 1) {

						swap(trans[i], trans[j]);

						swap(inv[i], inv[j]);

						break;

					}

				}

			}

			for (int j = i + 1; j < 100; j++) {

				if (trans[j][i] == 1) {

					add(trans[j], trans[i]); // ツ湘」ツ三ツ角ツ行ツ療アツ可サ

					add(inv[j], inv[i]);

				}

			}

		}

		for (int i = 0; i < 100; i++) {

			if (trans[99 - i][99 - i] == 0) {

				for (int j = i + 1; j < 100; j++) {

					if (trans[99 - j][99 - i] == 1) {

						swap(trans[99 - i], trans[99 - j]);

						swap(inv[99 - i], inv[99 - j]);

						break;

					}

				}

			}

			for (int j = i + 1; j < 100; j++) {

				if (trans[99 - j][99 - i] == 1) {

					add(trans[99 - j], trans[99 - i]); // ツ妥篠角ツ行ツ療アツ可サ

					add(inv[99 - j], inv[99 - i]);

				}

			}

		}

	}



	int[] ans(int in[]) {

		int[] ret = new int[100];

		for (int i = 0; i < 100; i++) {

			for (int j = 0; j < 100; j++) {

				ret[i] ^= inv[i][j] * in[j];

			}

		}

		return ret;

	}



	void run() {

		int n = sc.nextInt();

		init();

		for (int z = 0; z < n; z++) {

			int in[] = new int[100];

			for (int i = 0; i < 100; i++) {

				in[i] = sc.nextInt();

			}

			int ans[] = ans(in);

			for (int i = 0; i < 10; i++) {

				for (int j = 0; j < 10; j++) {

					if (j != 0) {

						System.out.print(" ");

					}

					System.out.print(ans[i * 10 + j]);

				}

				System.out.println();

			}

		}



	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}