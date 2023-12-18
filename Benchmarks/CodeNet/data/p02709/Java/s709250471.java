import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long a[] = new long[n];
    List<P> ls = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      ls.add(new P(i, a[i]));
    }
    sc.close();
    // sort from big num to small num
    Collections.sort(ls);
    long[][] dp = new long[n + 1][n + 1]; // [left + right][left]

    for (int i = 0; i < n; i++) { // i is already set
      P p = ls.get(i);
      for (int j = 0; j <= i; j++) { // j equal next left num
        int lpos = j; // next left pos
        int rpos = n - 1 - (i - j); // next right pos
        // add right
        dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j] + p.num * Math.abs(rpos - p.pos));
        // add left
        dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], dp[i][j] + p.num * Math.abs(lpos - p.pos));
      }
    }

    long res = 0;
    for (int i = 0; i <= n; i++) {
      res = Math.max(res, dp[n][i]);
    }
    
    System.out.println(res);
  }

  static class P implements Comparable<P> { // sorted by num from big to small
    int pos;
    long num;
    P(int pos, long num) {
      this.pos = pos;
      this.num = num;
    }
    public int compareTo(P p) {
      return Long.compare(p.num, num);
    }
  }
}