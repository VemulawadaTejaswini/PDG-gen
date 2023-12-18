import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String k = "CODEFESTIVAL2016";
    int ans = 0;
    for (int i = 0; i < k.length(); i++) {
      if (S.charAt(i) != k.charAt(i)) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}