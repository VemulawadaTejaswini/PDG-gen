import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		int  n = ni(), L = ni(), T = ni();
		int[][] xs = new int[n][];
		for(int i = 0;i < n;i++){
			xs[i] = new int[]{ni(), ni()};
		}
		int[] cl = new int[n];
		int[] ccl = new int[n];
		int p = 0, q = 0;
		for(int i = 0;i < n;i++){
			if(xs[i][1] == 1){
				cl[p++] = L-xs[i][0];
			}else{
				ccl[q++] = xs[i][0];
			}
		}
		Arrays.sort(cl, 0, p);
		// x, x + 2*T
		long[] rets = new long[n];
		Arrays.fill(rets, Long.MAX_VALUE);
		for(int i = 0;i < n;i++){
			if(xs[i][1] == 1){
				int count = (int)(count(ccl, q, xs[i][0], xs[i][0] + 2L*T, L) % n);
				rets[(i+count) % n] = (xs[i][0] + T) % L;
			}else{
				int count = (int)(count(cl, p, L-xs[i][0], L-xs[i][0] + 2L*T, L) % n);
				rets[(i+n-count) % n] = (xs[i][0] + L - T%L) % L;
			}
		}
		for(long ret : rets){
			out.println(ret);
		}
	}
	
	static long count(int[] xs, int q, long f, long t, int L)
	{
		long ret = 0;
		{
			ret += t/L*q;
			int ind = Arrays.binarySearch(xs, 0, q, (int)(t % L));
			if(ind < 0)ind = -ind-2;
			ind++;
			ret += ind;
		}
		
		{
			ret -= f/L*q;
			int ind = Arrays.binarySearch(xs, 0, q, (int)(f % L));
			if(ind < 0)ind = -ind-2;
			ind++;
			ret -= ind;
		}
		return ret;
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
