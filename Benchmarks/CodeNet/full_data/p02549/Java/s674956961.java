import java.util.*;

public class Main {
  static Scanner in = new Scanner(System.in);
  static List<Integer> list = new ArrayList<>();
  static long[] dp;
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
    dp = new long[n + 1];
    Arrays.fill(dp, 0);
    dp[1] = 1;
    for (int i = 1; i < n; i++) {
      if (dp[i] == 0) {
        continue;
      }
      for (int j = 0; j < list.size() && i + list.get(j) <= n; j++) {
        int v = list.get(j);
        dp[i + v] = (dp[i + v] + dp[i]) % mod;
      }
    }

    System.out.println(dp[n]);

  }
}
