import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;

	static void solve() {
		int n = ir.nextInt();
		long[] a = ir.nextLongArray(n);
		Arrays.sort(a);
		long res = 0;
		int p = 0, m = 0;
		if (a[0] > 0) {
			p = n - 1;
			m = 1;
			for (int i = 1; i < n; i++)
				res += a[i];
			res -= a[0];
		} else if (a[n - 1] < 0) {
			p = 1;
			m = n - 1;
			for (int i = 0; i < n - 1; i++)
				res -= a[i];
			res += a[n - 1];
		} else {
			int ct = 0;
			for (long x : a) {
				if (x > 0) {
					p++;
					res += x;
				} else if (x < 0) {
					m++;
					res -= x;
				} else {
					ct++;
				}
			}
			if (m == 0) {
				m++;
				ct--;
			}
			if (p == 0) {
				p++;
				ct--;
			}
			m += ct;
		}

		long[] x = new long[n - 1];
		long[] y = new long[n - 1];
		int st = 0, ed = n - 1;
		out.println(res);
		int f = 0;
		for (int i = 0; i < n - 1; i++) {
			if (m == 1) {
				m = p - 1;
				p = 1;
				long t = a[f == 0 ? ed : st];
				x[n - 2 - i] = t;
				y[n - 2 - i] = t - res;
				if (f == 0)
					ed--;
				else
					st++;
				res = t - res;
				f ^= 1;
			} else {
				m--;
				long t = a[f == 1 ? ed : st];
				x[n - 2 - i] = res + t;
				y[n - 2 - i] = t;
				if (f == 1)
					ed--;
				else
					st++;
				res = res + t;
			}
		}
		for (int i = 0; i < n - 1; i++) {
			out.println(x[i] + " " + y[i]);
		}
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
		out.println(Arrays.deepToString(o));
	}
}
