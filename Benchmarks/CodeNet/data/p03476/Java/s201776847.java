import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean[] isPrime = new boolean[100_001];
    for (int i = 0; i < isPrime.length; i++) isPrime[i] = true;
    isPrime[0] = false;
    isPrime[1] = false;
    for (int i = 2; i < (int) Math.sqrt(isPrime.length) + 1; i++) {
      if (isPrime[i]) {
        for (int j = 2; i * j < isPrime.length; j++) {
          isPrime[i * j] = false;
        }
      }
    }

    int[] acc = new int[isPrime.length];
    int sum = 0;
    for (int i = 3; i < isPrime.length; i++) {
      if (isPrime[i] && isPrime[(i + 1) / 2]) {
        sum++;
      }
      acc[i] = sum;
    }

    int Q = scanner.nextInt();
    for (int i = 0; i < Q; i++) {
      int l = scanner.nextInt();
      int r = scanner.nextInt();
      System.out.println(acc[r] - acc[l - 1]);
    }
  }
}
