import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	private static final long MOD = 998_244_353L;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), k = scanner.nextInt();
			long[] dp = new long[n + 1];
			dp[0] = dp[1] = 1L;
			int[] s = IntStream.range(0, k).flatMap(i -> IntStream.rangeClosed(scanner.nextInt(), scanner.nextInt()))
					.toArray();
			IntStream.range(1, n).forEach(
					i -> Arrays.stream(s).filter(j -> i + j <= n).forEach(j -> dp[i + j] = (dp[i + j] + dp[i]) % MOD));
			System.out.println(dp[n]);
		}
	}
}
