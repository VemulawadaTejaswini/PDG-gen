import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	
	int __STACKSIZE_CHANGE_FLAG__ = __f__;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/C2";

	FastScanner in;
	PrintWriter out;
	class Pair implements Comparable<Pair> {
		int id;
		int p;
		int type;

		Pair(int id, int p, int type) {
			this.id = id;
			this.p = p;
			this.type = type;
		}

		public int compareTo(Pair s) {
			return p - s.p;
		}

		public String toString() {
			return "(" + id + ", " + p + ", " + type + ")";
		}
	}
	
	public void solve() {
		int N = in.nextInt();
		int M = in.nextInt();
		int[] l = new int[N];
		int[] r = new int[N];
		Pair[] ps = new Pair[2 * N];
		for (int i = 0; i < N; i++) {
			l[i] = in.nextInt();
			r[i] = in.nextInt();
			ps[2*i] = new Pair(i, l[i], 0);
			ps[2*i+1] = new Pair(i, r[i] + 1, 1);
		}
		
		Arrays.sort(ps);
		boolean[] flag = new boolean[N];
		Queue<Integer> q = new LinkedList<>();
		for (int d = 1; d <= M; d++) {
			int ptr = 0, res = 0;
			for (int pos = 0; pos <= M; pos += d) {
				while (ptr < ps.length && ps[ptr].p <= pos) {
					if (ps[ptr].type == 0) {
						// left
						flag[ps[ptr].id] = true;
						q.add(ps[ptr].id);
					} else {
						// right
						flag[ps[ptr].id] = false;
					}
					ptr++;
				}
				while (!q.isEmpty()) {
					int next = q.poll();
					if (flag[next]) res++;
				}
			}
			while (ptr < ps.length) {
				flag[ps[ptr].id] = false;
				ptr++;
			}
			out.println(res);
		}
		out.close();
	}
	
	public void run() {
		if (__FILE_DEBUG_FLAG__ == __t__) {
			try {
				is = new FileInputStream(__DEBUG_FILE_NAME__);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("FILE_INPUT!");
		} else {
			is = System.in;
		}
		in = new FastScanner(is);
		out = new PrintWriter(System.out);
		if (__STACKSIZE_CHANGE_FLAG__ == __t__)
			new Thread(null, new Runnable() {
				@Override
				public void run() {
					solve();
				}
			}, "main", 1 << 30).start();
		else
			solve();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(long[][] a) {
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
			// stream = new FileInputStream(new File("dec.in"));

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
