import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		BigInteger n = new BigInteger(sc.next());
		int a = 0, b = 0;
		int ans = String.valueOf(n).length();

		for (int i = 1; n.divide(new BigInteger("2")).compareTo(new BigInteger(String.valueOf(i))) > 0; i++) {
			if (n.mod(new BigInteger(String.valueOf(i))).compareTo(BigInteger.ZERO) == 0) {
				a = String.valueOf(i).length();
				b = String.valueOf(n.divide(new BigInteger(String.valueOf(i)))).length();
				if (a >= b) {
					ans = a;
					break;
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
