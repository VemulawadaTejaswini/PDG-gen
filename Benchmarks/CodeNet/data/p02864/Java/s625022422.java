// ref. https://tiramistercp.hatenablog.com/entry/abc145-f

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] H = new int[N + 2];
    for (int i = 1; i <= N; i++) {
      H[i] = sc.nextInt();
    }
    // [idx-lastSelected][0<=numDel<=K]
    long[][] dp = new long[N + 2][K + 1];
    IntStream.range(1, dp.length).forEach(i -> Arrays.fill(dp[i], Integer.MAX_VALUE));

    for (int r = 1; r <= N + 1; r++) {
      for (int l = 0; l < r; l++) {
        int numSkip = r - l - 1; // Skip between (l, r)
        for (int k = 0; k + numSkip <= K && r > k + numSkip; k++) {
          dp[r][k + numSkip] = Math.min(dp[r][k + numSkip], dp[l][k] + cost(H[l], H[r]));
        }
      }
    }
    System.out.println(LongStream.of(dp[N + 1]).max().orElse(-1));
  }

  static long cost(long l, long r) {
    return Math.max(0, r - l);
  }
}
