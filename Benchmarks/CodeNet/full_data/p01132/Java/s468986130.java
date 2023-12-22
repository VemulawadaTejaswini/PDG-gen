import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	final int MOD = 1000000007;
	int[] dx = { 1, 0, 0, -1 };
	int[] dy = { 0, 1, -1, 0 };

	void run() {
		boolean f = false;
		for (;;) {
			int money = sc.nextInt();
			if (money == 0) {
				return;
			}
			if (f) {
				System.out.println();
			}
			f = true;
			int[] coin = sc.nextIntArray(4);
			int[] use = new int[4];
			for (int i = 0; i < 4; i++) {
				int c = coin[i];
				if (i == 0) {
					int m = money / 10;
					if (c != 0) {
						for (int j = 1; j <= c; j++) {
							if ((m - j) % 5 == 0) {
								use[i] = j;
								m -= j;
								c -= j;
								break;
							}
						}
					}
					while (c >= 5 && m >= 5) {
						c -= 5;
						m -= 5;
						use[i] += 5;
					}
					money = m * 10;
				}
				if (i == 1) {
					int m = money;
					if (c != 0) {
						for (int j = 1; j <= c; j++) {
							if (m % (50 * j) == 0) {
								use[i] = j;
								m -= 50 * j;
								c -= j;
								break;
							}
						}
					}
					while (c >= 2 && m >= 100) {
						c -= 2;
						m -= 100;
						use[i] += 2;
					}
					while (c >= 1 && m >= 10) {
						c -= 1;
						m -= 50;
						use[i] += 1;
					}
					money = m;
				}
				if (i == 2) {
					int m = money;
					if (c != 0) {
						for (int j = 1; j <= c; j++) {
							if ((m - (100 * j)) % 500 == 0) {
								use[i] = j;
								m -= 100 * j;
								c -= j;
								break;
							}
						}
						while (c > 0 && m > 0 && m < 500) {
							c -= 1;
							m -= 100;
							use[i] += 1;
						}
						while (c >= 5 && m >= 500) {
							c -= 5;
							m -= 500;
							use[i] += 5;
						}
					}
					money = m;
				}
				if (i == 3) {
					int m = money;
					if (c != 0) {
						while (c >= 1 && m > 0) {
							c -= 1;
							m -= 500;
							use[i] += 1;
						}
					}
				}
			}
			for (int i = 0; i < 4; i++) {
				if (i == 0) {
					if (use[i] != 0) {
						System.out.println(10 + " " + use[i]);
					}
				} else if (i == 1) {
					if (use[i] != 0) {
						System.out.println(50 + " " + use[i]);
					}
				} else if (i == 2) {
					if (use[i] != 0) {
						System.out.println(100 + " " + use[i]);
					}
				} else if (i == 3) {
					if (use[i] != 0) {
						System.out.println(500 + " " + use[i]);
					}
				}
			}
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