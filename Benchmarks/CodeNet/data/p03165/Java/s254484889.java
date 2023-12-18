
import java.util.*;
import java.io.*;

public class Main{
	static char[] x, y, ans;
	static int[][] dp;

	public static void trace(int i, int j, int k) {
		if (k == 0) {
			return;
		}
		if (x[i - 1] == y[j - 1]) {
			ans[k-1] = x[i - 1];
			trace(i - 1, j - 1, k - 1);
		} else if (dp[i - 1][j] > dp[i][j - 1]) {
			trace(i - 1, j, k);
		} else {
			trace(i, j - 1, k);
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		x = sc.next().toCharArray();
		y = sc.next().toCharArray();
		dp = new int[x.length + 1][y.length + 1];
		int i;
		int j = 0;
		for (i = 0; i <= x.length; i++) {
			for (j = 0; j <= y.length; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = 0;
				} else if (x[i - 1] == y[j - 1]) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		int k = dp[i-1][j-1];
		ans = new char[k];
		trace(x.length, y.length, k);
		for (int k2 = 0; k2 < k; k2++) {
			pw.print(ans[k2]);
		}
		pw.close();
	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	}
}
