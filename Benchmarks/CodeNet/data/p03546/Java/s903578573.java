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

		int h = sc.nextInt();
		int w = sc.nextInt();

		List<List<Edge>> edges = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			edges.add(new ArrayList<>());
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				int c = sc.nextInt();
				edges.get(i).add(new Edge(i, j, c));
			}
		}

		int[][] dist = new int[10][];
		for (int i = 0; i < 10; i++) {
			dist[i] = dijkstra(10, edges, i);
		}

		int cost = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				int a = sc.nextInt();
				if (a < 0) continue;
				cost += dist[a][1];
			}
		}

		out.println(cost);
		out.flush();
	}

	static int[] dijkstra(int n, List<List<Edge>> edges, int s) {
		int[] dist = new int[n];
		Arrays.fill(dist, Integer.MAX_VALUE);
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