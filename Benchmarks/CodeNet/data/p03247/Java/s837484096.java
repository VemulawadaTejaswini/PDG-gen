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
		int n = ni();
		int[][] co = new int[n][];
		for(int i = 0;i < n;i++){
			co[i] = new int[]{ni(), ni()};
		}
		int s = 0;
		for(int i = 0;i < n;i++){
			int t = Math.abs(co[i][0]) + Math.abs(co[i][1]);
			s += t % 2;
		}
		
		if(s == n){
			out.println(35);
			for(int k = 0;k < 35;k++){
				out.print((1L<<34-k) + " ");
			}
			out.println();
			for(int[] c : co){
				long x = c[0], y = c[1];
				for(int j = 34;j >= 0;j--){
					if(Math.abs(x) > Math.abs(y)){
						if(x > 0){
							out.print("R");
							x -= 1L<<j;
						}else{
							out.print("L");
							x += 1L<<j;
						}
					}else{
						if(y > 0){
							out.print("U");
							y -= 1L<<j;
						}else{
							out.print("D");
							y += 1L<<j;
						}
					}
	//						tr(j, x, y);
				}
				assert x == 0;
				assert y == 0;
				out.println();
			}
			return;
		}
		if(s == 0){
			out.println(36);
			for(int k = 0;k < 35;k++){
				out.print((1L<<34-k) + " ");
			}
			out.println(1);
			for(int[] c : co){
				long x = c[0], y = c[1];
				for(int j = 34;j >= 0;j--){
					if(Math.abs(x) > Math.abs(y)){
						if(x > 0){
							out.print("R");
							x -= 1L<<j;
						}else{
							out.print("L");
							x += 1L<<j;
						}
					}else{
						if(y > 0){
							out.print("U");
							y -= 1L<<j;
						}else{
							out.print("D");
							y += 1L<<j;
						}
					}
				}
				assert Math.abs(x) + Math.abs(y) == 1;
				{
					int j = 0;
					if(Math.abs(x) > Math.abs(y)){
						if(x > 0){
							out.print("R");
							x -= 1L<<j;
						}else{
							out.print("L");
							x += 1L<<j;
						}
					}else{
						if(y > 0){
							out.print("U");
							y -= 1L<<j;
						}else{
							out.print("D");
							y += 1L<<j;
						}
					}
				}
				out.println();
			}
			return;
		}
		out.println(-1);
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
