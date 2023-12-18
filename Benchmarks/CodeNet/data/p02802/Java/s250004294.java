import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] p = new int[m];
    String[] s = new String[m];

    int wc = 0;
    int ac = 0;

    if (m != 0) {

      int W = 0;
      int A = 0;

      for (int i = 0; i < m; i++) {
        p[i] = sc.nextInt();
        s[i] = sc.next();
        if (s[i].equals("WA")) W++;
        if (s[i].equals("AC")) A++;
      }

      int[] w = new int[W];
      int[] a = new int[A];

      int l = 0;
      int r = 0;

      for (int i = 0; i < m; i++) {

        if (s[i].equals("WA")) {
          w[l] = p[i];
          l++;
        }

        if (s[i].equals("AC")) {
          a[r] = p[i];
          r++;
        }

      }

      if (W != 0) wc = 1;
      if (A != 0) ac = 1;

      for (int i = 1; i < W; i++) {
        wc += w[i] - w[i-1];
      }

      for (int i = 1; i < A; i++) {
        ac += a[i] - a[i-1];
      }


    }

    System.out.println(ac+" "+wc);

  }


}
