import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long N = scanner.nextLong();
    long ans = 0;
    for (long a = 1; a * a < N; a++) {
      if (N % a == 0) {
        long b = N / a;
        if (b - 1 > a) ans += b - 1;
      }
    }
    System.out.println(ans);
  }
}
