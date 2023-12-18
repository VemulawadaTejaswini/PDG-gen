import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.BitSet;
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
		E_OddSubrectangles solver = new E_OddSubrectangles();
		solver.solve(1, in, out);
		out.close();
	}

	static class E_OddSubrectangles {
		public void solve(int testNumber, FastScanner in, PrintWriter out) {
			final int MOD = 998244353;
			int height = in.nextInt();
			int width = in.nextInt();
			BitSet[] a = new BitSet[height];
			for (int r = 0; r < height; r++) {
				a[r] = new BitSet(width);
				for (int c = 0; c < width; c++) {
					int x = in.nextInt();
					if (x == 1) {
						a[r].set(c);
					}
				}
			}

			int rank = calcRank(a.clone());

			long[] p2 = new long[height + width + 1];
			p2[0] = 1;
			for (int i = 1; i < p2.length; i++) {
				p2[i] = 2 * p2[i - 1] % MOD;
			}
			long ans = p2[height + width - 1] - p2[height + width - 1 - rank];
			if (ans < 0) {
				ans += MOD;
			}
			out.println(ans);
		}

		private int calcRank(BitSet[] rows) {
			diagonalize(rows);
			int res = 0;
			for (BitSet row : rows) {
				if (row.cardinality() != 0) {
					++res;
				}
			}
			return res;
		}

		private void diagonalize(BitSet[] a) {
			int lastR = a.length - 1;
			int r = 0;
			while (r <= lastR) {
				if (a[r].cardinality() == 0) {
					BitSet t = a[r];
					a[r] = a[lastR];
					a[lastR] = t;
					--lastR;
					continue;
				}

				int or = a[r].nextSetBit(r);
				if (or != r) {
					for (int i = 0; i <= lastR; i++) {
						boolean bitR = a[i].get(r);
						boolean bitOR = a[i].get(or);
						a[i].set(r, bitOR);
						a[i].set(or, bitR);
					}
				}
				for (int i = r + 1; i <= lastR; i++) {
					a[i].xor(a[r]);
				}

				++r;
			}
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

