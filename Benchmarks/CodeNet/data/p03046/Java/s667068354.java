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
		int m = ir.nextInt();
		long k = ir.nextLong();
		if (k >= 1 << m || (m == 1 && k == 1)) {
			out.println(-1);
			return;
		}
		if (k == 0) {
			for (int i = 0; i < 1 << m; i++) {
				out.print(i + " " + i + " ");
			}
			out.println();
			return;
		}
		long[] res = new long[1 << (m + 1)];
		if (Long.bitCount(k) >= 2) {
			long a = Long.highestOneBit(k);
			long b = k - a;
			int ct = 5;
			for (int i = 0; i < 1 << m; i++) {
				if (i == a || i == b || i == k)
					continue;
				res[ct] = i;
				res[(1 << (m + 1)) - 1 - (ct - 5)] = i;
				ct++;
			}
			res[0] = res[4] = a;
			res[1] = res[3] = b;
			res[2] = res[ct] = k;
		} else {
			long a = -1;
			long b = -1;
			int ct = 5;
			for (int i = 0; i < m; i++) {
				if ((k & (1 << i)) == 0) {
					a = 1 << i;
					b = k + a;
					break;
				}
			}
			for (int i = 0; i < 1 << m; i++) {
				if (i == a || i == b || i == k)
					continue;
				res[ct] = i;
				res[(1 << (m + 1)) - 1 - (ct - 5)] = i;
				ct++;
			}
			res[0] = res[4] = a;
			res[1] = res[3] = b;
			res[2] = res[ct] = k;
		}
		for (int i = 0; i < 1 << (m + 1); i++)
			out.print(res[i] + " ");
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
