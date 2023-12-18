import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.io.BufferedReader;
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
		ProblemC solver = new ProblemC();
		solver.solve(1, in, out);
		out.close();
	}

	static class ProblemC {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			out.println(solve(a.clone()));

			boolean stress = false;
			if (stress) {
				Random random = new Random(0);
				for (int it = 0; it < 100; it++) {
					n = random.nextInt(15) + 1;
					a = new int[n];
					for (int i = 0; i < n; i++) {
						a[i] = random.nextInt(2000) + 1;
					}
					int u = solve(a.clone());
					int v = slow(a.clone());
					if (u != v) {
						throw new AssertionError(Arrays.toString(a));
					}
				}
			}
		}

		private int solve(int[] a) {
			int sum = 0;
			for (int x : a) {
				sum += x;
			}
			BigInteger b = BigInteger.ONE;
			for (int x : a) {
				b = b.or(b.shiftLeft(x));
			}
			for (int i = (sum + 1) / 2; ; i++) {
				if (b.testBit(i)) {
					return i;
				}
			}
		}

		private int slow(int[] a) {
			int n = a.length;
			int[] s = new int[1 << n];
			for (int i = 1; i < s.length; i++) {
				int j = Integer.numberOfTrailingZeros(i);
				s[i] = s[i ^ (1 << j)] + a[j];
			}
			Arrays.sort(s);
			return s[1 << (n - 1)];
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

