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
		ProblemA solver = new ProblemA();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemA {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int m = in.nextInt();
			char[] s = in.next().toCharArray();
			char[] t = in.next().toCharArray();
			if (ok(s, t) && ok(t, s)) {
				out.println(lcm(n, m));
			} else {
				out.println(-1);
			}
		}

		private boolean ok(char[] s, char[] t) {
			for (int i = 0; i < s.length; i++) {
				long x = (long) t.length * i;
				if (x % s.length != 0) {
					continue;
				}
				int j = (int) (x / s.length);
				if (j < t.length && s[i] != t[j]) {
					return false;
				}
			}
			return true;
		}

		private long lcm(int a, int b) {
			return (long) a / gcd(a, b) * b;
		}

		private int gcd(int a, int b) {
			return b == 0 ? a : gcd(b, a % b);
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

