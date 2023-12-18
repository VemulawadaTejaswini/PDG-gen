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
		int n = ni()-1;
		long m = nl();
		int mod = 998244353;
		superPrepare(mod, 3);
		int[][] fif = enumFIF(600000, mod);
		if(m <= 300000){
			m--;
			long[] a = new long[(int)m+1];
			if(a.length >= 1)a[0] = 1;
			if(a.length >= 2)a[1] = 1;
			for(int i = 2;i <= m;i++){
				a[i] = a[i-1] + a[i-2];
				if(a[i] >= mod)a[i] -= mod;
			}
			if(n == 0){
				out.println(a[(int)m]);
				return;
			}
			long ans = 0;
			for(int i = 0;i <= m;i++){
				ans += a[i]*C((int)(m-i+n-1),n-1, mod, fif);
				ans %= mod;
			}
			out.println(ans);
			return;
		}
		long[] b = new long[n+1];
		for(int i = 0;i <= n;i++){
			b[i] = C(n, i, mod, fif);
			if((n-i) % 2 == 1){
				b[i] = mod-b[i];
			}
		}
		long[] gf = new long[n+3];
		for(int i = 0;i <= n;i++){
			gf[i] += b[i] * (mod-1);
			gf[i+1] += b[i] * (mod-1);
			gf[i+2] += b[i];
		}
		for(int i = 0;i < n+3;i++){
			gf[i] %= mod;
		}
		long[] co = gftoco(gf);
		long[] hey = lr(co, m+n);
		long[] a = new long[hey.length];
		a[hey.length-1] = 1;
		
		out.println(f(a, hey));
	}
	
	static long[] gftoco(long[] gf)
	{
		long[] co = new long[gf.length-1];
		for(int i = 0;i < gf.length-1;i++){
			co[i] = mod-gf[i];
			if(co[i] == mod)co[i] = 0;
		}
		return co;
	}
	
	public static int mod = 998244353;
	public static int G = 3; // primitive root of mod
	public static int L = 19;
	public static int[][] wws;
	public static int[][] iwws;
	
	public static long f(long[] a, long[] co)
	{
		long big = 8L*mod*mod;
		long s = 0;
		for(int i = 0;i < co.length;i++){
			s += co[i] * a[i];
			if(s >= big)s -= big;
		}
		return s % mod;
	}
	
	public static long[] lr(long[] co, long n)
	{
		int m = co.length;
		if(m == 0)return new long[0];
		if(m == 1){
			long ret = 1;
			long mul = co[0];
			for(;n > 0;n >>>= 1){
				if((n&1)==1)ret = ret * mul % mod;
				mul = mul * mul % mod;
			}
			return new long[]{ret};
		}
		
		long[] gf = new long[m+1]; // Generating Function of co
		for(int i = 0;i < m;i++){
			if(co[m-1-i] == 0)continue;
			gf[i+1] = mod-co[m-1-i];
		}
		gf[0] = 1;
		long[] rigf = rev(inv(gf));
		
		int mm = Math.max(2, Integer.highestOneBit(m-1)<<2);
		// precalculate F(1/gf)
		long[] frigf = nttmb(rigf, mm, false);
		// precalculate F(co)
		long[] fco = nttmb(co, mm, false);
		
		long[] ret = new long[m];
		ret[0] = 1;
		int h = 63-Long.numberOfLeadingZeros(n);
		int hh = h*9/10;
		for(int u = 0;u < n>>>hh;u++){
			long r = ret[m-1];
			for(int i = m-1;i >= 1;i--){
				ret[i] = (r * co[i] + ret[i-1]) % mod;
			}
			ret[0] = r * co[0] % mod;
		}
		for(int l = hh-1;l >= 0;l--){
			long[] ltemp = convoluteSimply(ret, ret, null);
			long[] fu = convoluteSimply(Arrays.copyOfRange(ltemp, m, 2*m), rigf, frigf);
			long[] last = convoluteSimply(Arrays.copyOfRange(fu, m, 2*m), co, fco);
			for(int i = 0;i < m;i++){
				ret[i] = last[i] + ltemp[i];
				if(ret[i] >= mod)ret[i] -= mod;
			}
			
			if(n<<~l<0){ // +1
				long r = ret[m-1];
				for(int i = m-1;i >= 1;i--){
					ret[i] = (r * co[i] + ret[i-1]) % mod;
				}
				ret[0] = r * co[0] % mod;
			}
		}
		
		return ret;
	}
	
	public static long[] rev(long[] a)
	{
		for(int i = 0, j = a.length-1;i < j;i++,j--){
			long d = a[i]; a[i] = a[j]; a[j] = d;
		}
		return a;
	}
	
	public static long[] mul(long[] a, long[] b, int lim)
	{
		return Arrays.copyOf(convoluteSimply(a, b, null), lim);
	}
	
	// F_{t+1}(x) = -F_t(x)^2*P(x) + 2F_t(x)
	public static long[] inv(long[] p)
	{
		int n = p.length;
		long[] f = {invl(p[0], mod)};
		for(int i = 0;i < p.length;i++){
			if(p[i] == 0)continue;
			p[i] = mod-p[i];
		}
		for(int i = 1;i < 2*n;i*=2){
			long[] f2 = mul(f, f, Math.min(n, 2*i));
			long[] f2p = mul(f2, Arrays.copyOf(p, i), Math.min(n, 2*i));
			for(int j = 0;j < f.length;j++){
				f2p[j] += 2L*f[j];
				if(f2p[j] >= mod)f2p[j] -= mod;
				if(f2p[j] >= mod)f2p[j] -= mod;
			}
			f = f2p;
		}
		return f;
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
	
	public static long[] convoluteSimply(long[] a, long[] b, long[] ffb)
	{
		int m = ffb != null ? ffb.length : Math.max(2, Integer.highestOneBit(a.length+b.length-1)<<1);
		long[] fa = nttmb(a, m, false);
		long[] fb = ffb != null ? ffb : a == b ? fa : nttmb(b, m, false);
		for(int i = 0;i < m;i++){
			fa[i] = fa[i]*fb[i]%mod;
		}
		return nttmb(fa, m, true);
	}
	
	public static void superPrepare(int P, int g)
	{
		{
			wws = new int[L+1][];
			long dw = pow(g, P-1>>>L, P);
			long w = (1L<<32)%P;
			long K = Integer.highestOneBit(P)<<1;
			int H = Long.numberOfTrailingZeros(K)*2;
			long M = K*K/P;
			wws[L] = new int[1<<L-1];
			for(int k = 0;k < 1<<L-1;k++){
				wws[L][k] = (int)w;
				w = modh(w*dw, M, H, P);
			}
			for(int i = L-1;i >= 1;i--){
				wws[i] = new int[1<<i-1];
				for(int k = 0;k < 1<<i-1;k++)wws[i][k] = wws[i+1][k*2];
			}
		}
		{
			iwws = new int[L+1][];
			long dw = pow(g, P-1-(P-1>>>L), P);
			long w = (1L<<32)%P;
			long K = Integer.highestOneBit(P)<<1;
			int H = Long.numberOfTrailingZeros(K)*2;
			long M = K*K/P;
			iwws[L] = new int[1<<L-1];
			for(int k = 0;k < 1<<L-1;k++){
				iwws[L][k] = (int)w;
				w = modh(w*dw, M, H, P);
			}
			for(int i = L-1;i >= 1;i--){
				iwws[i] = new int[1<<i-1];
				for(int k = 0;k < 1<<i-1;k++)iwws[i][k] = iwws[i+1][k*2];
			}
		}
	}
	
	private static long[] nttmb(long[] src, int n, boolean inverse){
		return nttmb(src, n, inverse, new long[n]);
	}
	
	// Modifed Montgomery + Barrett
	private static long[] nttmb(long[] src, int n, boolean inverse, long[] dst)
	{
		int P = mod;
		
//		long[] dst = Arrays.copyOf(src, n);
		System.arraycopy(src, 0, dst, 0, Math.min(n, src.length));
		Arrays.fill(dst, Math.min(n, src.length), n, 0);
		
		int h = Integer.numberOfTrailingZeros(n);
		
		long J = invl(P, 1L<<32);
		for(int i = 0;i < h;i++){
			int[] mul = inverse ? iwws[h-i] : wws[h-i];
			for(int j = 0;j < 1<<i;j++){
				for(int k = 0, s = j<<h-i, t = s|1<<h-i-1;k < 1<<h-i-1;k++,s++,t++){
					long u = (dst[s] - dst[t] + 2*P)*mul[k];
					dst[s] += dst[t];
					if(dst[s] >= 2*P)dst[s] -= 2*P;
					long Q = (u<<32)*J>>>32;
					dst[t] = (u>>>32)-(Q*P>>>32)+P;
				}
			}
		}
		
		for(int i = 0;i < n;i++){
			if(dst[i] >= P)dst[i] -= P;
		}
		for(int i = 0;i < n;i++){
			int rev = Integer.reverse(i)>>>-h;
			if(i < rev){
				long d = dst[i]; dst[i] = dst[rev]; dst[rev] = d;
			}
		}
		
		if(inverse){
			long K = Integer.highestOneBit(P)<<1;
			int H = Long.numberOfTrailingZeros(K)*2;
			long M = K*K/P;
			long in = invl(n, P);
			for(int i = 0;i < n;i++)dst[i] = modh(dst[i]*in, M, H, P);
		}
		
		return dst;
	}
	
	static final long mask = (1L<<31)-1;
	
	public static long modh(long a, long M, int h, int mod)
	{
		long r = a-((M*(a&mask)>>>31)+M*(a>>>31)>>>h-31)*mod;
		return r < mod ? r : r-mod;
	}
	
	private static long pow(long a, long n, long mod) {
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
