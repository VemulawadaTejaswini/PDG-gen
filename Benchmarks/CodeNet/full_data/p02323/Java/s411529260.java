
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskX solver = new TaskX();
		solver.solve(1, in, out);
		out.close();
	}

	static int INF = 1 << 20;
	static int MOD = 1000000007;
	static int[] mh4 = { 0, -1, 1, 0 };
	static int[] mw4 = { -1, 0, 0, 1 };
	static int[] mh8 = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] mw8 = { -1, 0, 1, -1, 1, -1, 0, 1 };

	static int n, e;
	static int[][] dest, dp;

	static class TaskX {
		public void solve(int testNumber, InputReader in, PrintWriter out) {

			n = in.nextInt(); e = in.nextInt();
			dest = new int[n][n];
			dp = new int[1 << n][n];

			for (int i = 0; i < n; i++) {
				Arrays.fill(dest[i], INF);
			}
			for (int i = 0; i < (1 << n); i++) {
				Arrays.fill(dp[i], -1);
			}

			for (int i = 0; i < e; i++) {
				int s = in.nextInt(), t = in.nextInt(), d = in.nextInt();
				dest[s][t] = d;
			}

			int ans = rec(0, 0);
			out.println(ans == INF ? -1 : ans);
		}

		/**
		 *
		 * @param S:すでに訪問した頂点の集合
		 * @param v:現在の頂点
		 *
		 * */
		int rec(int S, int v) {

			// すでに同じ状態になったことがある場合
			if (dp[S][v] >= 0) {
				return dp[S][v];
			}

			// すべての頂点を訪問して、最初の位置0に戻ってきた場合
			if (S == (1 << n) -1 && v == 0) {
				return dp[S][v] = 0;
			}

			// すべての頂点を訪問したが、最初の位置0にいない場合はINFになる
			int res = INF;

			// 次に訪問する頂点 u
			for (int u = 0; u < n; u++) {
				if (((S >> u) & 1) == 0 && dest[v][u] != INF) {
					res = Math.min(res, rec(S | (1 << u), u) + dest[v][u]);
				}
			}

			return dp[S][v] = res;
		}
	}


	static class InputReader {
		BufferedReader in;
		StringTokenizer tok;

		public String nextString() {
			while (!tok.hasMoreTokens()) {
				try {
					tok = new StringTokenizer(in.readLine(), " ");
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			return tok.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextString());
		}

		public long nextLong() {
			return Long.parseLong(nextString());
		}

		public double nextDouble() {
			return Double.parseDouble(nextString());
		}

		public int[] nextIntArray(int n) {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextInt();
			}
			return res;
		}

		public long[] nextLongArray(int n) {
			long[] res = new long[n];
			for (int i = 0; i < n; i++) {
				res[i] = nextLong();
			}
			return res;
		}

		public InputReader(InputStream inputStream) {
			in = new BufferedReader(new InputStreamReader(inputStream));
			tok = new StringTokenizer("");
		}
	}

	static void print(int[][] dp) {
		int n = dp.length;
		int m = dp[0].length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}

}

