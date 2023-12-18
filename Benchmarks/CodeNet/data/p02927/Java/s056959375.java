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
    SaikyouA2019 solver = new SaikyouA2019();
    solver.solve(1, in, out);
    out.close();
  }

  static class SaikyouA2019 {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int m = in.nextInt();
      int d = in.nextInt();
      int cnt = 0;
      for (int i = 1; i <= d; i++) {
        int ju = i / 10;
        int ichi = i % 10;
        if (ju >= 2 && ichi >= 2 && ju * ichi <= m) {
          cnt++;
        }
      }
      out.println(cnt);
    }

  }
}

