import java.util.Scanner;

public class Main {
  final static int MOD = 1000000007;

  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      String S = in.next();
      boolean[] discovered = new boolean[26];
      long count = count(0, S, discovered, 0) % MOD;

      System.out.println(count);
    }
  }

  private static long count (int cur, String s,boolean[] discovered, int len) {
    if (cur == s.length() || len == 26) {
      if (len > 0) {
        return 1;
      } else {
        return 0;
      }
    } else {
      long num = 0;
      if (discovered[s.charAt(cur) - 'a'] == false) {
        discovered[s.charAt(cur) - 'a'] = true;
        num += count(cur + 1, s, discovered, len + 1) % MOD;
        discovered[s.charAt(cur) - 'a'] = false;
      }

      num += count(cur + 1, s, discovered, len) % MOD;

      return num % MOD;
    }
  }
}