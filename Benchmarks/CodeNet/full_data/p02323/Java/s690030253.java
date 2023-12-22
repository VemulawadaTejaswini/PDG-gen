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

	static int INF = 1 << 26;
	static long LINF = 1L << 55;
	static int MOD = 1000000007;
	static int[] mh4 = { 0, -1, 1, 0 };
	static int[] mw4 = { -1, 0, 0, 1 };
	static int[] mh8 = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] mw8 = { -1, 0, 1, -1, 1, -1, 0, 1 };

	static class TaskX {

		public void solve(int testNumber, InputReader in, PrintWriter out) {

			int v = in.nextInt(), e = in.nextInt();
			int[][] mat = new int[v][v];
			for (int i = 0; i < v; i++) {
				Arrays.fill(mat[i], -1);
			}

			for (int i = 0; i < e; i++) {
				int s = in.nextInt(), t = in.nextInt(), d = in.nextInt();
				mat[s][t] = d;
			}

			int[][] dp = new int[1 << v][v];
			for (int i = 0; i < 1 << v; i++) {
				Arrays.fill(dp[i], INF);
			}
			dp[0][0] = 0;

			for (int s = 0; s < 1<<v; s++) {
				for (int now = 0; now < v; now++) {
					for (int to = 0; to < v; to++) {
						if ((s >> to & 1) == 0 && mat[now][to] != -1) {
							dp[s|1<<to][to] = Math.min(dp[s|1<<to][to], dp[s][now] + mat[now][to]);
						}
					}
				}
			}

			out.println(dp[(1<<v)-1][0] == INF ? -1 : dp[(1<<v)-1][0]);


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

}

