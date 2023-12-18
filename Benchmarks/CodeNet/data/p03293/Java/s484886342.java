import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuffer S = new StringBuffer(sc.next());
    StringBuffer T = new StringBuffer(sc.next());
    for (int i = 0; i < T.length(); i++) {
      char top = S.charAt(0);
      S = new StringBuffer(S.substring(1));
      S = S.append(top);
      if (S.toString().equals(T.toString())) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}