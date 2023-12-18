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
    DDiceInLine solver = new DDiceInLine();
    solver.solve(1, in, out);
    out.close();
  }

  static class DDiceInLine {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      // 1~pの目が出るさいころの期待値は(p+1)/2
      // 隣接k個の目の和が最大ならOK
      int n = in.nextInt();
      int k = in.nextInt();
      int[] a = new int[n];
      int sumMax = 0;
      int sumTmp = 0;
      for (int i = 0; i < n; i++) {
        a[i] = in.nextInt();
      }
      for (int i = 0; i < k; i++) {
        sumMax += a[i];
        sumTmp += a[i];
      }
      for (int i = k; i < n; i++) {
        sumTmp = sumTmp + a[i] - a[i - k];
        if (sumTmp > sumMax) {
          sumMax = sumTmp;
        }
      }

      out.println(((double) sumMax + k) / 2);

    }

  }
}

