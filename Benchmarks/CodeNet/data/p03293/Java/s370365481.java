import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    for (int i = 0; i < T.length(); i++) {
      boolean found = true;
      for (int j = 0; j < S.length(); j++) {
        if (S.charAt(j) != T.charAt((i+j) % T.length())) {
          found = false;
          break;
        }          
      }
      if (found) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}