
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
//		if (true) { test(); return; }
//		int TEST_CASE = Integer.parseInt(new String(io.nextLine()).trim());
		int TEST_CASE = 1;
		while(TEST_CASE-- != 0) {
			int n = io.nextInt();
			List<Integer>[] g = new List[n];
			for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
			for (int i = 0; i < n - 1; i++) {
				int a = io.nextInt() - 1;
				int b = io.nextInt() - 1;
				g[a].add(b);
				g[b].add(a);
			}
//			io.out.println(dfs(g, 0, 0) ? "First" : "Second");
			io.out.println(check(g) ? "First" : "Second");
		}
	}
	
	void test() {
		while (true) {
			int n = 9;
			List<Integer>[] g = genTree(n);
			boolean ans1 = dfs(g, 0, 0);
			boolean ans2 = check(g);
			if (ans1 != ans2) {
				dump(g, ans1, ans2);
				return;
			}
			dump("checked");
		}
	}

	// pat == 0 : chain
	boolean[][] memo;
	boolean chokudai;
	List<Integer>[] g;
	boolean dfs(int v, int p, int pat) {
		int ok = 0;
		for (int t : g[v]) if (t != p) {
			ok += dfs(t, v, pat^1) ? 1 : 0;
		}
		boolean cur;
		if (g[v].size() == 1) {
			cur = pat == 0;
		} else {
			cur = pat == 1 || g[v].size() == 2;
		}
		if (cur) {
			if (ok >= 2) chokudai = true;
			if (g[v].size() == 1 && ok == 1) chokudai = true;
		}
//		dump(v, p, pat, ok, cur, chokudai);
		boolean res = cur && (g[v].size() == 1 || ok >= 1);
		memo[pat][v] = res;
		return res;
	}
	void dfs2(int v, int p, boolean p0, boolean p1) {
		if (p == -1) {
			int cnt0 = 0;
			int cnt1 = 0;
			for (int t : g[v]) if (t != p) {
				cnt0 += memo[0][t] ? 1 : 0;
				cnt1 += memo[1][t] ? 1 : 0;
			}
			if (cnt1 == g[v].size()) {
				chokudai = true;
//				dump("dump", cnt0, cnt1, p1, v);
//				dump("dump2", cnt0, cnt1, p0, p1, g[v]);
			}
			if (g[v].size() == 1) cnt1++;
			for (int t : g[v]) if (t != p) {
				cnt0 -= memo[0][t] ? 1 : 0;
				cnt1 -= memo[1][t] ? 1 : 0;
				boolean ok0 = g[v].size() == 1 || cnt1 > 0 && g[v].size() == 2;
				dfs2(t, v, ok0, cnt0 > 0);
				cnt0 += memo[0][t] ? 1 : 0;
				cnt1 += memo[1][t] ? 1 : 0;
			}
		} else {
			int cnt0 = 0;
			int cnt1 = 0;
			for (int t : g[v]) if (t != p) {
				cnt0 += memo[0][t] ? 1 : 0;
				cnt1 += memo[1][t] ? 1 : 0;
			}
			if (p1 && cnt1 + 1 == g[v].size() && g[v].size() > 1) {
				chokudai = true;
//				dump("dump", cnt0, cnt1, p1, v);
//				dump("dump2", cnt0, cnt1, p0, p1, g[v]);
			}
//			if (v == 1) {
//				dump("dump", cnt0, cnt1, p1, v);
//				dump("dump2", cnt0, cnt1, p0, p1, g[v]);
//			}
			for (int t : g[v]) if (t != p) {
				cnt0 -= memo[0][t] ? 1 : 0;
				cnt1 -= memo[1][t] ? 1 : 0;
				dfs2(t, v, p1 && g[v].size() == 2, p0 || cnt0 > 0);
				cnt0 += memo[0][t] ? 1 : 0;
				cnt1 += memo[1][t] ? 1 : 0;
			}
		}
	}

	boolean check(List<Integer>[] g) {
//		int n = g.length;
//		boolean win = false;
//		for (int i = 0; i < n && !win; i++) {
//			int c = 0;
//			for (int t : g[i]) {
//				if (g[t].size() == 1) c++;
//			}
//			if (c >= 2) win = true;
//			win |= checkV(g, i);
//		}
//		return win;
		this.g = g;
		memo = new boolean[2][g.length];
		chokudai = false;
		dfs(0, -1, 0);
		dfs(0, -1, 1);
		dfs2(0, -1, false, false);
		return chokudai;
	}

	TreeMap<Integer, Boolean> mp = new TreeMap<>();
	boolean dfs(List<Integer>[] g, int v, int white) {
		if (v == 0) mp.clear();
		int key = v<<16|white;
		if (mp.containsKey(key)) return mp.get(key);
		int n = g.length;
		boolean ans = false;
		if (v == (1<<n) - 1) {
			for (int i = 0; i < n; i++) if ((white>>>i&1)==1) {
				boolean ok = true;
				for (int t : g[i]) ok &= (white>>>t&1)==1;
				if (ok) { ans = true; break; }
			}
		} else {
			int o = 1 ^ Integer.bitCount(v) % 2;
			if (o == 1) {
				ans = false;
			} else {
				ans = true;
			}
			
			for (int i = 0; i < n; i++) if ((v>>>i&1)==0) {
				if (o == 1) {
					// taka
					if (dfs(g, v | 1<<i, white | o<<i)) {
						ans = true;
						break;
					}
				} else {
					if (!dfs(g, v | 1<<i, white | o<<i)) {
						ans = false;
						break;
					}
				}
			}
		}
		mp.put(key, ans);
		return ans;
	}
	
	boolean checkV(List<Integer>[] g, int v) {
		for (int t1 : g[v]) {
			boolean find = false;
			for (int t2 : g[t1]) if (t2 != v) {
				find |= g[t2].size() == 1;
			}
			if (!find) return false;
		}
		return true;
	}
	
	List<Integer>[] genTree(int n) {
		List<Integer>[] g = new List[n];
		for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
		for (int i = 1; i < n; i++) {
			int p = random.nextInt(i);
			g[i].add(p);
			g[p].add(i);
		}
		return g;
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
