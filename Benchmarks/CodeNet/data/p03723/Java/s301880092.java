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
    ACookieExchanges solver = new ACookieExchanges();
    solver.solve(1, in, out);
    out.close();
  }

  static class ACookieExchanges {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int cnt = a == b && b == c ? -1 : 0;
      if (cnt == 0) {
        while (true) {
          int tmpa = (b + c) / 2;
          int tmpb = (a + c) / 2;
          int tmpc = (a + b) / 2;
          a = tmpa;
          b = tmpb;
          c = tmpc;
          cnt++;
          if (a % 2 == 1 || b % 2 == 1 || c % 2 == 1) {
            break;
          }
        }
      }
      out.println(cnt);
    }

  }
}

