import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static int[][] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int z = sc.nextInt();
		int w = sc.nextInt();

		int[] a = new int[n + 1];
		a[0] = w;
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}

		dp = new int[n + 1][n + 1];
		for (int i = 0; i <= n; i++) {
			Arrays.fill(dp[i], -1);
		}

		int score = -1;
		for (int i = n; i > 0; i--) {
			int t = dfs(i, 0, a);
			if (t > score) score = t;
		}

		System.out.println(score);
	}

	private static int dfs(int i, int j, int[] a) {
		if (dp[i][j] >= 0) return dp[i][j];

		if (i >= a.length - 1 || j >= a.length - 1) {
			dp[i][j] = Math.abs(a[i] - a[j]);
			return dp[i][j];
		}

		int score;
		if (i < j) {
			score = Integer.MIN_VALUE;

			for (int k = j + 1; k < a.length; k++) {
				score = Math.max(score, dfs(k, j, a));
			}

		} else {
			score = Integer.MAX_VALUE;

			for (int k = j + 1; k < a.length; k++) {
				score = Math.min(score, dfs(i, k, a));
			}
		}

		dp[i][j] = score;
		return dp[i][j];
	}
}
