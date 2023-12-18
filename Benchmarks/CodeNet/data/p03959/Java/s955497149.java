import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
  void run() {
    int n = ni();
    int[] t = new int[n];
    int[] a = new int[n];
    int tmax = 0;
    for (int i = 0; i < n; ++i) {
      t[i] = ni();
//      if (tmax > t[i]) {
//        System.out.println(0);
//        return;
//      }
      tmax = Math.max(tmax, t[i]);
    }
    for (int j = 0; j < n; ++j) {
      a[j] = ni();
    }
    int amax = 0;
    for (int j = n - 1; 0 <= j; --j) {
//      if (amax > a[j]) {
//        System.out.println(0);
//        return;
//      }
      amax = Math.max(amax, a[j]);
    }
    if (tmax != amax) {
      System.out.println(0);
      return;
    }

    int lmax = 0;
    int rmax = 0;
    long cnt = 1;
    for (int i = 0; i <= n / 2; ++i) {
      if (n % 2 == 0 && i == n / 2) {
        break;
      }
      if (n % 2 == 1 && i == n / 2) {
        if (t[i] > lmax || a[i] > amax) {
          break;
        }
        int v = Math.min(t[i], a[i]);
//        debug(v, lmax, amax);
        cnt *= v;
        cnt %= MOD;
        break;
      }
      if (lmax < t[i]) {
        lmax = t[i];
      } else {
        cnt *= lmax;
        cnt %= MOD;
      }
      if (rmax < a[n - 1 - i]) {
        rmax = a[n - 1 - i];
      } else {
        cnt *= rmax;
        cnt %= MOD;
      }
//      debug(i, cnt);
    }
    System.out.println(cnt);
  }

  class Node {
    int l, m, r;

    Node(int a, int b, int c) {
      l = a;
      m = b;
      r = c;
    }
  }

  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }

  class BIT<T> {
    int n;
    ArrayList<T> bit;
    BiFunction<T, T, T> bif;

    BIT(int n, BiFunction<T, T, T> bif, T defaultValue) {
      this.n = n;
      bit = new ArrayList<>(n + 1);
      for (int i = 0; i < n + 1; ++i) {
        bit.add(defaultValue);
      }
      this.bif = bif;
    }

    void update(int i, T v) {
      for (int x = i; x <= n; x += x & -x) {
        bit.set(x, bif.apply(bit.get(x), v));
      }
    }

    T reduce(int i, T defaultValue) {
      T ret = defaultValue;
      for (int x = i; x > 0; x -= x & -x) {
        ret = bif.apply(ret, bit.get(x));
      }
      return ret;
    }
  }

  long MOD = 1_000_000_007;

  long pow(long a, long r) {
    long sum = 1;
    while (r > 0) {
      if ((r & 1) == 1) {
        sum *= a;
        sum %= MOD;
      }
      a *= a;
      a %= MOD;
      r >>= 1;
    }
    return sum;
  }

  long C(int n, int r) {
    long sum = 1;
    for (int i = n; 0 < i; --i) {
      sum *= i;
      sum %= MOD;
    }
    long s = 1;
    for (int i = r; 0 < i; --i) {
      s *= i;
      s %= MOD;
    }
    sum *= pow(s, MOD - 2);
    sum %= MOD;

    long t = 1;
    for (int i = n - r; 0 < i; --i) {
      t *= i;
      t %= MOD;
    }
    sum *= pow(t, MOD - 2);
    sum %= MOD;

    return sum;
  }

  double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;

  /**
   * 黄金分割探索
   *
   * @param left  下限
   * @param right 上限
   * @param f     探索する関数
   * @param comp  上に凸な関数を探索するときは、Comparator.comparingDouble(Double::doubleValue)
   *              下に凸な関数を探索するときは、Comparator.comparingDouble(Double::doubleValue).reversed()
   * @return 極値の座標x
   */
  double goldenSectionSearch(double left, double right, Function<Double, Double> f, Comparator<Double> comp) {
    double c1 = divideInternally(left, right, 1, GOLDEN_RATIO);
    double c2 = divideInternally(left, right, GOLDEN_RATIO, 1);
    double d1 = f.apply(c1);
    double d2 = f.apply(c2);
    while (right - left > 1e-9) {
      if (comp.compare(d1, d2) > 0) {
        right = c2;
        c2 = c1;
        d2 = d1;
        c1 = divideInternally(left, right, 1, GOLDEN_RATIO);
        d1 = f.apply(c1);
      } else {
        left = c1;
        c1 = c2;
        d1 = d2;
        c2 = divideInternally(left, right, GOLDEN_RATIO, 1);
        d2 = f.apply(c2);
      }
    }
    return right;
  }

  /**
   * [a,b]をm:nに内分する点を返す
   */
  double divideInternally(double a, double b, double m, double n) {
    return (n * a + m * b) / (m + n);
  }
}
