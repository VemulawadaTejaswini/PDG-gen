import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean[] primes = primes(100000);
    int[] num2017 = new int[100001];
    for (int i = 1; i <= 100000; i++) {
      num2017[i] = num2017[i - 1];
      if (i % 2 == 1 && primes[i] && primes[(i + 1) / 2]) num2017[i]++;
    }

    int Q = scanner.nextInt();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < Q; i++) {
      int l = scanner.nextInt();
      int r = scanner.nextInt();
      sb.append(num2017[r] - num2017[l - 1]).append('\n');
    }
    System.out.print(sb.toString());
  }

  public static boolean[] primes(int n) {
    boolean[] isNotPrime = new boolean[n + 1];
    isNotPrime[0] = isNotPrime[1] = true;
    for (int i = 2; i < Math.sqrt(n); i++) {
      if (!isNotPrime[i]) {
        for (int j = 2; i * j <= n; j++) {
          isNotPrime[i * j] = true;
        }
      }
    }
    boolean[] isPrime = new boolean[n + 1];
    for (int i = 0; i < n + 1; i++) {
      isPrime[i] = !isNotPrime[i];
    }
    return isPrime;
  }
}
