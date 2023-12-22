import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		BigInteger m = sc.nextBigInteger();
		BigInteger n = sc.nextBigInteger();

		System.out.println(m.modPow(n, BigInteger.valueOf(1000000007)));
	}
}
