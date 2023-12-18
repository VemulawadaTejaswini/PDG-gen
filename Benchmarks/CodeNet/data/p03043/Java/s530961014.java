import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final long n = sc.nextInt();
		final long k = sc.nextInt();

		sc.close();

		final BigDecimal ndiv = BigDecimal.ONE.divide(BigDecimal.valueOf(n), 10, BigDecimal.ROUND_HALF_UP);
		final BigDecimal kdiv = BigDecimal.ONE.divide(BigDecimal.valueOf(2), 10, BigDecimal.ROUND_HALF_UP);
		BigDecimal result = BigDecimal.ZERO;

		for (long i = 1; i <= n; i++) {
			int pointCount = 0;
			long point = i;
			while (point < k) {
				pointCount++;
				point = point * 2;
			}
			result = result.add(ndiv.multiply(BigDecimal.valueOf(Math.pow(kdiv.doubleValue(), pointCount))));
		}

		System.out.print(result);

	}

}