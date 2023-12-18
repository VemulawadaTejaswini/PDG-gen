import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++)
      a[i] = sc.nextInt();
    sc.close();

    long[][] dp = new long[N][N];
    long ans = l(dp, a, 0, N - 1);
    System.out.println(ans);
  }

  private static long l(long[][] dp, int[] a, int head, int tail) {
    if (dp[head][tail] != 0) return dp[head][tail];
    if (head == tail) return a[head];
    long res = Math.max(
        a[head] - l(dp, a, head + 1, tail),
        a[tail] - l(dp, a, head, tail - 1));
    dp[head][tail] = res;
    return res;
  }
}