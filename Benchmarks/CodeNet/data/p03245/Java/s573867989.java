import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[][] points = new int[N][2];
    int maxMan = -1;
    for (int i = 0; i < N; i++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      points[i][0] = x;
      points[i][1] = y;
      int man = Math.abs(x) + Math.abs(y);
      if (maxMan >= 0 && maxMan % 2 != man % 2) {
        System.out.println("-1");
        return;
      }
      if (man > maxMan) {
        maxMan = man;
      }
    }

    int m = maxMan;
    System.out.println(m);
    for (int i = 0; i < m; i++) {
      System.out.print("1");
      if (i < m - 1) System.out.print(" ");
    }
    System.out.println();

    for (int i = 0; i < N; i++) {
      int x = points[i][0];
      int y = points[i][1];

      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < Math.abs(x); j++) {
        sb.append(x > 0 ? 'R' : 'L');
      }
      for (int j = 0; j < Math.abs(y); j++) {
        sb.append(y > 0 ? 'U' : 'D');
      }
      for (int j = 0; j < m - Math.abs(x) - Math.abs(y); j += 2) {
        sb.append("RL");
      }

      System.out.println(sb.toString());
    }
  }
}
