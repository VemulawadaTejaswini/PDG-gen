import java.util.*;

class NTTCRT {
	public static final int[] NTTPrimes = {1053818881, 1051721729, 1045430273, 1012924417, 1007681537, 1004535809, 998244353, 985661441, 976224257, 975175681};
	public static final int[] NTTPrimitiveRoots = {7, 6, 3, 5, 3, 3, 3, 3, 3, 17};
//	public static final int[] NTTPrimes = {1012924417, 1004535809, 998244353, 985661441, 975175681, 962592769, 950009857, 943718401, 935329793, 924844033};
//	public static final int[] NTTPrimitiveRoots = {5, 3, 3, 3, 17, 7, 7, 7, 3, 5};
	
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
	
	public static long[] convolute(long[] a, long[] b)
	{
		int USE = 2;
		int m = Math.max(2, Integer.highestOneBit(Math.max(a.length, b.length)-1)<<2);
		long[][] fs = new long[USE][];
		for(int k = 0;k < USE;k++){
			int P = NTTPrimes[k], g = NTTPrimitiveRoots[k];
			long[] fa = nttmb(a, m, false, P, g);
			long[] fb = a == b ? fa : nttmb(b, m, false, P, g);
			for(int i = 0;i < m;i++){
				fa[i] = fa[i]*fb[i]%P;
			}
			fs[k] = nttmb(fa, m, true, P, g);
		}
		
		int[] mods = Arrays.copyOf(NTTPrimes, USE);
		long[] gammas = garnerPrepare(mods);
		int[] buf = new int[USE];
		for(int i = 0;i < fs[0].length;i++){
			for(int j = 0;j < USE;j++)buf[j] = (int)fs[j][i];
			long[] res = garnerBatch(buf, mods, gammas);
			long ret = 0;
			for(int j = res.length-1;j >= 0;j--)ret = ret * mods[j] + res[j];
			fs[0][i] = ret;
		}
		return fs[0];
	}
	
	public static long[] convolute(long[] a, long[] b, int USE, int mod)
	{
		int m = Math.max(2, Integer.highestOneBit(Math.max(a.length, b.length)-1)<<2);
		long[][] fs = new long[USE][];
		for(int k = 0;k < USE;k++){
			int P = NTTPrimes[k], g = NTTPrimitiveRoots[k];
			long[] fa = nttmb(a, m, false, P, g);
			long[] fb = a == b ? fa : nttmb(b, m, false, P, g);
			for(int i = 0;i < m;i++){
				fa[i] = fa[i]*fb[i]%P;
			}
			fs[k] = nttmb(fa, m, true, P, g);
		}
		
		int[] mods = Arrays.copyOf(NTTPrimes, USE);
		long[] gammas = garnerPrepare(mods);
		int[] buf = new int[USE];
		for(int i = 0;i < fs[0].length;i++){
			for(int j = 0;j < USE;j++)buf[j] = (int)fs[j][i];
			long[] res = garnerBatch(buf, mods, gammas);
			long ret = 0;
			for(int j = res.length-1;j >= 0;j--)ret = (ret * mods[j] + res[j]) % mod;
			fs[0][i] = ret;
		}
		return fs[0];
	}
	
	// static int[] wws = new int[270000]; // outer faster
	
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
	
	// Modified Shoup + Barrett
	private static long[] nttsb(long[] src, int n, boolean inverse, int P, int g)
	{
		long[] dst = Arrays.copyOf(src, n);
		
		int h = Integer.numberOfTrailingZeros(n);
		long K = Integer.highestOneBit(P)<<1;
		int H = Long.numberOfTrailingZeros(K)*2;
		long M = K*K/P;
		
		long dw = inverse ? pow(g, P-1-(P-1)/n, P) : pow(g, (P-1)/n, P);
		long[] wws = new long[1<<h-1];
		long[] ws = new long[1<<h-1];
		long w = 1;
		for(int k = 0;k < 1<<h-1;k++){
			wws[k] = (w<<32)/P;
			ws[k] = w;
			w = modh(w*dw, M, H, P);
		}
		for(int i = 0;i < h;i++){
			for(int j = 0;j < 1<<i;j++){
				for(int k = 0, s = j<<h-i, t = s|1<<h-i-1;k < 1<<h-i-1;k++,s++,t++){
					long ndsts = dst[s] + dst[t];
					if(ndsts >= 2*P)ndsts -= 2*P;
					long T = dst[s] - dst[t] + 2*P;
					long Q = wws[k]*T>>>32;
					dst[s] = ndsts;
					dst[t] = ws[k]*T-Q*P&(1L<<32)-1;
				}
			}
//			dw = dw * dw % P;
			if(i < h-1){
				for(int k = 0;k < 1<<h-i-2;k++){
					wws[k] = wws[k*2];
					ws[k] = ws[k*2];
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
			long in = invl(n, P);
			for(int i = 0;i < n;i++){
				dst[i] = modh(dst[i] * in, M, H, P);
			}
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
	
	private static long invl(long a, long mod) {
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
}



public class Main {

  private static void solve() {
    int n = ni();
    int m = ni();

    long[] a = nal(n);
    long[] b = nal(m);
    int mod = 998244353;
    long[] ret = NTTCRT.convoluteSimply(a, b, mod, 3);

    for (int i = 0; i < n + m - 1; i ++) {
      out.print(ret[i] + " ");
    }
    out.println();
  }

  public static void main(String[] args) {
    new Thread(null, new Runnable() {
      @Override
      public void run() {
        long start = System.currentTimeMillis();
        String debug = args.length > 0 ? args[0] : null;
        if (debug != null) {
          try {
            is = java.nio.file.Files.newInputStream(java.nio.file.Paths.get(debug));
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
        reader = new java.io.BufferedReader(new java.io.InputStreamReader(is), 32768);
        solve();
        out.flush();
        tr((System.currentTimeMillis() - start) + "ms");
      }
    }, "", 64000000).start();
  }

  private static java.io.InputStream is = System.in;
  private static java.io.PrintWriter out = new java.io.PrintWriter(System.out);
  private static java.util.StringTokenizer tokenizer = null;
  private static java.io.BufferedReader reader;

  public static String next() {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      try {
        tokenizer = new java.util.StringTokenizer(reader.readLine());
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
    return tokenizer.nextToken();
  }

  private static double nd() {
    return Double.parseDouble(next());
  }

  private static long nl() {
    return Long.parseLong(next());
  }

  private static int[] na(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = ni();
    return a;
  }

  private static char[] ns() {
    return next().toCharArray();
  }

  private static long[] nal(int n) {
    long[] a = new long[n];
    for (int i = 0; i < n; i++)
      a[i] = nl();
    return a;
  }

  private static int[][] ntable(int n, int m) {
    int[][] table = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[i][j] = ni();
      }
    }
    return table;
  }

  private static int[][] nlist(int n, int m) {
    int[][] table = new int[m][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        table[j][i] = ni();
      }
    }
    return table;
  }

  private static int ni() {
    return Integer.parseInt(next());
  }

  private static void tr(Object... o) {
    if (is != System.in)
      System.out.println(java.util.Arrays.deepToString(o));
  }
}
