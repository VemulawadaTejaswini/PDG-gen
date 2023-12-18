import java.util.*;
import java.lang.Math;

class Main {
  private static long score(long n, long a) {
    return a - 1 + n/a - 1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();

    long min = Long.MAX_VALUE;
    for (long i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        min = Math.min(score(n, i), min);
      }
    }

    System.out.println(min);
  }
}