import java.util.*;
import java.math.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String s =sc.next();
    int ans = 999;
    for(int i=0;i<s.length()-2;i++) {
      //System.err.println(s.substring(i, i+3));
      String temp = s.substring(i, i+3);
      int digit = Integer.valueOf(temp);
      if(digit <= 753) {
        ans = Math.min(ans, 753-digit);
      } else {
        ans = Math.min(ans, digit-753);
      }
    }
    System.out.println(ans);
  }
}
