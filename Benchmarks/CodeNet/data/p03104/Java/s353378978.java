import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long A = scanner.nextLong();
    long B = scanner.nextLong();
    System.out.println(g(A - 1) ^ g(B));
  }

  private static long g(long a) {
    a++;
    long res = a / 2 % 2;
    for (int i = 1; i < 40; i++) {
      long j = 1L << i;
      long k = a / j;
      long l = a % j;
      if (k % 2 == 1 && l % 2 == 1) {
        res |= j;
      }
    }
    return res;
  }
}
