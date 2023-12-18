import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      String s = "0121313113131";
      int a = s.length();
      int b = s.length();
      boolean ans = s.charAt(a) == s.charAt(b);
      System.out.println(ans ? "Yes" : "No");
    } finally {
      sc.close();
    }
  }
}