import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int ans = s.length();
    int[] t = new int[s.length()];
    for(int i = 0; i < s.length(); i++) {
      t[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
    }
    for(int i = 0; i < s.length() - 1; i++) {
      if(t[i] != t[i + 1]) ans = Math.min(ans, Math.max(i + 1, s.length() - i - 1));
    }
    System.out.println(ans);
  }
}
