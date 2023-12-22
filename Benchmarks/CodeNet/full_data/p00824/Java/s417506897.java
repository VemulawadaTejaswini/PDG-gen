
import java.awt.Point;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.SortedMap;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/T";

	FastScanner in;
	PrintWriter out;
	
	int[][] IDEAL = {
			{11, 12, 13, 14, 15, 16, 17, 0},
			{21, 22, 23, 24, 25, 26, 27, 0},
			{31, 32, 33, 34, 35, 36, 37, 0},
			{41, 42, 43, 44, 45, 46, 47, 0}			
	};
	
	boolean isSolved(int[][] target) {
		for (int i = 0; i < target.length; i++) {
			for (int j = 0; j < target[0].length; j++) {
				if (target[i][j] != IDEAL[i][j]) return false;
			}
		}		
		return true;
	}
	
	String getKey(int[][] a) {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				res.append(a[i][j] + " ");
			}
		}
		return res.toString();
	}
	
	int[][] copy(int[][] a) {
		if (X.isEmpty()) throw new RuntimeException();
		
		int[][] res = X.poll();
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				res[i][j] = a[i][j];
			}
		}
		return res;
	}
	
	int H = 4, W = 8;
	HashMap<String, Integer> hash = new HashMap<String, Integer>();	
	Queue<int[][]> q = new LinkedList<int[][]>();

	Queue<int[][]> X = new LinkedList<int[][]>();
	
	public void solve() {
		int T = in.nextInt();
		
		for (int i = 0; i < 100000; i++) {
			X.add(new int[H][W]);
		}
		
		main : 
		for (int times = 0; times < T; times++) {
			int[][] map = X.poll();
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W - 1; j++) {
					int next = in.nextInt();
					if (next % 10 == 1) {
						map[(next / 10) - 1][0] = next;
					} else {
						map[i][j+1] = next;
					}
				}
			}
			
			hash.clear();
			q.clear();
			
			q.add(map);			
			hash.put(getKey(map), 0);
			
			Queue<Point> cand = new LinkedList<Point>();
			while (!q.isEmpty()) {
				int[][] next = q.poll();
				int val = hash.get(getKey(next));

				if (isSolved(next)) {
					System.out.println(val);
					hash.clear();
					X.add(next);
					while (!q.isEmpty()) {
						X.add(q.poll());
					}
					continue main;
				}
				
				cand.clear();
				for (int i = 0; i < H; i++) {
					for (int j = 0; j < W; j++) {
						if (next[i][j] == 0) cand.add(new Point(j, i));
					}
				}
				
				while (!cand.isEmpty()) {
					Point p = cand.poll();
					int[][] nmap = copy(next);
					int nx = -1, ny = -1;
					for (int i = 0; i < H; i++) {
						for (int j = 0; j < W; j++) {
							if (next[i][j] == next[p.y][p.x - 1] + 1) {
								nx = j;
								ny = i;
							}
						}
					}
					if (nx != -1 && ny != -1) {
						nmap[p.y][p.x] = nmap[ny][nx];
						nmap[ny][nx] = 0;
						
						String key = getKey(nmap);
						if (!hash.containsKey(key)) {
							hash.put(key, val + 1);
							q.add(nmap);
						} else {
							X.add(nmap);
						}
					} else {
						X.add(nmap);
					}
				}
				
				X.add(next);
			}
			System.out.println(-1);
			hash.clear();
		}
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