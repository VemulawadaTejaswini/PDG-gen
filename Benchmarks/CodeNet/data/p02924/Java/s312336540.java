import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		BigInteger n = s.nextBigInteger();
		if (BigInteger.ONE.equals(n)) {
			System.out.println(0);
		} else {
			System.out.println(n.add(BigInteger.ONE).multiply(n)
					.divide(BigInteger.valueOf(2)).subtract(n));
		}
	}
}