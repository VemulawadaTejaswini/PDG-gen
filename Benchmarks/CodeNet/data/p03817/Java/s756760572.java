import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		BigInteger x = new BigInteger(sc.next());
		BigInteger ans = BigInteger.ZERO;
		
		if (x.compareTo(new BigInteger("1100000")) > 0) {
			ans = BigInteger.ONE;
		}

		while (x.compareTo(new BigInteger("1100000")) > 0) {
			x = x.add(new BigInteger("-1100000"));
			ans = ans.add(new BigInteger("200000"));
		}

		for (int i = 0; x.compareTo(BigInteger.ZERO) > 0; i++) {
			if (x.compareTo(new BigInteger("6")) <= 0) {
				ans = ans.add(BigInteger.ONE);
				break;
			} else if (i % 2 == 0) {
				x = x.add(new BigInteger("-6"));
				ans = ans.add(BigInteger.ONE);
			} else {
				x = x.add(new BigInteger("-5"));
				ans = ans.add(BigInteger.ONE);
			}
		}
		System.out.println(ans);

		sc.close();
	}
}
