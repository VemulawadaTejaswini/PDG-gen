import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		int n = ni(), m = ni();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0;i < n;i++){
			a[i] = ni();
			b[i] = ni();
		}
		
		int[] from = new int[m];
		int[] to = new int[m];
		for(int i = 0;i < m;i++){
			from[i] = ni()-1;
			to[i] = ni()-1;
		}
		int[][] g = packU(n, from, to);
		
		
		int[][] ai = new int[n][];
		for(int i = 0;i < n;i++)ai[i] = new int[]{a[i], i};
		Arrays.sort(ai, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if(a[0] != b[0])return a[0] - b[0];
				return a[1] - b[1];
			}
		});
		
		long[] dp = new long[n];
		boolean[] done = new boolean[n];
		boolean[] ved = new boolean[n];
		DJSet ds = new DJSet(n);
		for(int i = 0;i < n;i++)ds.bsum[i] = b[i];
		for(int i = 0;i < n;i++){
			int id = ai[i][1];
			
			long dpsum = 0;
			int hit = 0;
			long bs = 0;
			for(int e : g[id]){
				if(!done[e])continue;
				if(ved[ds.root(e)])continue;
				hit++;
				bs += ds.bsum[ds.root(e)];
				
				dpsum += dp[ds.root(e)];
				ved[ds.root(e)] = true;
			}
			
			for(int e : g[id]){
				ved[ds.root(e)] = false;
			}
			
			// x -> y
			// >= dp[x]
			// >= bsum[x]+a[id]
			// >= bsum[x]+b[id]
			
			// y -> x
			// >= a[id]
			// >= b[id] + dp[x]
			
			// yp -> xp -> y -> zp
			// >= b[id] + dp[x]
			// >= a[id] + bsum[x]
			// >= b[id] + bsum[x] + dp[z]
			
			// y -> xp -> yp -> zp
			// >= dp[x]
			// >= a[id] + bsum[x]
			// >= b[id] + bsum[x] + dp[z]
			
			// dp[x] + bsum[so far] <= 
			// a[id] + bsum[not last]
			// b[id] + bsum[not last] + last
			
			// a[id] + bsum[not last]
			// b[id] + bsum[not last] + dp[last]
			long val = Long.MAX_VALUE;
			if(hit == 0){
				val = Math.max(a[id], b[id]);
			}else{
				for(int e : g[id]){
					if(!done[e])continue;
					val = Math.min(val, 
							bs - ds.bsum[ds.root(e)] + Math.max(a[id], b[id] + dp[ds.root(e)])
							);
				}
				val = Math.min(val, 
						Math.max(
								bs + b[id], 
						bs + a[id])
								);
			}
			
			for(int e : g[id]){
				if(!done[e])continue;
				ds.union(e, id);
			}
			dp[ds.root(id)] = val;
//			tr(id, val, bs);
			
			done[id] = true;
		}
		out.println(dp[ds.root(0)]);
	}
	
	static int[][] packU(int n, int[] from, int[] to) {
		int[][] g = new int[n][];
		int[] p = new int[n];
		for (int f : from)
			p[f]++;
		for (int t : to)
			p[t]++;
		for (int i = 0; i < n; i++)
			g[i] = new int[p[i]];
		for (int i = 0; i < from.length; i++) {
			g[from[i]][--p[from[i]]] = to[i];
			g[to[i]][--p[to[i]]] = from[i];
		}
		return g;
	}
	
	public static class DJSet {
		public int[] upper;
		public long[] bsum;

		public DJSet(int n) {
			upper = new int[n];
			Arrays.fill(upper, -1);
			bsum = new long[n];
		}

		public int root(int x) {
			return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
		}

		public boolean equiv(int x, int y) {
			return root(x) == root(y);
		}

		public boolean union(int x, int y) {
			x = root(x);
			y = root(y);
			if (x != y) {
				if (upper[y] < upper[x]) {
					int d = x;
					x = y;
					y = d;
				}
				upper[x] += upper[y];
				upper[y] = x;
				bsum[x] += bsum[y];
			}
			return x == y;
		}

		public int count() {
			int ct = 0;
			for (int u : upper)
				if (u < 0)
					ct++;
			return ct;
		}
	}

	public static void main(String[] args) throws Exception
	{
		long S = System.currentTimeMillis();
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		solve();
		out.flush();
		long G = System.currentTimeMillis();
		tr(G-S+"ms");
	}
	
	private static boolean eof()
	{
		if(lenbuf == -1)return true;
		int lptr = ptrbuf;
		while(lptr < lenbuf)if(!isSpaceChar(inbuf[lptr++]))return false;
		
		try {
			is.mark(1000);
			while(true){
				int b = is.read();
				if(b == -1){
					is.reset();
					return true;
				}else if(!isSpaceChar(b)){
					is.reset();
					return false;
				}
			}
		} catch (IOException e) {
			return true;
		}
	}
	
	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;
	
	private static int readByte()
	{
		if(lenbuf == -1)throw new InputMismatchException();
		if(ptrbuf >= lenbuf){
			ptrbuf = 0;
			try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
			if(lenbuf <= 0)return -1;
		}
		return inbuf[ptrbuf++];
	}
	
	private static boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
//	private static boolean isSpaceChar(int c) { return !(c >= 32 && c <= 126); }
	private static int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
	
	private static double nd() { return Double.parseDouble(ns()); }
	private static char nc() { return (char)skip(); }
	
	private static String ns()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while(!(isSpaceChar(b))){
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	
	private static char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while(p < n && !(isSpaceChar(b))){
			buf[p++] = (char)b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}
	
	private static char[][] nm(int n, int m)
	{
		char[][] map = new char[n][];
		for(int i = 0;i < n;i++)map[i] = ns(m);
		return map;
	}
	
	private static int[] na(int n)
	{
		int[] a = new int[n];
		for(int i = 0;i < n;i++)a[i] = ni();
		return a;
	}
	
	private static int ni()
	{
		int num = 0, b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}
		
		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private static long nl()
	{
		long num = 0;
		int b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}
		
		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
}
