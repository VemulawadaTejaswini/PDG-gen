import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt();
		int K = sc.nextInt();
		Graph g = new Graph(N);

		for (int i = 0; i < N - 1; i++) {
			g.addBoth(sc.nextInt() - 1, sc.nextInt() - 1);
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			int x = dfs(g, i, -1, 0, K);
			ans = Math.min(ans, N - x);
		}
		System.out.println(ans);
	}

	private static int dfs(Graph g, int now, int pre, int depth, int K) {
		if (depth * 2 > K) {
			return 0;
		}

		int ret = 1;
		for (Graph.Path p : g.get(now)) {
			if (p.to != pre) {
				ret += dfs(g, p.to, now, depth + 1, K);
			}
		}
		return ret;
	}
}

class Graph {
	public static class Path implements Comparable<Path> {
		public final int from;
		public final int to;
		public final long cost;

		public Path(int from, int to, long cost) {
			this.from = from;
			this.to = to;
			this.cost = cost;
		}

		@Override
		public int compareTo(Path o) {
			return Long.compare(this.cost, o.cost);
		}
	}

	private final List<Set<Path>> edgeList;
	private final int size;

	public Graph(int n) {
		this.size = n;
		this.edgeList = new ArrayList<Set<Path>>();
		for (int i = 0; i < n; i++) {
			this.edgeList.add(new HashSet<Path>());
		}
	}

	public void add(int from, int to, long cost) {
		this.edgeList.get(from).add(new Path(from, to, cost));
	}

	public void addBoth(int v1, int v2, long cost) {
		this.add(v1, v2, cost);
		this.add(v2, v1, cost);
	}

	public void add(int from, int to) {
		this.edgeList.get(from).add(new Path(from, to, 1));
	}

	public void delete(int v) {
		for (Path p : get(v)) {
			get(p.to).remove((Object) v);
		}
		get(v).clear();
	}

	public void addBoth(int v1, int v2) {
		this.add(v1, v2, 1);
		this.add(v2, v1, 1);
	}

	public Set<Path> get(int from) {
		return this.edgeList.get(from);
	}

	public int size() {
		return this.size;
	}
}

class FastScanner {
	public static String debug = null;

	private final InputStream in = System.in;
	private int ptr = 0;
	private int buflen = 0;
	private byte[] buffer = new byte[1024];
	private boolean eos = false;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				if (debug != null) {
					buflen = debug.length();
					buffer = debug.getBytes();
					debug = "";
					eos = true;
				} else {
					buflen = in.read(buffer);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen < 0) {
				eos = true;
				return false;
			} else if (buflen == 0) {
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

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean isEOS() {
		return this.eos;
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

	public long[] nextLongList(int n) {
		return nextLongTable(1, n)[0];
	}

	public int[] nextIntList(int n) {
		return nextIntTable(1, n)[0];
	}

	public long[][] nextLongTable(int n, int m) {
		long[][] ret = new long[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ret[i][j] = nextLong();
			}
		}
		return ret;
	}

	public int[][] nextIntTable(int n, int m) {
		int[][] ret = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ret[i][j] = nextInt();
			}
		}
		return ret;
	}
}