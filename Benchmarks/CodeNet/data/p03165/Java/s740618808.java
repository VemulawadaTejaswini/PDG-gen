import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    sc.close();

    String min = s.length() < t.length() ? s : t;
    String max = s.length() < t.length() ? t : s;

//    char[][] cs = new char[min.length() + 1][max.length() + 1];
//    for (char[] a : cs) Arrays.fill(a, ' ');
//    for (int i = 0; i < min.length(); i++) {
//      for (int j = 0; j < max.length(); j++) {
//        if (min.charAt(i) == max.charAt(j)) {
//          cs[i + 1][j + 1] = min.charAt(i);
//        }
//      }
//    }
//    Arrays.stream(cs).map(Arrays::toString).forEach(System.out::println);


    int[][] dp = new int[min.length() + 1][max.length() + 1];
    for (int i = 1; i < min.length() + 1; i++) {
      for (int j = 1; j < max.length() + 1; j++) {
        if (min.charAt(i - 1) == max.charAt(j - 1)) {
          dp[i][j] = Math.min(
              dp[i - 1][j],
              dp[i][j - 1]) +1;
        } else {
          dp[i][j] = Math.max(
              dp[i - 1][j],
              dp[i][j - 1]);
        }
      }
    }

//    Arrays.stream(dp).map(Arrays::toString).forEach(System.out::println);

    StringBuilder buf = new StringBuilder();
    int x = max.length();
    for (int i = min.length(); 0 < i; i--) {
      for (int j = x; 0 < j; j--) {
        if (min.charAt(i - 1) != max.charAt(j - 1)) continue;
        if (dp[i][j - 1] < dp[i][j]) {
          buf.append(min.charAt(i - 1));
          x = j - 1;
          break;
        }
      }
    }

    String ans = buf.reverse().toString();
    System.out.println(ans);
  }
}