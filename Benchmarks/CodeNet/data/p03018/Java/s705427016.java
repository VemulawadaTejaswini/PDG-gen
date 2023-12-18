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
		B_ABC solver = new B_ABC();
		solver.solve(1, in, out);
		out.close();
	}

	static class B_ABC {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			char[] s = in.next().toCharArray();
			long ans = 0;
			char last = 'B';
			int len = 0;
			for (int i = s.length - 1; i >= 0; i--) {
				if (s[i] == 'A') {
					if (len % 2 == 0) {
						ans += len / 2;
					} else {
						len = 0;
					}
					continue;
				}
				if (s[i] == last) {
					len = s[i] == 'C' ? 1 : 0;
				} else {
					++len;
				}
				last = s[i];
			}
			out.println(ans);
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

	}
}

