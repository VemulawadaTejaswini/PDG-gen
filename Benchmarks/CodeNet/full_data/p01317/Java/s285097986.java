import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	int n, m, r;
	int[] perm;
	int[][] ld, sd;
	List<Integer>[] le, se;

	class D implements Comparable<D> {
		int pos;
		int shp;
		int idx;
		int min;

		public D(int pos, int shp, int idx, int min) {
			this.pos = pos;
			this.shp = shp;
			this.idx = idx;
			this.min = min;
		}

		@Override
		public int compareTo(D o) {
			if (this.min != o.min) {
				return this.min - o.min;
			}
			if (this.pos != o.pos) {
				return this.pos - o.pos;
			}
			if (this.shp != o.shp) {
				return this.shp - o.shp;
			}
			if (this.idx != o.idx) {
				return this.idx - o.idx;
			}
			return 0;
		}

		@Override
		public String toString() {
			return "(" + pos + ", " + shp + ", " + idx + ", " + min + ")";
		}
	}

	int dijkstra() {
		PriorityQueue<D> queue = new PriorityQueue<D>();
		boolean[][][] vis = new boolean[n][n][r];

		int id = 0;
		while (perm[0] == perm[id]) {
			id++;
		}
		queue.add(new D(perm[0], perm[0], id, 0));

		while (!queue.isEmpty()) {
			D d = queue.poll();
			int pos = d.pos;
			int shp = d.shp;
			int idx = d.idx;
			int min = d.min;

			if (idx == r) {
				return min;
			}
			if (vis[pos][shp][idx]) {
				continue;
			}
			vis[pos][shp][idx] = true;

			for (Integer to : le[pos]) {
				int npos = to;
				int nshp = shp;
				int nidx = idx;
				int nmin = min + ld[pos][npos];
				while (nidx < r && perm[nidx] == npos) {
					nidx++;
				}
				if (!vis[npos][nshp][nidx]) {
					queue.add(new D(npos, nshp, nidx, nmin));
				}
			}
			for (Integer to : se[pos]) {
				int npos = to;
				int nshp = shp;
				int nidx = idx;
				int nmin = min + sd[pos][npos];
				if (shp != pos) {
					continue;
				}
				while (nidx < r && perm[nidx] == npos) {
					nidx++;
				}
				nshp = npos;
				if (!vis[npos][nshp][nidx]) {
					queue.add(new D(npos, nshp, nidx, nmin));
				}
			}
		}

		return -1;
	}

	@SuppressWarnings("unchecked")
	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}
			le = new LinkedList[n];
			se = new LinkedList[n];
			for (int i = 0; i < n; i++) {
				le[i] = new LinkedList<Integer>();
				se[i] = new LinkedList<Integer>();
			}
			ld = new int[n][n];
			sd = new int[n][n];
			for (int i = 0; i < m; i++) {
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;
				int t = sc.nextInt();
				char c = sc.next().charAt(0);
				if (c == 'L') {
					le[x].add(y);
					le[y].add(x);
					ld[x][y] = ld[y][x] = t;
				} else {
					se[x].add(y);
					se[y].add(x);
					sd[x][y] = sd[y][x] = t;
				}
			}
			r = sc.nextInt();
			perm = new int[r];
			for (int i = 0; i < r; i++) {
				perm[i] = sc.nextInt() - 1;
			}

			System.out.println(dijkstra());
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