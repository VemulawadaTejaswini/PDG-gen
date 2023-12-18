import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
		final int n = 100;

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int a = in.nextInt();
			int b = in.nextInt();
			char[][] s;
			if (a <= b) {
				s = solve(a, b);
			} else {
				s = invert(solve(b, a));
			}

			out.println(n + " " + n);
			for (int i = 0; i < n; i++) {
				out.println(new String(s[i]));
			}
		}

		private char[][] invert(char[][] s) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					s[i][j] = (char) (s[i][j] ^ '.' ^ '#');
				}
			}
			return s;
		}

		private char[][] solve(int a, int b) {
			char[][] s = new char[n][n];
			for (char[] arr : s) {
				Arrays.fill(arr, '.');
			}
			--a;

			for (int r = 0; r + 2 < n; r += 4) {
				for (int c = 0; c + 2 < n; c += 4) {
					if (a == 0 || b == 0) {
						break;
					}
					--a;
					--b;
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							s[r + i][c + j] = '#';
						}
					}
					s[r + 1][c + 1] = '.';
				}
			}

			while (b > 0) {
				--b;
				outer:
				for (int r = 1; r + 1 < n; r++) {
					for (int c = 1; c + 1 < n; c++) {
						if (s[r][c] == '#' || s[r + 1][c] == '#' || s[r - 1][c] == '#' || s[r][c + 1] == '#' || s[r][c - 1] == '#') {
							continue;
						}
						s[r][c] = '#';
						break outer;
					}
				}
			}

			return s;
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
					st = new StringTokenizer(in.readLine());
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

