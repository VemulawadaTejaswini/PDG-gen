import java.math.*;
import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = sc.nextInt();
    sc.close();

    Map<Integer, Integer> fA[] = new Map[N];
    for (int i = 0; i < N; i++) fA[i] = f(A[i]);

    Map<Integer, Integer> lcm = fA[0];
    for (int i = 1; i < N; i++)
      lcm = lcm(lcm, fA[i]);

    long mod = 1000000007;
    long ans = 0;
    for (int i = 0; i < N; i++) {
      Map<Integer, Integer> Bi = divide(lcm, fA[i]);
      long b = 1;
      for (Integer p : Bi.keySet()) {
        for (int j = 0; j < Bi.get(p); j++) {
          b *= p;
          b %= mod;
        }
      }
      ans += b;
      ans %= mod;
    }
    System.out.println(ans);
  }

  private static Map<Integer, Integer> divide(Map<Integer, Integer> a, Map<Integer, Integer> b) {
    Map<Integer, Integer> r = new HashMap<>();
    Set<Integer> ps = new HashSet<>();
    ps.addAll(a.keySet());
    ps.addAll(b.keySet());
    for (Integer p : ps) {
      int av = a.getOrDefault(p, 0);
      int bv = b.getOrDefault(p, 0);
      r.put(p, av - bv);
    }
    return r;
  }

  private static Map<Integer, Integer> lcm(Map<Integer, Integer> a, Map<Integer, Integer> b) {
    Map<Integer, Integer> r = new HashMap<>();
    Set<Integer> ps = new HashSet<>();
    ps.addAll(a.keySet());
    ps.addAll(b.keySet());
    for (Integer p : ps) {
      int av = a.getOrDefault(p, 0);
      int bv = b.getOrDefault(p, 0);
      r.put(p, Math.max(av, bv));
    }
    return r;
  }

  private static Map<Integer, Integer> f(int n) {
    Map<Integer, Integer> f = new HashMap<>();
    int m = n;
    int s = SIEVE[m - 1];
    while (s != 0) {
      f.compute(s, (k, v) -> v == null ? 1 : v + 1);
      m /= s;
      s = SIEVE[m - 1];
    }
    return f;
  }

  private static int[] SIEVE = sieve(1000000);

  private static int[] sieve(int n) {
    int [] sieve = new int[n];
    for (int i = 2; i <= n; i += 2) sieve[i - 1] = 2;
    int sqrt = (int) Math.sqrt(n);
    for (int i = 3; i <= n; i += 2) {
      if (sieve[i - 1] == 0) sieve[i - 1] = i;
      if (i <= sqrt)
        for (int j = i * i; j <= n; j += i)
          if (sieve[j - 1] == 0) sieve[j - 1] = i;
    }
    return sieve;
  }
}