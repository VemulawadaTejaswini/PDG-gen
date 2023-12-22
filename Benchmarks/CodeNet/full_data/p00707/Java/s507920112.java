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
		for (;;) {
			int W = sc.nextInt();
			int H = sc.nextInt();
			if ((W | H) == 0)
				return;
			char[][] f = sc.nextCharField(H, W);
			Info[][] s = new Info[H][W];
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (!Character.isDigit(f[i][j])) {
						s[i][j] = new Info(".", i, j);
					} else {
						s[i][j] = new Info("0", i, j);
					}
				}
			}
			String max = "0";
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (!s[i][j].s.equals(".") && s[i][j].s.compareTo(f[i][j] + "") <= 0 && f[i][j] != '0') {
						s[i][j].s = f[i][j] + "";
						LinkedList<Info> que = new LinkedList<Info>();
						que.add(s[i][j]);
						while (!que.isEmpty()) {
							int size = que.size();
							for (int k = 0; k < size; k++) {
								Info now = que.poll();
								if(now.s.length() > max.length()) max = now.s;
								else  if(now.s.length() == max.length() && now.s.compareTo(max) > 0) max = now.s;
								if (inner(now.h + 1, now.w, H, W)
										&& Character
												.isDigit(f[now.h + 1][now.w])) {
									Info next = new Info(now.s
											+ f[now.h + 1][now.w], now.h + 1,
											now.w);
									if (next.s.compareTo(s[now.h + 1][now.w].s) > 0) {
										que.add(next);
										s[now.h + 1][now.w] = next;
									}
								}
								if (inner(now.h, now.w + 1, H, W)
										&& Character
												.isDigit(f[now.h][now.w + 1])) {
									Info next = new Info(now.s
											+ f[now.h][now.w + 1], now.h,
											now.w + 1);
									if (next.s.compareTo(s[now.h][now.w + 1].s) > 0) {
										que.add(next);
										s[now.h][now.w + 1] = next;
									}
								}
							}
						}
					}
				}
			}
			System.out.println(max);
		}
	}

	class Info {
		String s;
		int h;
		int w;

		public Info(String s, int h, int w) {
			super();
			this.s = s;
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

	boolean palindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
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

		char[][] nextCharField(int n, int m) {
			char[][] in = new char[n][m];
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				for (int j = 0; j < m; j++) {
					in[i][j] = s.charAt(j);
				}
			}
			return in;
		}
	}
}