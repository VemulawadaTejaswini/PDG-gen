
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int len = s.length();
    // dp[i]：i桁目まで見た時のmod 2019
    long[] dp = new long[len + 1];
    // mod iの個数
    long[] r = new long[2019];
    long[] f = new long[len];
    f[0] = 1;
    for(int i = 1; i < len; i++) {
      f[i] = (f[i - 1] * 10) % 2019;
    }
    for(int i = len - 1; i >= 0; i--) {
      int t = len - i;
      int d = Integer.parseInt(String.valueOf(s.charAt(i)));
      dp[t] = (dp[t - 1] + (f[t - 1] * d)) % 2019;
      r[(int)dp[t]]++;
    }
    long ans = r[0];
    for(int i = 0; i < 2019; i++) {
      long t = r[i];
      ans += ((t * (t - 1)) / 2);
    }
    System.out.println(ans);
  }
}