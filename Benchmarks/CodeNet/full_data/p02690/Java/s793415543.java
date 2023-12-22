import java.util.*;

public class Main {
  static int x;
  static int res1;
  static int res2;
  static boolean running = true;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    x = sc.nextInt();
    int a = 0;
    int p = 0; // a +- p;

    while ((int)Math.pow(a, 5) < x) {
      a++;
    } // 今aの5乗はx以上、これがスタート

    while (running) {
      dec(a+p, 0);
      dec(a-p, 1);
      p++;
    }

    System.out.println(res1 + " " + res2);
    sc.close();
  }

  static void dec (int a, int upOrDown) { // 0 should be down, 1 should be up
    int pow = (int)Math.pow(a, 5);
    int b = 0;
    if (upOrDown == 0) {
      while (pow - (int)Math.pow(b, 5) > x) {
        b++;
      }
      if (pow - (int)Math.pow(b, 5) == x) {
          res1 = a;
          res2 = b;
          running = false;
          return;
      }
    } else if (upOrDown == 1) {
      while (pow - (int)Math.pow(b, 5) < x) {
        b--;
      }
      if (pow - (int)Math.pow(b, 5) == x) {
        res1 = a;
        res2 = b;
        running = false;
        return;
      }
    }
  }

}