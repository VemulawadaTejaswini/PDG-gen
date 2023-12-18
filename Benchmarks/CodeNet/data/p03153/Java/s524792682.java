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
		int n = ni(), D = ni();
		int[] a = na(n);
		Long[] res = dfs(0, n, a, D);
		long ans = 0;
		for(Long e : res){
			ans += cost((int)(e>>>32), (int)(long)e, a, D);
		}
		out.println(ans);
	}
	
	static Long[] dfs(int l, int r, int[] a, long D)
	{
		if(r-l <= 1)return new Long[0];
		int h = l+r>>1;
		// [l,h), [h,r)
		
		long min = Long.MAX_VALUE;
		int argr =-1;
		for(int i = h;i < r;i++){
			long oc = a[i] + (i-h)*D;
			if(oc < min){
				min = oc;
				argr = i;
			}
		}
		
		Long[] es = new Long[r-l+(r-h)*2];
		int p = 0;
		
		long minl = Long.MAX_VALUE;
		int argl = -1;
		for(int i = l;i < h;i++){
			long v = (h-i)*D + a[i];
			if(v < minl){
				minl = v;
				argl = i;
			}
		}
		
		for(int i = h;i < r;i++){
			es[p++] = (long)argl<<32|i;
		}
		for(int i = l;i < h;i++){
			es[p++] = (long)i<<32|argr;
		}
		
		Long[] les = dfs(l, h, a, D);
		Long[] res = dfs(h, r, a, D);
		
		for(Long e : les)es[p++] = e;
		for(Long e : res)es[p++] = e;
		
		es = Arrays.copyOf(es, p);
		Arrays.sort(es, new Comparator<Long>() {
			public int compare(Long x, Long y) {
				return Long.compare(cost((int)(x>>>32), (int)(long)x, a, D), 
						cost((int)(y>>>32), (int)(long)y, a, D));
			}
		});
		
		DJSet ds = new DJSet(r-l);
		Long[] ret = new Long[r-l-1];
		int rp = 0;
		for(Long e : es){
			if(!ds.union((int)(e>>>32)-l, ((int)(long)e)-l)){
				ret[rp++] = e;
			}
		}
		assert rp == ret.length;
		return ret;
	}
	
	static long cost(int x, int y, int[] a, long D)
	{
		return Math.abs(x-y)*D + a[x]+a[y];
	}
		
		public static class DJSet {
			public int[] upper;

			public DJSet(int n) {
				upper = new int[n];
				Arrays.fill(upper, -1);
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
