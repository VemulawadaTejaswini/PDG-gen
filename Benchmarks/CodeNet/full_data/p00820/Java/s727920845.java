import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	int mod = 1000000007;

	void run() {
		for (;;) {
			int N = sc.nextInt();
			if (N == 0) {
				return;
			}
			int[][] table = new int[4][200];
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 200; j++) {
					table[i][j] = (int) (Math.pow(j + 1, 2) * (i + 1));
				}
			}

			int cnt = 0;
			// select one
			for (int i = 0; i < 200; i++) {
				if (table[0][i] == N) {
					cnt++;
				}
			}

			// select two
			for (int i = 0; i < 200; i++) {
				if (table[1][i] == N) {
					cnt++;
				}
			}
			for (int i = 0; i < 200; i++) {
				for (int j = i + 1; j < 200; j++) {
					if (table[0][i] + table[0][j] == N) {
						cnt++;
					}
				}
			}

			// select three
			for (int i = 0; i < 200; i++) {
				if (table[2][i] == N) {
					cnt++;
				}
			}
			for (int i = 0; i < 200; i++) {
				for (int j = 0; j < 200; j++) {
					if (i == j) {
						continue;
					}
					if (table[0][i] + table[1][j] == N) {
						cnt++;
					}
				}
			}
			for (int i = 0; i < 200; i++) {
				for (int j = i + 1; j < 200; j++) {
					for (int k = j + 1; k < 200; k++) {
						if (table[0][i] + table[0][j] + table[0][k] == N) {
							cnt++;
						}
					}
				}
			}

			// select four
			for (int i = 0; i < 200; i++) {
				if (table[3][i] == N) {
					cnt++;
				}
			}
			for (int i = 0; i < 200; i++) {
				for (int j = 0; j < 200; j++) {
					if (i == j) {
						continue;
					}
					if (table[0][i] + table[2][j] == N) {
						cnt++;
					}
				}
			}
			for (int i = 0; i < 200; i++) {
				for (int j = i + 1; j < 200; j++) {
					if (table[1][i] + table[1][j] == N) {
						cnt++;
					}
				}
			}
			for (int i = 0; i < 200; i++) {
				for (int j = i + 1; j < 200; j++) {
					for (int k = 0; k < 200; k++) {
						if (i == k || j == k) {
							continue;
						}
						if (table[0][i] + table[0][j] + table[1][k] == N) {
							cnt++;
						}
					}
				}
			}
			for (int i = 0; i < 200; i++) {
				for (int j = i + 1; j < 200; j++) {
					for (int k = j + 1; k < 200; k++) {
						for (int l = k + 1; l < 200; l++) {
							if (table[0][i] + table[0][j] + table[0][k]
									+ table[0][l] == N) {
								cnt++;
							}
						}
					}
				}
			}
			System.out.println(cnt);
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
				System.out.printf("%02d ", array[i][j]);
			}
			System.out.println();
		}
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
	}
}