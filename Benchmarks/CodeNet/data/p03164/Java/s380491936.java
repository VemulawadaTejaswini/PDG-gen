import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static class Reader {
		BufferedReader br;
		StringTokenizer st;

		public Reader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	static int[][] wv;
	static long[][] dp;
	public static void main(String[] args) {
		Reader r = new Reader();

		int n = r.nextInt();
		int w = r.nextInt();
		wv = new int[n][2];
		for (int i = 0; i < n; i++) {
			wv[i][0] = r.nextInt();
			wv[i][1] = r.nextInt();
		}
		dp = new long[n][w + 1];
		for (int i = 0; i < n; i++) {
			Arrays.fill(dp[i], -1);
		}

		System.out.println(recur(n, w));
	}

	static long recur(int n, int w) {
		if (n == 0 || w == 0) {
			return 0; 
		} else if (dp[n - 1][w] == -1) {
			if (wv[n - 1][0] > w) {
				dp[n - 1][w] = recur(n - 1, w); 
			} else {
				dp[n - 1][w] = Long.max(wv[n - 1][1] + recur(n - 1, w - wv[n - 1][0]), recur(n - 1, w));
			}
		}
		return dp[n - 1][w];
	}
}
