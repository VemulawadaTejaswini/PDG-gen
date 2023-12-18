import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
    CTimeGap solver = new CTimeGap();
    solver.solve(1, in, out);
    out.close();
  }

  static class CTimeGap {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int[] time = new int[n + 1];
      for (int i = 1; i <= n; i++) {
        time[i] = in.nextInt();
      }

      Arrays.sort(time);
      for (int i = 0; i <= n; i++) {
        if (i + 2 <= n && time[i] == time[i + 1] && time[i + 1] == time[i + 2]) {
          out.println(0);
          return;
        }
      }

      for (int i = 1; i <= n; i += 2) {
        time[i] = (24 - time[i]) % 24;
      }

      Arrays.sort(time);
      int res = 114514;
      for (int i = 1; i <= n; i++) {
        res = Math.min(res, time[i] - time[i - 1]);
      }
      res = Math.min(24 - time[n], res);

      out.println(res);
    }

  }
}

