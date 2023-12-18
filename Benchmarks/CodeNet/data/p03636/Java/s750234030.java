import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    StringBuilder A = new StringBuilder();
    A.append(S.charAt(0));
    A.append(S.length() - 2);
    A.append(S.charAt(S.length() - 1));
    System.out.println(A);
  }
}
