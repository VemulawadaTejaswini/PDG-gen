import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      int[] t = new int[n];
      for (int ii = 0; ii < n; ii++) {
        t[ii] = scanner.nextInt();
      }
      int s = scanner.nextInt();
      int mc = n / 2;
      int pre = mc;
      for (int c = 1; ; c++) {
        int mv = t[mc];
        if (mv == s) {
          System.out.println(c);
          break;
        } else if (s < mv) {
          mc -= (n - mc) / 2;
        } else if (s > mv) {
          mc += (n - mc) / 2;
        }
        if (pre == mc) {
          System.out.println(c + 1);
          break;
        }
        pre = mc;
      }
    }
  }
}