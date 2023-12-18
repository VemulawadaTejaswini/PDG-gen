import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Indrajit Sinha
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		EGetEverything solver = new EGetEverything();
		solver.solve(1, in, out);
		out.close();
	}

	static class EGetEverything {
		int n;
		PrintWriter out;
		InputReader in;
		zoom[] zc;
		int m;
		long[][] dp;
		int val;
		final Comparator<zoom> com = new Comparator<zoom>() {
			public int compare(zoom x, zoom y) {
				return Integer.compare(x.a, y.a);
			}
		};

		public void solve(int testNumber, InputReader in, PrintWriter out) {
			int t, i, j, tt, k;
			this.out = out;
			this.in = in;
			n = in.nextInt();
			m = in.nextInt();
			zc = new zoom[m];
			for (i = 0; i < m; i++) {
				int a = in.nextInt();
				int b = in.nextInt();
				zc[i] = new zoom(a, b);
				for (j = 0; j < b; j++) {
					zc[i].c[j] = in.nextInt() - 1;
				}
			}
			dp = new long[m][1 << n + 1];
			for (i = 0; i < m; i++) {
				Arrays.fill(dp[i], -1);
			}
			val = (int) Math.pow(2, n) - 1;
			Arrays.sort(zc, com);
			long mn = go(0, 0);
			if (mn != Integer.MAX_VALUE)
				pn(mn);
			else
				pn(-1);
		}

		long go(int ind, int msk) {
			if (ind == m) {
				if (msk == val)
					return 0;
				else
					return Integer.MAX_VALUE;
			}
			if (dp[ind][msk] != -1)
				return dp[ind][msk];
			long mn = zc[ind].a;
			int op = msk;
			for (int i = 0; i < zc[ind].b; i++) {
				op = op | (1 << zc[ind].c[i]);
			}
			mn = mn + go(ind + 1, op);
			mn = Math.min(mn, go(ind + 1, msk));
			dp[ind][msk] = mn;
			return mn;
		}

		void pn(int zx) {
			out.println(zx);
		}

		void pn(long zx) {
			out.println(zx);
		}

		class zoom {
			int[] c;
			int a;
			int b;

			zoom(int x, int y) {
				a = x;
				b = y;
				c = new int[y];
			}

		}

	}

	static class InputReader {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public InputReader(InputStream stream) {
			this.stream = stream;
		}

		public int read() {
			if (numChars == -1) {
				throw new UnknownError();
			}
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new UnknownError();
				}
				if (numChars <= 0) {
					return -1;
				}
			}
			return buf[curChar++];
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public String next() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			StringBuffer res = new StringBuffer();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));

			return res.toString();
		}

		private boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

	}
}

