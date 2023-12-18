import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long K = scanner.nextLong();
    int N = 50;
    long[] k = new long[N];

    long l = K / N;
    int r = (int) (K % N);
    for (int i = 0; i < r; i++) k[i] = l + 1;
    for (int i = r; i < N; i++) k[i] = l;

    System.out.println(N);
    for (int i = 0; i < N; i++) {
      long a = (N + 1) * k[i] + N - K - 1;
      System.out.printf("%d ", a);
    }
    System.out.println();
  }
}
