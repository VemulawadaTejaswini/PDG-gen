import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.NoSuchElementException;

interface F1<A> {
	A f();
}

interface F2<A, B> {
	B f(A a);
}

interface F3<A, B, C> {
	C f(A a, B b);
}

interface F4<A, B, C, D> {
	D f(A a, B b, C c);
}

class U {
	static <A> ArrayList<A> make(int n, F2<Integer, A> maker) {
		ArrayList<A> res = new ArrayList<A>();
		for (int i = 0; i < n; i++) {
			res.add(maker.f(i));
		}
		return res;
	}

	static <A> ArrayList<A> filter(ArrayList<A> as, F2<A, Boolean> pred) {
		ArrayList<A> res = new ArrayList<A>();
		for (A a : as) {
			if (pred.f(a))
				res.add(a);
		}
		return res;
	}

	static <A> ArrayList<A> map(ArrayList<A> as, F2<A, A> f) {
		return make(as.size(), (i) -> f.f(as.get(i)));
	}

	static <A extends Comparable<A>> A min(A a, A b) {
		return a.compareTo(b) < 0 ? a : b;
	}

	static <A extends Comparable<A>> A max(A a, A b) {
		return a.compareTo(b) > 0 ? a : b;
	}

	static <A extends Comparable<A>> A clamp(A a, A min, A max) {
		return a.compareTo(min) < 0 ? min : a.compareTo(max) > 0 ? max : a;
	}
}

class UP<A, B> {
	A a;
	B b;

	UP(A a, B b) {
		this.a = a;
		this.b = b;
	}

	static <A, B> UP<A, B> make(A a, B b) {
		return new UP<A, B>(a, b);
	}

	public UP<A, B> clone() {
		return make(a, b);
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof UP))
			return false;
		UP<?, ?> p = (UP<?, ?>) o;
		boolean aok = a == null ? p.a == null : a.equals(p.a);
		boolean bok = b == null ? p.b == null : b.equals(p.b);
		return aok && bok;
	}

	public String toString() {
		return "(" + a.toString() + ", " + b.toString() + ")";
	}
}

//Persistent Lazy Segment Tree
class PLST<A, Op> {
	private class N {
		final A a;
		final Op lazy;
		final N l;
		final N r;

		N(A a, Op lazy, N l, N r) {
			this.a = a;
			this.lazy = lazy;
			this.l = l;
			this.r = r;
		}
	}

	private ArrayList<N> roots;
	private F3<A, A, A> merger;
	private F4<A, Op, Integer, A> applier;
	private F3<Op, Op, Op> opMerger;
	private ArrayList<UP<N, A>> pool;
	private int poolCounter;
	private A e;
	private Op id;
	private int h;
	private int n;

	PLST(int num, F3<A, A, A> merger, F4<A, Op, Integer, A> applier, F3<Op, Op, Op> opMerger, A e, Op id) {
		this.merger = merger;
		this.applier = applier;
		this.opMerger = opMerger;
		this.e = e;
		this.id = id;
		h = 0;
		while ((1 << h) < num)
			h++;
		n = 1 << h;
		N root = init(1, i -> e);
		roots = new ArrayList<N>();
		roots.add(root);
		pool = U.make(n * 2, i -> UP.make(null, e));
	}

	int init(A[] vals) {
		N root = init(1, i -> i < vals.length ? vals[i] : e);
		roots.add(root);
		return roots.size() - 1;
	}

	A get(int root, int i) {
		return query(root, i, i + 1);
	}

	int set(int root, int i, A a) {
		N newRoot = set(roots.get(root), 0, n, i, a, id);
		roots.add(newRoot);
		return roots.size() - 1;
	}

	A query(int root, int from, int until) {
		UP<N, A> res = query(roots.get(root), from, until, 0, n, id);
		roots.set(root, res.a);
		return res.b;
	}

	int apply(int root, int from, int until, Op o) {
		N newRoot = apply(roots.get(root), from, until, 0, n, id, o);
		roots.add(newRoot);
		return roots.size() - 1;
	}

	private N init(int k, F2<Integer, A> maker) {
		if (k >= n) {
			return new N(maker.f(k - n), id, null, null);
		}
		N nl = init(k << 1, maker);
		N nr = init(k << 1 | 1, maker);
		return new N(merge(nl.a, nr.a), id, nl, nr);
	}

	private N set(N node, int l, int r, int i, A a, Op lazy) {
		if (i < l || i >= r) {
			if (lazy == id)
				return node;
			return new N(node.a, mergeOp(node.lazy, lazy), node.l, node.r);
		}
		if (r - l == 1)
			return new N(a, id, null, null);
		Op lazyProp = mergeOp(node.lazy, lazy);
		N nl = set(node.l, l, l + r >> 1, i, a, lazyProp);
		N nr = set(node.r, l + r >> 1, r, i, a, lazyProp);
		return new N(merge(eval(nl, r - l >> 1), eval(nr, r - l >> 1)), id, nl, nr);
	}

	private UP<N, A> query(N node, int a, int b, int l, int r, Op lazy) {
		if (a >= r || b <= l) {
			if (lazy == id)
				return pick(node, e);
			return pick(new N(node.a, mergeOp(node.lazy, lazy), node.l, node.r), e);
		}
		if (a <= l && b >= r) {
			N newNode = new N(node.a, mergeOp(node.lazy, lazy), node.l, node.r);
			return pick(newNode, eval(newNode, r - l));
		}
		Op lazyProp = mergeOp(node.lazy, lazy);
		UP<N, A> rl = query(node.l, a, b, l, l + r >> 1, lazyProp);
		UP<N, A> rr = query(node.r, a, b, l + r >> 1, r, lazyProp);
		return pick(new N(merge(eval(rl.a, r - l >> 1), eval(rr.a, r - l >> 1)), id, rl.a, rr.a), merge(rl.b, rr.b));
	}

	private UP<N, A> pick(N node, A a) {
		UP<N, A> res = pool.get(poolCounter);
		poolCounter = (poolCounter + 1) % pool.size();
		res.a = node;
		res.b = a;
		return res;
	}

	private N apply(N node, int a, int b, int l, int r, Op lazy, Op o) {
		if (a >= r || b <= l) {
			if (lazy == id)
				return node;
			return new N(node.a, mergeOp(node.lazy, lazy), node.l, node.r);
		}
		if (a <= l && b >= r) {
			return new N(node.a, mergeOp(mergeOp(node.lazy, lazy), o), node.l, node.r);
		}
		Op lazyProp = mergeOp(node.lazy, lazy);
		N nl = apply(node.l, a, b, l, l + r >> 1, lazyProp, o);
		N nr = apply(node.r, a, b, l + r >> 1, r, lazyProp, o);
		return new N(merge(eval(nl, r - l >> 1), eval(nr, r - l >> 1)), id, nl, nr);
	}

	private A merge(A a, A b) {
		return a == e ? b : b == e ? a : merger.f(a, b);
	}

	private Op mergeOp(Op o, Op p) {
		return o == id ? p : p == id ? o : opMerger.f(o, p);
	}

	private A apply(A a, Op o, int len) {
		return o == id ? a : applier.f(a, o, len);
	}

	private A eval(N node, int len) {
		return apply(node.a, node.lazy, len);
	}
}

public class Main {

	// TODO: solve
	private static void solve() {
		int n = nei();
		int q = nei();
		PLST<Integer, Integer> lst = new PLST<Integer, Integer>(n, (a, b) -> a + b, (a, f, len) -> f * len,
				(f, g) -> g, 0, null);
		int root = 0;
		for (int i = 0; i < q; i++) {
			if (nei() == 0) {
				int l = nei();
				int r = nei() + 1;
				int x = nei();
				root = lst.apply(root, l, r, x);
			} else {
				int l = nei();
				int r = nei() + 1;
				out(lst.query(root, l, r));
			}
		}
	}

	// returns (x, y, d) s.t. ax + by = d
	static long[] exgcd(long a, long b) {
		int sa = a < 0 ? -1 : 1;
		int sb = b < 0 ? -1 : 1;
		a *= sa;
		b *= sb;
		long x = 1;
		long y = 0;
		long z = 0;
		long w = 1;
		while (b > 0) {
			long q = a / b;
			long t = z;
			z = x - q * z;
			x = t;
			t = w;
			w = y - q * w;
			y = t;
			t = b;
			b = a - q * b;
			a = t;
		}
		return new long[] { x * sa, y * sb, a };
	}

	static int[] lis(int[] s) {
		int n = s.length;
		int[] dp = new int[n];
		int[] ids = new int[n];
		int[] pids = new int[n];
		dp[0] = s[0];
		int len = 1;
		int lidx = 0;
		for (int i = 1; i < n; i++) {
			int idx = bs(s[i], dp, 0, len);
			dp[idx] = s[i];
			ids[idx] = i;
			if (idx == len) {
				lidx = i;
				len++;
			}
			if (idx > 0)
				pids[i] = ids[idx - 1];
		}
		int[] lis = new int[len];
		lis[len - 1] = s[lidx];
		for (int i = len - 1; i >= 0; i--) {
			lis[i] = s[lidx];
			lidx = pids[lidx];
		}
		return lis;
	}

	static int bs(int a, int[] as, int from, int num) {
		int min = from;
		int max = from + num - 1;
		while (min < max) {
			int mid = min + max >> 1;
			if (as[mid] < a)
				min = mid + 1;
			else if (as[mid] > a)
				max = mid;
			else
				return mid;
		}
		return as[min] < a ? min + 1 : min;
	}

	static int gcd(int x, int y) {
		x = (x ^ x >> 31) - (x >> 31);
		y = (y ^ y >> 31) - (y >> 31);
		if (x < y) {
			x ^= y;
			y ^= x;
			x ^= y;
		}
		int z = x % y;
		if (z == 0)
			return y;
		return gcd(y, z);
	}

	static long gcd(long x, long y) {
		x = (x ^ x >> 63) - (x >> 63);
		y = (y ^ y >> 63) - (y >> 63);
		if (x < y) {
			x ^= y;
			y ^= x;
			x ^= y;
		}
		long z = x % y;
		if (z == 0)
			return y;
		return gcd(y, z);
	}

	static long modinv(long a, long mod) {
		return modpow(a, mod - 2, mod);
	}

	static long modpow(long a, long b, long mod) {
		if (b == 0)
			return 1;
		if ((b & 1) == 0) {
			long sqrt = modpow(a, b >> 1, mod);
			return sqrt * sqrt % mod;
		}
		return a * modpow(a, b - 1, mod) % mod;
	}

	static long fact(long n) {
		if (n <= 1)
			return 1;
		long res = 2;
		for (long i = 3; i <= n; i++) {
			res *= i;
		}
		return res;
	}

	static long modfact(long n, long mod) {
		if (n <= 1)
			return 1 % mod;
		long res = 2;
		for (long i = 3; i <= n; i++) {
			res *= i;
			res %= mod;
		}
		return res % mod;
	}

	// returns facts([0]) and invfacts([1])
	static long[][] enumfacts(int n, long mod) {
		int num = n + 10;
		long[][] res = new long[2][num];
		long[] facts = res[0];
		long[] invfacts = res[1];
		for (int i = 0; i < num; i++) {
			if (i <= 1) {
				facts[i] = 1;
				invfacts[i] = 1;
			} else {
				facts[i] = facts[i - 1] * i % mod;
				invfacts[i] = modinv(facts[i], mod);
			}
		}
		return res;
	}

	static long modcomb(long n, long m, long mod) {
		if (m > n)
			return 0;
		if (m > n - m) {
			m = n - m;
		}
		long numer = 1;
		for (int i = 0; i < m; i++) {
			numer = numer * (n - i) % mod;
		}
		long denom = modfact(m, mod);
		return numer * modinv(denom, mod) % mod;
	}

	static long modcomb(int n, int m, long[] facts, long[] invfacts, long mod) {
		if (m > n)
			return 0;
		long numer = facts[n];
		long denom = invfacts[m] * invfacts[n - m] % mod;
		return numer * denom % mod;
	}

	// res[i][0]: prime factor, res[i][1]: exponent
	static int[][] factorize(int n) {
		int[][] pfs = new int[32][2];
		int num = 0;
		for (int i = 2; i * i <= n; i++) {
			int count = 0;
			while (n % i == 0) {
				n /= i;
				count++;
			}
			if (count > 0) {
				pfs[num][0] = i;
				pfs[num][1] = count;
				num++;
			}
		}
		if (n > 1) {
			pfs[num][0] = n;
			pfs[num][1] = 1;
			num++;
		}
		int[][] res = new int[num][2];
		for (int i = 0; i < num; i++) {
			res[i][0] = pfs[i][0];
			res[i][1] = pfs[i][1];
		}
		return res;
	}

	static long lcm(long x, long y) {
		x = (x ^ x >> 63) - (x >> 63);
		y = (y ^ y >> 63) - (y >> 63);
		return x / gcd(x, y) * y;
	}

	static int abs(int x) {
		return x < 0 ? -x : x;
	}

	static long abs(long x) {
		return x < 0 ? -x : x;
	}

	static int min(int a, int b) {
		return a < b ? a : b;
	}

	static long min(long a, long b) {
		return a < b ? a : b;
	}

	static int max(int a, int b) {
		return a > b ? a : b;
	}

	static long max(long a, long b) {
		return a > b ? a : b;
	}

	static int clamp(int a, int min, int max) {
		return a < min ? min : a > max ? max : a;
	}

	static long clamp(long a, long min, long max) {
		return a < min ? min : a > max ? max : a;
	}

	static double clamp(double a, double min, double max) {
		return a < min ? min : a > max ? max : a;
	}

	static void out(String val) {
		IO.out(val);
	}

	static void out(Object val) {
		IO.out(String.valueOf(val));
	}

	static void out(int val) {
		IO.out(String.valueOf(val));
	}

	static void out(long val) {
		IO.out(String.valueOf(val));
	}

	static void out(char val) {
		IO.out(String.valueOf(val));
	}

	static void out(double val) {
		IO.out(Double.isFinite(val) ? BigDecimal.valueOf(val).toPlainString() : String.valueOf(val));
	}

	static void out(boolean val) {
		IO.out(val ? "true" : "false");
	}

	static void kil(String val) {
		IO.out(val);
		IO.flush();
		System.exit(0);
	}

	static void kil(Object val) {
		IO.out(String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(int val) {
		IO.out(String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(long val) {
		IO.out(String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(char val) {
		IO.out(String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(double val) {
		IO.out(Double.isFinite(val) ? BigDecimal.valueOf(val).toPlainString() : String.valueOf(val));
		IO.flush();
		System.exit(0);
	}

	static void kil(boolean val) {
		IO.out(val ? "true" : "false");
		IO.flush();
		System.exit(0);
	}

	static String nes() {
		return IO.next();
	}

	static int nei() {
		return IO.nextInt();
	}

	static long nel() {
		return IO.nextLong();
	}

	static double ned() {
		return IO.nextDouble();
	}

	static char nec() {
		return IO.nextChar();
	}

	static String[] nss(int n) {
		String[] as = new String[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.next();
		}
		return as;
	}

	static int[] nis(int n) {
		int[] as = new int[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.nextInt();
		}
		return as;
	}

	static long[] nls(int n) {
		long[] as = new long[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.nextLong();
		}
		return as;
	}

	static double[] nds(int n) {
		double[] as = new double[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.nextDouble();
		}
		return as;
	}

	static char[] ncs(int n) {
		char[] as = new char[n];
		for (int i = 0; i < n; i++) {
			as[i] = IO.nextChar();
		}
		return as;
	}

	static String[][] nss2(int n, int m) {
		String[][] as = new String[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.next();
			}
		}
		return as;
	}

	static int[][] nis2(int n, int m) {
		int[][] as = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.nextInt();
			}
		}
		return as;
	}

	static long[][] nls2(int n, int m) {
		long[][] as = new long[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.nextLong();
			}
		}
		return as;
	}

	static double[][] nds2(int n, int m) {
		double[][] as = new double[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.nextDouble();
			}
		}
		return as;
	}

	static char[][] ncs2(int n, int m) {
		char[][] as = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				as[i][j] = IO.nextChar();
			}
		}
		return as;
	}

	static int parseInt(String val) {
		return Integer.parseInt(val);
	}

	static int parseInt(char val) {
		return Integer.parseInt(String.valueOf(val));
	}

	static long parseLong(String val) {
		return Long.parseLong(val);
	}

	public static void main(String[] args) {
		try {
			solve();
			IO.flush();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}

final class IO {
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out, false);
	private static final byte[] buffer = new byte[1024];
	private static int ptr = 0;
	private static int len = 0;

	private static boolean hasNextByte() {
		if (ptr < len)
			return true;
		ptr = 0;
		try {
			len = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return len > 0;
	}

	private static int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	static boolean hasNext() {
		byte c;
		while (hasNextByte() && ((c = buffer[ptr]) < '!' || c > '~'))
			ptr++;
		return hasNextByte();
	}

	static String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (b >= '!' && b <= '~') {
			sb.append((char) b);
			b = readByte();
		}
		return sb.toString();
	}

	static char nextChar() {
		if (!hasNext())
			throw new NoSuchElementException();
		return (char) readByte();
	}

	static long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
		long n = 0;
		int sign = 1;
		int b = readByte();
		if (b == '-') {
			sign = -1;
			b = readByte();
		}
		if (b < '0' || '9' < b)
			throw new NumberFormatException();
		while (true) {
			if ('0' <= b && b <= '9')
				n = n * 10 + b - '0';
			else if (b == -1 || b < '!' || b > '~')
				return n * sign;
			else
				throw new NumberFormatException();
			b = readByte();
		}
	}

	static int nextInt() {
		if (!hasNext())
			throw new NoSuchElementException();
		int n = 0;
		int sign = 1;
		int b = readByte();
		if (b == '-') {
			sign = -1;
			b = readByte();
		}
		if (b < '0' || '9' < b)
			throw new NumberFormatException();
		while (true) {
			if ('0' <= b && b <= '9')
				n = n * 10 + b - '0';
			else if (b == -1 || b < '!' || b > '~')
				return n * sign;
			else
				throw new NumberFormatException();
			b = readByte();
		}
	}

	static double nextDouble() {
		return Double.parseDouble(next());
	}

	static void out(String val) {
		out.println(val);
	}

	static void flush() {
		out.flush();
	}
}

