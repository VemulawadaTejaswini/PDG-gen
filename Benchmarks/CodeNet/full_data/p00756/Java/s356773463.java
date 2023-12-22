import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static boolean debug = false;
	static int[] dp = new int[1 << 24];

	static void solve() {
		for (;;) {
			int n = ir.nextInt();
			if (n == 0)
				return;
			Arrays.fill(dp, -1);
			int[][] a = new int[n][];
			for (int i = 0; i < n; i++)
				a[i] = ir.nextIntArray(4);
			Graph[] g = new Graph[n];
			for (int i = 0; i < n; i++)
				g[i] = new Graph();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < i; j++) {
					if (Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0])
							+ (a[i][1] - a[j][1]) * (a[i][1] - a[j][1])) < (double) a[i][2] + a[j][2])
						g[i].add(j);
				}
			}
			out.println(dfs((1 << n) - 1, n, g, a));
		}
	}

	static int dfs(int m, int n, Graph[] g, int[][] a) {
		if (dp[m] >= 0)
			return dp[m];
		ArrayList<Integer> buf = new ArrayList<Integer>();
		outer: for (int i = 0; i < n; i++) {
			if (((1 << i) & m) != 0) {
				for (int j = 0; j < g[i].size(); j++) {
					if (((1 << g[i].get(j)) & m) != 0)
						continue outer;
				}
				buf.add(i);
			}
		}
		if (buf.size() < 2)
			return 0;
		int ret = 0;
		for (int i = 0; i < buf.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (a[buf.get(i)][3] == a[buf.get(j)][3]) {
					ret = Math.max(ret, dfs(m ^ ((1 << buf.get(i)) | (1 << buf.get(j))), n, g, a) + 2);
				}
			}
		}
		return dp[m] = ret;
	}

	static class Graph extends ArrayList<Integer> {
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

