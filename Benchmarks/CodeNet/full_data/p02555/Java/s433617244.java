import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	private static final long MOD = 1_000_000_007L;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int s = scanner.nextInt();
			long[] result = new long[s + 1], sum = new long[s + 1];
			result[0] = result[1] = result[2] = 0L;
			sum[0] = sum[1] = sum[2] = 0L;
			IntStream.rangeClosed(3, s).forEach(i -> {
				result[i] = (sum[i - 3] + 1) % MOD;
				sum[i] = (sum[i - 1] + result[i]) % MOD;
			});
			System.out.println(result[s]);
		}
	}
}
