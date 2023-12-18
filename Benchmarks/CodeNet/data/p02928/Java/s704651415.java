import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int size = list.size();

		BigInteger base = BigInteger.ZERO;

		BigInteger loop = BigInteger.ZERO;

		for (int i = 0; i < size; i++) {
			int ki = list.get(i);
			for (int j = 0; j < i + 1; j++) {
				if (ki > list.get(j)) {
					loop = loop.add(BigInteger.ONE);
				}
			}

			for (int j = i + 1; j < size; j++) {
				if (ki > list.get(j)) {
					base = base.add(BigInteger.ONE);
					loop = loop.add(BigInteger.ONE);
				}
			}
		}

		BigInteger kk = BigInteger.valueOf(k-1l).multiply(BigInteger.valueOf(k)).divide(BigInteger.valueOf(2l));

		System.out.println(
				loop.multiply(kk).add(base.multiply(BigInteger.valueOf(k)))
						.remainder(BigInteger.valueOf(1000000007l)));
	}
}
