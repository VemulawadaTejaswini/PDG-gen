import java.util.Scanner;

class Main {

  public static final long INF = Long.MAX_VALUE / 4;

  public static long gcd(long a, long b) {
    if (a < b) {
      long tmp = a;
      a = b;
      b = tmp;
    }
    if (b == 0) {
      return a;
    }
    long r = a % b;
    while (r != 0) {
      a = b;
      b = r;
      r = a % b;
    }
    return b;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    long[] A = new long[N];
    for (int i = 0; i < N; i++) {
      A[i] = scanner.nextLong();
    }
    long[] L = new long[N + 1];
    long[] R = new long[N + 1];
    for (int i = 0; i < N; i++) {
      L[i + 1] = gcd(L[i], A[i]);
    }
    for (int i = N; i > 0; i--) {
      R[i - 1] = gcd(R[i], A[i - 1]);
    }
    long[] ans = new long[N];
    for (int i = 0; i < N; i++) {
      ans[i] = gcd(L[i], R[i + 1]);
    }
    long max = 0;
    for (long m : ans) {
      max = Math.max(max, m);
    }
    System.out.println(max);

  }

}
ajdflakj