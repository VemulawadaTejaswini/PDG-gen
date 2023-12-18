
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
			/*
//			for(long n = 1; n <= 1000; n++) {
			for(long n = 50; n <= 100000; n++) {
				int cnt = 0;
				for(long i = n; i > 2; i--) {
					if(f(i, n) > f(i-1, n)) {
						long d = f(i, n) - f(i+1, n);
//						System.err.println(n + " " + i + " " + d + " " + f(i, n));
						if(cnt != 0 && i != (n+cnt+1)/(cnt+1)) {
							throw new RuntimeException();
						}
						if(++cnt >= 3) break;
					}
				}
			}
			*/
//			for(long n = 1; n <= 1000; n++) {
//				for(long s = 1; s <= 1000; s++) {
//					if(func(n, s) != naive(n, s)) {
//						System.err.println(n + " " + s + " " + func(n, s) + " " + naive(n, s));
//						return;
//					}
//				}
//			}
			long n = io.nextLong();
			long s = io.nextLong();
			
			io.out.println(func(n, s));
//			io.out.println(naive(n, s));
		}
	}
	
	long func(long n, long s) {
		if(n <= 50) {
			for(int i = 2; i <= n; i++) {
				if(f(i, n) == s) {
					return i;
				}
			}
			return -1;
		}
//		for(long i = 2; i*i <= n; i++) {
//			if(f(i, n) == s) {
//				return i;
//			}
//		}
		if(s == n || s == 1) return n;
		long ans = -1;
		long sqrt = (long)Math.sqrt(n);
		for(long i = 2, cur = n; cur > 2 && cur > sqrt - 100; i++) {
//			System.err.println(i + " " + cur);
			long next = (n+i)/i;
			long len = cur - next;
			long a = f(cur - 1, n);
			// a, a + (i-1), a + 2*(i-1)
//			System.err.println("ck: " + s + " " + (i - 1) + " " + a + " " + len);
//			if(s % (i - 1) == a % (i - 1)) {
			if((s - a) % (i - 1) == 0) {
				if(s >= a && s <= a + (len-1)*(i-1)) {
					ans = cur - ((s - a) / (i - 1) + 1);
//					System.err.println("ans: " + ans);
				}
			}
			cur = next;
		}
		for(long i = 2; i*i <= n + 100 && (ans == -1 || i < ans); i++) {
			if(f(i, n) == s) {
				return i;
			}
		}
		return ans;
	}
	
	long naive(long n, long s) {
		for(long i = 2; i <= n; i++) {
			if(f(i, n) == s) {
				return i;
			}
//			System.err.println(i + " " + f(i, n));
		}
		return -1;
	}
	
	long f(long b, long n) {
		if(b <= 1) throw new RuntimeException();
		return n <= b ? n : (f(b, n/b) + n % b);
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
