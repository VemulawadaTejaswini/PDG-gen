import java.util.Arrays;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	int mod = 1000000007;
	int n, flag, goal, d, startX;

	void run() {
		for (;;) {
			n = sc.nextInt();
			if (n == 0) {
				return;
			}
			startX = (sc.nextInt() - 1) * 2;
			goal = sc.nextInt();
			d = sc.nextInt();
			int[][] field = new int[d][n * 2 - 1];
			flag = 1;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < d; j++) {
					field[j][i * 2] = 1;
				}
			}
			for (int i = 0; i < d; i++) {
				char[] input = sc.next().toCharArray();
				for (int j = 0; j < input.length; j++) {
					field[i][1 + j * 2] = Integer.valueOf(input[j] - '0');
				}
			}
			int nowX = startX;
			for (int nowY = 0; nowY < d; nowY++) {
				if (nowX - 2 >= 0 && field[nowY][nowX - 1] == 1) {
					nowX = nowX - 2;
				} else if (nowX + 2 <= n * 2 - 2 && field[nowY][nowX + 1] == 1) {
					nowX = nowX + 2;
				}
			}
			if ((nowX / 2 + 1) == goal) {
				flag = 0;
			} else {
				label:
				for (int i = 0; i < d; i++) {
					for (int j = 0; j < n * 2 - 1; j++) {
						if (flag == 2) {
							break label;
						}
						if (field[i][j] == 0) {
							if ((j - 2 < 0 || j - 2 > 0 && field[i][j - 2] != 1)
									&& (j + 2 > n * 2 - 2 || j + 2 < n * 2 - 2
											&& field[i][j + 2] != 1)) {
								check(field, j, i);
							}
						}
					}
				}
			}
			if (flag != 2) {
				System.out.println(flag);
			}
		}
	}

	void check(int field[][], int connectX, int connectY) {
		field[connectY][connectX] = 1;
		int nowX = startX;
		for (int nowY = 0; nowY < d; nowY++) {
			if (nowX - 2 >= 0 && field[nowY][nowX - 1] == 1) {
				nowX = nowX - 2;
			} else if (nowX + 2 <= n * 2 - 2 && field[nowY][nowX + 1] == 1) {
				nowX = nowX + 2;
			}
		}
		field[connectY][connectX] = 0;
		if (nowX / 2 + 1 == goal) {
			flag = 2;
			System.out.println((connectY + 1) + " " + (connectX / 2 + 1));
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
				System.out.print(array[i][j] + " ");
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