import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			if (N == 0) break;
			int[][] x = new int[N + 2][];
			x[0] = new int[] { 0 };
			x[N + 1] = new int[] { 0 };
			int[][] d = new int[N + 2][];
			d[0] = new int[] { 0 };
			d[N + 1] = new int[] { 0 };
			for (int i = 0; i < N; ++i) {
				int k = sc.nextInt();
				x[i + 1] = new int[k];
				d[i + 1] = new int[k];
				for (int j = 0; j < k; ++j) {
					x[i + 1][j] = sc.nextInt();
					d[i + 1][j] = sc.nextInt();
				}
			}
			int[][][] dp = new int[N + 2][M + 1][];
			for (int i = 0; i < N + 2; ++i) {
				for (int j = 0; j < M + 1; ++j) {
					dp[i][j] = new int[x[i].length];
					Arrays.fill(dp[i][j], Integer.MAX_VALUE);
				}
			}
			dp[0][0][0] = 0;
			for (int i = 0; i < N + 1; ++i) {
				for (int j = 0; j <= M; ++j) {
					for (int k = 0; k < dp[i][j].length; ++k) {
						if (dp[i][j][k] == Integer.MAX_VALUE) continue;
						for (int l = 0; l < dp[i + 1][j].length; ++l) {
							int nv = dp[i][j][k];
							if (i != 0 && i != N) nv += (d[i][k] + d[i + 1][l]) * Math.abs(x[i][k] - x[i + 1][l]);
							dp[i + 1][j][l] = Math.min(dp[i + 1][j][l], nv);
						}
						if (i < N && j < M) {
							for (int l = 0; l < dp[i + 2][j + 1].length; ++l) {
								int nv = dp[i][j][k];
								if (i != 0 && i != N - 1) nv += (d[i][k] + d[i + 2][l]) * Math.abs(x[i][k] - x[i + 2][l]);
								dp[i + 2][j + 1][l] = Math.min(dp[i + 2][j + 1][l], nv);
							}
						}
					}
				}
			}
			int ans = Integer.MAX_VALUE;
			for (int i = 0; i <= M; ++i) {
				ans = Math.min(dp[N + 1][i][0], ans);
			}
			System.out.println(ans);
		}
	}
}