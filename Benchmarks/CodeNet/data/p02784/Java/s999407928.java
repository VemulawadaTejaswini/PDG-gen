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
    BCommonRaccoonVsMonster solver = new BCommonRaccoonVsMonster();
    solver.solve(1, in, out);
    out.close();
  }

  static class BCommonRaccoonVsMonster {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int h = in.nextInt();
      int n = in.nextInt();
      long x = 0;
      for (int i = 0; i < n; i++) {
        x += in.nextLong();
      }
      out.println(x >= h ? "Yes" : "No");
    }

  }
}

