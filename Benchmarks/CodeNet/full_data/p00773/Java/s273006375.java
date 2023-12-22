import java.util.*;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int s = sc.nextInt();
      if (x == 0 && y == 0 && s == 0) return;
      int max = 0;
      for (int i = 1; i < s; i++) {
        for (int j = 1; j < s; j++) {
          int a = i * (100 + x) / 100;
          int b = j * (100 + x) / 100;
          if (a + b == s) {
            a = i * (100 + y) / 100;
            b = j * (100 + y) / 100;
            if (a + b > max) max = a + b;
          }
        }
      }

      System.out.println(max);
    }
  }
}

