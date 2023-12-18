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
    DLazyFaith solver = new DLazyFaith();
    solver.solve(1, in, out);
    out.close();
  }

  static class DLazyFaith {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int a = in.nextInt();
      int b = in.nextInt();
      int q = in.nextInt();
      long[] jinja = new long[a];
      long[] tera = new long[b];
      long[] query = new long[q];
      for (int i = 0; i < a; i++) {
        jinja[i] = in.nextLong();
      }
      for (int i = 0; i < b; i++) {
        tera[i] = in.nextLong();
      }
      for (int i = 0; i < q; i++) {
        query[i] = in.nextLong();
        long leftJinja = nibutan(jinja, query[i], 1);
        long rightJinja = nibutan(jinja, query[i], 0);
        long leftTera = nibutan(tera, query[i], 1);
        long rightTera = nibutan(tera, query[i], 0);

        // out.println(String.format("lj: %d, rj: %d, lt: %d, rt: %d", leftJinja, rightJinja, leftTera,rightTera));
        // lj lt, lt ljは同じ
        long res = query[i] - Math.min(leftJinja, leftTera);
        // lj -> rt
        res = Math.min(res, rightTera + query[i] - 2 * leftJinja);
        // rt -> lj
        res = Math.min(res, 2 * rightTera - query[i] - leftJinja);
        // rj -> lt
        res = Math.min(res, 2 * rightJinja - query[i] - leftTera);
        // lt -> rj
        res = Math.min(res, rightJinja + query[i] - 2 * leftTera);
        // rt <-> rj
        res = Math.min(res, Math.max(rightTera, rightJinja) - query[i]);
        out.println(res);
      }

    }

    long nibutan(long[] ar, long n, int type) {
      int high = ar.length;
      int low = 0;
      int mid = (high + low) / 2;
      // n より大きい最小のar[i]を求める
      while (low < high) {
        if (ar[mid] <= n) {
          low = mid + 1;
        } else {
          high = mid;
        }
        mid = (high + low) / 2;
      }
      low -= type;
      if (low < 0) {
        return (long) -1e12;
      }
      if (low == ar.length) {
        return (long) 1e12;
      }
      return ar[low];

    }

  }
}

