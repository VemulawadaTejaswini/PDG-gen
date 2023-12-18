import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	private static BigInteger v(long v) {
		return BigInteger.valueOf(v);
	}

	private static void solve() {
		int n = nei();
		int x = nei();
		long[][] blu = nls2(n, 3);
		long[][] ad = new long[n][2];// ad, idx
		BigInteger left = BigInteger.ZERO;
		for (int i = 0; i < n; i++) {
			long b = blu[i][0];
			long l = blu[i][1];
			long u = blu[i][2];
			ad[i][0] = b * l + (x - b) * u;
			ad[i][1] = i;
			left = left.add(v(b).multiply(v(l)));
//			left += b * l;
		}

		Arrays.sort(ad, (a, b) -> Long.signum(b[0] - a[0]));
		long ans = 0;
		BigInteger vx = v(x);
		for (int i = 0; i < n; i++) {
			long adi = ad[i][0];
			BigInteger badi = v(adi);

//			System.out.println("left=" + left + ", ad[i]=" + adi);

//			if (left < adi) {
			if (left.compareTo(badi) < 0) {
//				System.out.println("overkill, check all");
				BigInteger minT = vx;
				for (int j = i; j < n; j++) {
					int idx = (int) ad[j][1];

					BigInteger score = left;

					BigInteger b = v(blu[idx][0]);
					BigInteger l = v(blu[idx][1]);
					BigInteger u = v(blu[idx][2]);
					BigInteger one = v(1);

//					System.out.println("b="+b + " l=" + l + " u=" + u);
					BigInteger num = score.add(l.subtract(one)).divide(l);
//					System.out.println("left-1: " + score + " " + num);
					if (num.compareTo(b) <= 0) {
						minT = U.min(minT, num);
						continue;
					}
//					score = score.subtract(l.multiply(b));
					num = b.add(score.subtract(b.multiply(l)).add(u.subtract(one)).divide(u));
//					System.out.println("left-2: " + score + " " + num);
					if (num.compareTo(vx) <= 0) {
						minT = U.min(minT, num);
						continue;
					}
				}
//				System.out.println("min: " + minT);
				ans += minT.longValueExact();
				kil(ans);
			}
			left = left.subtract(badi);
			ans += x;
		}
		kil(ans);
//
//		Arrays.sort(blu, (a, b) -> Long.signum(b[1] - a[1]));
//		long score = 0;
//		for (int i = 0; i < n; i++) {
//			score += blu[i][0] * blu[i][1];
//			System.out.println(blu[i][0] + " " + blu[i][1] + " " + blu[i][2]);
//		}
//		System.out.println();
//		long ans = 0;
//		for (int i = 0; i < n; i++) {
//			long b = blu[i][0];
//			long l = blu[i][1];
//			long u = blu[i][2];
//
//			System.out.println(b + " " + l + " " + u);
//			long num = (score + l - 1) / l;
//			System.out.println("left-1: " + score + " " + num);
//			if (num <= b) {
//				ans += num;
//				kil(ans);
//			}
//			score -= l * b;
//			ans += b;
//			System.out.println("left-2: " + score + " " + num);
//			num = (score + u - 1) / u;
//			if (b + num <= x) {
//				ans += num;
//				kil(ans);
//			}
//			score -= (x - b) * u;
//			ans += x - b;
//			System.out.println("left-3: " + score);
//		}
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

class PQE { // Priority Queue Entry
}

@SuppressWarnings("unchecked")
class PQ<A> { // Priority Queue
	private static class E extends PQE { // Entry
		Object a;
		int index;

		public E(Object a, int index) {
			this.a = a;
			this.index = index;
		}
	}

	private int n;
	private E[] as;
	private Comparator<A> comp;

	PQ(Comparator<A> comp) {
		this.comp = comp;
		as = new E[64];
		n = 1;
	}

	PQE add(A a) {
		E res = addEntry(a);
		fixUp(n - 1);
		return res;
	}

	A pop() {
		int max = n - 1;
		if (max == 0)
			return null;
		if (max == 1) {
			return removeLast();
		}

		E tmp = as[1];
		as[1] = as[max];
		as[max] = tmp;
		as[1].index = 1;
		as[max].index = max;

		A res = removeLast();
		fixDown(1);
		return res;
	}

	A get(PQE e) {
		return (A) ((E) e).a;
	}

	void remove(PQE e) {
		int k = ((E) e).index;
		int max = n - 1;
		if (k == max) {
			removeLast();
			return;
		}

		E tmp = as[k];
		as[k] = as[max];
		as[max] = tmp;
		as[k].index = k;
		as[max].index = max;

		removeLast();
		if (!fixDown(k))
			fixUp(k);
	}

	void update(PQE e, A a) {
		int k = ((E) e).index;
		as[k].a = a;
		if (!fixDown(k))
			fixUp(k);
	}

	boolean isEmpty() {
		return n == 1;
	}

	private A removeLast() {
		n--;
		E res = as[n];
		res.index = -1;
		as[n] = null;
		return (A) res.a;
	}

	private boolean fixUp(int k) {
		boolean res = false;
		while (k > 1) {
			int nk = k >> 1;
			if (comp.compare((A) as[k].a, (A) as[nk].a) < 0) {
				E tmp = as[k];
				as[k] = as[nk];
				as[nk] = tmp;
				as[k].index = k;
				as[nk].index = nk;
				k = nk;
				res = true;
				continue;
			}
			break;
		}
		return res;
	}

	private boolean fixDown(int k) {
		boolean res = false;
		while (k << 1 < n) {
			A a = (A) as[k].a;
			A l = (A) as[k << 1].a;
			if (k << 1 == n - 1) {
				if (comp.compare(a, l) <= 0)
					break;
				res = true;
				E tmp = as[k];
				as[k] = as[k << 1];
				as[k << 1] = tmp;
				as[k].index = k;
				as[k << 1].index = k << 1;
				break;
			}
			A r = (A) as[k << 1 | 1].a;
			if (comp.compare(a, l) <= 0 && comp.compare(a, r) <= 0)
				break;
			res = true;
			if (comp.compare(l, r) < 0) {
				int nk = k << 1;
				E tmp = as[k];
				as[k] = as[nk];
				as[nk] = tmp;
				as[k].index = k;
				as[nk].index = nk;
				k = nk;
			} else {
				int nk = k << 1 | 1;
				E tmp = as[k];
				as[k] = as[nk];
				as[nk] = tmp;
				as[k].index = k;
				as[nk].index = nk;
				k = nk;
			}
		}
		return res;
	}

	private E addEntry(A a) {
		if (n == as.length) {
			as = U.doubleSize(as);
		}
		return as[n] = new E(a, n++);
	}

	public String toString() {
		if (n == 1)
			return "[]";
		String s = null;
		for (int i = 1; i < n; i++) {
			A a = (A) as[i].a;
			if (s == null)
				s = "[" + a;
			else
				s += ", " + a;
		}
		return s + "]";
	}
}

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

interface F5<A, B, C, D, E> {
	E f(A a, B b, C c, D d);
}

interface F1V<A> {
	void f(A a);
}

interface F2V<A, B> {
	void f(A a, B b);
}

interface F3V<A, B, C> {
	void f(A a, B b, C c);
}

interface F4V<A, B, C, D> {
	void f(A a, B b, C c, D d);
}

interface F5V<A, B, C, D, E> {
	void f(A a, B b, C c, D d, E e);
}

class U { // Utilities
	static <A> ArrayList<A> make(int n, F2<Integer, A> maker) {
		ArrayList<A> res = new ArrayList<A>();
		for (int i = 0; i < n; i++)
			res.add(maker.f(i));
		return res;
	}

	static <A> ArrayList<A> filter(ArrayList<A> as, F2<A, Boolean> pred) {
		ArrayList<A> res = new ArrayList<A>();
		for (A a : as)
			if (pred.f(a))
				res.add(a);
		return res;
	}

	static <A> int count(ArrayList<A> as, F2<A, Boolean> pred) {
		int res = 0;
		for (A a : as)
			if (pred.f(a))
				res++;
		return res;
	}

	static <A> ArrayList<A> concat(ArrayList<A> as, ArrayList<A> bs) {
		ArrayList<A> res = new ArrayList<A>();
		res.addAll(as);
		res.addAll(bs);
		return res;
	}

	static <A> boolean any(ArrayList<A> as, F2<A, Boolean> pred) {
		for (A a : as)
			if (pred.f(a))
				return true;
		return false;
	}

	static <A> boolean all(ArrayList<A> as, F2<A, Boolean> pred) {
		for (A a : as)
			if (!pred.f(a))
				return false;
		return true;
	}

	static <A> ArrayList<A> flatten(ArrayList<ArrayList<A>> ass) {
		ArrayList<A> res = new ArrayList<A>();
		for (ArrayList<A> as : ass)
			res.addAll(as);
		return res;
	}

	static <A, B> B foldl(ArrayList<A> as, F3<B, A, B> f, B e) {
		B res = e;
		for (A a : as)
			res = f.f(res, a);
		return res;
	}

	static <A, B> B foldr(ArrayList<A> as, F3<A, B, B> f, B e) {
		B res = e;
		for (int i = as.size() - 1; i >= 0; i--)
			res = f.f(as.get(i), res);
		return res;
	}

	static <A> ArrayList<A> reverse(ArrayList<A> as) {
		int size = as.size();
		return make(size, i -> as.get(size - 1 - i));
	}

	static <A> void forEach(ArrayList<A> as, F1V<A> f) {
		for (A a : as)
			f.f(a);
	}

	static <A extends Comparable<A>> UP<TreeMap<A, Integer>, ArrayList<A>> compress(ArrayList<A> as) {
		TreeSet<A> set = new TreeSet<A>(as);
		TreeMap<A, Integer> map = new TreeMap<A, Integer>();
		ArrayList<A> imap = new ArrayList<A>();
		int i = 0;
		for (A a : set) {
			map.put(a, i++);
			imap.add(a);
		}
		return UP.make(map, imap);
	}

	static <A, B> ArrayList<B> map(ArrayList<A> as, F2<A, B> f) {
		return make(as.size(), (i) -> f.f(as.get(i)));
	}

	static <A, B> ArrayList<UP<A, B>> zip(ArrayList<A> as, ArrayList<B> bs) {
		return make(min(as.size(), bs.size()), (i) -> UP.make(as.get(i), bs.get(i)));
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

	static <A> ArrayList<A> toAL(A[] as) {
		return make(as.length, i -> as[i]);
	}

	static <A> A[] doubleSize(A[] as) {
		return Arrays.copyOf(as, as.length << 1);
	}
}

class Rev<A extends Comparable<A>> implements Comparable<Rev<A>> {
	A a;

	Rev(A a) {
		this.a = a;
	}

	static <A extends Comparable<A>> Rev<A> make(A a) {
		return new Rev<A>(a);
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Rev))
			return false;
		Rev<?> r = (Rev<?>) o;
		return a == null ? r.a == null : a.equals(r.a);
	}

	public int compareTo(Rev<A> o) {
		return -a.compareTo(o.a);
	}

	public String toString() {
		return "-(" + a.toString() + ")";
	}
}

class Flat<A> implements Comparable<Flat<A>> {
	A a;

	Flat(A a) {
		this.a = a;
	}

	static <A> Flat<A> make(A a) {
		return new Flat<A>(a);
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Flat))
			return false;
		Flat<?> r = (Flat<?>) o;
		return a == null ? r.a == null : a.equals(r.a);
	}

	public int compareTo(Flat<A> o) {
		return 0;
	}

	public String toString() {
		return "0(" + a.toString() + ")";
	}
}

class UP<A, B> { // Unordered Pair
	A a;
	B b;

	UP(A a, B b) {
		this.a = a;
		this.b = b;
	}

	static <A, B> UP<A, B> make(A a, B b) {
		return new UP<A, B>(a, b);
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

class P<A extends Comparable<A>, B extends Comparable<B>> extends UP<A, B> implements Comparable<P<A, B>> { // Pair
	P(A a, B b) {
		super(a, b);
	}

	static <A extends Comparable<A>, B extends Comparable<B>> P<A, B> make(A a, B b) {
		return new P<A, B>(a, b);
	}

	public int compareTo(P<A, B> o) {
		int sa = a.compareTo(o.a);
		int sb = b.compareTo(o.b);
		return sa != 0 ? sa : sb;
	}
}

class UT<A, B, C> { // Unordered Tuple
	A a;
	B b;
	C c;

	UT(A a, B b, C c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	static <A, B, C> UT<A, B, C> make(A a, B b, C c) {
		return new UT<A, B, C>(a, b, c);
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof UT))
			return false;
		UT<?, ?, ?> t = (UT<?, ?, ?>) o;
		boolean aok = a == null ? t.a == null : a.equals(t.a);
		boolean bok = b == null ? t.b == null : b.equals(t.b);
		boolean cok = c == null ? t.c == null : c.equals(t.c);
		return aok && bok && cok;
	}

	public String toString() {
		return "(" + a.toString() + ", " + b.toString() + ", " + c.toString() + ")";
	}
}

class T<A extends Comparable<A>, B extends Comparable<B>, C extends Comparable<C>> extends UT<A, B, C> implements
		Comparable<T<A, B, C>> { // Tuple
	T(A a, B b, C c) {
		super(a, b, c);
	}

	static <A extends Comparable<A>, B extends Comparable<B>, C extends Comparable<C>> T<A, B, C> make(A a, B b, C c) {
		return new T<A, B, C>(a, b, c);
	}

	public int compareTo(T<A, B, C> o) {
		int sa = a.compareTo(o.a);
		int sb = b.compareTo(o.b);
		int sc = c.compareTo(o.c);
		return sa != 0 ? sa : sb != 0 ? sb : sc;
	}
}
