import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();
		int[] r = new int[R];
		for (int i = 0; i < R; i++) {
			r[i] = sc.nextInt() - 1;
		}

		List<List<Edge>> edges = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			edges.add(new ArrayList<>());
		}

		for (int i = 0; i < M; i++) {
			int A = sc.nextInt() - 1;
			int B = sc.nextInt() - 1;
			int C = sc.nextInt();
			edges.get(A).add(new Edge(A, B, C));
			edges.get(B).add(new Edge(B, A, C));
		}

		int[][] dist = new int[R][R];
		for (int i = 0; i < R; i++) {
			int[] d = dijkstra(N, edges, r[i]);
			for (int j = 0; j < R; j++) {
				dist[i][j] = d[r[j]];
			}
		}

		int[] way = new int[R];
		for (int i = 0; i < R; i++) {
			way[i] = i;
		}

		int min = 1145141919;
		do {
			int total = 0;
			for (int i = 1; i < R; i++) {
				total += dist[i - 1][i];
			}
			min = Math.min(min, total);
		} while (nextPermutation(way));

		out.println(min);
		out.flush();
	}

	static final int INF = 1145141919;

	static int[] dijkstra(int n, List<List<Edge>> edges, int s) {
		int[] dist = new int[n];
		Arrays.fill(dist, INF);
		dist[s] = 0;

		Queue<Edge> q = new PriorityQueue<Edge>();
		q.add(new Edge(s, s, 0));

		while (!q.isEmpty()) {
			Edge edge = q.poll();
			if (dist[edge.tgt] < edge.cost) {
				continue;
			}
			for (Edge e : edges.get(edge.tgt)) {
				if (dist[e.tgt] > dist[edge.tgt] + e.cost) {
					dist[e.tgt] = dist[edge.tgt] + e.cost;
					q.add(new Edge(edge.tgt, e.tgt, dist[e.tgt]));
				}
			}
		}

		return dist;
	}

	static class Edge implements Comparable<Edge> {
		int src, tgt, cost;

		Edge(int src, int tgt, int cost) {
			this.src = src;
			this.tgt = tgt;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge e) {
			return this.cost - e.cost;
		}
	}

	static boolean nextPermutation(int[] a) {
		for (int i = a.length - 1; i > 0; i--) {
			if (a[i - 1] < a[i]) {
				int swapIndex = find(a[i - 1], a, i, a.length - 1);
				int temp = a[swapIndex];
				a[swapIndex] = a[i - 1];
				a[i - 1] = temp;
				Arrays.sort(a, i, a.length);
				return true;
			}
		}
		return false;
	}

	static int find(int dest, int[] a, int s, int e) {
		if (s == e) { return s; }
		int m = (s + e + 1) / 2;
		return a[m] <= dest ? find(dest, a, s, m - 1) : find(dest, a, m, e);
	}
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) return true;
		else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) return false;
		}
		return true;
	}

	private byte readByte() {
		if (hasNextByte()) return buffer[ptr++];
		return -1;
	}

	private boolean isPrintableChar(byte c) {
		return '!' <= c && c <= '~';
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		byte b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public int nextInt() {
		if (!hasNext()) throw new NoSuchElementException();
		int n = 0;
		boolean minus = false;
		byte b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) throw new NumberFormatException();
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

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
		}
		return a;
	}

	public long nextLong() {
		if (!hasNext()) throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		byte b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) throw new NumberFormatException();
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

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
		}
		return a;
	}
}