import java.util.*;
import java.lang.Math;

class Main {
  private static long score(long n, long a) {
    return a - 1 + n/a - 1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = Long.parseLong(sc.next());

    long min = Long.MAX_VALUE;
    for (long i = 1; i < (long)Math.sqrt((double)n); i++) {
      if (n % i == 0) {
        long s = score(n, i);
        if (s < min) {
          min = s;
        }
      }
    }

    System.out.println(min);
  }
}