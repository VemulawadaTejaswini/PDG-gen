import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    long x = sc.nextLong();
    sc.close();

    for (long a = 0; a < 10000; a++) {

      long b5 = (long)Math.pow(a, 5) - x;
      if (b5 == 0) {
        System.out.println(a + " " + b5);
        return;
      }
      for (long b = 1; b < 10000; b++) {
        if (Math.abs(b5) % b == 0) {
          if (b5 > 0) {
            System.out.println(a + " " + b);
          } else {
            System.out.println(a + " " + (b * -1));
          }
          return;
        }
      }


    }

    /*
    for (long a = 0; a < 100000; a++) {
      for (long b = 0; b < 100000; b++) {
        if (Math.pow(a, 5) - Math.pow(b, 5) == x) {
          System.out.println(a + " " + b);
          sc.close();
          return;
        } else if (Math.pow(a * -1, 5) - Math.pow(b, 5) == x) {
          System.out.println((a * -1) + " " + b);
          sc.close();
          return;
        } else if (Math.pow(a * -1, 5) - Math.pow(b * -1, 5) == x) {
          System.out.println((a * -1) + " " + (b * -1));
          sc.close();
          return;
        } else if (Math.pow(a, 5) - Math.pow(b * -1, 5) == x) {
          System.out.println(a + " " + (b * -1));
          sc.close();
          return;
        }
      }
    }
    */

    sc.close();

  }
}