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
	
	static void paint(int x1, int x2, int y1, int y2, int[][] map, int K)
	{
		while(x1 >= K && y1 >= K){
			x1 -= K;
			x2 -= K;
			y1 -= K;
			y2 -= K;
		}
		while(x1 < 0 || y1 < 0){
			x1 += K;
			x2 += K;
			y1 += K;
			y2 += K;
		}
		
		for(int i = 0;i <= 4*K;i+=K){
			for(int j = i/K%2*K;j <= 4*K && x1+i < map.length && y1+j < map.length;j+=2*K){
				map[x1+i][y1+j]++;
				map[Math.min(map.length-1, x2+i+1)][Math.min(map.length-1, y2+j+1)]++;
				map[x1+i][Math.min(map.length-1, y2+j+1)]--;
				map[Math.min(map.length-1, x2+i+1)][y1+j]--;
			}
		}
	}
	
	static void solve()
	{
		int n = ni(), K = ni();
		int[][] ks = new int[4*K+4][4*K+4];
		for(int i = 0;i  <n;i++){
			int x = ni(), y = ni();
			char c = nc();
			// [x-K+1, x], [y-K+1, y]
			x %= 2*K;
			y %= 2*K;
			// 1 2
			// 0 1 1 2
			if(c == 'B'){
				paint(x+1, x+K, y+1, y+K, ks, K);
			}else{
				paint(x+1, x+K, y-K+1, y, ks, K);
			}
//			tr();
//			for(int[] row : ks){
//				tr(row);
//			}
		}
		int u = ks.length;
		for(int i = 0;i < u;i++){
			for(int j = 1;j < u;j++){
				ks[i][j] += ks[i][j-1];
			}
		}
		for(int j = 0;j < u;j++){
			for(int i = 1;i < u;i++){
				ks[i][j] += ks[i-1][j];
			}
		}
//		for(int[] row : ks){
//			tr(row);
//		}
		int max = 0;
		for(int i = 2*K;i < 4*K;i++){
			for(int j = 2*K;j < 4*K;j++){
				max = Math.max(max, ks[i][j]);
			}
		}
		out.println(max);
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
