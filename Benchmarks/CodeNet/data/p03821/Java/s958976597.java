import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long[] A = new long[N];
    long[] B = new long[N];
    for (int i = 0; i < N; i++) {
      A[i] = scanner.nextInt();
      B[i] = scanner.nextInt();
    }
    long res = 0;
    for (int i = N - 1; i >= 0; i--) {
      A[i] += res;
      if (A[i] == 0) {
        res += B[i];
      } else {
        long r = A[i] % B[i];
        if (r > 0) res += B[i] - r;
      }
    }
    System.out.println(res);
  }
}
