import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int n;
	static int[] a;
	static long[] b;
	static long[][] dp;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		b = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			b[i] = b[i - 1] + a[i];
		}

		dp = new long[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			Arrays.fill(dp[i], Long.MAX_VALUE);
		}
		System.out.println(dfs(1, n));
	}

	static long dfs(int l, int r) {
		if (dp[l][r] < Long.MAX_VALUE) {
			return dp[l][r];
		}
		if (l == r) {
			return dp[l][r] = 0;
		}

		long sum = b[r] - b[l - 1];
		long ret = Long.MAX_VALUE;
		for (int i = l; i < r; i++) {
			long s1 = dfs(l, i);
			long s2 = dfs(i + 1, r);
			long val = s1 + s2 + sum;
			ret = Math.min(ret, val);
		}
		return dp[l][r] = ret;
	}
}
