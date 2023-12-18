import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String X = sc.next();
    StringBuilder A = new StringBuilder();
    for (int i = 0; i < X.length(); i += 2) {
      A.append(X.charAt(i));
    }
    System.out.println(A);
  }
}
