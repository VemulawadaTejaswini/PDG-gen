import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

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
    ABC150E solver = new ABC150E();
    solver.solve(1, in, out);
    out.close();
  }

  static class ABC150E {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int n = in.nextInt();
      ModInt res = new ModInt(0);
      ArrayList<Integer> c = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        c.add(in.nextInt());
      }
      c.sort(Comparator.comparing(x -> -x));
      if (n == 1) {
        res = new ModInt(c.get(0));
      } else {
        for (int i = 0; i < n; i++) {
          res = res.add(new ModInt(i + 2).mul(new ModInt(2).pow(n - 2)).mul(new ModInt(c.get(i))));
          // out.println(res);
        }
      }
      out.println(res.mul(new ModInt(2).pow(n)));
    }

  }

  static class ModInt {

    private static int MOD = 1000000007;
    long x;

    ModInt(long l) {
      this.x = l % MOD;
    }

    ModInt add(ModInt mi) {
      return new ModInt(this.x + mi.x);
    }

    ModInt mul(ModInt mi) {
      return new ModInt(this.x * mi.x);
    }

    ModInt pow(int p) {
      ModInt res = new ModInt(1);
      ModInt tmp = this;
      while (p > 0) {
        if ((p & 1) == 1) {
          res = res.mul(tmp);
        }
        tmp = tmp.mul(tmp);
        p /= 2;
      }
      return res;
    }

    public String toString() {
      return Integer.toString((int) this.x);
    }

  }
}

