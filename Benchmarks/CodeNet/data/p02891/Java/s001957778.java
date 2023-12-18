import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		char[] s = ns().toCharArray();
		int n = s.length;
		int K = ni();
		
		if(n == 1){
			out.println(K/2);
			return;
		}
		
		same = s[0] == s[n-1];
		long[][] vals = new long[2][2];
		for(int i = 0;i < 2;i++){
			for(int j = 0;j < 2;j++){
				int[] dp = new int[2];
				if(i == 0){
					dp[0] = 0;
					dp[1] = Integer.MAX_VALUE / 2;
				}else{
					dp[1] = 1;
					dp[0] = Integer.MAX_VALUE / 2;
				}
				for(int k = 1;k < n;k++){
					int[] ndp = new int[2];
					ndp[1] = Math.min(dp[0], dp[1]) + 1;
					ndp[0] = dp[1];
					if(s[k] != s[k-1]){
						ndp[0] = Math.min(ndp[0], dp[0]);
					}
					dp = ndp;
				}
				vals[i][j] = dp[j];
			}
		}
		
		cache = new HashMap<>();
		cache.put(1, vals);
		long[][] res = dfs(K);
		long ans = Long.MAX_VALUE;
		for(int i = 0;i < 2;i++){
			for(int j = 0;j < 2;j++){
				ans = Math.min(ans, res[i][j]);
			}
		}
		out.println(ans);
	}
	
	static Map<Integer, long[][]> cache;
	
	static boolean same;
	
	static long[][] dfs(int K)
	{
		if(cache.containsKey(K))return cache.get(K);
		long[][] L = dfs(K/2);
		long[][] R = dfs(K-K/2);
		
		long[][] ret = new long[2][2];
		for(int i = 0;i < 2;i++){
			for(int j = 0;j < 2;j++){
				ret[i][j] = Long.MAX_VALUE;
				for(int k = 0;k < 2;k++){
					for(int l = 0;l < 2;l++){
						if(k == 0 && l == 0 && same)continue;
						ret[i][j] = Math.min(ret[i][j], L[i][k] + R[l][j]);
					}
				}
			}
		}
		cache.put(K, ret);
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
