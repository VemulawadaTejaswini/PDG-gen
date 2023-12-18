import java.util.Arrays;
import java.util.stream.IntStream;

public class AtCoder {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), w = scanner.nextInt();
        int[] wa = new int[n], va = new int[n];
        for (int i = 0; i < n; i++) {
            wa[i] = scanner.nextInt();
            va[i] = scanner.nextInt();
        }
        int sum = Arrays.stream(va).sum();
        long[] dp = new long[sum + 1];
        Arrays.fill(dp, 1, sum + 1, Long.MAX_VALUE);
        for (int i = 0; i < n; i++)
            for (int j = sum; j >= va[i]; j--)
                if (dp[j - va[i]] != Long.MAX_VALUE)
                    dp[j] = Math.min(dp[j], dp[j - va[i]] + wa[i]);
        IntStream.rangeClosed(0, sum)
                .filter(j -> dp[sum - j] <= w)
                .findFirst()
                .ifPresent(j -> System.out.println(sum - j));
    }
}