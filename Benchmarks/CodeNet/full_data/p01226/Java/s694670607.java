import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	int h, w;
	char[][] map;
	int x, y;
	char d;
	int[] dx, dy;
	char[] tank;

	void init() {
		int max = 0;
		max = Math.max(max, '^');
		max = Math.max(max, 'v');
		max = Math.max(max, '>');
		max = Math.max(max, '<');
		max++;
		dx = new int[max];
		dy = new int[max];
		dy['^'] = -1;
		dy['v'] = 1;
		dx['>'] = 1;
		dx['<'] = -1;
		tank = new char['Z'];
		tank['U'] = '^';
		tank['D'] = 'v';
		tank['R'] = '>';
		tank['L'] = '<';
	}

	void shot() {
		int gx = x;
		int gy = y;

		while (true) {
			int nx = gx + dx[d];
			int ny = gy + dy[d];
			if (nx < 0 || w <= nx || ny < 0 || h <= ny) {
				return;
			}
			if (map[ny][nx] == '*') {
				map[ny][nx] = '.';
				return;
			}
			if (map[ny][nx] == '#') {
				return;
			}
			gx = nx;
			gy = ny;
		}
	}

	void print() {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}

	void move(char c) {
		map[y][x] = tank[c];
		d = tank[c];
		int nx = x + dx[tank[c]];
		int ny = y + dy[tank[c]];
		if (nx < 0 || w <= nx || ny < 0 || h <= ny) {
			return;
		}
		if (map[ny][nx] == '.') {
			char tmp = map[y][x];
			map[y][x] = map[ny][nx];
			map[ny][nx] = tmp;
			x = nx;
			y = ny;
		}
	}

	void run() {
		MyScanner sc = new MyScanner();
		init();
		String tab = "";

		for (int T = sc.nextInt() - 1; 0 <= T; T--) {
			h = sc.nextInt();
			w = sc.nextInt();
			map = new char[h][];
			for (int i = 0; i < h; i++) {
				map[i] = sc.next().toCharArray();
			}
			int n = sc.nextInt();
			char[] o = sc.next().toCharArray();
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					char c = map[i][j];
					if (c == '^' || c == 'v' || c == '>' || c == '<') {
						x = j;
						y = i;
						d = map[i][j];
					}
				}
			}

			for (int i = 0; i < n; i++) {
				char c = o[i];
				if (c == 'S') {
					shot();
				} else {
					move(c);
				}
			}
			System.out.print(tab);
			tab = "\r\n";
			print();
		}
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
		System.out.println("----------------------------" + '\n');
	}

	class MyScanner {
		int read() {
			try {
				return System.in.read();
			} catch (IOException e) {
				throw new InputMismatchException();
			}
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