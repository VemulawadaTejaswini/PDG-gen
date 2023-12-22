import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int ii = 0; ii < n; ii++) {
      System.out.printf("Case %d:\n", ii + 1);
      int s = scanner.nextInt();
      for (int jj = 0; jj < 10; jj++) {
        String str = String.format("%08d", s * s);
        s = Integer.parseInt(str.substring(2, 2 + 4));
        System.out.println(s);
      }
    }
  }
}