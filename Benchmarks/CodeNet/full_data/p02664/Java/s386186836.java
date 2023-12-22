import java.util.*;

public class Main {
  
  static String r;
  static int pd = -1;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    t(sc.nextLine());
    System.out.println(r);
  }
  
  static void t(String s) {
    int i = s.indexOf("?");
    if (i == -1) {
      int p = 0;
      for (int j = 0; j < s.length(); j++) {
        if (s.charAt(j) == 'D') {
          p++;
          if (0 < j && s.charAt(j - 1) == 'P')
            p++;
        }
      }
      if (pd < p) {
        pd = p;
        r = s;
      }
    }
    else {
      t(s.replaceFirst("\\?", "P"));
      t(s.replaceFirst("\\?", "D"));
    }
  }
  
}
