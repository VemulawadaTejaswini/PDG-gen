import java.awt.Point;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	int w, h;
	char[][] c;
	int[] rdx = { 1, 1, 1, 1, 1, 2, 2, 2, 3 };
	int[] rdy = { 2, 1, 0, -1, -2, 1, 0, -1, 0 };
	int[] ldx = { -1, -1, -1, -1, -1, -2, -2, -2, -3 };
	int[] ldy = { 2, 1, 0, -1, -2, 1, 0, -1, 0 };

	class D implements Comparable<D> {
		int lx, ly, rx, ry;
		int min;

		D(int lx, int ly, int rx, int ry, int min) {
			this.lx = lx;
			this.ly = ly;
			this.rx = rx;
			this.ry = ry;
			this.min = min;
		}

		@Override
		public int compareTo(D o) {
			if (this.min != o.min) {
				return this.min - o.min;
			}
			if (this.lx != o.lx) {
				return this.lx - o.lx;
			}
			if (this.ly != o.ly) {
				return this.ly - o.ly;
			}
			if (this.rx != o.rx) {
				return this.rx - o.rx;
			}
			if (this.ry != o.ry) {
				return this.ry - o.ry;
			}
			return 0;
		}
	}

	int dijkstra() {
		PriorityQueue<D> queue = new PriorityQueue<D>();

		List<Point> list = new LinkedList<Point>();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (c[i][j] == 'S') {
					list.add(new Point(j, i));
				}
			}
		}
		//		Point[] p = list.toArray(new Point[0]);
		//		for (int i = 0; i < p.length; i++) {
		//			for (int j = i + 1; j < p.length; j++) {
		//				Point l = p[i].x < p[j].x ? p[i] : p[j];
		//				Point r = p[i].x < p[j].x ? p[j] : p[i];
		//				if (r.x - l.x <= 3) {
		//					queue.add(new D(l.x, l.y, r.x, r.y, 0));
		//				}
		//			}
		//		}
		for (Point p : list) {
			queue.add(new D(p.x, p.y, p.x, p.y, 0));
		}

		boolean[][][][] vis = new boolean[w][h][w][h];

		while (!queue.isEmpty()) {
			D d = queue.poll();
			int lx = d.lx;
			int ly = d.ly;
			int rx = d.rx;
			int ry = d.ry;
			int min = d.min;

			if (vis[lx][ly][rx][ry]) {
				continue;
			}
			vis[lx][ly][rx][ry] = true;

			if (c[ly][lx] == 'T' || c[ry][rx] == 'T') {
				return min;
			}

			for (int i = 0; i < 9; i++) {
				int nlx = lx;
				int nly = ly;
				int nrx = nlx + rdx[i];
				int nry = nly + rdy[i];
				if (nrx < 0 || w <= nrx || nry < 0 || h <= nry) {
					continue;
				}
				if (c[nry][nrx] == 'X') {
					continue;
				}
				int add;
				if (c[nry][nrx] == 'T') {
					add = 0;
				} else {
					add = c[nry][nrx] - '0';
				}
				int nmin = min + add;
				queue.add(new D(nlx, nly, nrx, nry, nmin));
			}
			for (int i = 0; i < 9; i++) {
				int nrx = rx;
				int nry = ry;
				int nlx = rx + ldx[i];
				int nly = ry + ldy[i];
				if (nlx < 0 || w <= nlx || nly < 0 || h <= nly) {
					continue;
				}
				if (c[nly][nlx] == 'X') {
					continue;
				}
				int add;
				if (c[nly][nlx] == 'T') {
					add = 0;
				} else {
					add = c[nly][nlx] - '0';
				}
				int nmin = min + add;
				queue.add(new D(nlx, nly, nrx, nry, nmin));
			}
		}

		return -1;
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if ((w | h) == 0) {
				break;
			}
			c = new char[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					c[i][j] = sc.next().charAt(0);
				}
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