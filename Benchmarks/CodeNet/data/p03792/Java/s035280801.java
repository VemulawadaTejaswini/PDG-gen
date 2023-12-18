
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/T";

	FastScanner in;
	PrintWriter out;
	
	HashSet<String> hash = new HashSet<>();
	
	class Pair {
		int turn;
		String[] s;

		Pair(int turn, String[] s) {
			this.turn = turn;
			this.s = s;
		}
		
		Pair covert(Pair p, int ii, int jj) {
			int n = s.length;
			char[][] tmp = new char[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					tmp[i][j] = s[i].charAt(j);
				}
			}
			
			char[] c = new char[n];
			for (int j = 0; j < n; j++) {
				c[j] = tmp[ii][j];
			}
			for (int i = 0; i < n; i++) {
				tmp[i][jj] = c[i];
			}
			String[] next = new String[n];
			for (int i = 0; i < n; i++) {
				next[i] = String.valueOf(tmp[i]);
			}
			return new Pair(turn + 1, next);
		}
		
		boolean isOk() {
			int n = s.length;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (s[i].charAt(j) == '.')
						return false;
				}
			}
			return true;
		}
	}
	
	String toKey(String[] s) {
		String res = "";
		for (int i = 0; i < s.length; i++) {
			res += s[i] + " ";
		}
		return res;
	}
	
	public void solve() {
		int n = in.nextInt();
		String[] a = in.nextStringArray(n);
		if (n > 3) {
			return;
		}
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(0, a));
		
		while (!q.isEmpty()) {
			Pair cur = q.poll();
			if (cur.isOk()) {
				System.out.println(cur.turn);
				return;
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					Pair next = cur.covert(cur, i, j);
					String key = toKey(next.s);
					if (!hash.contains(key)) {
						hash.add(key);
						q.add(next);
					}
				}
			}
		}
		System.out.println("-1");
	}

	public void run() {
		if (__FILE_DEBUG_FLAG__ == __t__) {
			try {
				is = new FileInputStream(__DEBUG_FILE_NAME__);
			} catch (FileNotFoundException e) {
				// TODO 自動生成された catch ブロック
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

