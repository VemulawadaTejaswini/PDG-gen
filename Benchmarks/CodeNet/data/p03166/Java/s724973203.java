import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	static PrintWriter out;
	static InputReader ir;
	static boolean debug = false;

	static void solve() {
		int n = ir.nextInt();
		int m = ir.nextInt();
		int[][] a = new int[m][];
		for (int i = 0; i < m; i++)
			a[i] = ir.nextIntArray(2);
		Graph[] g = new Graph[n];
		for (int i = 0; i < n; i++)
			g[i] = new Graph();
		for (int i = 0; i < m; i++)
			g[a[i][0] - 1].add(a[i][1] - 1);
		int[] ord = tpologicalSort(g);
		int[] dp = new int[n];
		for (int i = 0; i < n; i++) {
			for (int to : g[ord[i]]) {
				dp[to] = Math.max(dp[to], dp[ord[i]] + 1);
			}
		}
		int ma=0;
      for(int i=0;i<n;i++)
        ma=Math.max(ma,dp[i]);
      out.println(ma);
	}

	static class Graph extends ArrayList<Integer> {
	}

	static int[] tpologicalSort(Graph[] gs) {
		int n = gs.length;
		int[] in = new int[n];
		int[] ord = new int[n];
		for (int i = 0; i < n; i++) {
			for (int to : gs[i])
				in[to]++;
		}
		Deque<Integer> s = new ArrayDeque<Integer>();
		for (int i = 0; i < n; i++) {
			if (in[i] == 0) {
				s.offerFirst(i);
			}
		}
		int p = 0;
		while (!s.isEmpty()) {
			int from = s.pollFirst();
			ord[p++] = from;
			for (int j = 0; j < gs[from].size(); j++) {
				int to = gs[from].get(j);
				in[to]--;
				if (in[to] == 0) {
					s.offerFirst(to);
				}
			}
		}
		for (int i = 0; i < n; i++)
			if (in[i] != 0)
				return null;
		return ord;
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
