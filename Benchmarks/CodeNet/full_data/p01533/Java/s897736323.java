import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	final int MOD = 1000000007;
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };
	int[] dx2 = { 1, 0, 0, -1, 1, -1, -1, 1 };
	int[] dy2 = { 0, 1, -1, 0, 1, 1, -1, -1 };

	void run() {
		int w = sc.nextInt();
		int h = sc.nextInt();
		char[][] f = new char[h][w];
		int[][] hole = new int[h][w];
		for (int i = 0; i < h; i++) {
			Arrays.fill(hole[i], 1);
		}
		int num = 0;
		int sh = 0;
		int sw = 0;
		for (int i = 0; i < h; i++) {
			String in = sc.next();
			for (int j = 0; j < w; j++) {
				f[i][j] = in.charAt(j);
				if (f[i][j] == 'S') {
					sh = i;
					sw = j;
				}
				if (f[i][j] == 'M') {
					f[i][j] = (char) (num++ + '0');
				}
				if (f[i][j] == '#') {
					LinkedList<Info> que = new LinkedList<Info>();
					que.add(new Info(0, i, j));
					int cost = 3;
					while (cost != 0) {
						int s = que.size();
						for (int k = 0; k < s; k++) {
							Info now = que.poll();
							for (int l = 0; l < 8; l++) {
								int nh = now.h + dy2[l];
								int nw = now.w + dx2[l];
								if (inner(nh, nw, h, w) && hole[nh][nw] < cost) {
									hole[nh][nw] = cost;
									que.add(new Info(0, nh, nw));
								}
							}
						}
						cost--;
					}
				}
			}
		}

		LinkedList<Info> que = new LinkedList<Info>();
		int[][][] cost = new int[1 << num][h][w];
		for (int i = 0; i < 1 << num; i++) {
			for (int j = 0; j < h; j++) {
				Arrays.fill(cost[i][j], Integer.MAX_VALUE / 10);
			}
		}
		cost[0][sh][sw] = 0;
		que.add(new Info(0, sh, sw));
		int min = Integer.MAX_VALUE / 10;
		while (!que.isEmpty()) {
			Info now = que.poll();
			if (Character.isDigit(f[now.h][now.w])) {
				int m = Integer.valueOf(f[now.h][now.w] - '0');
				if (cost[now.num][now.h][now.w] < cost[now.num | (1 << m)][now.h][now.w]) {
					cost[now.num | (1 << m)][now.h][now.w] = cost[now.num][now.h][now.w];
					now.num |= 1 << m;
				}
			}
			if (f[now.h][now.w] == 'G' && now.num == (1 << num) - 1) {
				min = Math.min(min, cost[(1 << num) - 1][now.h][now.w]);
			}
			for (int i = 0; i < 4; i++) {
				int nh = now.h + dy[i];
				int nw = now.w + dx[i];
				if (inner(nh, nw, h, w) && f[nh][nw] != '#') {
					if (cost[now.num][now.h][now.w] + hole[now.h][now.w] < cost[now.num][nh][nw]) {
						cost[now.num][nh][nw] = cost[now.num][now.h][now.w] + hole[now.h][now.w];
						que.add(new Info(now.num, nh, nw));
					}
				}
			}
		}
		System.out.println(min);
	}

	class Info {
		int num;
		int h;
		int w;

		/**
		 * @param h
		 * @param w
		 */
		public Info(int num, int h, int w) {
			super();
			this.num = num;
			this.h = h;
			this.w = w;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(char[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	void debug3(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	boolean inner(int h, int w, int limH, int limW) {
		return 0 <= h && h < limH && 0 <= w && w < limW;
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