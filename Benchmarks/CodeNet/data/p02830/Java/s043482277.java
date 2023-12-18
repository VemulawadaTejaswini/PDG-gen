import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    String t = sc.next();
    String ans = "";
    for(int i = 0; i < n; i++) {
      String s1 = String.valueOf(s.charAt(i));
      String s2 = String.valueOf(t.charAt(i));
      ans += s1;
      ans += s2;
    }
    System.out.println(ans);
  }
}