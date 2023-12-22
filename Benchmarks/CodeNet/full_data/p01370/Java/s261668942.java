
import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	int[][][] map = new int[2][121][121];
	boolean[][] visited = new boolean[121][121];
	
	int[] vx = {0, 1, -1, 1, -1, 0};
	int[] vy = {1, 1, 0, 0, -1, -1};
	
	public void run() {
		while (true) {
			int t = in.nextInt(), n = in.nextInt();
			if (t == 0) break;
			for (int i = 0; i <= 120; i++) {
				Arrays.fill(map[0][i], 0);
				Arrays.fill(map[1][i], 0);
				Arrays.fill(visited[i], false);
			}
			for (int i = 0; i < n; i++) {
				int x = in.nextInt(), y = in.nextInt();
				map[0][60+x][60+y] = map[1][60+x][60+y] = -1;
			}
			int startX = in.nextInt(), startY = in.nextInt();
			
			map[0][60+startX][60+startY] = 1;
			visited[60+startX][60+startY] = true;
			int cur = 0;
			for (int i = 0; i < t; i++) {
				for (int j = 0; j <= 120; j++) {
					for (int k = 0; k <= 120; k++) {
						if (map[cur][j][k] == 1) {
							for (int a = 0; a < vx.length; a++) {
								int nx = j + vx[a], ny = k + vy[a];
								if (map[cur][nx][ny] != -1) {
									map[cur^1][nx][ny] = 1;
									visited[nx][ny] = true;
								}
							}
						}
					}
				}
				cur ^= 1;
			}
			
			int res = 0;
			for (int i = 0; i <= 120; i++) {
				for (int j = 0; j <= 120; j++) {
					if (visited[i][j]) {
						res++;
					}
				}
			}
			
			System.out.println(res);
		}
		out.close();
	}

	boolean isOk(int x, int M, int y, int N) {
		return 0 <= x && x < M && 0 <= y && y < N && Math.abs(x-30) <= 30 && Math.abs(y-30) <= 30;
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

		System.out.println("----------------------------");
		System.out.println();
	}

	public void debug(Object... obj) {
		System.out.println(Arrays.deepToString(obj));
	}

	class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
			//stream = new FileInputStream(new File("dec.in"));

		}

		int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
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

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
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