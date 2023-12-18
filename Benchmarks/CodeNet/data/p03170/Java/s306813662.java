
import java.io.PrintWriter;
import java.util.Scanner;

class Solution {
  public static PrintWriter out = new PrintWriter(System.out);
  public static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    //      int t = ni();
    //      while (t-- > 0)
    solve();
    out.flush();
  }

  private static void solve() {

    int n = ni();
    int k = ni();
    int[] a = na(n);
    boolean[] dp = new boolean[k + 1];
    for (int i = 0; i <= k; i++) {
      for (int x : a) {
        if (i - x >= 0) {
          dp[i] |= !dp[i - x];
        } else break;
      }
    }
    out.println(dp[k] ? "f" : "s");
  }

  private static int ni() {
    return in.nextInt();
  }

  private static int[] na(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) a[i] = ni();
    return a;
  }

  private static long[] nal(int n) {
    long[] a = new long[n];
    for (int i = 0; i < n; i++) a[i] = nl();
    return a;
  }

  private static long nl() {
    return in.nextLong();
  }

  private float nf() {
    return in.nextFloat();
  }

  private static double nd() {
    return in.nextDouble();
  }
}
