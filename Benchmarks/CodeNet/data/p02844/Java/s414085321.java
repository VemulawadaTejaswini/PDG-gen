import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int ans = 0;
    for (int i = 0; i < 1000; i++) {
      String key = String.format("%03d", i);
      if (can(key, s)) ans++;
    }
    System.out.println(ans);
  }

  public static boolean can(String key, String s) {
    int index = 0;
    for (int i = 0; i < 3; i++) {
      index = s.indexOf(key.charAt(i), index);
      if (index < 0) return false;
      index++;
    }
    return true;
  }
}
