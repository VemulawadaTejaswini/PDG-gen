import java.io.*;
import java.util.*;

class Main {
	static final int M = 1000000007;

	private static long[][] dp;
	private static List<Integer>[] g;

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new long[n][2];
		g = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			g[i] = new ArrayList<>();
		}

		for (int i = 0; i < n - 1; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			g[x].add(y);
			g[y].add(x);
		}

		dfs(0, -1);
		System.out.println((dp[0][0] + dp[0][1]) % M);
	}

	private static void dfs(int v, int p) {
		dp[v][0] = dp[v][1] = 1;
		for (int c : g[v]) {
			if (c == p) continue;
			dfs(c, v);
			dp[v][0] = dp[v][0] * ((dp[c][0] + dp[c][1]) % M) % M;
			dp[v][1] = dp[v][1] * dp[c][0] % M;
		}
	}
}
