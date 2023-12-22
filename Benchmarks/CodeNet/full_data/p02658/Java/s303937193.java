import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		List<BigInteger> a = new ArrayList<>();
		for (long i = 0; i < n; i++) {
			a.add(new BigInteger(sc.next()));
		}
		Collections.sort(a);
		BigInteger result = a.get(0);
		BigInteger max = new BigInteger("10").pow(18);
		for (int i = 1; i < n; i++) {
			if (BigInteger.ZERO.equals(result)) {
				break;
			}
			result = result.multiply(a.get(i));
		}
		if (max.compareTo(result) < 0) {
			result = new BigInteger("-1");
		}
		System.out.println(result.toString());
	}
}
