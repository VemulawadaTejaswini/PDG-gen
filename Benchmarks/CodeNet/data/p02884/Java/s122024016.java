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

	static void solve() {
		int n = ir.nextInt();
		int m = ir.nextInt();
		Graph[] g = new Graph[n];
		for (int i = 0; i < n; i++) {
			g[i] = new Graph();
		}
		for (int i = 0; i < m; i++) {
			int s = ir.nextInt() - 1;
			int t = ir.nextInt() - 1;
			g[s].add(t);
		}

		double[] dp = new double[n];
		for (int i = n - 2; i >= 0; i--) {
			for (int to : g[i]) {
				dp[i] += (dp[to] + 1.0) / g[i].size();
			}
		}
		double res = dp[0];
		double[] cur = new double[n];
		cur[0] = 1.0;
		// tr(dp);
		for (int i = 0; i < n; i++) {
			if (i != 0 && (Math.abs(cur[i]) < 1e-10 || Math.abs(cur[i] - 1.0) < 1e-10))
				continue;
			double ma = -1;
			int idx = -1;
			double tot = 0;
			for (int j = 0; j < g[i].size(); j++) {
				int to = g[i].get(j);
				if (dp[to] > ma) {
					ma = dp[to];
					idx = to;
				}
				tot += dp[to] + 1.0;
			}
			// tr(i, idx);
			if (i == 0) {
				if (g[i].size() > 1) {
					res = Math.min(res, (tot - 1 - dp[idx]) / (g[i].size() - 1));
				}
				for (int j = 0; j < g[i].size(); j++) {
					int to = g[i].get(j);
					cur[to] += cur[i] / g[i].size();
				}
				cur[i] = 0.0;
				continue;
			}
			if (idx >= 0 && g[i].size() > 1) {
				double d = (tot - 1 - dp[idx]) / (g[i].size() - 1) - tot / g[i].size();
				if (d < 0)
					res = Math.min(res, dp[0] + d * cur[i]);
			}
			for (int j = 0; j < g[i].size(); j++) {
				int to = g[i].get(j);
				cur[to] += cur[i] / g[i].size();
			}
			cur[i] = 0.0;
		}
		out.println(res);
	}

	static class Graph extends ArrayList<Integer> {
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