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
    ABC150B solver = new ABC150B();
    solver.solve(1, in, out);
    out.close();
  }

  static class ABC150B {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      String s = in.next();
      int cnt = 0;
      for (int i = 0; i < n - 2; i++) {
        if (s.charAt(i) == 'A' &&
            s.charAt(i + 1) == 'B' &&
            s.charAt(i + 2) == 'C') {
          cnt++;
        }
      }
      out.println(cnt);
    }

  }
}

