import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int mod = 1000000000 + 7;
    ModInt ans = new ModInt(0, mod);
    int n = Integer.parseInt(sc.next());
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        long multi = (long) a[i] * a[j];
        ans = ans.add(multi);
      }
    }
    pw.println(ans);
  }

  static class ModInt {

    final long mod;
    long x;

    ModInt(long x, long mod) {
      this.x = x;
      this.mod = mod;
    }

    ModInt(ModInt m) {
      this.x = m.x;
      this.mod = m.mod;
    }

    ModInt add(long m) {
      ModInt n = new ModInt(this);
      n.x += m;
      n.x %= mod;
      return n;
    }

    ModInt add(ModInt m) {
      return this.add(m.x);
    }

    ModInt minus(long m) {
      ModInt n = new ModInt(this);
      if ((n.x += (mod - m)) >= mod) {
        n.x -= mod;
      }
      return n;
    }

    ModInt minus(ModInt m) {
      return this.minus(m.x);
    }

    ModInt multiplicity(long m) {
      ModInt n = new ModInt(this);
      n.x *= m;
      n.x %= mod;
      return n;
    }

    ModInt multiplicity(ModInt m) {
      return multiplicity(m.x);
    }

    ModInt pow(long p) {
      if (p == 0) {
        return new ModInt(1, mod);
      }
      ModInt a = pow(p >> 1);
      a = a.multiplicity(a.x);
      if ((p & 1) == 1) {
        a = a.multiplicity(x);
      }
      return a;
    }

    ModInt inv() {
      return pow(mod - 2);
    }

    ModInt divide(ModInt d) {
      ModInt n = new ModInt(this);
      n = n.multiplicity(d.inv().x);
      return n;
    }

    @Override
    public String toString() {
      return String.valueOf(x);
    }
  }
}
