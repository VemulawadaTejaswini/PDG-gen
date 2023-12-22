import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Fraction x = Fraction.ZERO;
		for(int i=0;i<n;i++) {
			int op = sc.nextInt();
			Fraction y = new Fraction(sc.next());
//			System.out.println(x);
			switch (op) {
			case 1:
				x = x.add(y);
				break;
			case 2:
				x = x.subtract(y);
				break;
			case 3:
				x = x.multiply(y);
				break;
			case 4:
				x = x.divide(y);
				break;
			}
		}
		System.out.println(x.intValue());
	}

}

class Fraction {
	public static Fraction ONE = new Fraction(BigInteger.ONE, BigInteger.ONE);
	public static Fraction ZERO = new Fraction(BigInteger.ZERO, BigInteger.ONE);
	BigInteger numerator;
	BigInteger denominator;
	public Fraction(String s) {
		this(new BigInteger(s),BigInteger.ONE);
	}
	public Fraction(BigInteger numerator,BigInteger denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public static Fraction reduction(BigInteger numerator, BigInteger denominator) {
		int signum = numerator.signum();
		if (signum == 0) {
			return ZERO;
		}
		BigInteger gcd = gcd(numerator,denominator);
		return new Fraction(numerator.divide(gcd), denominator.divide(gcd));
	}

	public Fraction add(Fraction f) {
		BigInteger n = numerator.multiply(f.denominator).add(denominator.multiply(f.numerator));
		BigInteger d = denominator.multiply(f.denominator);
		return reduction(n, d);
	}
	public Fraction subtract(Fraction f) {
		BigInteger n = numerator.multiply(f.denominator).subtract(denominator.multiply(f.numerator));
		BigInteger d = denominator.multiply(f.denominator);
		return reduction(n, d);
	}
	public Fraction multiply(Fraction f) {
		BigInteger n = numerator.multiply(f.numerator);
		BigInteger d = denominator.multiply(f.denominator);
		return reduction(n, d);
	}
	public Fraction divide(Fraction f) {
		BigInteger n = numerator.multiply(f.denominator);
		BigInteger d = denominator.multiply(f.numerator);
		return reduction(n, d);
	}
	public int intValue() {
		return numerator.divide(denominator).intValue();
	}
	private static BigInteger gcd(BigInteger a,BigInteger b) {
		int sgn = 1;
		if (a.signum() < 0) {
			sgn *= -1;
			a = a.negate();
		}
		if (b.signum() < 0) {
			sgn *= -1;
			b = b.negate();
		}
		while(!b.equals(BigInteger.ZERO)) {
			BigInteger r = a.remainder(b);
			a = b;
			b = r;
		}
		if (sgn < 0) {
			a = a.negate();
		}
		return a;
	}
	public String toString() {
		return numerator + "/" + denominator;
	}
}