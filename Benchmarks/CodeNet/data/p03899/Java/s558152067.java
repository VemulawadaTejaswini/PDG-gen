import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/A1";

	FastScanner in;
	PrintWriter out;
	
	class SegmentTree {
		private final int INF = 100000000;
		int N;
		int[] minDat;
		long[] maxDat;
		double[] sumDat;
		
		public SegmentTree(int n) {
			N = Integer.highestOneBit(n) << 1;
			int size = (N << 1) - 1;
			// If each function is not necessary, the size of each array should be 1 to save memory.
			minDat = new int[0];
			maxDat = new long[size];
			sumDat = new double[0];
			Arrays.fill(minDat, -INF);
			Arrays.fill(maxDat, Integer.MIN_VALUE);
		}

		void minUpdate(int k, int a) {
			k += N - 1;
			minDat[k] = a;
			while (k > 0) {
				k = (k - 1) / 2;
				minDat[k] = Math.min(minDat[k*2 + 1], minDat[k*2 + 2]);
			}
		}
		
		void maxUpdate(int k, long a) {
			k += N - 1;
			maxDat[k] = a;
			while (k > 0) {
				k = (k - 1) / 2;
				maxDat[k] = Math.max(maxDat[k*2 + 1], maxDat[k*2 + 2]);
			}
		}
		
		void sumUpdate(int k, double a) {
			k += N - 1;
			sumDat[k] = a;
			while (k > 0) {
				k = (k - 1) / 2;
				sumDat[k] = sumDat[k*2+1] + sumDat[k*2+2];
			}
		}
		
		private int minQuery(int a, int b, int k, int l, int r) {
			if (r < a || b < l) return INF;
			
			if (a <= l && r <= b) return minDat[k];
			else {
				int vl = minQuery(a, b, k * 2 + 1, l, (l + r) / 2);
				int vr = minQuery(a, b, k * 2 + 2, (l + r) / 2 + 1, r);
				return Math.min(vl, vr);
			}
		}

		private long maxQuery(int a, int b, int k, int l, int r) {
			if (r < a || b < l) return Integer.MIN_VALUE;
			
			if (a <= l && r <= b) return maxDat[k];
			else {
				long vl = maxQuery(a, b, k * 2 + 1, l, (l + r) / 2);
				long vr = maxQuery(a, b, k * 2 + 2, (l + r) / 2 + 1, r);
				return Math.max(vl, vr);
			}
		}
		
		private double sumQuery(int a, int b, int k, int l, int r) {
			if (r < a || b < l) return 0;
			
			if (a <= l && r <= b) return sumDat[k];
			else {
				double vl = sumQuery(a, b, k * 2 + 1, l, (l + r) / 2);
				double vr = sumQuery(a, b, k * 2 + 2, (l + r) / 2 + 1, r);
				return vl + vr;
			}
		}
		
		int getMinQuery(int a, int b) {
			return minQuery(a, b, 0, 0, N - 1);
		}
		
		long getMaxQuery(int a, int b) {
			return maxQuery(a, b, 0, 0, N - 1);
		}
		
		double getSumQuery(int a, int b) {
			return sumQuery(a, b, 0, 0, N - 1);
		}
		
		void display() {
			int[] dat = minDat;
			System.out.println("-------------Segment Tree-------------");
			for (int i = 1; i < dat.length; i *= 2) {
				for (int j = i; j < 2 * i; j++) {
					System.out.print(dat[j-1] + " ");
				}
				System.out.println();
			}
			System.out.println("----------------End------------------");
			System.out.println();
		}
	}
	
	public void solve() {
		int n = in.nextInt(), m = in.nextInt(), k = in.nextInt();
		int[] A = in.nextIntArray(n);
		if (k > 30) return;
		
		SegmentTree[] st = new SegmentTree[k+1];
		for (int i = 0; i < k + 1; i++) {
			st[i] = new SegmentTree(n + 1);
		}				
		
		for (int i = 0; i < k; i++) {
			for (int j = i; j < n; j++) {
				long next = (i == 0 ? 0 : st[i].getMaxQuery(0, j - 1)) + (i + 1L) * A[j];
				st[i+1].maxUpdate(j, next);
			}
		}
		System.out.println(st[k].getMaxQuery(0, n + 1));
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

		Thread t = new Thread(null, new Runnable() {

			@Override
			public void run() {
				solve();
			}
		}, "lul", 1 << 30);
		t.start();
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
