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
			boolean[][] visit = new boolean[H][W];
			for (int i = 0; i < H; i++) {
				String input = sc.next();
				for (int j = 0; j < W; j++) {
					field[i][j] = input.charAt(j);
				}
			}

			Queue<Point> que = new LinkedList<Point>();
			BigInteger ans = new BigInteger("0");
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (Character.isDigit(field[i][j]) && !visit[i][j]) {
						que.add(new Point(j, i,
								new BigInteger(field[i][j] + "")));
						while (!que.isEmpty()) {
							int size = que.size();
							for (int k = 0; k < size; k++) {
								Point now = que.poll();
								ans = ans.max(now.number);

								int nowH = now.h;
								int nowW = now.w;
								visit[nowH][nowW] = true;
								BigInteger nowNum = now.number;
								for (int l = 0; l < 2; l++) {
									int nextH = nowH + dy[l];
									int nextW = nowW + dx[l];
									if (nextH < H
											&& nextW < W
											&& Character
													.isDigit(field[nextH][nextW])) {
										que.add(new Point(
												nextW,
												nextH,
												new BigInteger(
														nowNum
																+ ""
																+ new BigInteger(
																		field[nextH][nextW]
																				+ ""))));
									}
								}
							}
						}
					}
				}
			}
			System.out.println(ans);
		}
	}

	class Point {
		int w;
		int h;
		BigInteger number;

		/**
		 * @param w
		 * @param h
		 */
		public Point(int w, int h, BigInteger number) {
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

	void debug2(char[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
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