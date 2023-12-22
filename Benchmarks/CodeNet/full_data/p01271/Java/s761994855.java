
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

public class Main {
	FastScanner in = new FastScanner(System.in);
	PrintWriter out = new PrintWriter(System.out);

	HashSet<Integer> hash = new HashSet<Integer>();	
	PriorityQueue<State> pq = new PriorityQueue<State>();
	boolean res;
	char[][] len, rin;

	int[] vx = {0, -1, 1, 0};
	int[] vy = {-1, 0, 0, 1};
	
	class State implements Comparable<State> {
		int len_x, len_y, rin_x, rin_y;
		
		State(int len_x, int len_y, int rin_x, int rin_y) {
			this.len_x = len_x;
			this.len_y = len_y;
			this.rin_x = rin_x;
			this.rin_y = rin_y;
		}

		@Override
		public int compareTo(State o) {
			return 0;
		}
		
		public String toString() {
			return len_x + " " + len_y + " " + rin_x + " " + rin_y;
		}
	}
	
	boolean isOk(int x, int y, int H, int W, char[][] map) {
		return x >= 0 && x < W && y >= 0 && y < H && map[y][x] != '#';
	}
	
	void bfs(int H, int W) {
		while (!pq.isEmpty()) {
			State s = pq.poll();
			for (int i = 0; i < vx.length; i++) {
				int len_nx = s.len_x + vx[i];
				int len_ny = s.len_y + vy[i];
				int rin_nx = s.rin_x - vx[i];
				int rin_ny = s.rin_y + vy[i];
				if (!isOk(len_nx, len_ny, H, W, len)) {
					len_nx -= vx[i];
					len_ny -= vy[i];
				}
				if (!isOk(rin_nx, rin_ny, H, W, rin)) {
					rin_nx += vx[i];
					rin_ny -= vy[i];
				}
				int hashValue = convert(len_nx, len_ny, rin_nx, rin_ny);
				if (!hash.contains(hashValue)) {
					if ((len[len_ny][len_nx] != '%' && rin[rin_ny][rin_nx] == '%') ||
						(len[len_ny][len_nx] == '%' && rin[rin_ny][rin_nx] != '%')) {
						continue;
					}
					pq.add(new State(len_nx, len_ny, rin_nx, rin_ny));
					hash.add(hashValue);
					if (len[len_ny][len_nx] == '%' && rin[rin_ny][rin_nx] == '%') res = true;
				}
			}
		}
	}
	
	int convert(int len_x, int len_y, int rin_x, int rin_y) {
		return len_x * 50*50*50 + len_y * 50*50 + rin_x * 50 + rin_y;
	}
	
	public void run() {
		while (true) {
			int W = in.nextInt(), H = in.nextInt();
			if (W == 0) break;
			hash.clear();
			res = false;
			
			len = new char[H][W];
			rin = new char[H][W];
			
			for (int i = 0; i < H; i++) {
				len[i] = in.next().toCharArray();
				rin[i] = in.next().toCharArray();
			}
			
			int len_sx = 0, len_sy = 0, rin_sx = 0, rin_sy = 0;
			
			for (int i = 0; i < H; i++) for (int j = 0; j < W; j++) {
				if (len[i][j] == 'L') {
					len_sx = j;
					len_sy = i;
				}
			}
			
			for (int i = 0; i < H; i++) for (int j = 0; j < W; j++) {
				if (rin[i][j] == 'R') {
					rin_sx = j;
					rin_sy = i;
				}
			}
			
			pq.clear();
			pq.add(new State(len_sx, len_sy, rin_sx, rin_sy));
			hash.add(convert(len_sx, len_sy, rin_sx, rin_sy));
			
			bfs(H, W);	
			
			System.out.println(res ? "Yes" : "No");
		}
		out.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(char[][] a) {
		System.out.println("--------map display---------");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%c ", a[i][j]);
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