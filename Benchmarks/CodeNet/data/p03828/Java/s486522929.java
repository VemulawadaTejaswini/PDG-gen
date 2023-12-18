import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    int N = scanner.nextInt();

    int[] primes = findPrimes(1000);
    int[] primeFactorCounts = new int[primes.length];
    for (int i = 2; i <= N; i++) {
      int n = i;
      for (int j = 0; j < primes.length && n > 0; j++) {
        int p = primes[j];
        while (n % p == 0) {
          n /= p;
          primeFactorCounts[j]++;
        }
      }
    }

    long res = 1;
    for (int c : primeFactorCounts) {
      res *= c + 1;
      res %= M;
    }
    System.out.println(res);
  }

  private static int[] findPrimes(int n) {
    boolean[] prime = new boolean[n + 1];
    for (int i = 2; i <= n; i++) prime[i] = true;
    for (int i = 2; i * i <= n; i++)
      for (int j = i * 2; j <= n; j += i)
        prime[j] = false;
    List<Integer> primes = new ArrayList<>();
    for (int i = 0; i <= n; i++) if (prime[i]) primes.add(i);
    int[] res = new int[primes.size()];
    for (int i = 0; i < primes.size(); i++) res[i] = primes.get(i);
    return res;
  }
}
