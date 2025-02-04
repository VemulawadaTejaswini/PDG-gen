import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static boolean debug = true;

	static void solve() {
		int n = ir.nextInt();
		long m = ir.nextLong();
		long[] a = ir.nextLongArray(n);
		int[] p = ir.nextIntArray(n);
		long[] lcm = new long[1 << n];
		double[] pro = new double[1 << n];
		pro[0] = 1.0;
		for (int i = 0; i < n; i++)
			pro[0] *= 1.0 - p[i] / 100.0;
		lcm[0] = 1;
		for (int i = 1; i < 1 << n; i++) {
			int x = Integer.highestOneBit(i);
			int y = Integer.numberOfTrailingZeros(x);
			lcm[i] = lcm(a[y], lcm[i ^ x]);
			pro[i] = pro[i ^ x] * (double) p[y] / (100 - p[y]);
		}
		long[][] dp = new long[2][1 << n];
		for (int i = 0; i < 1 << n; i++)
			dp[n & 1][i] = Math.max(0, m / lcm[i]);
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < 1 << n; j++) {
				dp[i & 1][j] = dp[i & 1 ^ 1][j];
				if ((j & 1 << i) == 0)
					dp[i & 1][j] -= dp[i & 1 ^ 1][j | 1 << i];
			}
			Arrays.fill(dp[i & 1 ^ 1], 0);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 1 << n; j++) {
				dp[i & 1 ^ 1][j] = dp[i & 1][j];
				if ((j & 1 << i) != 0)
					dp[i & 1 ^ 1][j] += dp[i & 1][j ^ 1 << i];
			}
			Arrays.fill(dp[i & 1], 0);
		}
		double ret = 0.0;
		for (int i = 0; i < 1 << n; i++) {
			ret += (m - dp[n & 1][((1 << n) - 1) ^ i]) * pro[i];
		}
		DecimalFormat df = new DecimalFormat("0.00000000");
		out.println(df.format(ret));
	}

	static long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	static long lcm(long a, long b) {
		a /= gcd(a, b);
		if (a * b / b != a)
			return (long) 2e18;
		return a * b;
	}

	public static void main(String[] args) {
		ir = new InputReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}

	static class InputReader {

		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}

	static void tr(Object... o) {
		if (debug)
			out.println(Arrays.deepToString(o));
	}
}

