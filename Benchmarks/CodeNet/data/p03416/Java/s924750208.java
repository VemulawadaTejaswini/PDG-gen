import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = 0;
    for(int i = a; i <= b; i++) {
      String s = String.valueOf(i);
      int p = 0;
      for(int j = 0; j < s.length(); j++) {
        if(s.charAt(j) != s.charAt(s.length() - 1 - j)) p++;
      }
      if(p == 0) ans++;
    }
    System.out.println(ans);
  }
}