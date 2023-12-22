import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger K = new BigInteger(sc.next());
		sc.close();
		if (K.equals(new BigInteger("2"))) {
			System.out.println(-1);
		}

		BigInteger sevens = new BigInteger("7");
		BigInteger seven = new BigInteger("7");
		BigInteger ten = new BigInteger("10");
		BigInteger zero = new BigInteger("0");
		for (int i = 1; true; i++) {
			if (sevens.compareTo(K) < 0) {
				sevens = sevens.multiply(ten).add(seven);
				continue;
			}
			if ((sevens.remainder(K)).equals(zero)) {
				System.out.println(i);
				return;
			}
			sevens = sevens.multiply(ten).add(seven);
		}
	}

	public static int gcd(int n, int m) {
		int r = n % m;
		if (r == 0) {
			return m;
		} else {
			return gcd(m, r);
		}
	}
}