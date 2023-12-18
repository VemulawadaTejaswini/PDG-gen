import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();
		int[] r = new int[R];
		for (int i = 0; i < R; i++) {
			r[i] = sc.nextInt() - 1;
		}

		long[][] d = new long[N][N];
		for (int i = 0; i < N; i++) {
			Arrays.fill(d[i], 200000002L);
		}

		for (int i = 0; i < M; i++) {
			int a = sc.nextInt() - 1, b = sc.nextInt() - 1;
			int c = sc.nextInt();
			d[a][b] = d[b][a] = c;
		}

		for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
				}
			}
		}

		long[][] dp = new long[(1 << R)][N];
		for (int i = 0; i < (1 << R); i++) {
			Arrays.fill(dp[i], 200000002L);
		}

		for (int i = 0; i < R; i++) {
			dp[1 << i][r[i]] = 0;
		}

		for (int i = 0; i < (1 << R); i++) {
			for (int j = 0; j < R; j++) {
				if (((1 << j) & i) > 0) continue;
				for (int k = 0; k < N; k++) {
					dp[i | (1 << j)][r[j]] = Math.min(dp[i | (1 << j)][r[j]], dp[i][k] + d[k][r[j]]);
				}
			}
		}

		long a = Long.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			a = Math.min(a, dp[(1 << R) - 1][i]);
		}

		System.out.println(a);
	}
}
