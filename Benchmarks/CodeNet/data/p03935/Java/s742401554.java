import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
  private static boolean debug = false;
  private static boolean elapsed = false;

  private int DIV = 998244353;

  private void solve(Scanner sc, PrintWriter out) {
    int n = sc.nextInt();
    int m = sc.nextInt();

    out.println(d(n, m).remainder(BigInteger.valueOf(DIV)));
  }
  private BigInteger d(int n, int m) {
    if (n == 1) {
      return a(m);
    } else {
      BigInteger sum = BigInteger.ZERO;
      for (int k = 1; k <= m; ++k) {
        sum = sum.add(d(n - 1, k));
      }
      return sum;
    }
  }
  private BigInteger a(int m) {
    if (m <= 2) {
      return BigInteger.ONE;
    } else {
      return BigInteger.valueOf((long)((Math.pow(((1 + Math.sqrt(5)) / 2), m) - Math.pow(((1 - Math.sqrt(5)) / 2), m)) / Math.sqrt(5)));
    }
  }
  /*
   * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
   * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
   */
  public static void main(String[] args) {
    long S = System.currentTimeMillis();

    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(sc, out);
    out.flush();

    long G = System.currentTimeMillis();
    if (elapsed) {
      System.err.println((G - S) + "ms");
    }
  }
}