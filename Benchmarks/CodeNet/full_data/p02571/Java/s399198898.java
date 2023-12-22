import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    String s = sc.next();
    String t = sc.next();
    int ans = t.length();
    for (int i = 0; i <= s.length() - t.length(); i++) {
      ans = Math.min(countDiff(s.substring(i, i + t.length()), t), ans);
    }
    pw.println(ans);
  }

  static int countDiff(String subS, String t) {
    int diff = 0;
    for (int i = 0; i < subS.length(); i++) {
      if (subS.charAt(i) != t.charAt(i)) {
        diff++;
      }
    }
    return diff;
  }
}
