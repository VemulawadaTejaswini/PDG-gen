import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int X = scanner.nextInt();

    int[] primes = primes(1_000_000);
    for (int p : primes) {
      if (p >= X) {
        System.out.println(p);
        return;
      }
    }
  }

  private static int[] primes(int n) {
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
}
