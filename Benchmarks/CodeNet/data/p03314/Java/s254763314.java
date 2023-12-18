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

	static boolean colorful(int[] a, int K)
	{
		int[] last = new int[K];
		Arrays.fill(last, -99999999);
		int n = a.length;
		inner:
		for(int i = 0;i < n;i++){
			last[a[i]] = i;
			for(int j = 0;j < K;j++){
				if(last[j] < i-K+1)continue inner;
			}
			return true;
		}
		return false;
	}
	
	static int mod = 1000000007;
	
	static void solve()
	{
		int n = ni(), K = ni(), m = ni();
		int[] a = na(m);
		for(int i = 0;i <  m;i++)a[i]--;
		if(colorful(a, K)){
			out.println(pow(K, n-m, mod) * (n-m+1) % mod);
			return;
		}
		
		int suf = 0;
		{
			int[] last = new int[K];
			Arrays.fill(last, -99999999);
			int len = 0;
			for(int i = 0;i < m;i++){
				len++;
				len = Math.min(len, i - last[a[i]]);
				last[a[i]] = i;
			}
			suf = len;
		}
		
		int pre = 0;
		{
			int[] last = new int[K];
			Arrays.fill(last, 99999999);
			int len = 0;
			for(int i = m-1;i >= 0;i--){
				len++;
				len = Math.min(len, last[a[i]] - i);
				last[a[i]] = i;
			}
			pre = len;
		}
		
		
		long[] prec = numcolorful(K, pre, n);
		long[] sufc = numcolorful(K, suf, n);
		long ans = 0;
		for(int i = 0;i+m-1 < n;i++){
			ans += pow(K, n-m, mod) - (pow(K, i, mod) - prec[i])*(pow(K, n-m-i, mod) - sufc[n-m-i]);
			ans %= mod;
		}
		if(ans < 0)ans += mod;
		out.println(ans);
	}

	
	static long[] numcolorful(int K, int start, int n)
	{
		long[] ret = new long[n+1];
		
		long[] dp = new long[K+1]; // if K, colorful
		dp[start] = 1;
		ret[0] = dp[K];
		for(int i = 1;i <= n;i++){
			long[] ndp = new long[K+1];
			ndp[1] += dp[0] * K;
			long cum = 0;
			for(int j = K-1;j >= 1;j--){
				cum += dp[j];
				ndp[j] += cum;
			}
			for(int j = 1;j < K;j++){
				ndp[j+1] += dp[j] * (K-j);
			}
			ndp[K] += dp[K] * K;
			for(int j = 0;j <= K;j++)ndp[j] %= mod;
			
			dp = ndp;
			ret[i] = dp[K];
		}
		return ret;
	}
	
	public static int[][] redundantKMP(int[] s, int K)
	{
		int n = s.length;
		final int W = 26;
		int[][] dp = new int[n][W];
		int[] kmp = new int[n+1];
		kmp[0] = -1;
		for(int i = 0;i < n;i++){
			for(int j = 0;j < W;j++){
				if(kmp[i] == -1){
					dp[i][j] = 0;
				}else if(j == s[kmp[i]]-'a'){
					dp[i][j] = kmp[i] + 1;
				}else{
					dp[i][j] = dp[kmp[i]][j];
				}
			}
			kmp[i+1] = dp[i][s[i]-'a'];
		}
		return dp;
	}
	
	public static int[] mpTable(int[] str)
	{
		int n = str.length;
		int[] mp = new int[n+1];
		mp[0] = -1;
		for(int i = 1, j = 0;i < n;i++){
			while(j >= 0 && str[i] != str[j])j = mp[j];
			mp[i+1] = ++j;
		}
		return mp;
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
