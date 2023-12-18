import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    sc.close();
    int cnt = 0;
    for (int i = 0; i < N; i++) {
      if (S.charAt(i) == 'A') {
        if (S.charAt(i + 1) == 'B') {
          if (S.charAt(i + 2) == 'C') {
            cnt++;
          }
        }
      }
    }
    System.out.println(cnt);
  }
}
