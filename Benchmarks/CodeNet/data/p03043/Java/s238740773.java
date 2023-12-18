import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final long N = s.nextLong();
			final long K = s.nextLong();

			final long BASE = (long) Math.ceil(Math.pow(K, 0.5));
			long coin = 0;
			for (long i = 1; i <= N && i < K; i++) {
				coin += Math.pow(2, BASE - Math.ceil(Math.pow(K / i, 0.5)));
			}
			if (N > K) {
				coin += (N - K + 1) * Math.pow(2, BASE);
			}
			System.out.println(
					BigDecimal.valueOf(coin).divide(BigDecimal.valueOf(Math.pow(2, BASE)), 12, RoundingMode.HALF_UP)
							.divide(BigDecimal.valueOf(N), 12, RoundingMode.HALF_UP));
		}
	}
}
