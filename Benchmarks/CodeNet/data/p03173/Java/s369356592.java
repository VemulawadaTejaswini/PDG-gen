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
		if (l + 1 == r) {
			return dp[l][r] = a[l] + a[r];
		}

		long ret = b[r] - b[l - 1] + dfs(l + 1, r);
		for (int i = l + 1; i < r; i++) {
			long vl = dfs(l, i - 1);
			long vr = dfs(i + 1, r);
			long v1 = b[i] - b[l - 1];
			long v2 = b[r] - b[i - 1];
			long val = Math.min(v1, v2) + vl + vr + b[r] - b[l - 1];
			ret = Math.min(ret, val);
		}
		long v = b[r] - b[l - 1] + dfs(l, r - 1);
		ret = Math.min(ret, v);
		return dp[l][r] = ret;
	}
}
