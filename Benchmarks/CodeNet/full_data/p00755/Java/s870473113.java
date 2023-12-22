

import java.io.*;
import java.util.*;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	int[][][] map;
	boolean[][] visited = new boolean[40][40];
	
	int targetc;
	int[] vx = {1, 0, -1, 0}, vy = {0, 1, 0, -1};
	int dfs2(int x, int y, int[][] a) {
		if (a[y][x] != targetc || visited[y][x]) return 0;
		
		visited[y][x] = true;
		int h = a.length, w = a[0].length;
		int res = 1;
		for (int d = 0; d < vx.length; d++) {
			int nx = x + vx[d], ny = y + vy[d];
			if (nx >= 0 && nx < w && ny >= 0 && ny < h) {
				res += dfs2(nx, ny, a);
			}
		}
		return res;
	}
	
	void dfs3(int origin, int c, int x, int y, int num) {
		if (visited[y][x]) return;
		visited[y][x] = true;
		
		int h = map[0].length, w = map[0][0].length;
		for (int d = 0; d < vx.length; d++) {
			int nx = x + vx[d], ny = y + vy[d];
			if (nx >= 0 && nx < w && ny >= 0 && ny < h && (origin == map[num][ny][nx])) {
				dfs3(origin, c, nx, ny, num);
			}
		}
		map[num][y][x] = c;
	}
	
	int dfs(int color, int num) {
		int h = map[0].length, w = map[0][0].length;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				map[num+1][i][j] = map[num][i][j];
			}
		}
		
		for (int i = 0; i < visited.length; i++) Arrays.fill(visited[i], false);
		dfs3(map[num+1][0][0], color, 0, 0, num + 1);
		
		if (num == 4) {
			for (int i = 0; i < visited.length; i++) Arrays.fill(visited[i], false);
			int x = dfs2(0, 0, map[5]);

			return x;
		} else {
			int res = 0;
			for (int i = 1; i <= 6; i++) {
				res = Math.max(res, dfs(i, num + 1));
			}
			return res;			
		}
	}
	
//	int[] order = {6, 3, 4, 2, 5};
	public void run() {
		while (true) {
			int h = in.nextInt(), w = in.nextInt();
			targetc = in.nextInt();
			
			if (h == 0) break;
			
			map = new int[7][h][w];
			for (int i = 0; i < h; i++) {
				map[0][i] = in.nextIntArray(w);
			}
			
			int res = 0;
			for (int i = 1; i <= 6; i++)
				res = Math.max(res, dfs(i, 0));
			System.out.println(res);
		}
		out.close();
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

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();

			return array;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();

			return array;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();

			return array;
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

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
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