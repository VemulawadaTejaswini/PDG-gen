import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			BigInteger n = sc.nextBigInteger();
			BigInteger k = sc.nextBigInteger();

			for (int i = 0; i < k.intValue(); i++) {
				BigInteger one = BigInteger.valueOf(1);
				BigInteger a = Comb(k.subtract(one) , BigInteger.valueOf(i));
				BigInteger b = Comb(n.subtract(k).add(one), BigInteger.valueOf(i).add(one));
				System.out.println((a.multiply(b)).longValue() % (1000000000 + 7));
			}
		}
	}

	public static BigInteger Comb(BigInteger n, BigInteger k) {
		int first = 1;
		BigInteger result = BigInteger.valueOf(first);
		result = Fact(n).divide(Fact(k)).divide(Fact(n.subtract(k)));
		return result;
	}

	public static BigInteger Fact(BigInteger n) {
		int first = 1;
		BigInteger result = BigInteger.valueOf(first);
		for (int i = 1; i <= n.intValue(); i++) {
			BigInteger temp = BigInteger.valueOf(i);		
			result = result.multiply(temp);
		}
		return result;
	}

}
