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
	static int mod = 998244353 ;
	
	static void solve()
	{
		int n = ni(), m = ni();
		char[] L = ns(n);
		char[] R = ns(n);
		char[] U = ns(m);
		char[] D = ns(m);
		out.println((count(U, D, L, R) + count(L, R, U, D)) % mod);
	}
	
	static long count(char[] U, char[] D, char[] L, char[] R)
	{
		int m = U.length;
		long S = 0;
		long ans = 0;
		
		int[] fu = new int[m+1];
		for(int i = 0;i < m;i++)fu[i+1] = fu[i] + U[i] - '0';
		int[] fd = new int[m+1];
		for(int i = 0;i < m;i++)fd[i+1] = fd[i] + D[i] - '0';
		int fl = 0;
		for(char c : L)fl += c-'0';
		int fr = 0;
		for(char c : R)fr += c-'0';
	
		for(int i = 0;i < m;i++){
			int ud = U[i]-'0'+D[i]-'0';
			if(ud == 0)continue;
			S += count(fl, fu[i], fd[i]);
			S = S * ud;
			S %= mod;
			ans += S * count(fr, fu[m] - fu[i+1], fd[m] - fd[i+1]);
			ans %= mod;
		}
		return ans;
	}
	
	static int[][] fif = enumFIF(500000, mod);
	
	static long count(int l, int u, int d)
	{
		if(l == 0){
			return u+d > 0 ? 0 : 1;
		}
		
		// C(u+d+(l-1)-1,u+d-1)
		return C(u+d+l-1-1+1, u+d-1+1, mod, fif);
		// C(u+d+2,l-1)
		
		// f(1,0)*f(1,0)
		// f(1,0)*f(1,1)
		// f(1,0)*f(1,2)
		// f(1,1)*f(1,0)
		// f(1,1)*f(1,1)
		// f(1,2)*f(1,0)
		
		// f(i,j) = C(i+1,j)
		// f(u,0)*f(d,0)
		// f(u,i)*f(d,j) (i+j<l)
		// C(u+i-1,u-1)*C(d+j-1,d-1) (i+j<l)
		// i+j=q, C(u+d+q-1,u+d-1)
		// C(u+d-1,u+d-1)
		// C(u+d+(l-1)-1,u+d-1)
	}
	
	public static long C(int n, int r, int mod, int[][] fif) {
		if (n < 0 || r < 0 || r > n)
			return 0;
		return (long) fif[0][n] * fif[1][r] % mod * fif[1][n - r] % mod;
	}

	
	public static int[][] enumFIF(int n, int mod) {
		int[] f = new int[n + 1];
		int[] invf = new int[n + 1];
		f[0] = 1;
		for (int i = 1; i <= n; i++) {
			f[i] = (int) ((long) f[i - 1] * i % mod);
		}
		long a = f[n];
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
		invf[n] = (int) (p < 0 ? p + mod : p);
		for (int i = n - 1; i >= 0; i--) {
			invf[i] = (int) ((long) invf[i + 1] * (i + 1) % mod);
		}
		return new int[][] { f, invf };
	}

	
	public static char[] rev(char[] a)
	{
		for(int i = 0, j = a.length-1;i < j;i++,j--){
			char c = a[i]; a[i] = a[j]; a[j] = c;
		}
		return a;
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
