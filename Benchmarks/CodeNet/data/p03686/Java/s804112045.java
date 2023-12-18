import java.io.*;
import java.math.*;
import java.util.*;
import java.util.Map.Entry;

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
			int m = io.nextInt();
			int m2 = Integer.highestOneBit(m)<<1;
			int numM = m2 * 2 - 1;
			
			int S = n + numM, T = S + 1;
			Dinic flow = new Dinic(T + 1);
			
//			dump(m2, numM);
			
			init(flow, 0, 0, m2);
			for (int i = 0; i < n; i++) {
				int l = io.nextInt();
				int r = io.nextInt() - 1;
				flow.AddEdge(S, i, 1);
//				dump("chk", i, 0, 0, l, 0, m2);
				addEdge(flow, i, 0, 0, l, 0, m2);
//				dump("chk", i, 1, r, m, 0, m2);
				addEdge(flow, i, 0, r, m, 0, m2);
			}
			for (int i = 0; i < m; i++) {
				flow.AddEdge(n+m2-1+i, T, 1);
			}
			
			io.out.println(n-flow.MaxFlow(S, T));
		}
	}
	
	int n;
	void init(Dinic flow, int k, int curL, int curR) {
		if (curR - curL == 0) return;
		if (k > 0) flow.AddEdge(n+(k-1)/2, n+k, 1<<29);
		if (curR - curL <= 1) return;
		int curM = (curL + curR) / 2;
		init(flow, 2*k+1, curL, curM);
		init(flow, 2*k+2, curM, curR);
	}
	void addEdge(Dinic flow, int i, int k, int l, int r, int curL, int curR) {
		if (l >= r) return;
//		if (l >= curL && r <= curR) { flow.AddEdge(i, n+k, 1); return; }
		if (curL >= l && curR <= r) { flow.AddEdge(i, n+k, 1); return; }
		if (r <= curL || l >= curR) { return; }
		int curM = (curL + curR) / 2;
		addEdge(flow, i, 2*k+1, l, r, curL, curM);
		addEdge(flow, i, 2*k+2, l, r, curM, curR);
	}
	
	
	
	static class Dinic {
		final int INF = 1 << 29;

//		List<List<Edge>> G;
		AdjListGraph g;
		int[] level, iter, q;
		List<int[]> es = new ArrayList<>();

		void bfs(int s) {
			for (int i = 0; i < level.length; i++) level[i] = -1;
//			Queue<Integer> q = new LinkedList<Integer>();
			int qs = 0, qt = 0;
			level[s] = 0;
			q[qt++] =s;
			while (qs != qt) {
				int v = q[qs++];
				for(int e = g.head[v]; e != -1; e = g.next[e]) {
					final int t = g.to[e];
					if (g.cap[e] > 0 && level[t] < 0) {
						level[t] = level[v] + 1;
						q[qt++] = t;
					}
				}
			}
		}

		int dfs(int v, int t, int f) {
			if (v == t) return f;
			for (int i = iter[v]; i != -1; i = iter[v] = g.next[i]) {
				if (g.cap[i] > 0 && level[v] < level[g.to[i]]) {
					int d = dfs(g.to[i], t, Math.min(f, g.cap[i]));
					if (d > 0) {
						g.cap[i] -= d;
						g.cap[g.rev[i]] += d;
						return d;
					}
				}
			}
			return 0;
		}

		public void AddEdge(int from, int to, int cap) {
//			dump(from, to, cap);
			es.add(new int[]{from, to, cap, });
//			g.addEdge(from, to, cap, g.m + 1);
//			g.addEdge(to, from, 0, g.m - 1);
		}
		
		private void build() {
			if(g == null) {
				g = new AdjListGraph(level.length, 2 * es.size() * 2);
				for(int[] e : es) {
					g.addEdge(e[0], e[1], e[2], g.m + 1);
					g.addEdge(e[1], e[0], 0, g.m - 1);
				}
			}
		}

		public int MaxFlow(int s, int t) {
			build();
			int flow = 0;
			for (; ; ) {
				bfs(s);
				if (level[t] < 0) return flow;
				for (int i = 0; i < iter.length; i++) iter[i] = g.head[i];
				for (int f = 0; (f = dfs(s, t, INF)) > 0; )
					flow += f;
			}
		}

		public int BipartiteMatching(int s, int t) {
			return MaxFlow(s, t);
		}
		
		void clear() {
			g.clear();
		}
		
		void clear(int n) {
			g.clear(n);
		}

		public Dinic(int size) {
			level = new int[size];
			iter = new int[size];
			q = new int[size];
		}

		int[][] generateGraphCut(int S, int T) {
			final int n = g.head.length;
			int[] q = new int[n];
			final boolean[] used = new boolean[n];
			used[S] = true;
			
			int cnt = 0;
			int s = 0, t = 0;
			q[t++] = S;
			while(s != t) {
				final int v = q[s++];
				cnt++;
				for(int u = g.head[v]; u != -1; u = g.next[u]) {
					final int to = g.to[u];
					final int cap = g.cap[u];
					if(cap != 0 && !used[to]) {
						q[t++] = to;
						used[to] = true;
					}
				}
			}
			final int[][] res = new int[2][];
			final int[] len = new int[2];
			res[0] = new int[cnt];
			res[1] = new int[n - cnt];
			for(int i = 0; i < n; i++) {
				final int x = used[i] ? 0 : 1;
				res[x][len[x]++] = i;
			}
			return res;
		}
		
		static class AdjListGraph {
			int m;
			int[] head, next, to, rev;
			int[] cap;

			public AdjListGraph(int V, int E) {
				head = new int[V];
				next = new int[E];
				to = new int[E];
				cap = new int[E];
				rev = new int[E];
				clear();
			}

			public void clear(int v) {
				m = 0;
				for(int i = 0; i < v; i++) {
					head[i] = -1;
				}
			}

			public void clear() {
				m = 0;
				Arrays.fill(head, -1);
			}

			public void addEdge(int s, int t, int c, int r) {
				next[m] = head[s];
				head[s] = m;
				to[m] = t;
				cap[m] = c;
				rev[m++] = r;
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
