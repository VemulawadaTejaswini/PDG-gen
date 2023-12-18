import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		sc.close();

		BigInteger right = BigInteger.valueOf(c - (a + b));
		right = right.pow(2);
		BigInteger left = BigInteger.valueOf(4).multiply(BigInteger.valueOf(a)).multiply(BigInteger.valueOf(b));
		if (left.compareTo(right) < 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
