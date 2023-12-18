import java.util.*;
import java.util.regex.Pattern;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String t = sc.next();

    boolean flg = true;

    if(s.length() <= 0 || s.length() > 10) {
      flg = false;
    }
    if((s.length()+1) != t.length()) {
      flg = false;
    }

    flg = isHalfAlphanumeric(s);
    flg = isHalfAlphanumeric(t);
    if(flg) {
      if(t.contains(s)) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    } else {
      System.out.println("No");
    }
    sc.close();
  }
  public static boolean isHalfAlphanumeric(String str) {
    return Pattern.matches("^[a-z]+$", str);
  }
}