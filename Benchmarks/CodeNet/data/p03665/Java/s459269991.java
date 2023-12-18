import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int P = scanner.nextInt();
    int numOdd = 0;
    int numEven = 0;
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      if (a % 2 == 0) numEven++;
      else numOdd++;
    }

    long res = 0;
    if (P == 1) {
      for (int i = 1; i <= numOdd; i += 2)
        res += choose(numOdd, i);
    } else {
      for (int i = 0; i <= numOdd; i += 2)
        res += choose(numOdd, i);
    }
    res *= 1L << numEven;
    System.out.println(res);
  }

  private static long choose(long n, long k) {
    if (k > n - k) return choose(n, n - k);
    if (k == 0) return 1;
    long res = 1;
    for (int i = 0; i < k; i++) res *= n - i;
    for (int i = 1; i <= k; i++) res /= i;
    return res;
  }
}
