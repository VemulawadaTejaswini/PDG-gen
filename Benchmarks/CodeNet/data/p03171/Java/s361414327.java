import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n;
	static int[] a;
	static long[][][] dp;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		dp = new long[2][n][n];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < n; j++) {
				Arrays.fill(dp[i][j], Long.MIN_VALUE);
			}
		}
		System.out.println(dfs(0, 0, n - 1));
	}

	static long dfs(int t, int l, int r) {
		if (dp[t][l][r] != Long.MIN_VALUE) {
			return dp[t][l][r];
		}
		if (t == 0) {
			if (l == r) {
				return dp[t][l][r] = a[l];
			}
			long ret = Long.MIN_VALUE;
			ret = Math.max(ret, dfs(1, l + 1, r) + a[l]);
			ret = Math.max(ret, dfs(1, l, r - 1) + a[r]);
			return dp[t][l][r] = ret;
		} else {
			if (l == r) {
				return dp[t][l][r] = -a[l];
			}
			long ret = Long.MAX_VALUE;
			ret = Math.min(ret, dfs(0, l + 1, r) - a[l]);
			ret = Math.min(ret, dfs(0, l, r - 1) - a[r]);
			return dp[t][l][r] = ret;
		}
	}
}
