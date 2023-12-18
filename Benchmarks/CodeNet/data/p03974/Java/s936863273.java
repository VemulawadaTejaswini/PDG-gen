import java.util.Scanner;
import java.lang.Math;

public class Main {
    
  public static void main(String[] args) {
    int n, q, order;
    int[] k;
    String[] s, p;
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    s = new String[n];
    scanner.nextLine();
    for (int i = 0; i < n; i++) {
        s[i] = scanner.nextLine();
    }
    q = scanner.nextInt();
    k = new int[q];
    p = new String[q];
    scanner.nextLine();
    for (int i = 0; i < q; i++) {
        k[i] = scanner.nextInt();
        p[i] = scanner.next();
    }
    scanner.close();

    for (int i = 0; i < q; i++) {
        order = 1;
        for (int j = 0; j < n; j++) {
            if (j + 1 == k[i]) {
                continue;
            }
            if (compare(s[k[i] - 1], s[j], p[i]) > 0) {
                order++;
            }
        }
        System.out.println(order);
    }
  }

  public static int compare(String s1, String s2, String order) {
      int p1 = 0, p2 = 0;
      for (int i = 0; i < Math.min(s1.length(), s2.length()) && p1 == p2; i++) {
          p1 = order.indexOf(s1.charAt(i));
          p2 = order.indexOf(s2.charAt(i));
      }

      if (p1 == p2 && s1.length() != s2.length()) {
          return s1.length() - s2.length();
      }

      return p1 - p2;
  }
}