import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      int n = sc.nextInt();
      String s = sc.next();
      int ans = 0;
      for (int i = 0; i < n; i++) {
        int a = mask(s.substring(0, i));
        int b = mask(s.substring(i, n));
        int cnt = Integer.bitCount(a & b);
        if (ans < cnt) ans = cnt;
      }
      System.out.println(ans);
    } finally {
      sc.close();
    }
  }

  private static int mask(String s) {
    int mask = 0;
    for (int i = 0; i < s.length(); i++) {
      mask |= 1 << (s.charAt(i) - 'a');
    }
    return mask;
  }
}