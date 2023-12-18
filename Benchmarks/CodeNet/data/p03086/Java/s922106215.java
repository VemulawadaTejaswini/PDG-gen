import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int cnt = 0;
    int max = 0;
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == 'A' || S.charAt(i) == 'C' || S.charAt(i) == 'G' || S.charAt(i) == 'T') {
        cnt++;
      } else {
        max = Math.max(max, cnt);
        cnt = 0;
      }
    }
    System.out.println(max);
  }
}
