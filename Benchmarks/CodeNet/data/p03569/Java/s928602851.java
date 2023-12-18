import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    long ans = 0;

    while(s.length() > 1) {
      int len = s.length();
      if(s.charAt(0) == s.charAt(len - 1)) {
        if(len == 2) {
          break;
        } else {
          s = s.substring(1, len - 1);
        }
      } else {
        if((s.charAt(0) != 'x') && (s.charAt(len - 1) != 'x')) {
          ans = -1;
          break;
        } else {
          ans++;
          if(s.charAt(0) == 'x') {
            s = s.substring(1);
          } else {
            s = s.substring(0, len - 1);
          }
        }
      }
    }
    
    System.out.println(ans);
  }
}
