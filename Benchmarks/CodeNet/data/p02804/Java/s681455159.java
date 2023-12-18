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
    ABC151E solver = new ABC151E();
    solver.solve(1, in, out);
    out.close();
  }

  static class ABC151E {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      ModInt res = new ModInt(0);
      ModInt max = new ModInt(0);
      ModInt min = new ModInt(0);
      ModComb mc = new ModComb(100005);
      mc.makeFac();
      int n = in.nextInt();
      int k = in.nextInt();
      int[] ar = new int[n];
      for (int i = 0; i < n; i++) {
        ar[i] = in.nextInt();
      }
      Arrays.sort(ar);
      // ar[i]がminとなる集合はiより大きいn-1-iCk
      // ar[i]がmaxとなる集合はiより小さいiCk
      for (int i = 0; i < n; i++) {
        // out.println(mc.combFac(i, k - 1) + " " + mc.combFac(n - 1 - i, k - 1));
        max = max.add(new ModInt(ar[i]).mul(mc.combFac(i, k - 1)));
        min = min.add(new ModInt(ar[i]).mul(mc.combFac(n - 1 - i, k - 1)));
        // out.println(max + " " + min);
      }
      res = max.sub(min);
      out.println(res);
    }

  }

  static class ModInt {

    private static int MOD = 1000000007;
    long x;

    ModInt(int i) {
      this.x = i % MOD;
    }

    ModInt(long l) {
      this.x = l % MOD;
    }

    ModInt add(ModInt mi) {
      return new ModInt(this.x + mi.x);
    }

    ModInt sub(ModInt mi) {
      return new ModInt(this.x + MOD - mi.x);
    }

    ModInt mul(long i) {
      return new ModInt(this.x * i);
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

    ModInt inv() {
      return this.pow(MOD - 2);
    }

    public String toString() {
      return Integer.toString((int) this.x);
    }

  }

  static class ModComb {

    int size;
    ModInt[] fac;
    ModInt[] inv;

    ModComb(int n) {
      size = n;
      fac = new ModInt[n + 1];
      inv = new ModInt[n + 1];
    }

    void makeFac() {
      for (int i = 0; i <= size; i++) {
        if (i == 0) {
          fac[i] = new ModInt(1);
        } else {
          fac[i] = fac[i - 1].mul(i);
        }
        inv[i] = fac[i].inv();
      }


    }

    ModInt combFac(int n, int k) {
      if (n < k) {
        return new ModInt(0);
      }
      return fac[n].mul(inv[k]).mul(inv[n - k]);
    }

  }
}

