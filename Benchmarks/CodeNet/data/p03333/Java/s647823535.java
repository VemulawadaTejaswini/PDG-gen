import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		int n = ni();
		int[][] rs = new int[n][];
		for(int i = 0;i < n;i++){
			rs[i] = new int[]{ni(), ni(), i};
		}
		
		long ans = go(rs);
		
		for(int i = 0;i < n;i++){
			int l = rs[i][0], r = rs[i][1];
			rs[i][0] = -r;
			rs[i][1] = -l;
		}
		ans = Math.max(ans, go(rs));
		out.println(ans);
	}
		
	static long go(int[][] rs)
	{
		int n = rs.length;
		PriorityQueue<int[]> pql = new PriorityQueue<>((x, y) -> {
			if(x[1] != y[1])return x[1] - y[1];
			return x[0] - y[0];
		});
		PriorityQueue<int[]> pqr = new PriorityQueue<>((x, y) -> {
			if(x[0] != y[0])return -(x[0] - y[0]);
			return -(x[1] - y[1]);
		});
		boolean[] done = new boolean[n];
		for(int i = 0;i < n;i++){
			pql.add(rs[i]);
			pqr.add(rs[i]);
		}
		
		long ans = 0;
		long x = 0;
		while(true){
			while(!pql.isEmpty() && done[pql.peek()[2]])pql.poll();
			if(pql.isEmpty())break;
			int[] L = pql.poll();
			if(x > L[1]){
				ans += x-L[1];
				x = L[1];
			}else if(x < L[0]){
				ans += L[0] - x;
				x = L[0];
			}
			done[L[2]] = true;
			while(!pqr.isEmpty() && done[pqr.peek()[2]])pqr.poll();
			if(pqr.isEmpty())break;
			int[] R = pqr.poll();
			if(x > R[1]){
				ans += x-R[1];
				x = R[1];
			}else if(x < R[0]){
				ans += R[0] - x;
				x = R[0];
			}
			done[R[2]] = true;
		}
		ans += Math.abs(x);
		
		return ans;
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
