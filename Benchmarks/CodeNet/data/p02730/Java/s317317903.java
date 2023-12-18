import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ans = "Yes";
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
        ans = "No";
        break;
      }
    }
    for(int i = 0; i < (s.length() - 1) / 2; i++) {
      if(s.charAt(i) != s.charAt((s.length() - 1) / 2 - 1 - i)) {
        ans = "No";
        break;
      }
    }
    for(int i = (s.length() + 1) / 2; i < s.length(); i++) {
      if(s.charAt(i) != s.charAt(s.length() - 1 - (i - (s.length() + 1) / 2))) {
        ans = "No";
        break;
      }
    }
    System.out.println(ans);
  }
}