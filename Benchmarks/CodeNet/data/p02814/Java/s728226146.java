import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    ABC150D solver = new ABC150D();
    solver.solve(1, in, out);
    out.close();
  }

  static class ABC150D {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      int[] ar = new int[n];
      long x = 1;
      for (int i = 0; i < n; i++) {
        ar[i] = in.nextInt() / 2;
        x = x / gcd(x, ar[i]) * (long) ar[i];
        if (x > m) {
          out.println(0);
          return;
        }
      }

      for (int i = 0; i < n; i++) {
        if ((x / ar[i]) % 2 == 0) {
          out.println(0);
          return;
        }
      }
      long p = m / x;
      out.println((p + 1) / 2);
    }

    long gcd(long a, long b) {
      return b == 0 ? a : gcd(b, a % b);
    }

  }
}

