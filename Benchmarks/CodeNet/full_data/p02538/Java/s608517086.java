import java.io.*;
import java.util.*;
import static java.lang.Math.*;

class LazySegTree<S, F> {
	final int MAX;
	
	final int N;
	final int Log;
	final java.util.function.BinaryOperator<S> Op;
	final S E;
	final java.util.function.BiFunction<F, S, S> Mapping;
	final java.util.function.BinaryOperator<F> Composition;
	final F Id;
	
	final S[] Dat;
	final F[] Laz;
	
	@SuppressWarnings("unchecked")
	public LazySegTree(int n, java.util.function.BinaryOperator<S> op, S e, java.util.function.BiFunction<F, S, S> mapping, java.util.function.BinaryOperator<F> composition, F id) {
		this.MAX = n;
		int k = 1;
		while (k < n) k <<= 1;
		this.N = k;
		this.Log = Integer.numberOfTrailingZeros(N);
		this.Op = op;
		this.E = e;
		this.Mapping = mapping;
		this.Composition = composition;
		this.Id = id;
		this.Dat = (S[]) new Object[N << 1];
		this.Laz = (F[]) new Object[N];
		java.util.Arrays.fill(Dat, E);
		java.util.Arrays.fill(Laz, Id);
	}
	
	public LazySegTree(S[] dat, java.util.function.BinaryOperator<S> op, S e, java.util.function.BiFunction<F, S, S> mapping, java.util.function.BinaryOperator<F> composition, F id) {
		this(dat.length, op, e, mapping, composition, id);
		build(dat);
	}
	
	private void build(S[] dat) {
		int l = dat.length;
		System.arraycopy(dat, 0, Dat, N, l);
		for (int i = N - 1; i > 0; i--) {
			Dat[i] = Op.apply(Dat[i << 1 | 0], Dat[i << 1 | 1]);
		}
	}
	
	private void push(int k) {
		if (Laz[k] == Id) return;
		int lk = k << 1 | 0, rk = k << 1 | 1;
		Dat[lk] = Mapping.apply(Laz[k], Dat[lk]);
		Dat[rk] = Mapping.apply(Laz[k], Dat[rk]);
		if (lk < N) Laz[lk] = Composition.apply(Laz[k], Laz[lk]);
		if (rk < N) Laz[rk] = Composition.apply(Laz[k], Laz[rk]);
		Laz[k] = Id;
	}
	
	private void pushTo(int k) {
		for (int i = Log; i > 0; i--) push(k >> i);
	}
	
	private void pushTo(int lk, int rk) {
		for (int i = Log; i > 0; i--) {
			if (((lk >> i) << i) != lk) push(lk >> i);
			if (((rk >> i) << i) != rk) push(rk >> i);
		}
	}
	
	private void updateFrom(int k) {
		k >>= 1;
			while (k > 0) {
				Dat[k] = Op.apply(Dat[k << 1 | 0], Dat[k << 1 | 1]);
				k >>= 1;
			}
	}
	
	private void updateFrom(int lk, int rk) {
		for (int i = 1; i <= Log; i++) {
			if (((lk >> i) << i) != lk) {
				int lki = lk >> i;
			Dat[lki] = Op.apply(Dat[lki << 1 | 0], Dat[lki << 1 | 1]);
			}
			if (((rk >> i) << i) != rk) {
				int rki = (rk - 1) >> i;
			Dat[rki] = Op.apply(Dat[rki << 1 | 0], Dat[rki << 1 | 1]);
			}
		}
	}
	
	public void set(int p, S x) {
		exclusiveRangeCheck(p);
		p += N;
		pushTo(p);
		Dat[p] = x;
		updateFrom(p);
	}
	
	public S get(int p) {
		exclusiveRangeCheck(p);
		p += N;
		pushTo(p);
		return Dat[p];
	}
	
	public S prod(int l, int r) {
		if (l > r) {
			throw new IllegalArgumentException(
					String.format("Invalid range: [%d, %d)", l, r)
					);
		}
		inclusiveRangeCheck(l);
		inclusiveRangeCheck(r);
		if (l == r) return E;
		l += N; r += N;
		pushTo(l, r);
		S sumLeft = E, sumRight = E;
		while (l < r) {
			if ((l & 1) == 1) sumLeft = Op.apply(sumLeft, Dat[l++]);
			if ((r & 1) == 1) sumRight = Op.apply(Dat[--r], sumRight);
			l >>= 1; r >>= 1;
		}
		return Op.apply(sumLeft, sumRight);
	}
	
	public S allProd() {
		return Dat[1];
	}
	
	public void apply(int p, F f) {
		exclusiveRangeCheck(p);
		p += N;
		pushTo(p);
		Dat[p] = Mapping.apply(f, Dat[p]);
		updateFrom(p);
	}
	
	public void apply(int l, int r, F f) {
		if (l > r) {
			throw new IllegalArgumentException(
					String.format("Invalid range: [%d, %d)", l, r)
					);
		}
		inclusiveRangeCheck(l);
		inclusiveRangeCheck(r);
		if (l == r) return;
		l += N; r += N;
		pushTo(l, r);
		for (int l2 = l, r2 = r; l2 < r2;) {
			if ((l2 & 1) == 1) {
				Dat[l2] = Mapping.apply(f, Dat[l2]);
				if (l2 < N) Laz[l2] = Composition.apply(f, Laz[l2]);
				l2++;
			}
			if ((r2 & 1) == 1) {
				r2--;
				Dat[r2] = Mapping.apply(f, Dat[r2]);
				if (r2 < N) Laz[r2] = Composition.apply(f, Laz[r2]);
			}
			l2 >>= 1; r2 >>= 1;
		}
		updateFrom(l, r);
	}
	
	public int maxRight(int l, java.util.function.Predicate<S> g) {
		inclusiveRangeCheck(l);
		if (!g.test(E)) {
			throw new IllegalArgumentException("Identity element must satisfy the condition.");
		}
		if (l == MAX) return MAX;
		l += N;
		pushTo(l);
		S sum = E;
		do {
			l >>= Integer.numberOfTrailingZeros(l);
				if (!g.test(Op.apply(sum, Dat[l]))) {
					while (l < N) {
						push(l);
						l = l << 1;
						if (g.test(Op.apply(sum, Dat[l]))) {
							sum = Op.apply(sum, Dat[l]);
							l++;
						}
					}
					return l - N;
				}
				sum = Op.apply(sum, Dat[l]);
				l++;
		} while ((l & -l) != l);
		return MAX;
	}
	
	public int minLeft(int r, java.util.function.Predicate<S> g) {
		inclusiveRangeCheck(r);
		if (!g.test(E)) {
			throw new IllegalArgumentException("Identity element must satisfy the condition.");
		}
		if (r == 0) return 0;
		r += N;
		pushTo(r - 1);
		S sum = E;
		do {
			r--;
			while (r > 1 && (r & 1) == 1) r >>= 1;
						if (!g.test(Op.apply(Dat[r], sum))) {
							while (r < N) {
								push(r);
								r = r << 1 | 1;
								if (g.test(Op.apply(Dat[r], sum))) {
									sum = Op.apply(Dat[r], sum);
									r--;
								}
							}
							return r + 1 - N;
						}
						sum = Op.apply(Dat[r], sum);
		} while ((r & -r) != r);
		return 0;
	}
	
	private void exclusiveRangeCheck(int p) {
		if (p < 0 || p >= MAX) {
			throw new IndexOutOfBoundsException(
					String.format("Index %d is not in [%d, %d).", p, 0, MAX)
					);
		}
	}
	
	private void inclusiveRangeCheck(int p) {
		if (p < 0 || p > MAX) {
			throw new IndexOutOfBoundsException(
					String.format("Index %d is not in [%d, %d].", p, 0, MAX)
					);
		}
	}
}

public class Main {
	static int n;
	static void solve() {
		long now = 1;
		for(int i=1;i<200100;i++) {
			value111[i] = now;
			now = now*10%mod;
			now = (now + 1)%mod;
		}
		now = 1;
		for(int i=0;i<200100;i++) {
			mul10[i] = now;
			now = now*10%mod;
		}
		
		n = ni(); 
		var dat = new S[n];
		for(int i=0;i<n;i++) {
			dat[i] = new S(1, i+1, 1);
		}
		var seg = new LazySegTree<S, F>(dat, S::op, new S(0, 0, 0), Main::map, F::composite, new F(0));
		int q = ni();
		for(int i=0;i<q;i++) {
			int l = ni()-1, r = ni(), d = ni();
			seg.apply(l, r, new F(d));
			out.println(seg.allProd().v);
		}
	}	
	static long[] value111 = new long[200200];
	static long[] mul10 = new long[200200];
	static boolean done = false;
	static S map(F f, S s) {
		return new S(f.v*value111[s.size]%mod, s.r, s.size);
	}
	
	static class S{
		long v;
		int r;
		int size;
		public S(long v, int r, int size) {
			super();
			this.v = v;
			this.r = r;
			this.size = size;
		}
		
		static S op(S l, S r) {
			int maxR = max(l.r, r.r);
			long nv = l.v * mul10[maxR - l.r] + r.v * mul10[maxR - r.r];
			nv %= mod;
//			nv = div(nv, mul10[n - maxR]);
			return new S(nv, maxR, l.size + r.size);
		}
		
	}
	
	static class F{
		long v;

		public F(long v) {
			super();
			this.v = v;
		}
		
		static F composite(F f, F g) {
			return new F(f.v);
		}
	}
	
	//constants
	static final int inf = Integer.MAX_VALUE / 2;
	static final long linf = Long.MAX_VALUE / 3;
	static final double dinf = Double.MAX_VALUE / 3;
	static final long mod = 998244353;
	static final int[] dx = { -1, 0, 1, 0 }, dy = { 0, -1, 0, 1 }, dx8 = { -1, -1, -1, 0, 0, 1, 1, 1 }, dy8 = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static final double eps = 1e-10;
	
	//libraries
	static long pow(long x, long y) {
		if (y < 0)
			return 0;
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * pow(x, y - 1)) % mod;
		long root = pow(x, y / 2);
		return root * root % mod;
	}
	public static void main(String[] args) throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}
	//input
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;
	private static int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}
	private static boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}
	private static int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}
	@SuppressWarnings("unused")
	private static double nd() {
		return Double.parseDouble(ns());
	}
	@SuppressWarnings("unused")
	private static char nc() {
		return (char) skip();
	}
	private static String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	private static char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b))) {
			buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}
	@SuppressWarnings("unused")
	private static char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}
	@SuppressWarnings("unused")
	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}
	@SuppressWarnings("unused")
	private static long[] nla(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}
	@SuppressWarnings("unused")
	private static int[][] na(int n, int m){
		int[][] res = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				res[i][j] = ni();
			}
		}
		return res;
	}
	@SuppressWarnings("unused")
	private static long[][] nla(int n, int m){
		long[][] res = new long[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				res[i][j] = nl();
			}
		}
		return res;
	}
	private static int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		
		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	private static long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		
		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
}
