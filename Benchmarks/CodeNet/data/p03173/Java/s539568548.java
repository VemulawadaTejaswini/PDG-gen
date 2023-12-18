import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {

	private final int n;
	private final List<Long> a;
	private long[][] dp;
	private long[] prefixSums;
	private long[] suffixSums;

	public N(int n, List<Long> a) {
		this.n = n;
		this.a = a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> a = LongStream.range(0, n).map(i -> sc.nextLong()).boxed().collect(Collectors.toList());

		new N(n, a).solve();
	}

	private void solve() {
		dp = new long[n][n];
		prefixSums = new long[n];
		suffixSums = new long[n];
		Arrays.fill(prefixSums, -1);
		Arrays.fill(suffixSums, -1);

		for (int i = 0; i < n; i++) {
			Arrays.fill(dp[i], -1);
		}

		System.out.println(best(0, n - 1));
	}

	private long best(int from, int to) {
		if (from == to) return 0;
		if (dp[from][to] != -1) return dp[from][to];

		long best = Long.MAX_VALUE;
		for (int lastFromLeft = from; lastFromLeft < to; lastFromLeft++) {
			best = Math.min(best,
				sumBetween(from, lastFromLeft) + sumBetween(lastFromLeft + 1, to) +
							best(from, lastFromLeft) + best(lastFromLeft + 1, to));
		}
		return best;
	}

	private long sumBetween(int l, int r) {
		return prefixSum(r) - (l == 0? 0 : prefixSum(l - 1));
	}

	private long prefixSum(int lastFromLeft) {
		if (lastFromLeft == 0) return a.get(0);
		if (prefixSums[lastFromLeft] != -1) return prefixSums[lastFromLeft];
		return prefixSums[lastFromLeft] =
				a.get(lastFromLeft) + prefixSum(lastFromLeft - 1);
	}

}
