import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    String a = "";
    for (int i = 0; i < s.length(); i++) {
      String t = s.substring(i, i+1);
      if (t.equals("B") && a.length() == 0) continue;
      if (t.equals("B") && a.length() != 0) {
        a = a.substring(0, i-1);
      } else {
        a += t;
      }
    }
    
    System.out.println(a);
  }
}