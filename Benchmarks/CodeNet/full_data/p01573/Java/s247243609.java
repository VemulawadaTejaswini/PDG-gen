import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	int INF = 1 << 28;
	double EPS = 1e-9;

	int n;
	int[] a;

	void run() {
		n = sc.nextInt();
		a = new int[n + 1];
		for (int i = n; i >= 0; i--) {
			a[i] = sc.nextInt();
		}
		solve();
	}

	void solve() {
		int p1 = nextPrime(1500), p2 = nextPrime(p1);
		// debug(p1, p2);
		ArrayList<P> list1 = new ArrayList<P>(), list2 = new ArrayList<P>();
		P zero = new P(0, 0);
		for (int x = 0; x < p1; x++) {
			for (int y = 0; y < p1; y++) {
				// (x+yi)
				if (evalMod(new P(x, y), p1).equals(zero)) {
					list1.add(new P(x, y));
				}
			}
		}
		for (int x = 0; x < p2; x++) {
			for (int y = 0; y < p2; y++) {
				// (x+yi)
				if (evalMod(new P(x, y), p2).equals(zero)) {
					list2.add(new P(x, y));
				}
			}
		}

		// debug("list1", list1);
		// debug("list2", list2);

		ArrayList<P> list = new ArrayList<P>();

		for (P z1 : list1) {
			for (P z2 : list2) {
				// z = z1 % p1
				// z = z2 % p2
				long x = linear(new long[] { 1, 1 }, new long[] { z1.x, z2.x },
						new long[] { p1, p2 });
				long y = linear(new long[] { 1, 1 }, new long[] { z1.y, z2.y },
						new long[] { p1, p2 });
				P z = new P(x, y);
				// debug(z);
				for (int i = 0; i <= 1; i++) {
					for (int j = 0; j <= 1; j++) {
						P zz = new P(z.x - i * p1 * p2, z.y - j * p1 * p2);
						// if (zz.x == -1)
						// debug(zz);
						if (eval(zz)) {
							list.add(zz);
						}
					}
				}
			}
		}
		sort(list);
		for (int i = -3; i <= 3; i++) {
			for (int j = -3; j <= 3; j++) {
				// list.add(new P(i, j));
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append(list.size()).append('\n');
		for (int i = 0; i < list.size(); i++) {
			long x = list.get(i).x, y = list.get(i).y;
			String s = x + "+" + y + "i";
			s = s.replaceAll("[\\+|-]0i", "").replaceAll("\\+-", "-")
					.replaceAll("\\+1i", "+i").replaceAll("-1i", "-i")
					.replaceAll("^0", "").replaceAll("^\\+", "");
			if (s.length() == 0) {
				s = "0";
			}
			sb.append(s);
			if (i == list.size() - 1) {
				sb.append('\n');
			} else {
				sb.append(' ');
			}
		}
		println(sb.toString());
	}

	long linear(long[] A, long[] B, long[] M) {
		long x = 0, m = 1;
		for (int i = 0; i < A.length; i++) {
			long a = A[i] * m, b = B[i] - A[i] * x, d = gcd(M[i], a);
			if (b % d != 0)
				return -1;
			long t = b / d * invMod(a / d, M[i] / d) % (M[i] / d);
			x = x + m * t;
			m *= M[i] / d;
		}
		return (x % m + m) % m;
	}

	long gcd(long a, long b) {
		return a == 0 ? b : gcd(b % a, a);
	}

	long invMod(long x, long mod) {
		return powMod(x, mod - 2, mod);
	}

	long powMod(long x, long k, long mod) {
		if (k == 0) {
			return 1;
		}
		if ((k & 1) == 0) {
			return powMod(x * x % mod, k >>> 1, mod);
		}
		return x * powMod(x, k - 1, mod) % mod;
	}

	P evalMod(P z, int mod) {
		P eval = new P(0, 0);
		for (int i = 0; i <= n; i++) {
			eval = eval.mul(z).add(new P(a[i], 0));
			eval.x %= mod;
			eval.y %= mod;
		}
		return eval;
	}

	boolean eval(P z) {
		P eval = new P(0, 0);
		for (int i = 0; i <= n; i++) {
			eval = eval.mul(z).add(new P(a[i], 0));
		}
		return eval.x == 0 && eval.y == 0;
	}

	class P implements Comparable<P> {
		long x, y;

		P(long x, long y) {
			this.x = x;
			this.y = y;
		}

		P add(P p) {
			return new P(x + p.x, y + p.y);
		}

		P mul(P p) {
			return new P(x * p.x - y * p.y, x * p.y + p.x * y);
		}

		public boolean equals(P p) {
			return x == p.x && y == p.y;
		}

		@Override
		public String toString() {
			return "(" + x + ", " + y + ")";
		}

		public int compareTo(P p) {
			return Long.signum(x - p.x) * 2 + Long.signum(y - p.y);
		}
	}

	int nextPrime(int n) {
		for (n++; !BigInteger.valueOf(n).isProbablePrime(200); n++)
			;
		return n;
	}

	void println(String s) {
		System.out.println(s);
	}

	void print(String s) {
		System.out.print(s);
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}