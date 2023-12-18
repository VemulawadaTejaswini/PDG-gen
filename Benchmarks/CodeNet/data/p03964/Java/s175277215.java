import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] t = new int[N];
    int[] a = new int[N];
    for(int i = 0; i < N; i++) {
      t[i] = sc.nextInt();
      a[i] = sc.nextInt();
    }
    // dp[i]はi回目までの投票数（t[i]*k,a[i]*k）の最小値kを表す
    long[] dp = new long[N];
    dp[0] = 1;
    for(int i = 1; i < N; i++) {
      long rate = Math.max((long)Math.ceil(((double)t[i - 1] / (double)t[i]) * dp[i - 1]), (long)Math.ceil(((double)a[i - 1] / (double)a[i]) * dp[i - 1]));
      dp[i] = rate;
    }
    System.out.println(dp[N - 1] * (t[N - 1] + a[N - 1]));
  }
}