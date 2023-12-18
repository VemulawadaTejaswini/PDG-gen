
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.LinkedList;

public class Main {
	public class pair implements Comparable<pair> {
		int wt;
		int val;
		double rat;

		pair(int a, int v) {
			wt = a;
			val = v;
			rat = v / wt;
		}

		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return (int) (this.rat - o.rat);
		}

	}

	public static long mod = (long) (1e9 + 7);

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		String s[] = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = scn.next();
		}
		long dp[][] = new long[n][m];
		for (int j = m - 1; j >= 0; j--) {
			if (s[n - 1].charAt(j) == '.') {
				if (j < m - 1 && dp[n - 1][j + 1] == -1) {
					dp[n - 1][j] = -1;
				} else {
					dp[n - 1][j] = 1;
				}
			} else {
				dp[n - 1][j] = -1;
			}
		}
		for (int j = n - 1; j >= 0; j--) {
			if (s[j].charAt(m - 1) == '.') {
				if (j < n - 1 && dp[j + 1][m - 1] == -1) {
					dp[j][m - 1] = -1;
				} else {
					dp[j][m - 1] = 1;
				}
			} else {
				dp[j][m - 1] = -1;
			}
		}
		for (int i = n - 2; i >= 0; i--) {
			for (int j = m - 2; j >= 0; j--) {
				if (s[i].charAt(j) == '.') {
					dp[i][j] = ((dp[i + 1][j] > 0 ? dp[i + 1][j] : 0) + (dp[i][j + 1] > 0 ? dp[i][j+1] : 0)) % mod;
				} else {
					dp[i][j] = -1;
				}
			}
		}
		System.out.println(dp[0][0]);

	}

	private static int dfs(int sr, HashSet<Integer> hset, int[] dp, ArrayList<Integer>[] g) {
		if (hset.contains(sr)) {
			return dp[sr];
		}
		hset.add(sr);
		int res = -1;
		for (int nei : g[sr]) {
			res = Math.max(res, dfs(nei, hset, dp, g));
		}
		dp[sr] = Math.max(dp[sr], res + 1);
		return dp[sr];

	}

}