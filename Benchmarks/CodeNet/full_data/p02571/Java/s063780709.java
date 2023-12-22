import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int ans = t.length();
    for(int i = 0; i <= s.length() - t.length(); i++) {
      int tt = 0;
      for(int j = i; j < i + t.length(); j++) {
        if(s.charAt(j) != t.charAt(j - i)) tt++;
      }
      ans = Math.min(ans, tt);
    }
    System.out.println(ans);
  }
}