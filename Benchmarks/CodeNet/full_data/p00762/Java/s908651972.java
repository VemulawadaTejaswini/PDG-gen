import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static boolean debug = false;
	static final int offset = 150;
	static final int[] d = { 0, 1, 0, -1 };

	static void solve() {
		for (;;) {
			int n = ir.nextInt();
			if (n == 0)
				return;
			int[][][] c = new int[offset * 2][offset * 2][2];
			int[] ct = new int[7];
			for (int i = 0; i < n; i++) {
				roll(0, 0, c, ct, ir.nextInt(), ir.nextInt());
			}
			for (int i = 1; i <= 6; i++)
				out.print(ct[i] + ((i == 6) ? "\n" : " "));
		}
	}

	static void roll(int x, int y, int[][][] c, int[] ct, int t, int f) {
		int s = 6 - Math.min(7 - t, t) - Math.min(f, 7 - f);
		int b = t & 1;
		for (int i = 1; i <= 6; i++) {
			if (i == t || i == 7 - t)
				continue;
			if (i == f)
				break;
			b ^= 1;
		}
		if (b == 0)
			s = 7 - s;
		int idx = -1;
		int ma = 4;
		for (int i = 0; i < 4; i++) {
			int nx = x + d[i], ny = y + d[i ^ 1];
			int num = (i == 0) ? f : (i == 1) ? s : (i == 2) ? 7 - f : 7 - s;
			if (num >= ma && c[x + offset][y + offset][0] > c[nx + offset][ny + offset][0]) {
				idx = i;
				ma = num;
			}
		}
		if (idx == -1) {
			c[x + offset][y + offset][0]++;
			ct[c[x + offset][y + offset][1]]--;
			ct[c[x + offset][y + offset][1] = t]++;
		} else
			roll(x + d[idx], y + d[idx ^ 1], c, ct, 7 - ma, idx == 0 ? t : (idx == 2) ? 7 - t : f);
	}

	public static void main(String[] args) throws Exception {
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

