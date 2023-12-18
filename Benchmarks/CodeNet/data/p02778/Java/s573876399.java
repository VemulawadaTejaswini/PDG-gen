import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    StringBuilder A = new StringBuilder();
    for (int i = 0; i < S.length(); i++) {
      A.append('x');
    }
    System.out.println(A);
  }
}
