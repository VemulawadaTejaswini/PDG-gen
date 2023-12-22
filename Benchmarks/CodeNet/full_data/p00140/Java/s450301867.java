import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int ii = 0; ii < n; ii++) {
      int f = scanner.nextInt();
      int t = scanner.nextInt();
      if (f < t) {
        for (int jj = f; jj <= t; jj++) {
          System.out.print(jj);
          if (jj != t) {
            System.out.print(" ");
          } else {
            System.out.print("\n");
          }
        }
      } else if (f > t) {
        if (f <= 5 && t <= 5) {
          for (int jj = f; jj >= t; jj--) {
            System.out.print(jj);
            if (jj != t) {
              System.out.print(" ");
            } else {
              System.out.print("\n");
            }
          }
          continue;
        }
        String out = "";
        for (int jj = f;;) {
          out += jj + " ";
          if (jj == t) {
            break;
          }
          if (5 < jj) {
            jj++;
          } else {
            jj--;
            if (jj == 0) {
              jj += 6;
              out += "0 1 2 3 4 5 ";
            }
          }
          if (jj == 10) {
            jj = 5;
          }
        }
        System.out.print(out.trim() + "\n");
      }
    }
  }
}