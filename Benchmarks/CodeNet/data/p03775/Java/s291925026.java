import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int min = 11;
    long N = scanner.nextLong();
    for (long a = 1; a * a <= N; a++) {
      if (N % a == 0) {
        long b = N / a;
        min = Math.min(min, numDigits(b));
      }
    }
    System.out.println(min);
  }

  private static int numDigits(long n) {
    int i = 0;
    while (n > 0) {
      n /= 10;
      i++;
    }
    return i;
  }
}
