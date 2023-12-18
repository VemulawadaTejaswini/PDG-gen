import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    int a = 0;
    int b = 0;
    int c = 0;
    for(int i = 0; i < n ;i++) {
      String s = sc.next();
      for(int j = 0; j < s.length() - 1; j++) {
        if((s.charAt(j) == 'A') && (s.charAt(j) == 'B')) ans++;
      }
      if(s.charAt(s.length() - 1) == 'A') {
        if(s.charAt(0) == 'B') {
          c++;
        } else {
          a++;
        }
      } else if(s.charAt(0) == 'B') {
        b++;
      }
    }
    int ans1 = Math.min(a + c, b);
    int ans2 = Math.min(b + c, a);
    ans += (Math.max(ans1, ans2));
    System.out.println(ans);
  }
}