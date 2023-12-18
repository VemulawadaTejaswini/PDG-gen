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
    ABC102LinearApproximation solver = new ABC102LinearApproximation();
    solver.solve(1, in, out);
    out.close();
  }

  static class ABC102LinearApproximation {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      int[] ar = new int[n];
      long res = 0;
      for (int i = 0; i < n; i++) {
        ar[i] = in.nextInt() - (i + 1);
      }
      Arrays.sort(ar);
      int mode = ar[n / 2];
      for (int i = 0; i < n; i++) {
        res += Math.abs(ar[i] - mode);
      }
      out.println(res);
    }

  }
}