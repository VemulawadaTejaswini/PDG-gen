import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ans = "No";
    if((s.length() > 3) && ((s.substring(0, 4)).equals("YAKI"))) {
      ans = "Yes";
    }
    System.out.println(ans);
  }
}