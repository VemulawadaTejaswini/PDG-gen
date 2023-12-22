import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	int w, h;
	int[][] f;
	int dx[] = { -1, 0, 0, 1 };
	int dy[] = { 0, -1, 1, 0 };

	class D {
		int lx, ly, rx, ry;
		int min;

		D(int lx, int ly, int rx, int ry, int min) {
			this.lx = lx;
			this.ly = ly;
			this.rx = rx;
			this.ry = ry;
			this.min = min;
		}
	}

	int bfs(int lx, int ly, int rx, int ry) {
		Queue<D> queue = new LinkedList<D>();
		boolean[][][][] vis = new boolean[w][h][w][h];
		queue.add(new D(lx, ly, rx, ry, 0));

		while (!queue.isEmpty()) {
			D d = queue.poll();

			if (vis[d.lx][d.ly][d.rx][d.ry]) {
				continue;
			}
			vis[d.lx][d.ly][d.rx][d.ry] = true;
			if (100 <= d.min) {
				continue;
			}
			if (d.lx == d.rx && d.ly == d.ry) {
				return d.min;
			}

			for (int i = 0; i < 4; i++) {
				int nlx = d.lx + dx[i];
				int nly = d.ly + dy[i];
				int nrx = d.rx - dx[i];
				int nry = d.ry - dy[i];
				if (nlx < 0 || w <= nlx || nly < 0 || h <= nly) {
					continue;
				}
				if (nrx < 0 || w <= nrx || nry < 0 || h <= nry) {
					continue;
				}
				if (f[nly][nlx] > 0) {
					nlx -= dx[i];
					nly -= dy[i];
				}
				if (f[nry][nrx] > 0) {
					nrx += dx[i];
					nry += dy[i];
				}
				int nmin = d.min + 1;
				if (!vis[nlx][nly][nrx][nry]) {
					queue.add(new D(nlx, nly, nrx, nry, nmin));
				}
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
			int lx = sc.nextInt() - 1;
			int ly = sc.nextInt() - 1;
			int rx = sc.nextInt() - 1;
			int ry = sc.nextInt() - 1;
			f = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					f[i][j] = sc.nextInt();
				}
			}

			int ans = bfs(lx, ly, rx, ry);
			System.out.println(ans >= 0 ? ans : "NA");
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