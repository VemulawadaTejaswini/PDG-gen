import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    boolean flag = false;
    
    if (S.equals("keyence")) {
      flag = true;
    }
    if (S.contains("key") && S.contains("ence")) {
      if (S.indexOf("key") == 0 && S.lastIndexOf("ence") == S.length() - 4) {
        flag = true;
      }
    }
    if (S.contains("keyence")) {
      String ss = S.replaceFirst("keyence", "#");
      String[] sss = ss.split("#");
      if (sss.length == 1) {
        flag = true;
      } else if (sss.length == 2 && sss[0].equals("")) {
        flag = true;
      }
    }
    if (flag) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}