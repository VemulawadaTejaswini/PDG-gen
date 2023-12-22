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
	static final int[] d = { 0, 1, 0, -1 };

	static void solve() {
		for (;;) {
			int w = ir.nextInt();
			int h = ir.nextInt();
			if (w == 0 && h == 0)
				return;
			int[][] a = new int[h][];
			for (int i = 0; i < h; i++)
				a[i] = ir.nextIntArray(w);
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (a[i][j] == 2) {
						int ans = dfs(new int[] { i, j }, 0, a, w, h);
						out.println(ans == (1 << 30) ? -1 : ans);
					}
				}
			}
		}
	}

	static int dfs(int[] cur, int t, int[][] a, int w, int h) {
		if (a[cur[0]][cur[1]] == 3)
			return t;
		if (t == 10)
			return 1 << 30;
		int ret = 1 << 30;
		for (int i = 0; i < 4; i++) {
			int[] p = cur.clone();
			while (p[0] >= 0 && p[0] < h && p[1] >= 0 && p[1] < w && (a[p[0]][p[1]] == 0 || a[p[0]][p[1]] == 2)) {
				p[0] += d[i];
				p[1] += d[i ^ 1];
			}
			if ((p[0] >= 0 && p[0] < h && p[1] >= 0 && p[1] < w)) {
				if (a[p[0]][p[1]] == 1) {
					p[0] -= d[i];
					p[1] -= d[i ^ 1];
					if (!(cur[0] == p[0] && cur[1] == p[1])) {
						a[p[0] + d[i]][p[1] + d[i ^ 1]] = 0;
						ret = Math.min(ret, dfs(p, t + 1, a, w, h));
						a[p[0] + d[i]][p[1] + d[i ^ 1]] = 1;
					}
					;
				} else
					return t + 1;
			}
		}
		return ret;
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

