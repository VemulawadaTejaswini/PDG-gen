import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    long ans = 0;
    int len = s.length();
    for(int i = 0; i < (int)Math.pow(2, len - 1); i++) {
      int p = 0;
      for(int j = 0; j < (len - 1); j++) {
        if((i & (1 << j)) != 0) {
          String str = s.substring(p, j + 1);
          long t = Long.parseLong(str);
          ans += t;
          p = j + 1;
        }
      }
      String str = s.substring(p);
      long t = Long.parseLong(str);
      ans += t;
    }
    if(len == 1) ans = Long.parseLong(s);
    System.out.println(ans);
  }
}