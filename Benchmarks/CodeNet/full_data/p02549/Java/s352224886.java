import java.util.*;

public class Main {
  static Scanner in = new Scanner(System.in);
  static List<Integer> list = new ArrayList<>();
  static int[] dp;
  static int n;
  static int m;
  static final long mod = 998244353;
  public static void main(String[] args) {
    n = in.nextInt();
    m = in.nextInt();
    list.clear();
    int le, ri;
    while (m-- > 0) {
      le = in.nextInt();
      ri = in.nextInt();
      for (int i = le; i <= ri; i++) {
        list.add(i);
      }
    }
    list.sort((a, b) -> a - b);
    dp = new int[n + 1];
    Arrays.fill(dp, 0);
    dp[1] = 1;
    for (int i = 1; i < n; i++) {
      if (dp[i] == 0) {
        continue;
      }
      for (int v : list) {
        if (v + i > n) {
          break;
        }
        dp[i + v] = (dp[i + v]  + dp[i]);
        if (dp[i + v] >= mod) {
          dp[i + v] %= mod;
        }
      }
    }
    System.out.println(dp[n]);
  }
}
