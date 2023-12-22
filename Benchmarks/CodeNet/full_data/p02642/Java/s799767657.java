import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	static InputStream is = System.in;
	static String INPUT = "";

	public static void main(String[] args) throws Exception
	{
		int n = ni();
		int M = 1000001;
		int W = (M>>>6)+1;
		long[] f1 = new long[W];
		long[] f2 = new long[W];
		long[] ex = new long[W];
		for(int i = 0;i < n;i++){
			int v = ni();
			if(v == 1){
				System.out.println(n == 1 ? 1 : 0);
				return;
			}
			if(f1[v>>>6]<<~v>=0){
				f1[v>>>6] |= 1L<<v;
			}else{
				f2[v>>>6] |= 1L<<v;
			}
		}
		for(int i = 1;i*2 <= M;i++){
			if((f1[i>>>6]&~ex[i>>>6])<<~i<0){
				for(int j = i*2;j < M;j+=i){
					ex[j>>>6] |= 1L<<j;
				}
			}
		}
		int ans = 0;
		for(int i = 0;i < W;i++){
			ans += Long.bitCount((f1[i]^f2[i])&~ex[i]);
		}
		System.out.println(ans);
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
//		boolean minus = false;
//		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
//		if(b == '-'){
//			minus = true;
//			b = readByte();
//		}
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9')));
		
		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return num;
//				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
}
