import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	final int MOD = 1000000007;
	int[] dx = { 1, 1, 0, 0, -1, -1 };
	int[] dy = { 1, 0, -1, 1, 0, -1 };

	void run() {

		for (;;) {
			int t = sc.nextInt();
			int n = sc.nextInt();
			if ((t | n) == 0) {
				return;
			}
			int[][] visit = new int[150][150];
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt() + 75;
				int y = sc.nextInt() + 75;
				visit[y][x] = -1;
			}
			int sx = sc.nextInt() + 75;
			int sy = sc.nextInt() + 75;
			visit[sy][sx] = 1;

			LinkedList<Pos> que = new LinkedList<Pos>();
			que.add(new Pos(sx, sy));
			int turn = 0;
			while (!que.isEmpty() && turn++ < t) {
				int size = que.size();
				for (int i = 0; i < size; i++) {
					Pos now = que.poll();
					for (int j = 0; j < 6; j++) {
						int nextX = now.x + dx[j];
						int nextY = now.y + dy[j];
						if (visit[nextY][nextX] == 0) {
							visit[nextY][nextX] = 1;
							que.add(new Pos(nextX, nextY));
						}
					}
				}
			}
			int cnt = 0;
			for (int i = 0; i < 150; i++) {
				for (int j = 0; j < 150; j++) {
					if (visit[i][j] == 1) {
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}

	class Pos {
		int x;
		int y;

		/**
		 * @param x
		 * @param y
		 */
		public Pos(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	boolean inner(int h, int w, int lim) {
		return 0 <= h && h < lim && 0 <= w && w < lim;
	}

	void swap(int[] x, int a, int b) {
		int tmp = x[a];
		x[a] = x[b];
		x[b] = tmp;
	}

	// find minimum i (a[i] >= border)
	int lower_bound(int a[], int border) {
		int l = -1;
		int r = a.length;

		while (r - l > 1) {
			int mid = (l + r) / 2;
			if (border <= a[mid]) {
				r = mid;
			} else {
				l = mid;
			}
		}
		// r = l + 1
		return r;
	}

	class MyScanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}

		int[] nextIntArray(int n) {
			int[] in = new int[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextInt();
			}
			return in;
		}

		int[][] nextInt2dArray(int n, int m) {
			int[][] in = new int[n][m];
			for (int i = 0; i < n; i++) {
				in[i] = nextIntArray(m);
			}
			return in;
		}

		double[] nextDoubleArray(int n) {
			double[] in = new double[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextDouble();
			}
			return in;
		}

		long[] nextLongArray(int n) {
			long[] in = new long[n];
			for (int i = 0; i < n; i++) {
				in[i] = nextLong();
			}
			return in;
		}
	}
}