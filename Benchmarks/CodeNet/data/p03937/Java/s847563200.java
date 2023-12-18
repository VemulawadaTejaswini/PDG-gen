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
		TaskA solver = new TaskA();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskA {
		boolean ans;

		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int height = in.nextInt();
			int width = in.nextInt();
			char[][] s = new char[height][];
			for (int r = 0; r < height; r++) {
				s[r] = in.next().toCharArray();
			}
			ans = true;
			dfs(0, 0, s, height, width);
			for (int r = 0; r < height; r++) {
				for (int c = 0; c < width; c++) {
					if (s[r][c] == '#') {
						ans = false;
					}
				}
			}
			out.println(ans ? "Possible" : "Impossible");
		}

		private void dfs(int r, int c, char[][] s, int height, int width) {
			if (r >= height || c >= width) {
				return;
			}
			if (s[r][c] == '.') {
				return;
			}
			int x = 0;
			if (r + 1 < height && s[r + 1][c] == '#') {
				++x;
			}
			if (c + 1 < width && s[r][c + 1] == '#') {
				++x;
			}
			if (x > 1) {
				ans = false;
				return;
			}
			s[r][c] = '.';
			dfs(r + 1, c, s, height, width);
			dfs(r, c + 1, s, height, width);
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

