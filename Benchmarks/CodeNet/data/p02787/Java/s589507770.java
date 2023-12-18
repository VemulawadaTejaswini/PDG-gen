import static java.lang.Math.min;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int h = Integer.parseInt(sc.next());
    int n = Integer.parseInt(sc.next());
    long dp[] = new long[h + 1];
    for (int i = 0; i < dp.length; i++) {
      dp[i] = Integer.MAX_VALUE;
    }
    dp[0] = 0;
    for (int i = 0; i < n; i++) {
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      for (int j = 0; j < h; j++) {
        int nj = min(j + a, h);
        dp[nj] = min(dp[nj], dp[j] + b);
      }
    }
    pw.println(dp[h]);
  }
}
