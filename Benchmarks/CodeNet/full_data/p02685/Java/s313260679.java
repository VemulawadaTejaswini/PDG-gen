import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    long mod = 998244353;
    ModInt ans = new ModInt(0, mod);
    ModInt color = new ModInt(m, mod);
    ModIntCombinationCache cCache = new ModIntCombinationCache(200005, mod).calc();
    for (int x = n - 1; x >= 0; x--) {
      ModInt now = color.multiplicity(cCache.get(n - 1, x));
      if (x <= k) {
        ans = ans.add(now);
      }
      color = color.multiplicity(m - 1);
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

  static class ModIntCombinationCache {

    ModInt[] fact;
    ModInt[] ifact;
    int n;
    long mod;

    public ModIntCombinationCache(int n, long mod) {
      assert n < mod;
      this.fact = new ModInt[n + 1];
      this.ifact = new ModInt[n + 1];
      this.n = n;
      this.mod = mod;
    }

    ModIntCombinationCache calc() {
      fact[0] = new ModInt(1, mod);
      for (int i = 1; i <= n; i++) {
        fact[i] = fact[i - 1].multiplicity(i);
      }
      ifact[n] = fact[n].inv();
      for (int i = n; i >= 1; i--) {
        ifact[i - 1] = ifact[i].multiplicity(i);
      }
      return this;
    }

    ModInt get(int n, int k) {
      if (k < 0 || k > n) {
        return new ModInt(0, mod);
      }
      return fact[n].multiplicity(ifact[k]).multiplicity(ifact[n - k]);
    }
  }
}
