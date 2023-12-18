import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc135/tasks/abc135_b
 */
public class Main {

  private static boolean answer(long[] ps) {
    long prev = ps[0];
    int first = -1;
    int second = -1;
    for (int i = 1; i < ps.length; i++) {
      if (prev > ps[i]) {
        prev = ps[i];
        if (first == -1) {
          first = i - 1;
          continue;
        }

        if (second == -1) {
          second = i;
          continue;
        }

        return false;
      }

      prev = ps[i];
    }

    if (first == -1) {
      return true;
    }

    long first_prev = 0;
    if (first - 1 >= 0) {
      first_prev = ps[first - 1];
    }
    long first_next = 51;
    if (first + 1 < ps.length) {
      first_next = ps[first + 1];
    }
    boolean first_ok = first_prev < ps[second] && ps[second] < first_next;

    long second_prev = ps[second - 1];
    long second_next = 51;
    if (second + 1 < ps.length) {
      second_next = ps[second + 1];
    }
    boolean second_ok = second_prev < ps[first] && ps[first] < second_next;
    return first_ok && second_ok;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long[] ps = new long[n];
    for (int i = 0; i < n; i++) {
      ps[i] = scan.nextInt();
    }

    if (answer(ps)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
