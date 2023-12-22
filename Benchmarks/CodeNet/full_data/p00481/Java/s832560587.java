import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	final int MOD = 1000000007;
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	void run() {
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		char[][] f = new char[H][W];
		Info[] goal = new Info[N];
		LinkedList<Info> que = new LinkedList<Info>();
		for (int i = 0; i < H; i++) {
			String in = sc.next();
			for (int j = 0; j < W; j++) {
				f[i][j] = in.charAt(j);
				if (Character.isDigit(f[i][j])) {
					int num = f[i][j] - '0';
					goal[num - 1] = new Info(i, j);
				}
				if (f[i][j] == 'S') {
					que.add(new Info(i, j));
				}
			}
		}
		int all = 0;
		for (int I = 0; I < N; I++) {
			int cnt = 1;
			boolean[][] visit = new boolean[H][W];
			L: while (!que.isEmpty()) {
				int size = que.size();
				for (int i = 0; i < size; i++) {
					Info now = que.poll();
					visit[now.h][now.w] = true;
					for (int j = 0; j < 4; j++) {
						int nextH = now.h + dy[j];
						int nextW = now.w + dx[j];
						if (inner(nextH, nextW, H, W)) {
							if (nextH == goal[I].h && nextW == goal[I].w) {
								all += cnt;
								que.clear();
								que.add(new Info(nextH, nextW));
								break L;
							}
							if (!visit[nextH][nextW] && f[nextH][nextW] != 'X') {
								visit[nextH][nextW] = true;
								que.add(new Info(nextH, nextW));
							}
						}
					}
				}
				cnt++;
			}
		}
		System.out.println(all);
	}

	class Info {
		int h;
		int w;

		/**
		 * @param h
		 * @param w
		 */
		public Info(int h, int w) {
			super();
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

	void debug2(int[][] array) {
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