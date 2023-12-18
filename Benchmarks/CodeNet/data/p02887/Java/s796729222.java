import java.util.*;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String S = sc.next();

    char c = S.charAt(0);
    int count = 0;
    for (int i = 1; i < n; i++) {
      char _c = S.charAt(i);
      if (_c == c) {
        count++;
      } else {
        c = _c;
      }
    }

    System.out.println(n - count);
  }
}