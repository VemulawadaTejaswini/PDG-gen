import java.util.Scanner;

public class Main {
  final static int MOD = 1000000007;

  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      String S = in.next();
      boolean[] discovered = new boolean[26];
      long count = count(0, S, discovered) % MOD;

      System.out.println(count);
    }
  }

  private static long count (int cur, String s,boolean[] discovered) {
    if (cur == s.length()) {
      for (int i = 0; i < discovered.length; ++i) {
        if (discovered[i]) {
          return 1;
        }
      }
      
      return 0;
    } else {
      boolean isAllDiscovered = true;
      
      for (int i = 0; i < discovered.length; ++i) {
        if (discovered[i] == false) {
          isAllDiscovered = false;
          break;
        }
      }

      if (isAllDiscovered) {
        return 1;
      } else {
        long num = 0;
        if (discovered[s.charAt(cur) - 'a'] == false) {
          discovered[s.charAt(cur) - 'a'] = true;
          num += count(cur + 1, s, discovered) % MOD;
          discovered[s.charAt(cur) - 'a'] = false;
        }

        num += count(cur + 1, s, discovered) % MOD;

        return num % MOD;
      }
    }
  }
}