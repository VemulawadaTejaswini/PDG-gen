import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int m = scanner.nextInt();
      if (m == 0) {
        break;
      }
      int n = scanner.nextInt();
      int cc = 0;
      for (int ii = m; ii <= n; ii++) {
        int c = ii;
        for (; ;) {
          if (c % 5 == 0) {
            c /= 5;
            continue;
          }
          if (c % 3 == 0) {
            c /= 3;
            continue;
          }
          if (c % 2 == 0) {
            c /= 2;
            continue;
          }
          if (c == 1) {
            cc++;
            break;
          }
          break;
        }
      }
      System.out.println(cc);
    }
  }
}