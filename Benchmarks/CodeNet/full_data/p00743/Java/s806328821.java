import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	int n, m;
	int s, g;
	int[][] dist, speed;
	List<Integer>[] e;

	class D implements Comparable<D> {
		int pos;
		int spd;
		int pre;
		double min;

		public D(int pos, int spd, int pre, double min) {
			this.pos = pos;
			this.spd = spd;
			this.pre = pre;
			this.min = min;
		}

		@Override
		public int compareTo(D o) {
			if (this.min != o.min) {
				double diff = this.min - o.min;
				return diff > 0 ? 1 : -1;
			}
			if (this.pos != o.pos) {
				return this.pos - o.pos;
			}
			if (this.pre != o.pre) {
				return this.pre - o.pre;
			}
			if (this.spd != o.spd) {
				return this.spd - o.spd;
			}
			return 0;
		}

		@Override
		public String toString() {
			return "(" + pos + ", " + spd + ", " + min + ")";
		}
	}

	double dijkstra() {
		PriorityQueue<D> queue = new PriorityQueue<D>();
		queue.add(new D(s, 0, n, 0));
		boolean[][][] vis = new boolean[n][n + 1][31];

		while (!queue.isEmpty()) {
			D d = queue.poll();
			int pos = d.pos;
			int spd = d.spd;
			int pre = d.pre;
			double min = d.min;

			if (vis[pos][pre][spd]) {
				continue;
			}
			vis[pos][pre][spd] = true;

			if (pos == g && spd == 1) {
				return min;
			}

			for (Integer to : e[pos]) {
				int npos = to;
				if (npos == pre) {
					continue;
				}
				for (int i = -1; i <= 1; i++) {
					int nspd = spd + i;
					if (nspd <= 0 || speed[pos][npos] < nspd) {
						continue;
					}
					double nmin = min + (1. * dist[pos][npos] / nspd);
					queue.add(new D(npos, nspd, pos, nmin));
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
			if ((n | m) == 0)
				break;
			s = sc.nextInt() - 1;
			g = sc.nextInt() - 1;

			e = new LinkedList[n];
			for (int i = 0; i < n; i++) {
				e[i] = new LinkedList<Integer>();
			}
			dist = new int[n][n];
			speed = new int[n][n];
			for (int i = 0; i < m; i++) {
				int x = sc.nextInt() - 1;
				int y = sc.nextInt() - 1;
				int d = sc.nextInt();
				int c = sc.nextInt();
				e[x].add(y);
				e[y].add(x);
				dist[x][y] = dist[y][x] = d;
				speed[x][y] = speed[y][x] = c;
			}

			double ans = dijkstra();
			System.out.println(ans < 0 ? "unreachable" : ans);
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