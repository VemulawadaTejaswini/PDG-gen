import java.io.IOException;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

public class Main {
	int w, h;
	int[][] f;
	int[] cost;

	int STRAIGHT = 0;
	int RIGHT = 1;
	int BACK = 2;
	int LEFT = 3;
	int HALT = 4;

	int EAST = 0;
	int SOUTH = 1;
	int WEST = 2;
	int NORTH = 3;

	class D implements Comparable<D> {
		int x, y;
		int dir;
		int min;
		D par;

		D(int x, int y, int dir, int min) {
			this.x = x;
			this.y = y;
			this.dir = dir;
			this.min = min;
		}

		D(int x, int y, int dir, int min, D par) {
			this.x = x;
			this.y = y;
			this.dir = dir;
			this.min = min;
			this.par = par;
		}

		@Override
		public int compareTo(D o) {
			if (this.min != o.min) {
				return this.min - o.min;
			}
			if (this.x != o.x) {
				return this.x - o.x;
			}
			if (this.y != o.y) {
				return this.y - o.y;
			}
			if (this.dir != o.dir) {
				return this.dir - o.dir;
			}
			return 0;
		}

		@Override
		public String toString() {
			return "(" + x + ", " + y + "), dir = " + dir + ", cost = " + min;
		}
	}

	D dijkstra() {
		PriorityQueue<D> que = new PriorityQueue<D>();
		que.add(new D(0, 0, EAST, 0, null));
		int[] dx = new int[4];
		int[] dy = new int[4];
		dx[EAST] = 1;
		dx[WEST] = -1;
		dy[NORTH] = -1;
		dy[SOUTH] = 1;
		boolean[][][] vis = new boolean[w][h][4];

		while (!que.isEmpty()) {
			D d = que.poll();
			int x = d.x;
			int y = d.y;
			int dir = d.dir;
			int min = d.min;

			if (vis[x][y][dir]) {
				continue;
			}
			vis[x][y][dir] = true;
			if (x == w - 1 && y == h - 1) {
				// return min;
				return d;
			}

			int o = f[y][x];
			if (o != 4) {
				int ndir = (dir + o) % 4;
				int nx = x + dx[ndir];
				int ny = y + dy[ndir];
				if (!(nx < 0 || w <= nx || ny < 0 || h <= ny)) {
					if (!vis[nx][ny][ndir]) {
						que.add(new D(nx, ny, ndir, min, d));
					}
				}
			}
			for (int i = 0; i < 4; i++) {
				int ndir = (dir + i) % 4;
				int nx = x + dx[ndir];
				int ny = y + dy[ndir];
				if (nx < 0 || w <= nx || ny < 0 || h <= ny) {
					continue;
				}
				int nmin = min + cost[i];
				if (!vis[nx][ny][ndir]) {
					que.add(new D(nx, ny, ndir, nmin, d));
				}
			}
		}

		// return -1;
		return null;
	}

	void print(D d) {
		if (d == null) {
			return;
		}
		print(d.par);
		System.out.println(d);
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if ((w | h) == 0) {
				break;
			}
			f = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					f[i][j] = sc.nextInt();
				}
			}
			cost = new int[4];
			for (int i = 0; i < 4; i++) {
				cost[i] = sc.nextInt();
			}

			D ans = dijkstra();
			System.out.println(ans.min);
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