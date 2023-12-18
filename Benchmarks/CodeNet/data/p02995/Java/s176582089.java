import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(calc(s.nextBigInteger(), s.nextBigInteger(),
				s.nextBigInteger(), s.nextBigInteger()));

	}

	public static BigInteger calc(BigInteger a, BigInteger b, BigInteger c,
			BigInteger d) {
		BigInteger zenKosu = b.subtract(a).add(BigInteger.ONE);
		return zenKosu.subtract(calcBiasuKosu(a, b, c, d));
	}

	public static BigInteger calcBiasuKosu(BigInteger a, BigInteger b, BigInteger c,
			BigInteger d) {
		BigInteger cKosu = calcBiasuKosu(a, b, c);
		BigInteger dKosu = calcBiasuKosu(a, b, d);
		BigInteger cdKosu = calcBiasuKosu(a, b, calcKoBaisu(c, d));
		return cKosu.add(dKosu).subtract(cdKosu);
	}

	public static BigInteger calcKoBaisu(BigInteger x, BigInteger y) {
		BigInteger a = x;
		BigInteger b = y;
		BigInteger mult = x.multiply(y);
		if (a.compareTo(b) < 0) {
			BigInteger tmp = a;
			a = b;
			b = tmp;
		}
		BigInteger r = a.mod(b);
		while (!r.equals(BigInteger.ZERO)) {
			a = b;
			b = r;
			r = a.mod(b);
		}
		return mult.divide(b);
	}

	public static BigInteger calcBiasuKosuFrom1(BigInteger n, BigInteger to) {
		return n.divide(to);
	}

	public static BigInteger calcBiasuKosu(BigInteger a, BigInteger b, BigInteger n) {
		BigInteger res = calcBiasuKosuFrom1(b, n).subtract(calcBiasuKosuFrom1(a, n));
		if (a.mod(n).equals(BigInteger.ZERO)) {
			res = res.add(BigInteger.ONE);
		}
		return res;
	}
}
