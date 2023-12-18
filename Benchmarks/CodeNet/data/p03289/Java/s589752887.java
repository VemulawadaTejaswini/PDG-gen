import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ans = "AC";
    if (s.charAt(0) != 'A') ans = "WA";
    int c_count = 0;
    for (int i = 1; i < s.length(); i++) {
      if (Character.isUpperCase(s.charAt(i))) { // 大文字なら
        if (i == 1 || i == s.length() - 1) {
          ans = "WA";
        } else if (s.charAt(i) != 'C') {
          ans = "WA";
        } else if (s.charAt(i) == 'C') {
          c_count++;
        }
      }
    }
    if (c_count != 1) ans = "WA";
    System.out.println(ans);
  }
}