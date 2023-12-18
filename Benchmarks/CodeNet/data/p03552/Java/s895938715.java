import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskD {
		final int infinity = (int) 1e9;
		int n;
		int[] a;
		int[][][][] dp;
		boolean[][][][] was;

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			n = in.nextInt();
			n += 2;
			a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			dp = new int[2][2][n][n];
			was = new boolean[2][2][n][n];
			int ans = solve(0, 0, 0, 1);
			out.println(ans);
		}

		private int solve(int whoMoves, int canPass, int i, int j) {
			if (was[whoMoves][canPass][i][j]) {
				return dp[whoMoves][canPass][i][j];
			}
			was[whoMoves][canPass][i][j] = true;
			int res = whoMoves == 0 ? -infinity : +infinity;
			if (canPass == 1) {
				int nxt = solve(whoMoves ^ 1, 0, i, j);
				if (whoMoves == 0) {
					res = Math.max(res, nxt);
				} else {
					res = Math.min(res, nxt);
				}
			}
			int k = Math.max(i, j) + 1;
			if (k < n) {
				int ni = i;
				int nj = j;
				if (whoMoves == 0) {
					ni = k;
				} else {
					nj = k;
				}
				int nxt = solve(whoMoves, 1, ni, nj);
				if (whoMoves == 0) {
					res = Math.max(res, nxt);
				} else {
					res = Math.min(res, nxt);
				}
			} else {
				int score = Math.abs(a[i] - a[j]);
				if (whoMoves == 0) {
					res = Math.max(res, score);
				} else {
					res = Math.min(res, score);
				}
			}
			dp[whoMoves][canPass][i][j] = res;
			return res;
		}

	}

	static class FastScanner {
		private BufferedReader in;
		private StringTokenizer st;

		public FastScanner(InputStream stream) {
			in = new BufferedReader(new InputStreamReader(stream));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					String rl = in.readLine();
					if (rl == null) {
						return null;
					}
					st = new StringTokenizer(rl);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

	}
}

