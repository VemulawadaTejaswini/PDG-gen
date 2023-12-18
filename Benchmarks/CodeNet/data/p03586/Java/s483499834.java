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
		outer:
		for(int T = ni();T > 0;T--){
			long a = nl();
			long m = nl();
			a %= m;
			long b = a;
			long pg = 0;
			
			long pb = 1;
			int tq = -1;
			for(int q = 1;;q++){
				if(q == b){
					out.println(q);
					continue outer;
				}
				long g = gcd(b, m);
				if(pg == g){
					// (q-1)~
					tq = q-1;
					break;
				}
				pg = g;
				pb = b;
				b = b * a % m;
			}
			long period = totient(m / gcd(pb, m));
			for(int i = 2;i*i <= period;i++){
				while(period % i == 0 && pb * pow(a, period/i, m) % m
						 == pb){
					period /= i;
				}
			}
			// a^(t+pk)=V (mod m)
			long ans = 0;
			long fpb = pb;
			while(true){
				ans = crt(period, tq, m, pb);
				if(ans != -1)break;
				tq++; pb = pb * a % m;
				if(pb == fpb){
					out.println(-1);
					continue outer;
				}
			}
			if(ans == 0){
				ans += period * m;
			}
			// 9 168
			// 81
			// 729
			// 
//			tr(period, tq, m, pb);
			assert pow(a, ans, m) == ans % m;
			out.println(ans);
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

	
	public static long crt(long p, long m, long q, long n)
	{
		long a = p, b = q;
		long pp = 1, qq = 0;
		while(b > 0){
			long c = a / b;
			long d;
			d = a; a = b; b = d % b;
			d = pp; pp = qq; qq = d - c * qq;
		}
		if((n - m) % a != 0)return -1;
		long mod = p / a * q;
//		long ret = (p * pp % mod * ((n - m) / a) + m) % mod;
		long ret = (mul(mul(p, pp, mod), (n-m)/a, mod)+m)%mod;
		if(ret < 0)ret += mod;
		return ret;
	}
	public static long mul(long a, long b, long mod)
	{
		a %= mod; if(a < 0)a += mod;
		b %= mod; if(b < 0)b += mod;
		long ret = 0;
		int x = 63-Long.numberOfLeadingZeros(b);
		for(;x >= 0;x--){
			ret += ret;
			if(ret >= mod)ret -= mod;
			if(b<<~x<0){
				ret += a;
				if(ret >= mod)ret -= mod;
			}
		}
		return ret;
	}

	
	public static long totient(long n)
	{
		long tot = n;
		for(int p = 2;p*p <= n;p++){
			int e = 0;
			while(n % p == 0){
				n /= p;
				e++;
			}
			if(e > 0)tot = tot / p * (p-1);
		}
		if(n > 1){
			tot = tot / n * (n-1);
		}
		return tot;
	}
	
	public static long gcd(long a, long b) {
		while (b > 0) {
			long c = a;
			a = b;
			b = c % b;
		}
		return a;
	}
	
	
	public static long bsgs(long alpha, long beta, int p)
	{
		int m = (int)Math.sqrt(p)+1;
		long[] table = new long[m];
		long val = 1;
		for(int j = 0;j < m;j++){
			table[j] = val<<32|j;
			val = val * alpha % p;
		}
		Arrays.sort(table);
		long ainvm = invl(val, p);
		
		long g = beta;
		for(int i = 0;i < m;i++){
			int ind = Arrays.binarySearch(table, g<<32);
			if(ind < 0)ind = -ind-1;
			if(ind < m && table[ind]>>>32 == g){
				return i*m+(int)table[ind];
			}
			g = g * ainvm % p;
		}
		return -1;
	}
	
	public static long invl(long a, long mod) {
		long b = mod;
		long p = 1, q = 0;
		while (b > 0) {
			long c = a / b;
			long d;
			d = a;
			a = b;
			b = d % b;
			d = p;
			p = q;
			q = d - c * q;
		}
		return p < 0 ? p + mod : p;
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
