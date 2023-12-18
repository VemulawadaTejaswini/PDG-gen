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
    BPalindromephilia solver = new BPalindromephilia();
    solver.solve(1, in, out);
    out.close();
  }

  static class BPalindromephilia {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      String s = in.next();
      int cnt = 0;
      for (int i = 0; i < s.length() - 1 - i; i++) {
        if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
          cnt++;
        }
      }
      out.println(cnt);
    }

  }
}

