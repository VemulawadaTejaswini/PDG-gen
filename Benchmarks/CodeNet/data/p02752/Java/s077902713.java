import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

// TLEするけど一応
public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		int n = ni();
		int[] from = new int[n - 1];
		int[] to = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			from[i] = ni() - 1;
			to[i] = ni() - 1;
		}
		
		int[][] g = packU(n, from, to);
		int[] cents = center(g);
		int[][] pars = parents3(g, cents[0]);
		int[] par = pars[0], ord = pars[1], dep = pars[2];
		
		int root = cents[0];
//		tr(cents);
		long[][] dp = new long[n][];
		for(int i = n-1;i >= 0;i--){
			int cur = ord[i];
			
			long[] ldp = {0L, 1L};
			for(int e : g[cur]){
				if(par[cur] == e)continue;
				if(cents.length == 2 && i == 0 && e == cents[1])continue;
				long[] t = new long[dp[e].length+1];
				for(int j = 1;j < dp[e].length+1;j++){
					long s = 0;
					for(int k = j-1;k <= j+1;k++){
						s += dp[e][Math.min(k, dp[e].length-1)];
					}
					t[j] = s % mod;
				}
				ldp = merge(ldp, t);
			}
			dp[cur] = ldp;
		}
		
		int[][] spar = logstepParents(par);
		
		if(cents.length == 1){
			int[] ds = dist(g, cents[0]);
			int R = 0;
			for(int x : ds)R = Math.max(R, x);
			
			long[] down = new long[n];
			down[root] = 1;//get(dp[root], R);
			for(int i = 1;i < n;i++){
				int cur = ord[i];
				int h = R-dep[cur];
//				tr(cur, h, get(dp[cur], h) + get(dp[cur], h+1) + get(dp[cur], h+2));
				down[cur] = down[par[cur]] * 
						(h == 0 ? 1 : get(dp[cur], h)) % mod *
						invl(get(dp[cur], h) + get(dp[cur], h+1) + get(dp[cur], h+2), mod) % mod;
			}
			
			Map<Integer, Long> ho = new HashMap<>();
			for(int i = 0;i < n;i++){
				if(ds[i] == R){
					int id = ancestor(i, R-1, spar);
					if(!ho.containsKey(id)){
						ho.put(id, down[i]);
					}else{
						ho.put(id, (ho.get(id) + down[i]) % mod);
					}
				}
			}
			long all = 0;
			for(long v : ho.values())all += v;
			all %= mod;
			all = all * all % mod;
			for(long v : ho.values()){
				all -= v * v;
				all %= mod;
			}
			all = all * invl(2, mod) % mod;
			if(all < 0)all += mod;
			out.println(all * get(dp[root], R) % mod);
		}else{
			int[] ds0 = dist(g, cents[0]);
			int[] ds1 = dist(g, cents[1]);
			int R = 0;
			for(int x : ds0)R = Math.max(R, x);
			R--;
			
			long[] down0 = new long[n];
			down0[root] = get(dp[root], R);
			for(int i = 1;i < n;i++){
				int cur = ord[i];
				int h = R-dep[cur];
//				tr(cur, h, get(dp[cur], h) + get(dp[cur], h+1) + get(dp[cur], h+2));
				down0[cur] = down0[par[cur]] * 
						(h == 0 ? 1 : get(dp[cur], h)) % mod *
						invl(get(dp[cur], h) + get(dp[cur], h+1) + get(dp[cur], h+2), mod) % mod;
			}
			
			pars = parents3(g, cents[1]);
			par = pars[0]; ord = pars[1]; dep = pars[2];
			
			int root1 = cents[1];
			long[] down1 = new long[n];
			down1[root1] = get(dp[root1], R);
			for(int i = 1;i < n;i++){
				int cur = ord[i];
				int h = R-dep[cur];
//				tr(cur, h, get(dp[cur], h) + get(dp[cur], h+1) + get(dp[cur], h+2));
				down1[cur] = down1[par[cur]] * 
						(h == 0 ? 1 : get(dp[cur], h)) % mod *
						invl(get(dp[cur], h) + get(dp[cur], h+1) + get(dp[cur], h+2), mod) % mod;
			}
			
			long s0 = 0;
			long s1 = 0;
			for(int i = 0;i < n;i++){
				if(ds0[i] == R && ds1[i] == R + 1){
					s0 += down0[i];
				}
				if(ds1[i] == R && ds0[i] == R + 1){
					s1 += down1[i];
				}
			}
			
			s0 %= mod;
			s1 %= mod;
			out.println(s0 * s1 % mod);
		}
	}
	
	static long get(long[] a, int h)
	{
		if(h >= a.length)return a[a.length-1];
		if(h <= 0)return 0;
		return a[h];
	}
	
	static long[] merge(long[] a, long[] b)
	{
		if(a.length < b.length){
			long[] d = a; a = b; b = d;
		}
		
		for(int i = 1;i < a.length;i++){
			a[i] = a[i] * b[Math.min(i, b.length-1)] % mod;
		}
		return a;
	}
	
	public static int lca2(int a, int b, int[][] spar, int[] depth) {
		if (depth[a] < depth[b]) {
			b = ancestor(b, depth[b] - depth[a], spar);
		} else if (depth[a] > depth[b]) {
			a = ancestor(a, depth[a] - depth[b], spar);
		}

		if (a == b)
			return a;
		int sa = a, sb = b;
		for (int low = 0, high = depth[a], t = Integer.highestOneBit(high), k = Integer
				.numberOfTrailingZeros(t); t > 0; t >>>= 1, k--) {
			if ((low ^ high) >= t) {
				if (spar[k][sa] != spar[k][sb]) {
					low |= t;
					sa = spar[k][sa];
					sb = spar[k][sb];
				} else {
					high = low | t - 1;
				}
			}
		}
		return spar[0][sa];
	}

	protected static int ancestor(int a, int m, int[][] spar) {
		for (int i = 0; m > 0 && a != -1; m >>>= 1, i++) {
			if ((m & 1) == 1)
				a = spar[i][a];
		}
		return a;
	}

	public static int[][] logstepParents(int[] par) {
		int n = par.length;
		int m = Integer.numberOfTrailingZeros(Integer.highestOneBit(n - 1)) + 1;
		int[][] pars = new int[m][n];
		pars[0] = par;
		for (int j = 1; j < m; j++) {
			for (int i = 0; i < n; i++) {
				pars[j][i] = pars[j - 1][i] == -1 ? -1 : pars[j - 1][pars[j - 1][i]];
			}
		}
		return pars;
	}

	
	public static int[] center(int[][] g)
	{
		int n = g.length;
		int start = 0;
		int[] d1 = dist(g, start);
		int maxd1 = -1;
		int argmaxd1 = -1;
		for(int i = 0;i < n;i++){
			if(d1[i] > maxd1){
				maxd1 = d1[i];
				argmaxd1 = i;
			}
		}
		
		int[] d2 = dist(g, argmaxd1);
		int maxd2 = -1;
		int argmaxd2 = -1;
		for(int i = 0;i < n;i++){
			if(d2[i] > maxd2){
				maxd2 = d2[i];
				argmaxd2 = i;
			}
		}
		
		if(maxd2 % 2 == 0){
			int h = maxd2/2;
			int j = argmaxd2;
			outer:
			for(int i = maxd2;i > h;i--){
				for(int e : g[j]){
					if(d2[e] == i-1){
						j = e;
						continue outer;
					}
				}
				throw new RuntimeException();
			}
			return new int[]{j};
		}else{
			int h = maxd2/2;
			int j = argmaxd2;
			int[] cs = new int[2];
			int p = 0;
			outer:
			for(int i = maxd2;i >= h;i--){
				if(i <= h+1)cs[p++] = j;
				if(i > h){
					for(int e : g[j]){
						if(d2[e] == i-1){
							j = e;
							continue outer;
						}
					}
					throw new RuntimeException();
				}
			}
			return cs;
		}
	}

	// distance array from start
	public static int[] dist(int[][] g, int start)
	{
		int n = g.length;
		int[] d = new int[n];
		Arrays.fill(d, n+3);
		int[] q = new int[n];
		int p = 0;
		q[p++] = start;
		d[start] = 0;
		for(int r = 0;r < p;r++){
			int cur = q[r];
			for(int e : g[cur]){
				if(d[e] > d[cur] + 1){
					d[e] = d[cur] + 1;
					q[p++] = e;
				}
			}
		}
		return d;
	}
	
	
	
	
	
	public static int mod = 998244353;
	public static int G = 3;
	
	static long[][] pas;
	
	static {
		long[] a = {1, 1, 1};
		pas = new long[17][];
		pas[0] = a;
		for(int i = 1;i < 17;i++){
			pas[i] = mul(pas[i-1], pas[i-1]);
		}
	}
	
	static long[] pow(int e)
	{
		long[] q = {1};
		while(e > 0){
			int v = Integer.numberOfTrailingZeros(e);
			e &= e-1;;
			q = mul(q, pas[v]);
		}
		return q;
	}
	
	public static long[] mul(long[] a, long[] b)
	{
		if(a.length + b.length < 100){
			return mulnaive(a, b);
		}else{
			return Arrays.copyOf(convoluteSimply(a, b, mod, G), a.length+b.length-1);
		}
	}
	
	public static long[] mul(long[] a, long[] b, int lim)
	{
		return Arrays.copyOf(convoluteSimply(a, b, mod, G), lim);
	}
	
	public static long[] mulnaive(long[] a, long[] b)
	{
		long[] c = new long[a.length+b.length-1];
		long big = 8L*mod*mod;
		for(int i = 0;i < a.length;i++){
			for(int j = 0;j < b.length;j++){
				c[i+j] += a[i]*b[j];
				if(c[i+j] >= big)c[i+j] -= big;
			}
		}
		for(int i = 0;i < c.length;i++)c[i] %= mod;
		return c;
	}
	
	public static long[] mulnaive(long[] a, long[] b, int lim)
	{
		long[] c = new long[lim];
		long big = 8L*mod*mod;
		for(int i = 0;i < a.length;i++){
			for(int j = 0;j < b.length && i+j < lim;j++){
				c[i+j] += a[i]*b[j];
				if(c[i+j] >= big)c[i+j] -= big;
			}
		}
		for(int i = 0;i < c.length;i++)c[i] %= mod;
		return c;
	}
	
	public static long[] mul_(long[] a, long k)
	{
		for(int i = 0;i < a.length;i++)a[i] = a[i] * k % mod;
		return a;
	}
	
	public static long[] mul(long[] a, long k)
	{
		a = Arrays.copyOf(a, a.length);
		for(int i = 0;i < a.length;i++)a[i] = a[i] * k % mod;
		return a;
	}


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
		a %= mod;
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

	
	
	public static int[][] parents3(int[][] g, int root) {
		int n = g.length;
		int[] par = new int[n];
		Arrays.fill(par, -1);

		int[] depth = new int[n];
		depth[0] = 0;

		int[] q = new int[n];
		q[0] = root;
		for (int p = 0, r = 1; p < r; p++) {
			int cur = q[p];
			for (int nex : g[cur]) {
				if (par[cur] != nex) {
					q[r++] = nex;
					par[nex] = cur;
					depth[nex] = depth[cur] + 1;
				}
			}
		}
		return new int[][] { par, q, depth };
	}

	static int[][] packU(int n, int[] from, int[] to) {
		int[][] g = new int[n][];
		int[] p = new int[n];
		for (int f : from)
			p[f]++;
		for (int t : to)
			p[t]++;
		for (int i = 0; i < n; i++)
			g[i] = new int[p[i]];
		for (int i = 0; i < from.length; i++) {
			g[from[i]][--p[from[i]]] = to[i];
			g[to[i]][--p[to[i]]] = from[i];
		}
		return g;
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
