
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/T1";

	FastScanner in;
	PrintWriter out;

	int INF = 100000000;
	int[] vx = {0, 1, 1, 0, -1, -1};
	int[] evy = {1, 0, -1, -1, -1, 0};
	int[] ovy = {1, 1, 0, -1, 0, 1};
	
	int lx, ly;
	int[][][] cost;
	HashSet<Integer> wall = new HashSet<Integer>();
	
	class State implements Comparable<State> {
		int x;
		int y;
		int t;

		State(int x, int y, int t) {
			this.x = x;
			this.y = y;
			this.t = t;
		}

		public int compareTo(State s) {
			return cost[y][x][t] - cost[s.y][s.x][s.t];
		}

		public String toString() {
			return getClass().getName() + " : " + x + " " + y + " " + t + " " + mod(x, y, t);
		}
	}
	
	int mod(int x, int y, int t) {
		return Math.abs((x - lx) * (y - ly) * t) % 6;
	}
	
	boolean inside(int x, int y, int M, int N) {
		return x >= 0 && y >= 0 && x < M && y < N;
	}

	int calcHash(int x, int y) {
		return x * 5000 + y;
	}
	
	public void solve() {
		int sx = in.nextInt(), sy = in.nextInt();
		int gx = in.nextInt(), gy = in.nextInt();
		int n = in.nextInt();
		
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
		
		lx = in.nextInt();
		ly = in.nextInt();
		
		sx += lx; gx += lx;
		sy += ly; gy += ly;
		for (int i = 0; i < n; i++) {
			x[i] += lx;
			y[i] += ly;
			wall.add(calcHash(x[i], y[i]));
		}
		
		cost = new int[ly*2+1][lx*2+1][6];
		for (int i = 0; i <= ly * 2; i++) {
			for (int j = 0; j <= lx * 2; j++) {
				Arrays.fill(cost[i][j], INF);
			}
		}
		cost[sy][sx][0] = 0;
		
		PriorityQueue<State> pq = new PriorityQueue<State>();
		pq.add(new State(sx, sy, 0));
		
		while (!pq.isEmpty()) {
			State s = pq.poll();
			int nt = (s.t + 1) % 6;
			int d1 = mod(s.x, s.y, s.t);
			for (int d = 0; d < vx.length; d++) {
				int nx = s.x + vx[d];
				int ny = s.y + ((s.x - lx) % 2 == 0 ? evy[d] : ovy[d]);
				int ncost = cost[s.y][s.x][s.t] + (d1 == d ? 0 : 1);
				
				if (inside(nx, ny, lx * 2 + 1, ly * 2 + 1) && 
					!wall.contains(calcHash(nx, ny)) && 
					ncost < cost[ny][nx][nt]) {
					cost[ny][nx][nt] = ncost;
					pq.add(new State(nx, ny, nt));
				}
			}
			
			if (cost[s.y][s.x][s.t] + 1 < cost[s.y][s.x][nt]) {
				cost[s.y][s.x][nt] = cost[s.y][s.x][s.t] + 1;
				pq.add(new State(s.x, s.y, nt));
			}
		}
		
		int res = INF;
		for (int i = 0; i < 6; i++) {
			res = Math.min(res, cost[gy][gx][i]);
		}
		System.out.println(res == INF ? -1 : res);
	}
	
	public void run() {
		if (__FILE_DEBUG_FLAG__ == __t__) {
			try {
				is = new FileInputStream(__DEBUG_FILE_NAME__);
			} catch (FileNotFoundException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
			System.out.println("FILE_INPUT!");
		} else {
			is = System.in;
		}
		in = new FastScanner(is);
		out = new PrintWriter(System.out);

		solve();
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

		int[][] nextIntMap(int n, int m) {
			int[][] map = new int[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextIntArray(m);
			}
			return map;
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

		long[][] nextLongMap(int n, int m) {
			long[][] map = new long[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextLongArray(m);
			}
			return map;
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

		double[][] nextDoubleMap(int n, int m) {
			double[][] map = new double[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextDoubleArray(m);
			}
			return map;
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