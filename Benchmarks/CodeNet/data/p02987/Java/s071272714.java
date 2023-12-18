import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();

    String a = s.substring(0, 1);
    String b = s.substring(1, 2);
    String c = s.substring(2, 3);
    String d = s.substring(3, 4);

    String ans = "No";
    if (a.equals(b) && c.equals(d) && !(a.equals(c))) ans = "Yes";
    if (a.equals(c) && b.equals(d) && !(a.equals(b))) ans = "Yes";
    if (a.equals(d) && b.equals(c) && !(a.equals(b))) ans = "Yes";
    
    System.out.println(ans);
  }
}
