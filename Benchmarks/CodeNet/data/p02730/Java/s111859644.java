import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    sc.close();

    int n = S.length();
    boolean ans = isPal(S)
        && isPal(S.substring(0, (n - 1) / 2))
        && isPal(S.substring((n + 3) / 2 - 1));

    System.out.println(ans ? "Yes" : "No");
  }

  private static boolean isPal(String s) {
    int n = s.length();
    for (int i = 0; i < n / 2; i++) {
      if (s.charAt(i) != s.charAt(n - 1 - i)) return false;
    }
    return true;
  }
}
