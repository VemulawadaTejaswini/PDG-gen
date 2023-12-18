import java.util.*;

public class Main {
  
  private static final int MOD = 1_000_000_007;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    int g = 1;
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      g = gcd(g, A[i]);
    }
    
    List<Integer> primes = createPrimes();
    Map<Integer, Integer> lcmSpec = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int a = A[i]/g;
      for (int prime : primes) {
        int count = 0;
        while (a%prime == 0) {
          count++;
          a /= prime;
        }
        int old = lcmSpec.getOrDefault(prime, 0);
        lcmSpec.put(prime, Math.max(old, count));
      }
      lcmSpec.put(a, lcmSpec.getOrDefault(a, 0)+1);
    }
    
    long ans = 0;
    for (int i = 0; i < N; i++) {
      int a = A[i]/g;
      Map<Integer, Integer> bmap = new HashMap<>();
      for (int prime : primes) {
        int count = 0;
        while (a%prime == 0) {
          count++;
          a /= prime;
        }
        bmap.put(prime, count);
      }
      bmap.put(a, 1);

      long B = g;
      for (Map.Entry<Integer, Integer> entry : lcmSpec.entrySet()) {
        int p = entry.getKey();
        int c = entry.getValue() - bmap.getOrDefault(p, 0);
        while (c-- > 0) {
          B *= p;
          B %= MOD;
        }
      }

      ans += B;
      ans %= MOD;
    }

    System.out.println(ans);
  }
  
  private static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a%b);
  }
  
  private static List<Integer> createPrimes() {
    List<Integer> primes = new ArrayList<>();
    for (int a = 2; a <= 1_000; a++) {
      boolean isPrime = true;
      for (int i = 2; i*i <= a; i++) {
        if (a%i == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        primes.add(a);
      }
    }
    return primes;
  }
}