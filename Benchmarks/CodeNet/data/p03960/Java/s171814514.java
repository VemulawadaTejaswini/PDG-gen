import java.util.*;
import java.io.*;

public class Main {

	void solve() {
		int n = in.nextInt(), m = in.nextInt();
		char[][] a = new char[n][m];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextToken().toCharArray();
		}

		int[][][] cost = new int[m][n + 1][n + 1];
		for (int i = 0; i + 1 < m; i++) {
			for (int s1 = n; s1 >= 0; s1--) {
				for (int s2 = n; s2 >= 0; s2--) {
					int pos1 = n - s1 - 1;
					int pos2 = n - s2 - 1;
					if (pos1 >= 0 && pos2 >= 0 && a[pos1][i] == a[pos2][i + 1]) {
						cost[i][s1][s2]++;
					}
					if (s1 + 1 <= n && s2 + 1 <= n) {
						cost[i][s1][s2] += cost[i][s1 + 1][s2 + 1];
					}
				}
			}
		}

		int result = 0;
		for (int I = 0; I + 1 < m; I++) {
			int[][] cst = cost[I];
			int INF = Integer.MAX_VALUE / 4;
			int[][] dp = new int[n + 1][n + 1];
			for (int[] i : dp) {
				Arrays.fill(i, INF);
			}

			dp[n][n] = 0;
			for (int i = n; i >= 0; i--) {
				for (int j = n; j >= 0; j--) {
					if (i < n) {
						int val = dp[i + 1][j] + cst[i][j];
						dp[i][j] = Math.min(dp[i][j], val);
					}
					if (j < n) {
						int val = dp[i][j + 1] + cst[i][j];
						dp[i][j] = Math.min(dp[i][j], val);
					}
				}
			}
			result += dp[0][0];
		}
		out.println(result);
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
