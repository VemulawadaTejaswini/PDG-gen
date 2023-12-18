
import java.io.*;
import java.math.*;
import java.util.*;

import static java.util.Arrays.*;

public class Main {
	private static final int mod = (int)1e9+7;

	final Random random = new Random(0);
	final IOFast io = new IOFast();

	/// MAIN CODE
	public void run() throws IOException {
//		int TEST_CASE = Integer.parseInt(new String(io.nextLine()).trim());
		int TEST_CASE = 1;
		while(TEST_CASE-- != 0) {
			n = io.nextInt();
			x = io.nextInt();
			a = new long[2*n];
			for(int i = 0; i < n; i++) {
				a[i] = a[i+n] = io.nextLong();
			}
			
			long ans = Long.MAX_VALUE;
			for(int i = 0; i < n; i++) {
				long[] dp = new long[n];
				ConvexHullTrick cht = new ConvexHullTrick(n);
				cht.add(n, 0);
				for(int j = n - 1; j >= 0; j--) {
//					cht.add(j, dp[j]);
					long c = a[i+j] + x;
					dp[j] = -(c*j+x) + cht.minY(c);
//					System.err.println(i + " " + j + " " + dp[j] + " " + c + " " + cht.minY(c));
					cht.add(j, dp[j]);
				}
				ans = Math.min(ans, dp[0]);
			}
			
			io.out.println(ans);
		}
	}
	
	int n;
	long x;
	long[] a;
	long[][] dp;
	long func(int idx, int len) {
		if(len == 0) return 0;
		if(dp[idx][len] == -1) {
			int next = 1;
			for(int i = 1; i < len; i++) {
				if(a[idx+i] < a[idx]+i*x) {
					break;
				}
				next++;
			}
			dp[idx][len] = a[idx]*next + (next-1)*x + func(idx + next, len - next);
//			System.err.println(idx + " " + len + " " + next + " " + dp[idx][len]);
		}
		return dp[idx][len];
	}
	
	static
	class ConvexHullTrick {
		int s, t;
		final Line[] line;
		
		public ConvexHullTrick(final int n) {
			line = new Line[n+1];
		}
		
		public void add(long a, long b) {
			final Line l = new Line(a, b);
			while(t - s >= 2) {
				final Line l1 = line[t-1];
				final Line l2 = line[t-2];
				if(l2.crossOrder(l1, l) >= 0) {
					line[--t] = null;
				} else {
					break;
				}
			}
			line[t++] = l;
		}
		
		public long minY(long x) {
//			remove(x);
//			return line[s].f(x);
			
			int low = s-1, high = t-1;
			while(high - low > 1) {
				int mid = (low + high) / 2;
				if(line[mid].f(x) >= line[mid+1].f(x)) {
					low = mid;
				} else {
					high = mid;
				}
			}
			return line[high].f(x);
		}
		
		private void remove(long x) {
			while(t - s >= 2) {
				// minimize
				if(line[s].f(x) >= line[s+1].f(x)) {
					s++;
				} else {
					break;
				}
			}
		}
	}
	
	static
	class Line {
		final long a, b;
		
		public Line(long a, long b) {
			this.a = a;
			this.b = b;
		}
		
		public long f(long x) {
			return a*x+b;
		}
		
		public long crossOrder(Line l1, Line l2) {
			final long x1 = -(l1.b-b)*(l2.a-a);
			final long x2 = -(l2.b-b)*(l1.a-a);
			return x1 - x2;
		}
		
		@Override
		public String toString() {
			return String.format("%d*x+%d", a, b);
		}
	}
	
	/// TEMPLATE
	static int gcd(int n, int r) { return r == 0 ? n : gcd(r, n%r); }
	static long gcd(long n, long r) { return r == 0 ? n : gcd(r, n%r); }
	
	static <T> void swap(T[] x, int i, int j) { T t = x[i]; x[i] = x[j]; x[j] = t; }
	static void swap(int[] x, int i, int j) { int t = x[i]; x[i] = x[j]; x[j] = t; }

	void printArrayLn(int[] xs) { for(int i = 0; i < xs.length; i++) io.out.print(xs[i] + (i==xs.length-1?"\n":" ")); }
	void printArrayLn(long[] xs) { for(int i = 0; i < xs.length; i++) io.out.print(xs[i] + (i==xs.length-1?"\n":" ")); }
	
	static void dump(Object... o) { System.err.println(Arrays.deepToString(o)); } 
	
	void main() throws IOException {
		//		IOFast.setFileIO("rle-size.in", "rle-size.out");
		try { run(); }
		catch (EndOfFileRuntimeException e) { }
		io.out.flush();
	}
	public static void main(String[] args) throws IOException { new Main().main(); }
	
	static class EndOfFileRuntimeException extends RuntimeException {
		private static final long serialVersionUID = -8565341110209207657L; }

	static
	public class IOFast {
		private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		private PrintWriter out = new PrintWriter(System.out);

		void setFileIn(String ins) throws IOException { in.close(); in = new BufferedReader(new FileReader(ins)); }
		void setFileOut(String outs) throws IOException { out.flush(); out.close(); out = new PrintWriter(new FileWriter(outs)); }
		void setFileIO(String ins, String outs) throws IOException { setFileIn(ins); setFileOut(outs); }

		private static int pos, readLen;
		private static final char[] buffer = new char[1024 * 8];
		private static char[] str = new char[500*8*2];
		private static boolean[] isDigit = new boolean[256];
		private static boolean[] isSpace = new boolean[256];
		private static boolean[] isLineSep = new boolean[256];

		static { for(int i = 0; i < 10; i++) { isDigit['0' + i] = true; } isDigit['-'] = true; isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true; isLineSep['\r'] = isLineSep['\n'] = true; }
		public int read() throws IOException { if(pos >= readLen) { pos = 0; readLen = in.read(buffer); if(readLen <= 0) { throw new EndOfFileRuntimeException(); } } return buffer[pos++]; }
		public int nextInt() throws IOException { int len = 0; str[len++] = nextChar(); len = reads(len, isSpace); int i = 0; int ret = 0; if(str[0] == '-') { i = 1; } for(; i < len; i++) ret = ret * 10 + str[i] - '0'; if(str[0] == '-') { ret = -ret; } return ret; }
		public long nextLong() throws IOException { int len = 0; str[len++] = nextChar(); len = reads(len, isSpace); int i = 0; long ret = 0; if(str[0] == '-') { i = 1; } for(; i < len; i++) ret = ret * 10 + str[i] - '0'; if(str[0] == '-') { ret = -ret; } return ret; }
		public char nextChar() throws IOException { while(true) { final int c = read(); if(!isSpace[c]) { return (char)c; } } }
		int reads(int len, boolean[] accept) throws IOException { try { while(true) { final int c = read(); if(accept[c]) { break; } if(str.length == len) { char[] rep = new char[str.length * 3 / 2]; System.arraycopy(str, 0, rep, 0, str.length); str = rep; } str[len++] = (char)c; } } catch(EndOfFileRuntimeException e) { ; } return len; }
		int reads(char[] cs, int len, boolean[] accept) throws IOException { try { while(true) { final int c = read(); if(accept[c]) { break; } cs[len++] = (char)c; } } catch(EndOfFileRuntimeException e) { ; } return len; }
		public char[] nextLine() throws IOException { int len = 0; str[len++] = nextChar(); len = reads(len, isLineSep); try { if(str[len-1] == '\r') { len--; read(); } } catch(EndOfFileRuntimeException e) { ; } return Arrays.copyOf(str, len); }
		public String nextString() throws IOException { return new String(next()); }
		public char[] next() throws IOException { int len = 0; str[len++] = nextChar(); len = reads(len, isSpace); return Arrays.copyOf(str, len); }
//		public int next(char[] cs) throws IOException { int len = 0; cs[len++] = nextChar(); len = reads(cs, len, isSpace); return len; }
		public double nextDouble() throws IOException { return Double.parseDouble(nextString()); }
		public long[] nextLongArray(final int n) throws IOException { final long[] res = new long[n]; for(int i = 0; i < n; i++) { res[i] = nextLong(); } return res; }
		public int[] nextIntArray(final int n) throws IOException { final int[] res = new int[n]; for(int i = 0; i < n; i++) { res[i] = nextInt(); } return res; }
		public int[][] nextIntArray2D(final int n, final int k) throws IOException { final int[][] res = new int[n][]; for(int i = 0; i < n; i++) { res[i] = nextIntArray(k); } return res; }
		public int[][] nextIntArray2DWithIndex(final int n, final int k) throws IOException { final int[][] res = new int[n][k+1]; for(int i = 0; i < n; i++) { for(int j = 0; j < k; j++) { res[i][j] = nextInt(); } res[i][k] = i; } return res; }
		public double[] nextDoubleArray(final int n) throws IOException { final double[] res = new double[n]; for(int i = 0; i < n; i++) { res[i] = nextDouble(); } return res; }
	}
}
