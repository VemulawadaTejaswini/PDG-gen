import java.util.*;
import java.io.BufferedInputStream;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner (new BufferedInputStream(System.in));
    String s = sc.next();
    int n = s.length();
    boolean res = true;
    for(int i = 0; i < n / 2; ++i) {
      if(s.charAt(i) != s.charAt(n - 1 - i)) {
        res = false;
        break;
      }
    }
    if(res) {
      for(int i = 0; i < n / 4; ++i) {
        if(s.charAt(i) != s.charAt(n / 2 - 1 - i)) {
          res = false;
          break;
        }
      }
    }
    if(res) System.out.println("Yes");
    else System.out.println("No");
  }
}