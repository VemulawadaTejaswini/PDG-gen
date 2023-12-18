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
      long tnum = dp[i - 1] * (long)t[i - 1];
      long anum = dp[i - 1] * (long)a[i - 1];
      long rate = (long)Math.ceil(Math.max((double)tnum / (double)t[i], (double)anum / (double)a[i]));
      dp[i] = rate;
    }
    System.out.println(dp[N - 1] * (t[N - 1] + a[N - 1]));
  }
}