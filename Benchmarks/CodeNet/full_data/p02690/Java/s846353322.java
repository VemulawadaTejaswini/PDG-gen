import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    long x = sc.nextLong();

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

    sc.close();

  }
}