
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  static BigInteger[][] dp;
  static boolean[][] isPresent;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] arr = new int[N];
    dp = new BigInteger[N + 1][N + 1];
    isPresent = new boolean[N + 1][N + 1];
    long[] prefixSum = new long[N];
    long sum = 0;
    for (int i = 0; i < N; i++) {
      arr[i] = scanner.nextInt();
      sum += arr[i];
      prefixSum[i] = sum;
    }
    System.out.println(solve(arr, prefixSum, 0, arr.length));
  }

  private static BigInteger solve(int[] arr, long[] prefixSum, int start, int end) {
    BigInteger solve = new BigInteger("1000000000000000000000000000000000000000");
//    System.out.println(start + ", " + end);
    if (start == end - 1) {
      solve = BigInteger.ZERO;
    } else {
      for (int i = start + 1; i < end; i++) {
        if (!isPresent[start][i]) {
          dp[start][i] = solve(arr, prefixSum, start, i);
          isPresent[start][i]=true;
        }
        if (!isPresent[i][end]) {
          dp[i][end] = solve(arr, prefixSum, i, end);
          isPresent[i][end]=true;
        }
        BigInteger solve1 = dp[start][i];
        BigInteger solve2 = dp[i][end];
        BigInteger add =
            solve1
                .add(solve2)
                .add(
                    new BigInteger(
                        String.valueOf(prefixSum[end - 1] - prefixSum[start] + arr[start])));

        solve = solve.min(add);
      }
    }
//    System.out.println(solve);
    return solve;
  }

  //  private static int solve(int[] arr, int[] prefixSum) {
  //    int len = arr.length;
  //    int[][] dp = new int[len][len];
  //    for (int i = 0; i < len - 1; i++) {
  //      dp[i][i + 1] = arr[i] + arr[i + 1];
  //    }
  //    for (int i = 2; i < len; i++) {
  //      for (int j = 0; j + i < len; j++) {
  //        dp[j][j + i] =
  //            Math.min(dp[j][j + i - 1], dp[j + 1][j + i]) + prefixSum[j + i] - prefixSum[j] +
  // arr[j];
  //      }
  //    }
  //    return dp[0][len - 1];
  //  }
}
