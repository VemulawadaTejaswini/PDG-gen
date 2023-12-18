import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String X = sc.next();
    String Y = sc.next();
    StringBuffer A = new StringBuffer(X);
    String B = A.reverse().toString();
    System.out.println(B);
    if (B.equals(Y)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
