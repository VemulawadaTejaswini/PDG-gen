import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] t = new long[N];
    long[] a = new long[N];
    for(int i = 0; i < N; i++) {
      t[i] = sc.nextInt();
      a[i] = sc.nextInt(); 
    }
    // i回目の投票時が(t[i]k,a[i]k)としたときのkの最小値
    long[] dp = new long[N];
    dp[0] = 1;
    for(int i = 1; i < N; i++) {
      long d = (long)Math.ceil((double)(t[i - 1] * dp[i - 1]) / (double)(t[i]));
      long e = (long)Math.ceil((double)(a[i - 1] * dp[i - 1]) / (double)(a[i]));
      dp[i] = Math.max(d, e);
    }
    System.out.println(dp[N - 1] * (t[N - 1] + a[N - 1]));
  }
}