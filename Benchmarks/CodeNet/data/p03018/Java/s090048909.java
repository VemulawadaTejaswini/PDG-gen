import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String s2 = "";
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) == 'B') {
        if((i < (s.length() - 1)) && (s.charAt(i + 1) == 'C')) {
          s2 += "E";
          i++;
        } else {
          s2 += String.valueOf(s.charAt(i));
        }
      } else {
        s2 += String.valueOf(s.charAt(i));
      }
    }
    long ans = 0;
    long p = 0;
    for(int i = 0; i < s2.length(); i++) {
      if(s2.charAt(i) == 'E') {
        ans += p;
      } else if(s2.charAt(i) == 'A') {
        p++;
      } else {
        p = 0;
      }
    }
    System.out.println(ans);
  }
}