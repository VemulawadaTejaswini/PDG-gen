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
		int mod = 1000000007;
		int n = ni();
		int[] a = na(n);
		long c = 0;
		int[] zs = new int[n+1];
		int p = 0;
		zs[p++] = 0;
		for(int i = 0;i < n;i++){
			c ^= a[i];
			if(c == 0){
				zs[p++] = i+1;
			}
		}
		// 2ac+abc+bc+ab+a+b+c+1
		long ans = 0; // all 0
		if(zs[p-1] == n){
			ans += pow(2, p-2, mod);
			long[] f = new long[1<<20];
			long[] fsum = new long[1<<20];
			long[] flsum = new long[1<<20];
			int[] last = new int[1<<20];
			for(int i = 0;i < p-1;i++){
				int t = 0;
				Map<Integer, Integer> map = new HashMap<>();
				for(int j = zs[i];j < zs[i+1]-1;j++){
					t ^= a[j];
					if(map.containsKey(t)){
						map.put(t, map.get(t)+1);
					}else{
						map.put(t, 1);
					}
				}
				
				for(int k : map.keySet()){
					int v = map.get(k);
					flsum[k] += fsum[k] * (i-last[k]);
					flsum[k] %= mod;
					f[k] = (flsum[k]+1) * v % mod;
					ans += f[k];
					fsum[k] += f[k];
					if(fsum[k] >= mod)fsum[k] -= mod;
					last[k] = i;
				}
			}
			out.println(ans%mod);
		}else{
			int baset = 0 ;
			for(int i = zs[p-1];i < n;i++){
				baset ^= a[i];
			}
			
			long f = 0;
			long fsum = 0;
			long flsum = 0;
			int last = 0;
			// ab+a+b
			for(int i = 0;i < p-1;i++){
				int t = 0;
				int ct = 0;
				for(int j = zs[i];j < zs[i+1]-1;j++){
					t ^= a[j];
					if(t == baset)ct++;
				}
				flsum += fsum * (i-last);
				flsum %= mod;
				f = (flsum+1) * ct % mod;
				ans += f;
				fsum += f;
				if(fsum >= mod)fsum -= mod;
				last = i;
			}
			{
				flsum += fsum * (p-1-last);
				flsum %= mod;
				f = (flsum+1) * 1 % mod;
				ans += f;
				fsum += f;
				if(fsum >= mod)fsum -= mod;
			}
			out.println(ans%mod);
		}
	}
	
	public static long pow(long a, long n, long mod) {
		//		a %= mod;
		long ret = 1;
		int x = 63 - Long.numberOfLeadingZeros(n);
		for (; x >= 0; x--) {
			ret = ret * ret % mod;
			if (n << 63 - x < 0)
				ret = ret * a % mod;
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
