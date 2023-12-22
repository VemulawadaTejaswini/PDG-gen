import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long A = scanner.nextLong();
    long B = scanner.nextLong();
    long N = scanner.nextLong();

    if (N >= B) {
      System.out.println(f(A, B, B - 1));
    } else {
      System.out.println(f(A, B, N));
    }
  }

  private static long f(long A, long B, long x) {
    long f = A * x / B;
    f -= A * (x / B);
    return f;
  }
}
