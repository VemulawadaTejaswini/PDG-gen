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
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			String inputS = in.next();
			char[] s = new char[2 * n];
			for (int i = 0; i < s.length; i++) {
				s[i] = inputS.charAt(i % n);
			}
			for (int a = 0; a < 2; a++) {
				for (int b = 0; b < 2; b++) {
					char[] ans = new char[2 * n];
					ans[0] = a == 0 ? 'S' : 'W';
					ans[1] = b == 0 ? 'S' : 'W';
					for (int i = 2; i < s.length; i++) {
						if ((ans[i - 1]) == 'S' == (s[i - 1] == 'o')) {
							ans[i] = ans[i - 2];
						} else {
							ans[i] = (char) ('S' ^ 'W' ^ ans[i - 2]);
						}
					}
					boolean ok = true;
					for (int i = 0; i < n; i++) {
						if (ans[i] != ans[i + n]) {
							ok = false;
						}
					}
					if (ok) {
						out.println(new String(Arrays.copyOf(ans, n)));
						return;
					}
				}
			}
			out.println(-1);
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

