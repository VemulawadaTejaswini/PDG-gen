import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long[] A = new long[N];
    for (int i = 0; i < N; i++) A[i] = scanner.nextLong();

    long count = 0;
    long[] c = new long[N];
    while (!done(A, N)) {
      long sum = 0;
      Arrays.fill(c, 0);
      for (int i = 0; i < N; i++) {
        c[i] = A[i] / N;
        count += c[i];
        sum += c[i];
        A[i] -= c[i] * N;
      }
      for (int i = 0; i < N; i++) {
        A[i] += sum - c[i];
      }
    }
    System.out.println(count);
  }

  private static boolean done(long[] A, int N) {
    for (long a : A) if (a >= N) return false;
    return true;
  }
}
