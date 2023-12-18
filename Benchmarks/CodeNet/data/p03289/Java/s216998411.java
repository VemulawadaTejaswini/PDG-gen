import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int c_count = 0;
    boolean flag = true;
    if (s.charAt(0) != 'A') {
      flag = false;
    }
    if (!Character.isLowerCase(s.charAt(1))) {
      flag = false;
    }
    for (int i = 2; i < s.length(); i++) {
      if (s.charAt(i) == 'C') {
        c_count++;
        if (i >= 2 && i <= s.length() - 2) {
          flag = true;
        } else {
          flag = false;
        }
      } else {
        if (!Character.isLowerCase(s.charAt(i))) {
          flag = false;
        }
      }
    }
    if (flag && c_count == 1) {
      System.out.println("AC");
    } else {
      System.out.println("WA");
    }
  }
}