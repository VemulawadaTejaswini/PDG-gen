import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();

    long res = 1;
    for (int i = 0; i < N; i++) {
      long t = scanner.nextLong();
      res = lcm(res, t);
    }
    System.out.println(res);
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

  private static long lcm(long i, long j) {
    long gcd = gcd(i, j);
    return i / gcd * j;
  }
}
