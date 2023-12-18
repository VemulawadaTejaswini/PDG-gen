import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		long t = System.currentTimeMillis();
		new Main().run();
		System.err.println(System.currentTimeMillis() - t);
	}
	
	void run() {
		FastScanner sc = new FastScanner();
		int N=sc.nextInt();
		int S=sc.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;++i) {
			A[i]=sc.nextInt();
		}
		long[] dp=new long[S+1];
		dp[0]=1;
		for(int p=0;p<N;++p) {
			for(int i=dp.length-1;i>=0;--i) {
				if(i+A[p]<dp.length) {
					dp[i+A[p]]+=dp[i]*(i==0?(p+1):1)%mod*((i+A[p])==S?(N-p):1)%mod;
					dp[i+A[p]]%=mod;
				}
			}
		}
		PrintWriter pw=new PrintWriter(System.out);
		pw.println(dp[S]);
		pw.close();
	}

	static int mod=998244353;
	public static int G = 3;
	
	
	static long[] exp(long[] a, int lim)
	{
		long[] F = {1L};
		long[] G = {1L};
		long[] da = d(a);
		for(int m = 1;;m *= 2) {
			long[] G2 = mul(G, G, m);
			G = sub(mul_(G, 2), mul(F, G2, m));
			long[] Q = Arrays.copyOf(da, m-1);
			long[] W = add(Q, mul(G, sub(d(F), mul(F, Q, m), m-1)));
			F = mul(F, add(new long[] {1}, sub(Arrays.copyOf(a, m), i(W))), m);
			if(m >= lim)break;
		}
		return Arrays.copyOf(F, lim);
	}
	// integrate
	public static long[] i(long[] p)
	{
		long[] q = new long[p.length];
		for(int i = 0;i < p.length-1;i++){
			q[i+1] = p[i] * invl(i+1, mod) % mod;
		}
		return q;
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
	
	public static long[] add(long[] a, long[] b)
	{
		long[] c = new long[Math.max(a.length, b.length)];
		for(int i = 0;i < a.length;i++)c[i] += a[i];
		for(int i = 0;i < b.length;i++)c[i] += b[i];
		for(int i = 0;i < c.length;i++)if(c[i] >= mod)c[i] -= mod;
		return c;
	}
	
	public static long[] add(long[] a, long[] b, int lim)
	{
		long[] c = new long[lim];
		for(int i = 0;i < a.length && i < lim;i++)c[i] += a[i];
		for(int i = 0;i < b.length && i < lim;i++)c[i] += b[i];
		for(int i = 0;i < c.length;i++)if(c[i] >= mod)c[i] -= mod;
		return c;
	}
	
	public static long[] sub(long[] a, long[] b)
	{
		long[] c = new long[Math.max(a.length, b.length)];
		for(int i = 0;i < a.length;i++)c[i] += a[i];
		for(int i = 0;i < b.length;i++)c[i] -= b[i];
		for(int i = 0;i < c.length;i++)if(c[i] < 0)c[i] += mod;
		return c;
	}
	
	public static long[] sub(long[] a, long[] b, int lim)
	{
		long[] c = new long[lim];
		for(int i = 0;i < a.length && i < lim;i++)c[i] += a[i];
		for(int i = 0;i < b.length && i < lim;i++)c[i] -= b[i];
		for(int i = 0;i < c.length;i++)if(c[i] < 0)c[i] += mod;
		return c;
	}
	
	public static long[] mul(long[] a, long[] b)
	{
		return Arrays.copyOf(convoluteSimply(a, b, mod, G), a.length+b.length-1);
	}
	
	public static long[] mul(long[] a, long[] b, int lim)
	{
		return Arrays.copyOf(convoluteSimply(a, b, mod, G), lim);
	}
	
	public static long[] mul_(long[] a, long k)
	{
		for(int i = 0;i < a.length;i++)a[i] = a[i] * k % mod;
		return a;
	}
	
	public static long[] convoluteSimply(long[] a, long[] b, int P, int g)
	{
		int m = Math.max(2, Integer.highestOneBit(Math.max(a.length, b.length)-1)<<2);
		long[] fa = nttmb(a, m, false, P, g);
		long[] fb = a == b ? fa : nttmb(b, m, false, P, g);
		for(int i = 0;i < m;i++){
			fa[i] = fa[i]*fb[i]%P;
		}
		return nttmb(fa, m, true, P, g);
	}
	public static long[] mul(long[] a, long k)
	{
		a = Arrays.copyOf(a, a.length);
		for(int i = 0;i < a.length;i++)a[i] = a[i] * k % mod;
		return a;
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
	
	
	// Modifed Montgomery + Barrett
	private static long[] nttmb(long[] src, int n, boolean inverse, int P, int g)
	{
		long[] dst = Arrays.copyOf(src, n);
		
		int h = Integer.numberOfTrailingZeros(n);
		long K = Integer.highestOneBit(P)<<1;
		int H = Long.numberOfTrailingZeros(K)*2;
		long M = K*K/P;
		
		int[] wws = new int[1<<h-1];
		long dw = inverse ? pow(g, P-1-(P-1)/n, P) : pow(g, (P-1)/n, P);
		long w = (1L<<32)%P;
		for(int k = 0;k < 1<<h-1;k++){
			wws[k] = (int)w;
			w = modh(w*dw, M, H, P);
		}
		long J = invl(P, 1L<<32);
		for(int i = 0;i < h;i++){
			for(int j = 0;j < 1<<i;j++){
				for(int k = 0, s = j<<h-i, t = s|1<<h-i-1;k < 1<<h-i-1;k++,s++,t++){
					long u = (dst[s] - dst[t] + 2*P)*wws[k];
					dst[s] += dst[t];
					if(dst[s] >= 2*P)dst[s] -= 2*P;
//					long Q = (u&(1L<<32)-1)*J&(1L<<32)-1;
					long Q = (u<<32)*J>>>32;
					dst[t] = (u>>>32)-(Q*P>>>32)+P;
				}
			}
			if(i < h-1){
				for(int k = 0;k < 1<<h-i-2;k++)wws[k] = wws[k*2];
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
	
	private static long[] garnerPrepare(int[] m)
	{
		int n = m.length;
		assert n == m.length;
		if(n == 0)return new long[0];
		long[] gamma = new long[n];
		for(int k = 1;k < n;k++){
			long prod = 1;
			for(int i = 0;i < k;i++){
				prod = prod * m[i] % m[k];
			}
			gamma[k] = invl(prod, m[k]);
		}
		return gamma;
	}
	
	private static long[] garnerBatch(int[] u, int[] m, long[] gamma)
	{
		int n = u.length;
		assert n == m.length;
		long[] v = new long[n];
		v[0] = u[0];
		for(int k = 1;k < n;k++){
			long temp = v[k-1];
			for(int j = k-2;j >= 0;j--){
				temp = (temp * m[j] + v[j]) % m[k];
			}
			v[k] = (u[k] - temp) * gamma[k] % m[k];
			if(v[k] < 0)v[k] += m[k];
		}
		return v;
	}
	
	
	// differentiate	
	public static long[] d(long[] p)
	{
		long[] q = new long[p.length];
		for(int i = 0;i < p.length-1;i++){
			q[i] = p[i+1] * (i+1) % mod;
		}
		return q;
	}
	
	long[] fft(long[] a, boolean inv, long mod, long[] roots, long[] iroots) {
		int n = a.length;

		int c = 0;
		for (int i = 1; i < n; ++i) {
			for (int j = n >> 1; j > (c ^= j); j >>= 1)
				;
			if (c > i) {
				long d = a[i];
				a[i] = a[c];
				a[c] = d;
			}
		}
		int level = Long.numberOfTrailingZeros(mod - 1);
		for (int i = 1; i < n; i *= 2) {
			long w;
			if (!inv)
				w = roots[level - Integer.numberOfTrailingZeros(i) - 1];
			else
				w = iroots[level - Integer.numberOfTrailingZeros(i) - 1];
			for (int j = 0; j < n; j += 2 * i) {
				long wn = 1;
				for (int k = 0; k < i; ++k) {
					long u = a[j + k];
					long v = a[j + k + i] * wn % mod;
					a[j + k] = u + v;
					a[j + k + i] = u - v;
					if (a[j + k] >= mod)
						a[j + k] -= mod;
					if (a[j + k + i] < 0)
						a[j + k + i] += mod;
					wn = wn * w % mod;
				}
			}
		}
		return a;
	}
	
	// ln F(x) - k ln P(x) = 0
	public static long[] pow(long[] p, int K)
	{
		int n = p.length;
		long[] lnp = ln(p);
		for(int i = 1;i < lnp.length;i++)lnp[i] = lnp[i] * K % mod;
		lnp[0] = pow(p[0], K, mod); // go well for some reason
		return exp(Arrays.copyOf(lnp, n));
	}
	
	// F_{t+1}(x) = -F_t(x)^2*P(x) + 2F_t(x)
	// if want p-destructive, comment out flipping p just before returning.
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
		for(int i = 0;i < p.length;i++){
			if(p[i] == 0)continue;
			p[i] = mod-p[i];
		}
		return f;
	}
	
	// \int f'(x)/f(x) dx
	public static long[] ln(long[] f)
	{
		long[] ret = i(mul(d(f), inv(f)));
		ret[0] = f[0];
		return ret;
	}
	
	// F_{t+1}(x) = F_t(x)-(ln F_t(x) - P(x)) * F_t(x)
	public static long[] exp(long[] p)
	{
		int n = p.length;
		long[] f = {p[0]};
		for(int i = 1;i < 2*n;i*=2){
			long[] ii = ln(f);
			long[] sub = sub(ii, p, Math.min(n, 2*i));
			if(--sub[0] < 0)sub[0] += mod;
			for(int j = 0;j < 2*i && j < n;j++){
				sub[j] = mod-sub[j];
				if(sub[j] == mod)sub[j] = 0;
			}
			f = mul(sub, f, Math.min(n, 2*i));
//			f = sub(f, mul(sub(ii, p, 2*i), f, 2*i));
		}
		tr(f, p);
		return f;
	}

	long inv(long a, long mod) {
		a %= mod;
		if (a < 0)
			a += mod;
		if (a == 0) {
			throw new AssertionError();
			// return 1;
		}
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
		long ret = p < 0 ? (p + mod) : p;
		return ret;
	}


	long garner(long x1, long x2, long x3, long mod1, long mod2, long mod3, long gamma2, long gamma3, long mod0) {
		long v1, v2, v3;
		v1 = x1;
		v2 = (x2 - v1 + mod2) * gamma2 % mod2;
		v3 = (x3 - (v2 * mod1 + v1) % mod3 + mod3) * gamma3 % mod3;
		long ret = v3;
		ret = (ret * mod2 + v2) % mod0;
		ret = (ret * mod1 + v1) % mod0;
		return ret;
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}


class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    
    public int nextInt() {
    	return (int)nextLong();
    }
}