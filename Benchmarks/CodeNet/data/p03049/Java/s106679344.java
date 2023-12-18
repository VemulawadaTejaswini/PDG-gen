import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    int a = 0;
    int b = 0;
    for(int i = 0; i < n ;i++) {
      String s = sc.next();
      for(int i = 0; i < s.length() - 1; i++) {
        if((s.charAt(i) == 'A') && (s.charAt(i) == 'B')) ans++;
      }
      if(s.charAt(s.length() - 1) == 'A') {
        a++;
      } else if(s.charAt(s.length() - 1) == 'B') {
        b++;
      }
    }
    ans += (Math.min(a, b));
    System.out.println(ans);
  }
}
