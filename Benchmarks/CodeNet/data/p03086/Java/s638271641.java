import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = s.length();
    int count = 0;
    int ans = 0;
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == 'A' || s.charAt(i) == 'C' || s.charAt(i) == 'G' || s.charAt(i) == 'T') {
        count++;
      } else {
        ans = Math.max(ans, count);
        count = 0;
      }
    }
    ans = Math.max(ans, count);
    System.out.println(ans);
  }
}
