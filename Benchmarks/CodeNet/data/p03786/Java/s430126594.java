import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = scanner.nextInt();
    Arrays.sort(A);
    long[] cum = new long[N];
    cum[0] = A[0];
    for (int i = 1; i < N; i++) {
      cum[i] = cum[i - 1];
      cum[i] += A[i];
    }

    int p = N - 2;
    while (p >= 0 && cum[p] * 2 >= A[p + 1]) p--;
    System.out.println(N - p - 1);
  }
}
