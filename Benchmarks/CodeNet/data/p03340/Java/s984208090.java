import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			long[] sum = new long[n + 1], xorSum = new long[n + 1];
			sum[0] = xorSum[0] = 0L;
			IntStream.rangeClosed(1, n).forEach(i -> {
				long a = scanner.nextLong();
				sum[i] = sum[i - 1] + a;
				xorSum[i] = xorSum[i - 1] ^ a;
			});
			System.out.println(IntStream.range(0, n).mapToLong(i -> IntStream.rangeClosed(i + 1, n)
					.filter(j -> (sum[j] - sum[i]) == (xorSum[j] ^ xorSum[i])).count()).sum());
		}
	}
}
