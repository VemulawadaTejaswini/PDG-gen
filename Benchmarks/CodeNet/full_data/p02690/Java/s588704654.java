import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();

    for (int i = 0; ; i++) {
      long a = (long)(Math.pow(i,5));
      if (a < x) {
        for (int j = 0; Math.pow(j,5) < x-a; j--) {
          long b = (long)(Math.pow(j,5));
          if (a-b == x) {
            System.out.println(i+" "+j);
            return;
          }
        }
      } else if (a > x) {
        for (int j = 0; Math.pow(j,5) < x-a; j++) {
          long b = (long)(Math.pow(j,5));
          if (a-b == x) {
            System.out.println(i+" "+j);
            return;
          }
        }
      } else {
        System.out.println(i+" "+0);
        return;
      }
    }

  }

}
