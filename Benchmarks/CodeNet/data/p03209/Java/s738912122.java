import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long X = scanner.nextLong();
    System.out.println(count(N, X));
  }

  private static long count(int n, long x) {
    if ((1L << (n + 2)) - 3 < x) throw new IllegalArgumentException();
    if (n == 0) return 1;
    if (x == 1) return 0;
    x--;
    if (x <= (1L << (n + 1)) - 3) return count(n - 1, x);
    x -= (1L << (n + 1)) - 3;
    if (x == 1) return 1L << n;
    x--;
    if (x <= (1L << (n + 1)) - 3) return count(n - 1, x) + (1L << n);
    return (1L << (n + 1)) - 1;
  }
}