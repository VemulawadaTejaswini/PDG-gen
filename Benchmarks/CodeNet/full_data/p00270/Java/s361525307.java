import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Main {
	int n;
	List<Integer>[] e;
	TreeMap<Pair, Integer> map;

	class Pair implements Comparable<Pair> {
		int f, s;

		Pair(int f, int s) {
			this.f = f;
			this.s = s;
		}

		@Override
		public int compareTo(Pair o) {
			if (this.f != o.f) {
				return this.f - o.f;
			}
			return this.s - o.s;
		}
	}

	class D implements Comparable<D> {
		int pos;
		int min;

		D(int pos, int min) {
			this.pos = pos;
			this.min = min;
		}

		@Override
		public int compareTo(D o) {
			if (this.min != o.min) {
				return this.min - o.min;
			}
			return this.pos - o.pos;
		}
	}

	int dijkstra(int start, int goal) {
		PriorityQueue<D> queue = new PriorityQueue<D>();
		queue.add(new D(start, 0));
		boolean[] vis = new boolean[n];

		while (!queue.isEmpty()) {
			D d = queue.poll();
			int pos = d.pos;
			int min = d.min;

			if (vis[pos]) {
				continue;
			}
			vis[pos] = true;
			if (pos == goal) {
				return min;
			}

			for (Integer to : e[pos]) {
				int npos = to;
				int nmin = min + map.get(new Pair(pos, to));
				if (vis[to]) {
					continue;
				}
				queue.add(new D(npos, nmin));
			}
		}

		return -1;
	}

	void run() {
		MyScanner sc = new MyScanner();

		n = sc.nextInt();
		int m = sc.nextInt();
		e = new LinkedList[n];
		map = new TreeMap<Pair, Integer>();
		for (int i = 0; i < n; i++) {
			e[i] = new LinkedList<Integer>();
		}
		for (int i = 0; i < m; i++) {
			int u = sc.nextInt() - 1;
			int v = sc.nextInt() - 1;
			int w = sc.nextInt();
			e[u].add(v);
			map.put(new Pair(u, v), w);
		}
		int a = sc.nextInt() - 1;
		int b = sc.nextInt() - 1;
		int opt = dijkstra(a, b);
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int c = sc.nextInt() - 1;
			int d = sc.nextInt() - 1;
			int s = dijkstra(a, c);
			int t = dijkstra(c, d);
			int u = dijkstra(d, b);
			if (s + t + u == opt) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------" + '\n');
	}

	class MyScanner {
		int read() {
			try {
				return System.in.read();
			} catch (IOException e) {
				throw new InputMismatchException();
			}
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();
			return array;
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}