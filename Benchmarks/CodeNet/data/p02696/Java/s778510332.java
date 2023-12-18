import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger n = sc.nextBigInteger();
		BigInteger x = b.subtract(BigInteger.ONE).min(n);
		sc.close();
		System.out.println(a.multiply(x).divideAndRemainder(b)[0].toString());

		// (a * x) / b

	}
}
