import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long L = scanner.nextLong();
    long A = scanner.nextLong();
    long B = scanner.nextLong();
    long M = scanner.nextLong();
    System.out.println(f(A, B, M, 0, L).r);
  }

  private static Result f(long A, long B, long M, long n, long m) {
    if (m <= n) return new Result(0, 0);
    if (m - n == 1) {
      long t = A + B * n;
      long r = t % M;
      int d = 0;
      while (t > 0) {
        t /= 10;
        d++;
      }
      return new Result(r, d);
    }
    Result rr = f(A, B, M, (n + m) / 2, m);
    Result ll = f(A, B, M, n, (n + m) / 2);
    long r = ll.r;
    for (int i = 0; i < rr.d; i++) {
      r *= 10;
      r %= M;
    }
    r += rr.r;
    r %= M;
    return new Result(r, ll.d + rr.d);
  }

  private static class Result {
    private final long r;
    private final int d;

    private Result(long r, int d) {
      this.r = r;
      this.d = d;
    }
  }
}
