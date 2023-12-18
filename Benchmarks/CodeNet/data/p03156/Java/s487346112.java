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
    BContests solver = new BContests();
    solver.solve(1, in, out);
    out.close();
  }

  static class BContests {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int a = in.nextInt();
      int b = in.nextInt();
      int cnt1 = 0;
      int cnt2 = 0;
      int cnt3 = 0;
      for (int i = 0; i < n; i++) {
        int tmp = in.nextInt();
        if (tmp <= a) {
          cnt1++;
        } else if (tmp <= b) {
          cnt2++;
        } else {
          cnt3++;
        }
      }
      out.println(Math.min(Math.min(cnt1, cnt2), cnt3));
    }

  }
}

