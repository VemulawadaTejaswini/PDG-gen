import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String S = sc.next();

    sc.close();

    String[] s_ = S.split("");

    String R = "";

    for (int i = s_.length - 1 ; 0 <= i ; i--) {
      R += s_[i];
    }

    boolean flg = true;

    int count = R.length();

    while (flg) {
      String r1 = R.substring(0, 5);
      String r2 = "";
      String r3 = "";
      if (6 < count) { 
        r2 = R.substring(0, 6);
      }
      if (7 < count) { 
        r3 = R.substring(0, 7);
      }
      if (r1.equals("maerd")){
        R = R.replaceFirst("maerd", "");
      } else if (r1.equals("esare")){
        R = R.replaceFirst("esare", "");
      } else if (r2.equals("resare")){
        R = R.replaceFirst("resare", "");
      } else if (r3.equals("remaerd")){
        R = R.replaceFirst("remaerd", "");
      } else {
        flg = false;
        System.out.println("NO");
        return;
      }
      count = R.length();
      if (count == 0) {
        System.out.println("YES");
        return;
      }
    }

  }

}