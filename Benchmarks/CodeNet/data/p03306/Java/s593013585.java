import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

class Main implements Runnable {

	public static void main(String[] args) {
		new Thread(null, new Main(), "", Runtime.getRuntime().maxMemory()).start();
		;
	}

	class Edge {
		int src, dst;
		long s;

		public Edge(int src_, int dst_, long s_) {
			src = src_;
			dst = dst_;
			s = s_;
		}
	}

	public void run() {
		Scanner sc = new Scanner();
		int n = sc.nextInt();// 1e5
		int m = sc.nextInt();// 1e5
		int[] u = new int[m];
		int[] v = new int[m];
		long[] s = new long[m];// 1e9
		ArrayList<Edge>[] g = new ArrayList[n];
		for (int i = 0; i < n; ++i) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; ++i) {
			u[i] = sc.nextInt();
			v[i] = sc.nextInt();
			s[i] = sc.nextLong();
			--u[i];
			--v[i];
			g[u[i]].add(new Edge(u[i], v[i], s[i]));
			g[v[i]].add(new Edge(v[i], u[i], s[i]));
		}
		int[] col = new int[n];
		val = new long[n];
		Arrays.fill(col, -1);
		col[0] = 0;
		boolean bibartite = dfs(0, -1, col, g);
		long min0 = Long.MAX_VALUE / 3;
		long min1 = Long.MAX_VALUE / 3;
		long max0 = -Long.MAX_VALUE / 3;
		long max1 = -Long.MAX_VALUE / 3;
		for (int i = 0; i < n; ++i) {
			if (col[i] == 0) {
				min0 = Math.min(min0, val[i]);
				max0 = Math.max(max0, val[i]);
			} else {
				min1 = Math.min(min1, val[i]);
				max1 = Math.max(max1, val[i]);
			}
		}
		System.out.println(Math.max(0, min1 + min0 - 1));
	}

	long[] val;
	long x = -1;

	boolean dfs(int cur, int par, int[] col, ArrayList<Edge>[] g) {
		boolean ret = true;
		for (Edge e : g[cur]) {
			if (e.dst == par)
				continue;
			if (col[e.dst] != -1) {
				ret &= (col[e.dst] ^ 1) == col[cur];
				if (e.dst == 0) {
					if ((e.s - val[cur]) % 2 == 1 || e.s - val[cur] <= 0 || val[cur] < 0) {
						System.out.println(0);
					} else {
						System.out.println(1);
					}
					System.exit(0);
				}
			} else {
				col[e.dst] = col[cur] ^ 1;
				val[e.dst] = e.s - val[cur];
				ret &= dfs(e.dst, cur, col, g);
			}
		}
		return ret;
	}

	class Scanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[ptr++];
			else
				return -1;
		}

		private boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
		}

		public boolean hasNext() {
			skipUnprintable();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

		int nextInt() {
			return (int) nextLong();
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}