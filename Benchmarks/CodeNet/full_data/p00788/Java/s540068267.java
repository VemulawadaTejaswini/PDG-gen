import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int P, N;

	public static void main(String[] args) {
		while (true) {
			P = sc.nextInt();
			N = sc.nextInt();
			if (N == 0) break;
			ArrayList<Rational> low = new ArrayList<Rational>();
			ArrayList<Rational> high = new ArrayList<Rational>();
			for (long den = 1; den <= N; ++den) {
				double numf = Math.sqrt(den * den * P);
				long lo = (long) numf;
				if (lo <= N && gcd(lo, den) == 1) {
					low.add(new Rational(lo, den));
				}
				long hi = lo + 1;
				if (hi <= N && gcd(hi, den) == 1) {
					high.add(new Rational(hi, den));
				}
			}
			Collections.sort(low);
			Collections.sort(high);
			Rational l = low.get(low.size() - 1);
			Rational r = high.get(0);
			System.out.printf("%d/%d %d/%d\n", r.num, r.den, l.num, l.den);
		}
	}

	static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	static class Rational implements Comparable<Rational> {
		long num, den;

		Rational(long n, long d) {
			num = n;
			den = d;
		}

		public int compareTo(Rational o) {
			long v1 = num * o.den;
			long v2 = den * o.num;
			if (v1 < v2) return -1;
			if (v1 > v2) return 1;
			return 0;
		}

	}

}