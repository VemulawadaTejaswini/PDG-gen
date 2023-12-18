import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] primes =
        new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73,
            79, 83, 89, 97};
    int[] countPrimes = new int[25];
    int N = scanner.nextInt();

    for (int i = 2; i <= N; i++) {
      int n = i;
      for (int j = 24; j >= 0; j--) {
        int p = primes[j];
        while (n >= p && n % p == 0) {
          countPrimes[j]++;
          n /= p;
        }
      }
    }

    int over4 = 0;
    int bt24 = 0;
    int over14 = 0;
    int bt414 = 0;
    int over24 = 0;
    int bt224 = 0;
    int over74 = 0;
    for (int i = 0; i < 25; i++) {
      int c = countPrimes[i];

      if (c >= 4) over4++;
      else if (c >= 2) bt24++;

      if (c >= 14) over14++;
      else if (c >= 4) bt414++;

      if (c >= 24) over24++;
      else if (c >= 2) bt224++;

      if (c >= 74) over74++;
    }

    System.out.println(
        choose(over4, 3) + choose(over4, 2) * bt24
        + choose(over14, 2) + over14 * bt414
        + choose(over24, 2) + over24 * bt224
        + over74);
  }

  private static int choose(int n, int k) {
    if (n < k) return 0;
    int res = 1;
    for (int i = 0; i < k; i++) {
      res *= n - i;
    }
    for (int i = 1; i <= k; i++) {
      res /= i;
    }
    return res;
  }
}
