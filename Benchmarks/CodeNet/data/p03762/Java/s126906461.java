import java.util.*;

public class Main {

	private static final long MOD = 100_000_000_7;

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		long[] x = new long[N];
		long[] y = new long[M];

		for (int i = 0; i < N; i++) {
			x[i] = sc.nextLong();
		}

		for (int i = 0; i < M; i++) {
			y[i] = sc.nextLong();
		}
		// bruteForce(x, y);

		long xSum = 0;

		for (int i = 0; i < N; i++) {
			xSum = (xSum + i * x[i] - (N - i - 1) * x[i]) % MOD;
		}

		long ySum = 0;
		for (int j = 0; j < M; j++) {
			ySum = (ySum + j * y[j] - (M - j - 1) * y[j]) % MOD;
		}
		System.out.println((xSum * ySum) % MOD);
		// System.out.println(area(x, y, 0, x.length - 1, 0, y.length - 1));
		sc.close();

	}

	private void bruteForce(long[] x, long[] y) {
		int n = x.length;
		int m = y.length;
//		int[][] count = new int[n][m];
		long S = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = 0; k < m; k++) {
					for (int l = k + 1; l < m; l++) {

						/*
						 * for (int a = i; a < j; a++) { for (int b = k; b < l; b++) { count[a][b]++; }
						 * }
						 */
						S = (S + (x[j] - x[i]) * (y[l] - y[k])) % MOD;
					}
				}
			}
		}

		/*
		 * for (int j = m - 1; j >= 0; j--) { for (int i = 0; i < n; i++) {
		 * System.out.print(count[i][j] + " "); } System.out.println(); }
		 */
		System.out.println(S);
	}
}