import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String S = sc.next();

    sc.close();

    boolean flg = true;

    int count = S.length();

    while (flg) {
      String r1 = S.substring(S.length() - 5);
      String r2 = "";
      String r3 = "";
      if (6 < count) { 
        r2 = S.substring(S.length() - 6);
      }
      if (7 < count) { 
        r3 = S.substring(S.length() - 7);
      }
      if (r1.equals("dream")){
        S = S.replaceFirst("dream", "");
      } else if (r1.equals("erase")){
        S = S.replaceFirst("erase", "");
      } else if (r2.equals("eraser")){
        S = S.replaceFirst("eraser", "");
      } else if (r3.equals("dreamer")){
        S = S.replaceFirst("dreamer", "");
      } else {
        flg = false;
        System.out.println("NO");
        return;
      }
      count = S.length();
      if (count == 0) {
        System.out.println("YES");
        return;
      }
    }

  }

}