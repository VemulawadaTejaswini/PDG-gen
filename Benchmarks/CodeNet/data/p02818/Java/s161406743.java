import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Main {
  
  static Long cookie_a; //takahashi cookie
  static Long cookie_b; //aoki cookie
  static Long play;     //kaisu

  public static void main(String[] args) {

    try {
      cookie();
    } catch (Exception e) {
      cookie_a = 0L;
      cookie_b = 0L;
    } finally {
      System.out.print(cookie_a + " " + cookie_b);
    }
  }
  
  static void cookie() throws Exception {
  
      // 標準入力受け取り
      Scanner scan = new Scanner(System.in);      
      cookie_a     = Long.parseLong(scan.next());
      cookie_b     = Long.parseLong(scan.next());
      play         = Long.parseLong(scan.next());
      
      //算出
      if (cookie_a > play) {
        cookie_a -= play;
      } else if (cookie_b > play) {
        cookie_b -= play;
      } else if (cookie_a > 0 && cookie_a < play) {
        cookie_b = cookie_b - (play - cookie_a);
        cookie_a = 0L;
        if (cookie_b < 0L) {
          cookie_b = 0L;
        }
      }
  }
}
