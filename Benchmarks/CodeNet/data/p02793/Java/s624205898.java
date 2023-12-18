import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    int N = scanner.nextInt();
    int[] primes = primes(1_000_000);
    int[] A = new int[N];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      A[i] = scanner.nextInt();
      Map<Integer, Integer> factors = primeFactors(A[i], primes);
      for (Map.Entry<Integer, Integer> e : factors.entrySet()) {
        map.put(e.getKey(), Math.max(map.getOrDefault(e.getKey(), 0), e.getValue()));
      }
    }
    long lcm = 1;
    for (Map.Entry<Integer, Integer> f : map.entrySet()) {
      lcm *= modpow(f.getKey(), f.getValue(), M);
      lcm %= M;
    }

    long res = 0;
    for (int i = 0; i < N; i++) {
      res += lcm * inverse(A[i], M) % M;
      if (res >= M) res -= M;
    }
    System.out.println(res);
  }

  private static long inverse(long a, long mod) {
    return modpow(a, mod - 2, mod);
  }
  
  private static long modpow(long a, long n, long mod) {
    long res = 1;
    while (n > 0) {
      if (n % 2 == 1) res = (res * a) % mod;
      a = (a * a) % mod;
      n >>= 1;
    }
    return res % mod;
  }

  public static int[] primes(int n) {
    boolean[] isNotPrime = new boolean[n + 1];
    isNotPrime[0] = isNotPrime[1] = true;
    for (int i = 2; i < Math.sqrt(n); i++) {
      if (!isNotPrime[i]) {
        for (int j = 2; i * j <= n; j++) {
          isNotPrime[i * j] = true;
        }
      }
    }
    final List<Integer> ls = new ArrayList<>();
    for (int i = 2; i <= n; i++) if (!isNotPrime[i]) ls.add(i);
    int[] res = new int[ls.size()];
    for (int i = 0; i < ls.size(); i++) res[i] = ls.get(i);
    return res;
  }

  public static Map<Integer, Integer> primeFactors(int n, int[] primes) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int p : primes) {
      if (p * p > n) break;
      int count = 0;
      while (n % p == 0) {
        count++;
        n /= p;
      }
      if (count > 0) {
        map.put(p, count);
      }
    }
    if (n > 1) map.put(n, 1);

    return map;
  }
}
