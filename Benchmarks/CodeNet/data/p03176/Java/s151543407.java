import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	private static int n;
	private static int[] h, a;
	private static long[] seg;
	
	public static void main(String[] args) {
		n = ini();
		h = ina(n);
		a = ina(n);
		
//		println(solve(0, -1));
		int maxH = 0;
		for(int height: h) {
			maxH = Math.max(maxH, height);
		}
		maxH++;
		seg = new long[4*maxH];
		
		
		long ans = 0;
		
		for(int i=0; i<n; i++) {
			long local =  a[i]+query(0, h[i]-1, 0, maxH-1, 0);
			ans = Math.max(ans, local);
			update(h[i], local, 0, maxH-1, 0);
		}
		
		println(ans);

		out.flush();
		out.close();

	}
	
	private static long query(int qlow, int qhigh, int low, int high, int pos) {
		
		if (qhigh<low || high<qlow) {
			return -1*(int)1e9;
		} else if (qlow<=low && qhigh>=high) {
			return seg[pos];
		} else {
			int mid = 0;
			mid = (low+high)/2;
			return Math.max(query(qlow, qhigh, low, mid, 2*pos+1),
					query(qlow, qhigh, mid+1, high, 2*pos+2));
		}
		
	}
	
	private static void update(int index, long value, int low, int high, int pos) {
		if (low==high) {
			seg[pos] = value;
			return;
		}
		
		int mid = (low+high)/2;
		if (index<=mid)
			update(index, value, low, mid, 2*pos+1);
		else
			update(index, value, mid+1, high, 2*pos+2);
		
		seg[pos] = Math.max(seg[2*pos+1], seg[2*pos+2]);
		
	}

	private static long solve(int i, int j) {
		if (i==n) return 0;
		
		long ans = 0;
		if (j==-1 || h[i]>h[j]) {
			ans = Math.max(ans, a[i]+solve(i+1, i));
		}
		ans = Math.max(ans, solve(i+1, j));
		return ans;
		
	}

	//NONPROBLEM CODE

	private static InputReader in = new InputReader(System.in);
	private static PrintWriter out = new PrintWriter(System.out);

	private static class InputReader {

		private final InputStream stream;
		private final byte[] buf = new byte[8192];
		private int curChar, snumChars;

		public InputReader(InputStream st) {
			this.stream = st;
		}

		public int read() {
			if (snumChars == -1)
				throw new InputMismatchException();
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (snumChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public long nextLong() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public int[] nextIntArray(int n) {
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = nextInt();
			}
			return a;
		}

		public String readString() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public String nextLine() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndOfLine(c));
			return res.toString();
		}

		public boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		private boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

	}

	//INPUT SHORTCUTS

	private static int[] ina(int n) {
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			temp[i] = in.nextInt();
		}
		return temp;
	}

	private static int ini() {
		return in.nextInt();
	}

	//OTHER SHORTCUTS
	public static void sort(int[] a) {
		Arrays.sort(a);
	}

	//PRINT SHORTCUTS

	private static void println(Object... o) {
		for (Object x : o) {
			out.write(x + " ");
		}
		out.write("\n");
		out.flush();
	}

	private static void print(Object... o) {
		for (Object x : o) {
			out.write(x + " ");
		}
		out.flush();
	}

	private static void debug(Object... o) {
		for (Object x : o) {
			out.write(x + " ");
		}
		out.write("\n");
		out.flush();
	}
}
