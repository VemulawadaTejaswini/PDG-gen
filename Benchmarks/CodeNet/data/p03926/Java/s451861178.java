
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
			int n = io.nextInt();
			A = new int[n];
			for (int i = 0; i < n-1; i++) A[i] = io.nextInt();
			int m = io.nextInt();
			int[] X = io.nextIntArray(m);
			A[n-1] = X[0];
			memo = new int[n];
			Arrays.fill(memo, -1);
			
			int ans = Integer.MIN_VALUE;
			SegRMQInt seg = new SegRMQInt(n);
			seg.set(n-1, -A[n-1]);
			// 2
			// 6, 2
			// 1, -6
			for (int i = n - 2; i >= 2; i--) {
				int v = A[i] + seg.get(i, n + 1);
				seg.set(i, -v);
				seg.add(i + 1, n, A[i]);
//				dump(2, i, v);
			}
			
			io.out.println(A[0] - A[1] - seg.get(2, n));
		}
	}
	
	int[] memo;
	int[] A;
	int f(int idx) {
		if (idx >= A.length) return 0;
		if (memo[idx] != -1) return memo[idx];
		int ans = Integer.MIN_VALUE;
		int s = 0;
		for (int i = idx; i < A.length; i++) {
			ans = Math.max(ans, A[i] - s - f(i + 1));
			s += A[i];
		}
		dump(1, idx, ans);
		return memo[idx] = ans;
	}
	
	static
	class SegRMQInt {
		final int INF = 1<<29;
		
		final int n;
		final int[] seg;
		final int[] add;
		
		public SegRMQInt(final int n) {
			this.n = Integer.highestOneBit(n) << 1;
			seg = new int[this.n << 1];
			add = new int[this.n << 1];
			Arrays.fill(seg, INF);
		}
		
		void propagate(int curL, int curR, int k) {
			if(add[k] != 0) {
				final int curM = (curL + curR) / 2;
				add(curL, curR, 2 * k + 1, add[k], curL, curM);
				add(curL, curR, 2 * k + 2, add[k], curM, curR);
				add[k] = 0;
			}
		}

		int get(int l, int r) { return get(l, r, 0, 0, n); }
		int get(int l, int r, int k, int curL, int curR) {
			if(curR <= l || curL >= r) return INF;
			if(l <= curL && curR <= r) { return seg[k]; }
			propagate(curL, curR, k);
			final int curM = (curL + curR) / 2;
			return Math.min(
					get(l, r, 2 * k + 1, curL, curM),
					get(l, r, 2 * k + 2, curM, curR));
		}

		void add(int l, int r, int v) { add(l, r, 0, v, 0, n); }
		void add(int l, int r, int k, int v, int curL, int curR) {
			if(curR <= l || curL >= r) return;
			if(l <= curL && curR <= r) { seg[k] += v; add[k] += v; return; }
			final int curM = (curL + curR) / 2;
			propagate(curL, curR, k);
			add(l, r, 2 * k + 1, v, curL, curM);
			add(l, r, 2 * k + 2, v, curM, curR);
			seg[k] = Math.min(seg[2*k+1], seg[2*k+2]);
		}
		
		void set(int i, int v) {
			// propagate to leaf
			add(i, i + 1, 0);
			
			i += n - 1;
			seg[i] = v;
			add[i] = 0;
			while(i != 0) {
				i = (i - 1) / 2;
				seg[i] = Math.min(seg[2*i+1], seg[2*i+2]) + add[i];
			}
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
