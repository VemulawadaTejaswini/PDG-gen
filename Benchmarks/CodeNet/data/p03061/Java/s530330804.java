import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = scanner.nextInt();

    long[] gcdlr = new long[N];
    long[] gcdrl = new long[N];
    gcdlr[0] = A[0];
    gcdrl[N - 1] = A[N - 1];
    for (int i = 1; i < N; i++) gcdlr[i] = gcd(gcdlr[i - 1], A[i]);
    for (int i = N - 2; i >= 0; i--) gcdrl[i] = gcd(gcdrl[i + 1], A[i]);

    long max = Math.max(gcdlr[N - 2], gcdrl[1]);
    for (int i = 1; i < N - 1; i++) max = Math.max(max, gcd(gcdlr[i - 1], gcdrl[i + 1]));
    System.out.println(max);
  }

  private static long gcd(long i, long j) {
    if (i > j) return gcd(j, i);
    while (i > 0) {
      long r = j % i;
      j = i;
      i = r;
    }
    return j;
  }
}
