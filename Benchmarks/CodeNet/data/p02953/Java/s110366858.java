import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc136/tasks/abc136_c
 */
public class Main {

  private static void answer(long[] hs) {
    if (hs.length == 0) {
      System.out.println("YES");
      return;
    }

    long prev = hs[0];
    for (int i = 1; i < hs.length; i++) {
      if (prev > hs[i]) {
        prev--;
        if (i - 2 > 0 && prev < hs[i - 2]) {
          System.out.println("NO");
          return;
        }
      }

      if (prev > hs[i]) {
        System.out.println("NO");
        return;
      }

      prev = hs[i];
    }

    System.out.println("YES");
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long[] hs = new long[n];
    for (int i = 0; i < n; i++) {
      hs[i] = scan.nextLong();
    }
    scan.close();

    answer(hs);
  }
}
