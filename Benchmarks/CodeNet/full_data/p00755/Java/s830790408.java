import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static boolean debug = true;
	static final int[] d = { 0, 1, 0, -1 };

	static void solve() {
		for (;;) {
			int h = ir.nextInt();
			int w = ir.nextInt();
			int c = ir.nextInt();
			if (h == 0 && w == 0 && c == 0)
				return;
			int[][] p = new int[h][];
			for (int i = 0; i < h; i++)
				p[i] = ir.nextIntArray(w);
			out.println(dfs(0, p, h, w, c));
		}
	}

	static int dfs(int t, int[][] p, int h, int w, int c) {
		int ret = 1;
		Deque<int[]> que = new ArrayDeque<int[]>();
		que.offerLast(new int[] { 0, 0 });
		boolean[][] adj = new boolean[h][w];
		adj[0][0] = true;
		while (!que.isEmpty()) {
			int[] f = que.pollFirst();
			for (int i = 0; i < 4; i++) {
				int nx = f[0] + d[i];
				int ny = f[1] + d[i ^ 1];
				if (nx >= 0 && nx < h && ny >= 0 && ny < w && !adj[nx][ny] && p[f[0]][f[1]] == p[nx][ny]) {
					adj[nx][ny] = true;
					que.offerLast(new int[] { nx, ny });
					if (t == 5)
						ret++;
				}
			}
		}
		if (t == 5)
			return ret;
		int b = p[0][0];
		if (t == 4) {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (adj[i][j])
						p[i][j] = c;
				}
			}
			ret = dfs(t + 1, p, h, w, c);
		} else {
			for (int i = 1; i <= 6; i++) {
				if (i == b)
					continue;
				for (int j = 0; j < h; j++) {
					for (int k = 0; k < w; k++) {
						if (adj[j][k])
							p[j][k] = i;
					}
				}
				ret = Math.max(ret, dfs(t + 1, p, h, w, c));
			}
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (adj[i][j])
					p[i][j] = b;
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

