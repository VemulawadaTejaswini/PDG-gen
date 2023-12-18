import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < m; i++) {
      int a = sc.nextInt();
      list.add(a);
    }
    long MOD = (long)Math.pow(10, 9) + 7;
    long[] dp = new long[n + 1];
    dp[0] = 1;
    if(list.contains(1)) {
      dp[1] = 0;
    } else {
      dp[1] = 1;
    }
    if(list.contains(2)) {
      dp[2] = 0;
    } else {
      dp[2] = dp[1] + 1;
    }
    for(int i = 3; i < n + 1; i++) {
      if(list.contains(i)) {
        dp[i] = 0;
      } else {
        dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
      }
    }
    System.out.println(dp[n]);
  }
}
