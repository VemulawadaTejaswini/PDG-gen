import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    int cnt = 0;
    for (int i = 1; i < A.length(); i++) {
      if (A.charAt(i) == A.charAt(i - 1)) {
        cnt++;
      }
    }
    if (cnt >= 2) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
