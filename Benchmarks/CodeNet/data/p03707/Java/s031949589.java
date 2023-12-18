
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
			int h = io.nextInt();
			int w = io.nextInt();
			int q = io.nextInt();
			char[][] cs = new char[h][];
			int[][] deg = new int[h][w];
			for (int y = 0; y < h; y++) {
				cs[y] = io.next();
				for (int x = 0; x < w; x++) {
					if (cs[y][x] == '1') {
						if (x > 0 && cs[y][x-1] == '1') { deg[y][x]++; deg[y][x-1]++; }
						if (y > 0 && cs[y-1][x] == '1') { deg[y][x]++; deg[y-1][x]++; }
					}
				}
			}
			
			int[] d = new int[]{1,0,-1,0,1};
			int[] st = new int[w * h * 2 + 100];
			boolean[][] vis = new boolean[h][w];
			int[][] inc = new int[h+1][w+1];
			int[][] incx0 = new int[h+1][w+1];
			int[][] incx1 = new int[h+1][w+1];
			int[][] incy0 = new int[h+1][w+1];
			int[][] incy1 = new int[h+1][w+1];
			for (int y = 0; y < h; y++) {
				for (int x = 0; x < w; x++) if (cs[y][x] == '1' && deg[y][x] <= 1 && !vis[y][x]) {
					vis[y][x] = true;
					int sp = 0;
					st[sp++] = y<<16|x;
					inc[y+1][x+1]++;
					while (sp > 0) {
						int xx = st[--sp] & 0xFFFF;
						int yy = st[sp] >> 16;
						for (int i = 0; i < 4; i++) {
							int x2 = xx + d[i], y2 = yy + d[i+1];
							if (x2 < 0 || y2 < 0 || x2 >= w || y2 >= h || vis[y2][x2] || cs[y2][x2] == '0') continue;
							vis[y2][x2] = true;
							st[sp++] = y2<<16|x2;
							if (xx < x2) incx1[y2+1][x2+1]++;
							if (xx > x2) incx0[y2+1][x2+1]++;
							if (yy < y2) incy1[y2+1][x2+1]++;
							if (yy > y2) incy0[y2+1][x2+1]++;
						}
					}
				}
			}
			
			for (int x = 0; x <= w; x++) {
				for (int y = 1; y <= h; y++) {
					incx0[y][x] += incx0[y-1][x];
					incx1[y][x] += incx1[y-1][x];
					incy0[y][x] += incy0[y-1][x];
					incy1[y][x] += incy1[y-1][x];
					inc[y][x] += inc[y-1][x];
				}
			}
			for (int y = 0; y <= h; y++) {
				for (int x = 1; x <= w; x++) {
					incx0[y][x] += incx0[y][x-1];
					incx1[y][x] += incx1[y][x-1];
					incy0[y][x] += incy0[y][x-1];
					incy1[y][x] += incy1[y][x-1];
					inc[y][x] += inc[y][x-1];
				}
			}
			
			while (q-- > 0) {
				int y0 = io.nextInt();
				int x0 = io.nextInt();
				int y1 = io.nextInt();
				int x1 = io.nextInt();
				int ans = sum(inc, x1, y1, x0 - 1, y0 - 1);
				ans += sum(incx1, x0-0, y1, x0-1, y0-1);
				ans += sum(incx0, x1-0, y1, x1-1, y0-1);
				ans += sum(incy1, x1, y0-0, x0-1, y0-1);
				ans += sum(incy0, x1, y1-0, x0-1, y1-1);
				io.out.println(ans);
			}
		}
	}
	
	int sum(int[][] v, int x1, int y1, int x0, int y0) {
		if (y0 < 0 || y1 >= v.length || x0 < 0 || x1 >= v[0].length) return 0;
		return v[y1][x1]-v[y1][x0]-v[y0][x1]+v[y0][x0];
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
