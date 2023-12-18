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
      res += ((A[i] - 1) / B[i] + 1) * B[i] - A[i];
    }
    System.out.println(res);
  }
}
