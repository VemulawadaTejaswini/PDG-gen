import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abc136/tasks/abc136_c
 */
public class Main {

  private static void answer(long[] hs) {
    if (hs.length == 1) {
      System.out.println("YES");
      return;
    }

    long max = hs[0];
    long submax = max;
    for (int i = 1; i < hs.length; i++) {
       if (max < hs[i]) {
         submax = max;
         max = hs[i];
       }

       if (max - submax > 1) {
         System.out.println("NO");
         return;
       }
    }

    if (max - submax > 1) {
      System.out.println("NO");
    } else {
      long last = hs[hs.length - 1];
      long prev = hs[hs.length - 2];
      if (prev > last) {
        System.out.println("NO");
      } else {
        System.out.println("YES");
      }
    }
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
