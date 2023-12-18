import java.util.*;

public class Main {
	private final static long MOD = (int)1e9 + 7;

	private static String s;
	private static int n;

	private static long[][] dp;
	private static boolean[] vis;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		s = in.next();
		vis = new boolean[n + 1];
		dp = new long[n + 1][n + 1];
		for (int i = 0; i <= n; ++i) {
			for (int j = 0; j <= n; ++j) dp[i][j] = -1;
		}
		long res = 0;
		for (int i = 1; i <= n; ++i) {
			vis[i] = true;
			res = (res + f(0, i)) % MOD;
			vis[i] = false;
		}
		System.out.println(res % MOD);
	}

	static long f(int idx, int ending) {
		if (idx == n - 1) {
			return dp[idx][ending] = 1;
		}

		if (dp[idx][ending] != -1) return dp[idx][ending];

		long ans = 0;
		for (int i = 1; i <= n; ++i) {
			if (!vis[i] && isValid(idx, ending, i)) {
				vis[i] = true;
				ans = (ans + f(idx + 1, i)) % MOD;
				vis[i] = false;
			}
		}
		return dp[idx][ending] = ans % MOD;
	}

	static boolean isValid(int i, int x, int y) {
		if (s.charAt(i) == '<') return x < y;
		return x > y;
	}
}