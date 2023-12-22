import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger max = BigInteger.valueOf((long)Math.pow(10, 18));
		int n = sc.nextInt();
		BigInteger r = BigInteger.ONE;
		boolean isZero = false, isNegativeOne = true;
		while(n-->0) {
			BigInteger a = sc.nextBigInteger();
			if (a.compareTo(BigInteger.ZERO) == 0) {
				isZero = true;
			}
			if (!isZero && !isNegativeOne) {
				r = r.multiply(a);
				if (r.compareTo(max) >= 0) {
					isNegativeOne = true;
				}
			}
			
			
		}
		if (isZero) {
			System.out.println(0);
		} else if (isNegativeOne) {
			System.out.println(-1);
		} else if (r.compareTo(max) >= 0) {
			System.out.println(-1);
		} else {
			System.out.println(r);
		}
	}
}
