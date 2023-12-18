import java.util.Scanner;

/**
 * @author author
 *
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());

    long[] a = new long[n];

    for (int i = 0; i < n; i++) {
      a[i] = Long.parseLong(sc.next());
    }

    long answer = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        answer += Main.lcm(a[i], a[j]);
      }
    }


    System.out.println(answer % 998244353);

  }

  // Greatest common divisor
  static long gcd(long a, long b) {

    long c = 0;
    do {
      c = a % b;
      a = b;
      b = c;
    } while (c != 0);
    return a;
  }

  // Least common multiple
  static long lcm(long a, long b) {

    return a * b / gcd(a, b);
  }
}
