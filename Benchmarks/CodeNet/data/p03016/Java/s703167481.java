import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	private static void solve() {
		long l = nl();
		long a = nl();
		long b = nl();
		long m = nl();
		long x = a;
		long rem = 0;

		long keta = 1;
		long exp = 1;
		while (a >= exp * 10) {
			exp *= 10;
			keta++;
		}

		long prev = 0;

		long ans = 0;

		ModInt mo = new ModInt(m);
		while (true) {
			final long nexp = exp * 10;
			long next = U.searchL(prev - 1, l, mid -> a + mid * b >= nexp);
			if (next > prev) {
				long _a = a + prev * b;
				long k = next - prev - 1;

				mo.set("a b k ans n", _a, b, k, ans, keta);
				mo.run("T=10^n");
				if (k > 3) {
					mo.run("tmp=(a * (-(T^(k+1)) + T^(k+2) - T + 1) + b * (T^(k+1) - k*(T-1) - T)) / (T - 1)^2");
					mo.run("ans=ans*T^(k+1)+tmp");
					ans = mo.get("ans");
//					System.out.println("a  "+ans);
				} else {
					mo.set("tmp", 0l);
					for (long i = 0; i <= k; i++) {
						mo.set("i", i);
						mo.run("tmp=tmp+(a+i*b)*T^(k-i)");
					}
					mo.run("ans=ans*T^(k+1)+tmp");
					ans = mo.get("ans");
//					System.out.println("b  "+ans);
				}
			}
//			System.out.println("s_" + (next - 1) + "=" + (a + b * (next - 1)) + " " + keta + " " + exp + " num="
//					+ (next - prev));
			exp *= 10;
			keta++;
			if (next == l)
				break;
			prev = next;
		}
		out(ans);
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

	static String ns() {
		return IO.next();
	}

	static int ni() {
		return IO.nextInt();
	}

	static long nl() {
		return IO.nextLong();
	}

	static double nd() {
		return IO.nextDouble();
	}

	static char nc() {
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

// TODO: paste library here

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

class P<A extends Comparable<? super A>, B extends Comparable<? super B>> extends UP<A, B> implements
		Comparable<P<A, B>> { // Pair
	P(A a, B b) {
		super(a, b);
	}

	static <A extends Comparable<? super A>, B extends Comparable<? super B>> P<A, B> make(A a, B b) {
		return new P<A, B>(a, b);
	}

	public int compareTo(P<A, B> o) {
		int sa = a.compareTo(o.a);
		int sb = b.compareTo(o.b);
		return sa != 0 ? sa : sb;
	}
}

class PI implements Comparable<PI> { // Pair int
	int a;
	int b;

	PI(int a, int b) {
		this.a = a;
		this.b = b;
	}

	static PI make(int a, int b) {
		return new PI(a, b);
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PI))
			return false;
		PI p = (PI) o;
		return a == p.a && b == p.b;
	}

	public int compareTo(PI o) {
		int sa = a - o.a;
		int sb = b - o.b;
		return sa > 0 ? 1 : sa < 0 ? -1 : sb > 0 ? 1 : sb < 0 ? -1 : 0;
	}

	public String toString() {
		return "(" + a + ", " + b + ")";
	}
}

class PL implements Comparable<PL> { // Pair long
	long a;
	long b;

	PL(long a, long b) {
		this.a = a;
		this.b = b;
	}

	static PL make(long a, long b) {
		return new PL(a, b);
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof PL))
			return false;
		PL p = (PL) o;
		return a == p.a && b == p.b;
	}

	public int compareTo(PL o) {
		long sa = a - o.a;
		long sb = b - o.b;
		return sa > 0 ? 1 : sa < 0 ? -1 : sb > 0 ? 1 : sb < 0 ? -1 : 0;
	}

	public String toString() {
		return "(" + a + ", " + b + ")";
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

class T<A extends Comparable<? super A>, B extends Comparable<? super B>, C extends Comparable<? super C>> extends
		UT<A, B, C> implements Comparable<T<A, B, C>> { // Tuple
	T(A a, B b, C c) {
		super(a, b, c);
	}

	static <A extends Comparable<? super A>, B extends Comparable<? super B>, C extends Comparable<? super C>> T<A, B, C> make(
			A a, B b, C c) {
		return new T<A, B, C>(a, b, c);
	}

	public int compareTo(T<A, B, C> o) {
		int sa = a.compareTo(o.a);
		int sb = b.compareTo(o.b);
		int sc = c.compareTo(o.c);
		return sa != 0 ? sa : sb != 0 ? sb : sc;
	}
}

class TI implements Comparable<TI> { // Tuple int
	int a;
	int b;
	int c;

	TI(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	static TI make(int a, int b, int c) {
		return new TI(a, b, c);
	}

	TL toLong() {
		return TL.make(a, b, c);
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof TI))
			return false;
		TI t = (TI) o;
		return a == t.a && b == t.b && c == t.c;
	}

	public int compareTo(TI o) {
		int sa = a - o.a;
		int sb = b - o.b;
		int sc = c - o.c;
		return sa > 0 ? 1 : sa < 0 ? -1 : sb > 0 ? 1 : sb < 0 ? -1 : sc > 0 ? 1 : sc < 0 ? -1 : 0;
	}

	public String toString() {
		return "(" + a + ", " + b + ", " + c + ")";
	}
}

class TL implements Comparable<TL> { // Tuple long
	long a;
	long b;
	long c;

	TL(long a, long b, long c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	static TL make(long a, long b, long c) {
		return new TL(a, b, c);
	}

	TI toInt() {
		return TI.make((int) a, (int) b, (int) c);
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof TL))
			return false;
		TL t = (TL) o;
		return a == t.a && b == t.b && c == t.c;
	}

	public int compareTo(TL o) {
		long sa = a - o.a;
		long sb = b - o.b;
		long sc = c - o.c;
		return sa > 0 ? 1 : sa < 0 ? -1 : sb > 0 ? 1 : sb < 0 ? -1 : sc > 0 ? 1 : sc < 0 ? -1 : 0;
	}

	public String toString() {
		return "(" + a + ", " + b + ", " + c + ")";
	}
}

final class U { // Utilities
	private U() {
	}

	static <A> ArrayList<A> make(int n, F.IX<A> maker) {
		ArrayList<A> res = new ArrayList<A>();
		for (int i = 0; i < n; i++)
			res.add(maker.f(i));
		return res;
	}

	static boolean[] makeB(int n, F.IB maker) {
		boolean[] res = new boolean[n];
		for (int i = 0; i < n; i++)
			res[i] = maker.f(i);
		return res;
	}

	static int[] makeI(int n, F.II maker) {
		int[] res = new int[n];
		for (int i = 0; i < n; i++)
			res[i] = maker.f(i);
		return res;
	}

	static long[] makeL(int n, F.IL maker) {
		long[] res = new long[n];
		for (int i = 0; i < n; i++)
			res[i] = maker.f(i);
		return res;
	}

	static <A> A[] makeX(int n, F.IX<A> maker, A[] as) {
		A[] res = Arrays.copyOf(as, n);
		for (int i = 0; i < n; i++)
			res[i] = maker.f(i);
		return res;
	}

	static <A> ArrayList<A> filter(ArrayList<A> as, F.XB<A> pred) {
		ArrayList<A> res = new ArrayList<A>();
		for (A a : as)
			if (pred.f(a))
				res.add(a);
		return res;
	}

	static <A> int count(ArrayList<A> as, F.XB<A> pred) {
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

	static <A> boolean any(ArrayList<A> as, F.XB<A> pred) {
		for (A a : as)
			if (pred.f(a))
				return true;
		return false;
	}

	static <A> boolean all(ArrayList<A> as, F.XB<A> pred) {
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

	static <A, B> B foldl(ArrayList<A> as, F.XXX<B, A, B> f, B e) {
		B res = e;
		for (A a : as)
			res = f.f(res, a);
		return res;
	}

	static <A, B> B foldr(ArrayList<A> as, F.XXX<A, B, B> f, B e) {
		B res = e;
		for (int i = as.size() - 1; i >= 0; i--)
			res = f.f(as.get(i), res);
		return res;
	}

	static <A> ArrayList<A> reverse(ArrayList<A> as) {
		int size = as.size();
		return make(size, i -> as.get(size - 1 - i));
	}

	static boolean[] reverse(boolean[] as) {
		int size = as.length;
		return makeB(size, i -> as[size - 1 - i]);
	}

	static int[] reverse(int[] as) {
		int size = as.length;
		return makeI(size, i -> as[size - 1 - i]);
	}

	static long[] reverse(long[] as) {
		int size = as.length;
		return makeL(size, i -> as[size - 1 - i]);
	}

	static <A> A[] reverse(A[] as) {
		int size = as.length;
		return makeX(size, i -> as[size - 1 - i], as);
	}

	static <A extends Comparable<? super A>> UP<TreeMap<A, Integer>, ArrayList<A>> compress(ArrayList<A> as) {
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

	static <A, B> ArrayList<B> map(ArrayList<A> as, F.XX<A, B> f) {
		return make(as.size(), (i) -> f.f(as.get(i)));
	}

	static <A, B> ArrayList<B> mapi(ArrayList<A> as, F.XIX<A, B> f) {
		return make(as.size(), (i) -> f.f(as.get(i), i));
	}

	static <A, B> ArrayList<UP<A, B>> zip(ArrayList<A> as, ArrayList<B> bs) {
		return make(min(as.size(), bs.size()), (i) -> UP.make(as.get(i), bs.get(i)));
	}

	static int min(int a, int b) {
		return a < b ? a : b;
	}

	static long min(long a, long b) {
		return a < b ? a : b;
	}

	static <A extends Comparable<? super A>> A min(A a, A b) {
		return a.compareTo(b) < 0 ? a : b;
	}

	static int max(int a, int b) {
		return a > b ? a : b;
	}

	static long max(long a, long b) {
		return a > b ? a : b;
	}

	static <A extends Comparable<? super A>> A max(A a, A b) {
		return a.compareTo(b) > 0 ? a : b;
	}

	static int clamp(int a, int min, int max) {
		return a < min ? min : a > max ? max : a;
	}

	static long clamp(long a, long min, long max) {
		return a < min ? min : a > max ? max : a;
	}

	static int abs(int a) {
		return a < 0 ? -a : a;
	}

	static long abs(long a) {
		return a < 0 ? -a : a;
	}

	static <A extends Comparable<? super A>> A clamp(A a, A min, A max) {
		return a.compareTo(min) < 0 ? min : a.compareTo(max) > 0 ? max : a;
	}

	static <A> ArrayList<A> toAL(A[] as) {
		return make(as.length, i -> as[i]);
	}

	static <A> A[] doubleSize(A[] as) {
		return Arrays.copyOf(as, as.length << 1);
	}

	static long searchL(long ng, long ok, F.LB isOk) {
		while (ng - ok > 1 || ok - ng > 1) {
			long mid = ng + ok >> 1;
			if (isOk.f(mid))
				ok = mid;
			else
				ng = mid;
		}
		return ok;
	}

	static int searchI(int ng, int ok, F.IB isOk) {
		return (int) searchL((long) ng, (long) ok, (mid) -> isOk.f((int) mid));
	}
}

final class F { // Functions
	private F() {
	}

	interface VV {
		void f();
	}

	interface BV {
		void f(boolean a);
	}

	interface BXV<A> {
		void f(boolean a, A b);
	}

	interface BXXV<A, B> {
		void f(boolean a, A b, B c);
	}

	interface BXXXV<A, B, C> {
		void f(boolean a, A b, B c, C d);
	}

	interface XBV<A> {
		void f(A a, boolean b);
	}

	interface XXBV<A, B> {
		void f(A a, B b, boolean c);
	}

	interface XXXBV<A, B, C> {
		void f(A a, B b, C c, boolean d);
	}

	interface IV {
		void f(int a);
	}

	interface IXV<A> {
		void f(int a, A b);
	}

	interface IXXV<A, B> {
		void f(int a, A b, B c);
	}

	interface IXXXV<A, B, C> {
		void f(int a, A b, B c, C d);
	}

	interface XIV<A> {
		void f(A a, int b);
	}

	interface XXIV<A, B> {
		void f(A a, B b, int c);
	}

	interface XXXIV<A, B, C> {
		void f(A a, B b, C c, int d);
	}

	interface LV {
		void f(long a);
	}

	interface LXV<A> {
		void f(long a, A b);
	}

	interface LXXV<A, B> {
		void f(long a, A b, B c);
	}

	interface LXXXV<A, B, C> {
		void f(long a, A b, B c, C d);
	}

	interface XLV<A> {
		void f(A a, long b);
	}

	interface XXLV<A, B> {
		void f(A a, B b, long c);
	}

	interface XXXLV<A, B, C> {
		void f(A a, B b, C c, long d);
	}

	interface XV<A> {
		void f(A a);
	}

	interface XXV<A, B> {
		void f(A a, B b);
	}

	interface XXXV<A, B, C> {
		void f(A a, B b, C c);
	}

	interface XXXXV<A, B, C, D> {
		void f(A a, B b, C c, D d);
	}

	interface VB {
		boolean f();
	}

	interface BB {
		boolean f(boolean a);
	}

	interface BXB<A> {
		boolean f(boolean a, A b);
	}

	interface BXXB<A, B> {
		boolean f(boolean a, A b, B c);
	}

	interface BXXXB<A, B, C> {
		boolean f(boolean a, A b, B c, C d);
	}

	interface XBB<A> {
		boolean f(A a, boolean b);
	}

	interface XXBB<A, B> {
		boolean f(A a, B b, boolean c);
	}

	interface XXXBB<A, B, C> {
		boolean f(A a, B b, C c, boolean d);
	}

	interface IB {
		boolean f(int a);
	}

	interface IXB<A> {
		boolean f(int a, A b);
	}

	interface IXXB<A, B> {
		boolean f(int a, A b, B c);
	}

	interface IXXXB<A, B, C> {
		boolean f(int a, A b, B c, C d);
	}

	interface XIB<A> {
		boolean f(A a, int b);
	}

	interface XXIB<A, B> {
		boolean f(A a, B b, int c);
	}

	interface XXXIB<A, B, C> {
		boolean f(A a, B b, C c, int d);
	}

	interface LB {
		boolean f(long a);
	}

	interface LXB<A> {
		boolean f(long a, A b);
	}

	interface LXXB<A, B> {
		boolean f(long a, A b, B c);
	}

	interface LXXXB<A, B, C> {
		boolean f(long a, A b, B c, C d);
	}

	interface XLB<A> {
		boolean f(A a, long b);
	}

	interface XXLB<A, B> {
		boolean f(A a, B b, long c);
	}

	interface XXXLB<A, B, C> {
		boolean f(A a, B b, C c, long d);
	}

	interface XB<A> {
		boolean f(A a);
	}

	interface XXB<A, B> {
		boolean f(A a, B b);
	}

	interface XXXB<A, B, C> {
		boolean f(A a, B b, C c);
	}

	interface XXXXB<A, B, C, D> {
		boolean f(A a, B b, C c, D d);
	}

	interface VI {
		int f();
	}

	interface BI {
		int f(boolean a);
	}

	interface BXI<A> {
		int f(boolean a, A b);
	}

	interface BXXI<A, B> {
		int f(boolean a, A b, B c);
	}

	interface BXXXI<A, B, C> {
		int f(boolean a, A b, B c, C d);
	}

	interface XBI<A> {
		int f(A a, boolean b);
	}

	interface XXBI<A, B> {
		int f(A a, B b, boolean c);
	}

	interface XXXBI<A, B, C> {
		int f(A a, B b, C c, boolean d);
	}

	interface II {
		int f(int a);
	}

	interface IXI<A> {
		int f(int a, A b);
	}

	interface IXXI<A, B> {
		int f(int a, A b, B c);
	}

	interface IXXXI<A, B, C> {
		int f(int a, A b, B c, C d);
	}

	interface XII<A> {
		int f(A a, int b);
	}

	interface XXII<A, B> {
		int f(A a, B b, int c);
	}

	interface XXXII<A, B, C> {
		int f(A a, B b, C c, int d);
	}

	interface LI {
		int f(long a);
	}

	interface LXI<A> {
		int f(long a, A b);
	}

	interface LXXI<A, B> {
		int f(long a, A b, B c);
	}

	interface LXXXI<A, B, C> {
		int f(long a, A b, B c, C d);
	}

	interface XLI<A> {
		int f(A a, long b);
	}

	interface XXLI<A, B> {
		int f(A a, B b, long c);
	}

	interface XXXLI<A, B, C> {
		int f(A a, B b, C c, long d);
	}

	interface XI<A> {
		int f(A a);
	}

	interface XXI<A, B> {
		int f(A a, B b);
	}

	interface XXXI<A, B, C> {
		int f(A a, B b, C c);
	}

	interface XXXXI<A, B, C, D> {
		int f(A a, B b, C c, D d);
	}

	interface VL {
		long f();
	}

	interface BL {
		long f(boolean a);
	}

	interface BXL<A> {
		long f(boolean a, A b);
	}

	interface BXXL<A, B> {
		long f(boolean a, A b, B c);
	}

	interface BXXXL<A, B, C> {
		long f(boolean a, A b, B c, C d);
	}

	interface XBL<A> {
		long f(A a, boolean b);
	}

	interface XXBL<A, B> {
		long f(A a, B b, boolean c);
	}

	interface XXXBL<A, B, C> {
		long f(A a, B b, C c, boolean d);
	}

	interface IL {
		long f(int a);
	}

	interface IXL<A> {
		long f(int a, A b);
	}

	interface IXXL<A, B> {
		long f(int a, A b, B c);
	}

	interface IXXXL<A, B, C> {
		long f(int a, A b, B c, C d);
	}

	interface XIL<A> {
		long f(A a, int b);
	}

	interface XXIL<A, B> {
		long f(A a, B b, int c);
	}

	interface XXXIL<A, B, C> {
		long f(A a, B b, C c, int d);
	}

	interface LL {
		long f(long a);
	}

	interface LXL<A> {
		long f(long a, A b);
	}

	interface LXXL<A, B> {
		long f(long a, A b, B c);
	}

	interface LXXXL<A, B, C> {
		long f(long a, A b, B c, C d);
	}

	interface XLL<A> {
		long f(A a, long b);
	}

	interface XXLL<A, B> {
		long f(A a, B b, long c);
	}

	interface XXXLL<A, B, C> {
		long f(A a, B b, C c, long d);
	}

	interface XL<A> {
		long f(A a);
	}

	interface XXL<A, B> {
		long f(A a, B b);
	}

	interface XXXL<A, B, C> {
		long f(A a, B b, C c);
	}

	interface XXXXL<A, B, C, D> {
		long f(A a, B b, C c, D d);
	}

	interface VX<A> {
		A f();
	}

	interface BX<A> {
		A f(boolean a);
	}

	interface BXX<A, B> {
		B f(boolean a, A b);
	}

	interface BXXX<A, B, C> {
		C f(boolean a, A b, B c);
	}

	interface BXXXX<A, B, C, D> {
		D f(boolean a, A b, B c, C d);
	}

	interface XBX<A, B> {
		B f(A a, boolean b);
	}

	interface XXBX<A, B, C> {
		C f(A a, B b, boolean c);
	}

	interface XXXBX<A, B, C, D> {
		D f(A a, B b, C c, boolean d);
	}

	interface IX<A> {
		A f(int a);
	}

	interface IXX<A, B> {
		B f(int a, A b);
	}

	interface IXXX<A, B, C> {
		C f(int a, A b, B c);
	}

	interface IXXXX<A, B, C, D> {
		D f(int a, A b, B c, C d);
	}

	interface XIX<A, B> {
		B f(A a, int b);
	}

	interface XXIX<A, B, C> {
		C f(A a, B b, int c);
	}

	interface XXXIX<A, B, C, D> {
		D f(A a, B b, C c, int d);
	}

	interface LX<A> {
		A f(long a);
	}

	interface LXX<A, B> {
		B f(long a, A b);
	}

	interface LXXX<A, B, C> {
		C f(long a, A b, B c);
	}

	interface LXXXX<A, B, C, D> {
		D f(long a, A b, B c, C d);
	}

	interface XLX<A, B> {
		B f(A a, long b);
	}

	interface XXLX<A, B, C> {
		C f(A a, B b, long c);
	}

	interface XXXLX<A, B, C, D> {
		D f(A a, B b, C c, long d);
	}

	interface XX<A, B> {
		B f(A a);
	}

	interface XXX<A, B, C> {
		C f(A a, B b);
	}

	interface XXXX<A, B, C, D> {
		D f(A a, B b, C c);
	}

	interface XXXXX<A, B, C, D, E> {
		E f(A a, B b, C c, D d);
	}
}

class AST { // Abstract Syntax Tree
	static class AssignOp extends AST {
		String id;
		AST r;

		AssignOp(String id, AST r) {
			this.id = id;
			this.r = r;
		}

		public String toString() {
			return "Assign(" + id + ", " + r + ")";
		}
	}

	static class Multi extends AST {
		ArrayList<AST> as;

		Multi(ArrayList<AST> as) {
			this.as = as;
		}

		public String toString() {
			String s = "";
			for (AST a : as)
				s += s.isEmpty() ? a : "; " + a;
			return "Multi(" + s + ")";
		}
	}

	static class BinOp extends AST {
		AST l;
		AST r;
		String op;

		BinOp(AST l, String op, AST r) {
			this.l = l;
			this.op = op;
			this.r = r;
		}

		public String toString() {
			return "BinOp(" + l + ", " + op + ", " + r + ")";
		}
	}

	static class UnOp extends AST {
		AST a;
		String op;

		UnOp(String op, AST a) {
			this.op = op;
			this.a = a;
		}

		public String toString() {
			return "UnOp(" + op + ", " + a + ")";
		}
	}

	static class Int extends AST {
		long v;

		Int(long v) {
			this.v = v;
		}

		public String toString() {
			return "Int(" + v + ")";
		}
	}

	static class Id extends AST {
		String s;

		Id(String s) {
			this.s = s;
		}

		public String toString() {
			return "Id(" + s + ")";
		}
	}

	static class Evaluator<A> {
		private F.XXX<String, A, A> assignE;
		private F.XXXX<A, String, A, A> binE;
		private F.XXX<String, A, A> unE;
		private F.LX<A> intE;
		private F.XX<String, A> idE;

		Evaluator(F.XXX<String, A, A> assignE, F.XXXX<A, String, A, A> binE, F.XXX<String, A, A> unE, F.LX<A> intE,
				F.XX<String, A> idE) {
			this.assignE = assignE;
			this.binE = binE;
			this.unE = unE;
			this.intE = intE;
			this.idE = idE;
		}
	}

	static <A> A eval(AST a, Evaluator<A> etor) {
		if (a instanceof AssignOp)
			return etor.assignE.f(((AssignOp) a).id, eval(((AssignOp) a).r, etor));
		if (a instanceof Multi) {
			A last = null;
			for (AST a2 : ((Multi) a).as)
				last = eval(a2, etor);
			return last;
		}
		if (a instanceof BinOp)
			return etor.binE.f(eval(((BinOp) a).l, etor), ((BinOp) a).op, eval(((BinOp) a).r, etor));
		if (a instanceof UnOp)
			return etor.unE.f(((UnOp) a).op, eval(((UnOp) a).a, etor));
		if (a instanceof Int)
			return etor.intE.f(((Int) a).v);
		if (a instanceof Id)
			return etor.idE.f(((Id) a).s);
		throw new RuntimeException("unexpected ast: " + a);
	}
}

class Seq<A extends Comparable<? super A>> {
	ArrayList<A> as;
	int ptr;

	Seq(ArrayList<A> as) {
		this.as = as;
		ptr = 0;
	}

	boolean hasNext(int num) {
		return ptr + num < as.size();
	}

	boolean hasNext() {
		return hasNext(0);
	}

	A next(int num) {
		return ptr + num < as.size() ? as.get(ptr + num) : null;
	}

	A next() {
		return next(0);
	}

	A read() {
		return hasNext() ? as.get(ptr++) : null;
	}

	A read(A a) {
		if (!hasNext())
			throw new RuntimeException("unexpected EOF");
		if (!isNext(a))
			throw new RuntimeException("expected " + a + " but got" + next());
		return read();
	}

	A read(F.XX<A, Boolean> f) {
		if (!hasNext())
			throw new RuntimeException("unexpected EOF");
		if (!f.f(next()))
			throw new RuntimeException("f(" + next() + ") returned false");
		return read();
	}

	boolean isNext(A a) {
		return a.equals(next());
	}

	boolean isNext(@SuppressWarnings("unchecked") A... as) {
		for (A a : as)
			if (isNext(a))
				return true;
		return false;
	}

	boolean isNext(F.XX<A, Boolean> f) {
		return hasNext() && f.f(next());
	}

	boolean isNextIn(A min, A max) {
		return hasNext() && min.compareTo(next()) <= 0 && max.compareTo(next()) >= 0;
	}

	A readIfIn(A min, A max) {
		if (isNextIn(min, max))
			return read();
		return null;
	}

	A readIf(F.XX<A, Boolean> f) {
		if (isNext(f))
			return read();
		return null;
	}

	A readIf(@SuppressWarnings("unchecked") A... as) {
		for (A a : as)
			if (isNext(a)) {
				ptr++;
				return a;
			}
		return null;
	}

	public String toString() {
		return as.toString();
	}
}

class DSL {
	private static class Lexer {
		Seq<Character> sc;
		ArrayList<P<String, Integer>> ts;
		static final Integer ID = 1;
		static final Integer INT = 2;
		static final Integer SYM = 3;

		Lexer(String s) {
			sc = new Seq<Character>(U.make(s.length(), i -> s.charAt(i)));
		}

		Seq<P<String, Integer>> parse() {
			ts = new ArrayList<P<String, Integer>>();
			parseAll();
			return new Seq<P<String, Integer>>(ts);
		}

		private void parseAll() {
			while (sc.hasNext()) {
				while (sc.isNext(' ', '\t', '\r', '\n'))
					sc.read();
				if (!sc.hasNext())
					break;
				if (sc.isNext(c -> c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c == '_')) {
					parseId();
				} else if (sc.isNextIn('0', '9')) {
					parseInt();
				} else if (sc.isNext('=', '+', '-', '*', '/', '%', '^', '!', '(', ')', ';')) {
					parseSym();
				} else {
					throw new RuntimeException("invalid character: " + sc.next());
				}
			}
		}

		private void parseId() {
			String s = sc.read().toString();
			while (sc.isNext(c -> c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == '_'))
				s += sc.read().toString();
			ts.add(P.make(s, ID));
		}

		private void parseInt() {
			String s = sc.read().toString();
			while (sc.isNextIn('0', '9'))
				s += sc.read().toString();
			ts.add(P.make(s, INT));
		}

		private void parseSym() {
			String s = sc.read().toString();
			ts.add(P.make(s, SYM));
		}
	}

	private static class Parser {
		Seq<P<String, Integer>> ts;

		Parser(Seq<P<String, Integer>> ts) {
			this.ts = ts;
		}

		AST parse() {
			return parseExpr();
		}

		private AST parseExpr() {
			return parseMultiExpr();
		}

		private AST parseMultiExpr() {
			AST a = parseAssignExpr();
			if (ts.readIf(t -> t.a.equals(";")) != null) {
				ArrayList<AST> as = new ArrayList<AST>();
				as.add(a);
				do {
					as.add(parseAssignExpr());
				} while (ts.readIf(t -> t.a.equals(";")) != null);
				return new AST.Multi(as);
			}
			return a;
		}

		private AST parseAssignExpr() {
			AST a = parseAddSubOp();
			if (ts.isNext(t -> t.a.equals("="))) {
				ts.read();
				if (!(a instanceof AST.Id))
					throw new RuntimeException("cannot assign to " + a);
				return new AST.AssignOp(((AST.Id) a).s, parseAssignExpr());
			}
			return a;
		}

		private AST parseAddSubOp() {
			AST a = parseMulDivModOp();
			while (ts.isNext(t -> t.a.equals("+") || t.a.equals("-")))
				a = new AST.BinOp(a, ts.read().a, parseMulDivModOp());
			return a;
		}

		private AST parseMulDivModOp() {
			AST a = parsePowOp();
			while (ts.isNext(t -> t.a.equals("*") || t.a.equals("/") || t.a.equals("%")))
				a = new AST.BinOp(a, ts.read().a, parsePowOp());
			return a;
		}

		private AST parsePowOp() {
			AST a = parsePlusMinusOp();
			if (ts.isNext(t -> t.a.equals("^")))
				return new AST.BinOp(a, ts.read().a, parsePowOp());
			return a;
		}

		private AST parsePlusMinusOp() {
			if (ts.isNext(t -> t.a.equals("+") || t.a.equals("-")))
				return new AST.UnOp(ts.read().a, parsePlusMinusOp());
			return parseFactOp();
		}

		private AST parseFactOp() {
			AST a = parsePrimary();
			while (ts.isNext(t -> t.a.equals("!")))
				a = new AST.UnOp(ts.read().a, a);
			return a;
		}

		private AST parsePrimary() {
			if (ts.isNext(t -> t.b == Lexer.ID))
				return new AST.Id(ts.read().a);
			if (ts.isNext(t -> t.b == Lexer.INT))
				return new AST.Int(Long.parseLong(ts.read().a));
			if (ts.readIf(t -> t.a.equals("(")) != null) {
				AST e = parseExpr();
				ts.read(t -> t.a.equals(")"));
				return e;
			}
			throw new RuntimeException("unexpected token: " + ts.next());
		}
	}

	static HashMap<String, AST> cache = new HashMap<String, AST>();

	static AST parse(String s) {
		if (cache.containsKey(cache)) {
			return cache.get(s);
		}
		Lexer l = new Lexer(s);
		Seq<P<String, Integer>> ts = l.parse();
		Parser p = new Parser(ts);
		AST a = p.parse();
		cache.put(s, a);
		return a;
	}
}

class VME<A> {
	F.XXXX<A, String, A, A> binE;
	F.XXX<String, A, A> unE;
	F.LX<A> fromL;
	F.XX<A, A> filter;

	VME(F.XXXX<A, String, A, A> binE, F.XXX<String, A, A> unE, F.LX<A> fromL, F.XX<A, A> filter) {
		this.binE = binE;
		this.unE = unE;
		this.fromL = fromL;
		this.filter = filter;
	}
}

class VM<A> {
	private final HashMap<String, A> env;
	private Ref<VME<A>> ref;
	private AST.Evaluator<A> etor;

	VM(Ref<VME<A>> ref) {
		this.ref = ref;
		env = new HashMap<String, A>();
	}

	void clear() {
		env.clear();
	}

	A get(String id) {
		return env.get(id);
	}

	void set(String idsSp, @SuppressWarnings("unchecked") A... as) {
		String[] ids = idsSp.trim().split(" +");
		int n = ids.length;
		if (as.length != n)
			throw new IllegalArgumentException("argument size mismatch: " + n + " != " + as.length);
		for (int i = 0; i < n; i++)
			env.put(ids[i], ref.a.filter.f(as[i]));
	}

	A run(String expr) {
		if (etor == null)
			etor = new AST.Evaluator<A>((id, a) -> {
				a = ref.a.filter.f(a);
				env.put(id, a);
				return a;
			}, ref.a.binE, ref.a.unE, ref.a.fromL, env::get);
		return AST.eval(DSL.parse(expr), etor);
	}
}

class Ref<A> {
	private static Object mutex = new Object();
	private static Object tmp;
	A a;

	Ref(A a) {
		this.a = a;
	}

	static <A> Ref<A> create() {
		synchronized (mutex) {
			if (tmp != null)
				throw new RuntimeException("consume first");
			Ref<A> res = new Ref<A>(null);
			tmp = res;
			return res;
		}
	}

	static <A> Ref<A> consume() {
		synchronized (mutex) {
			if (tmp == null)
				throw new RuntimeException("already consumed");
			@SuppressWarnings("unchecked")
			Ref<A> res = (Ref<A>) tmp;
			tmp = null;
			return res;
		}
	}
}

class ModInt extends VM<Long> {
	final long mod;
	private long[] fact;
	private long[] invFact;
	private long[] factors;
	private HashMap<Long, Integer> bsgs;

	ModInt(long mod) {
		super(Ref.create());
		this.mod = mod;
		Ref.consume().a = new VME<Long>((a, op, b) -> {
			switch (op) {
			case "+":
				return (a + b) % mod;
			case "-":
				return (a + mod - b) % mod;
			case "*":
				return a * b % mod;
			case "/":
				return a * inv(b) % mod;
			case "%":
				return a % b;
			case "^":
				return pow(a, b);
			}
			throw new RuntimeException("invalid op: " + op);
		}, (op, a) -> {
			switch (op) {
			case "+":
				return a;
			case "-":
				return (mod - a) % mod;
			case "!":
				return fact[a.intValue()];
			}
			throw new RuntimeException("invalid op: " + op);
		}, a -> a % mod, a -> a % mod);
	}

	private long sqrtCeil(long a) {
		return U.searchL((long) Math.sqrt(a * 0.9), (long) Math.sqrt(a * 1.1) + 1, mid -> mid * mid >= a);
	}

	void precomputeFacts(int n) {
		fact = new long[n];
		invFact = new long[n];
		fact[0] = 1;
		invFact[0] = 1;
		for (int i = 1; i < n; i++) {
			fact[i] = fact[i - 1] * i % mod;
			invFact[i] = inv(fact[i]);
		}
	}

	long inv(long a) {
		return pow(a % mod, mod - 2);
	}

	long pow(long a, long b) {
		a %= mod;
		long res = 1;
		while (b > 0) {
			if ((b & 1) != 0)
				res = res * a % mod;
			a = a * a % mod;
			b >>= 1;
		}
		return res;
	}

	long order(long a) { // computes the order of `a` in O(sqrt(mod)) time
		a %= mod;
		if (a == 0)
			return 0;
		if (a == 1)
			return 1;
		if (factors == null) {
			ArrayList<Long> fs = new ArrayList<Long>();
			for (long i = 2; i * i < mod; i++) {
				if ((mod - 1) % i == 0)
					fs.add(i);
			}
			factors = new long[fs.size()];
			for (int i = 0; i < fs.size(); i++) {
				factors[i] = fs.get(i);
			}
		}
		for (long f : factors) {
			if (pow(a, f) == 1)
				return f;
		}
		return mod - 1;
	}

	PL log(long a, long b) { // log_b(a) in O(sqrt(mod)) time
		a %= mod;
		b %= mod;
		if (b == 1 || b == 0)
			return a == b ? PL.make(1, 1) : PL.make(-1, 0);
		if (a == 0)
			return PL.make(-1, 0);
		long order = order(b);
		if (a == 1)
			return PL.make(0, order);
		if (bsgs == null)
			bsgs = new HashMap<Long, Integer>();
		long orderSqrt = sqrtCeil(order);
		bsgs.clear();
		bsgs.put(1l, 0);
		long p = 1;
		for (int i = 1; i < orderSqrt; i++) {
			p = p * b % mod;
			bsgs.put(p, i);
		}
		long ib = pow(b, mod - orderSqrt - 1);
		p = a;
		for (int i = 1; i < orderSqrt; i++) {
			p = p * ib % mod;
			if (bsgs.containsKey(p))
				return PL.make((i * orderSqrt + bsgs.get(p)) % order, order);
		}
		return PL.make(-1, 0);
	}
}

class BigInt extends VM<BigInteger> {
	BigInt() {
		super(Ref.create());
		Ref.consume().a = new VME<BigInteger>((a, op, b) -> {
			switch (op) {
			case "+":
				return a.add(b);
			case "-":
				return a.subtract(b);
			case "*":
				return a.multiply(b);
			case "/":
				return a.divide(b);
			case "%":
				return a.mod(b);
			case "^":
				return a.pow(b.intValueExact());
			}
			throw new RuntimeException("invalid op: " + op);
		}, (op, a) -> {
			switch (op) {
			case "+":
				return a;
			case "-":
				return a.negate();
			}
			throw new RuntimeException("invalid op: " + op);
		}, a -> BigInteger.valueOf(a), a -> a);
	}

	void set(String idsSp, long... as) {
		set(idsSp, U.makeX(as.length, i -> BigInteger.valueOf(as[i]), new BigInteger[0]));
	}
}