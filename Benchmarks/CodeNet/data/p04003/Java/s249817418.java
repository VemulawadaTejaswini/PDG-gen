import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	int gen = 0;

	class Edge implements Comparable<Edge> {
		int src, dst, c;
		int cur;
		long dist;
		int id;

		public Edge(int src_, int dst_, int c_) {
			src = src_;
			dst = dst_;
			c = c_;
			id = gen++;
		}

		public Edge(int src_, int dst_, int c_, long dist_, int id_) {
			src = src_;
			dst = dst_;
			c = c_;
			dist = dist_;
			id = id_;
		}

		@Override
		public int compareTo(Edge o) {
			return Long.compare(dist, o.dist);
		}

	}

	public void run() {
		Scanner sc = new Scanner();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] p = new int[m];
		int[] q = new int[m];
		int[] c = new int[m];
		ArrayList<Edge>[] g = new ArrayList[n];
		for (int i = 0; i < n; ++i) {
			g[i] = new ArrayList<>();
		}
		for (int i = 0; i < m; ++i) {
			p[i] = sc.nextInt();
			q[i] = sc.nextInt();
			c[i] = sc.nextInt();
			--p[i];
			--q[i];
			g[p[i]].add(new Edge(p[i], q[i], c[i]));
			g[q[i]].add(new Edge(q[i], p[i], c[i]));
		}
		solve(n, m, g);
	}

	void solve(int n, int m, ArrayList<Edge>[] g) {
		long ans = Long.MAX_VALUE / 10;
		long[] dist = new long[2 * m];
		boolean[] vis = new boolean[2 * m];
		Arrays.fill(dist, Long.MAX_VALUE / 10);
		ArrayDeque<Edge> dq = new ArrayDeque<>();
		for (Edge e : g[0]) {
			e.dist = 1;
			dq.add(e);
			dist[e.dst] = 1;
			if (e.dst == n - 1)
				ans = 1;
		}
		while (!dq.isEmpty()) {
			Edge e1 = dq.poll();
			for (Edge e2 : g[e1.dst]) {
				int cost = (e1.c == e2.c ? 0 : 1);
				if (dist[e2.id] < e2.dist || dist[e2.id] <= dist[e1.id] + cost) {
					continue;
				}
				dist[e2.id] = dist[e1.id] + cost;
				Edge e = new Edge(e2.src, e2.dst, e2.c, dist[e2.id], e2.id);
				if (e2.dst == n - 1)
					ans = Math.min(ans, dist[e2.id]);
				if (cost == 0) {
					dq.addFirst(e);
				} else {
					dq.addLast(e);
				}
			}
		}
		System.out.println(ans > 1e10 ? -1 : ans);

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

		public int nextInt() {
			return (int) nextLong();
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
