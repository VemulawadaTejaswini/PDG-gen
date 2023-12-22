import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	int mod = 1000000007;

	int[] dx = { 1, 0 };
	int[] dy = { 0, 1 };

	void run() {
		for (;;) {
			int W = sc.nextInt();
			int H = sc.nextInt();
			if ((W | H) == 0) {
				return;
			}

			char[][] field = new char[H][W];
			BigInteger[][] maxHist = new BigInteger[H][W];
			for (int i = 0; i < H; i++) {
				String input = sc.next();
				for (int j = 0; j < W; j++) {
					field[i][j] = input.charAt(j);
					maxHist[i][j] = new BigInteger("0");
				}
			}
			for (int i = 0; i < W; i++) {
				if (Character.isDigit(field[0][i])) {
					if (i - 1 >= 0 && Character.isDigit(field[0][i - 1])) {
						maxHist[0][i] = new BigInteger(maxHist[0][i - 1] + ""
								+ field[0][i]);
					} else {
						maxHist[0][i] = new BigInteger(field[0][i] + "");
					}
				}
			}
			for (int i = 0; i < H; i++) {
				if (Character.isDigit(field[i][0])) {
					if (i - 1 >= 0 && Character.isDigit(field[i - 1][0])) {
						maxHist[i][0] = new BigInteger(maxHist[i - 1][0] + ""
								+ field[i][0]);
					} else {
						maxHist[i][0] = new BigInteger(field[i][0] + "");
					}
				}
			}
			for (int i = 1; i < H; i++) {
				for (int j = 1; j < W; j++) {
					if (!Character.isDigit(field[i][j])) {
						continue;
					}
					if (Character.isDigit(field[i - 1][j])
							&& !Character.isDigit(field[i][j - 1])) {
						maxHist[i][j] = new BigInteger(maxHist[i - 1][j] + ""
								+ field[i][j]);
					} else if (!Character.isDigit(field[i - 1][j])
							&& Character.isDigit(field[i][j - 1])) {
						maxHist[i][j] = new BigInteger(maxHist[i][j - 1] + ""
								+ field[i][j]);
					} else if (Character.isDigit(field[i - 1][j])
							&& Character.isDigit(field[i][j - 1])) {
						BigInteger tmp = maxHist[i][j - 1]
								.max(maxHist[i - 1][j]);
						maxHist[i][j] = new BigInteger(tmp + "" + field[i][j]);
					} else {
						maxHist[i][j] = new BigInteger(field[i][j] + "");
					}
				}
			}
			BigInteger ans = new BigInteger("0");
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					ans = ans.max(maxHist[i][j]);
				}
			}
			System.out.println(ans);
		}
	}

	class Point {
		int w;
		int h;
		String number;

		/**
		 * @param w
		 * @param h
		 */
		public Point(int w, int h, String number) {
			super();
			this.w = w;
			this.h = h;
			this.number = number;
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(BigInteger[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "            ");
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