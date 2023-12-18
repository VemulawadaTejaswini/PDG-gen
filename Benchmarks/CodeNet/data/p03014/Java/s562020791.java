import java.util.Scanner;

public class Main {
  private static class Counter {
    int val = 0;
  }
  private static void solve(int h, int w, boolean[][] cell) {
    Counter[][] horizontal = new Counter[h][w];
    for (int i = 0; i < h; i++) {
      Counter c = new Counter();
      for (int j = 0; j < w; j++) {
        if (cell[i][j]) {
          c.val += 1;
          horizontal[i][j] = c;
        } else {
          c = new Counter();
        }
      }
    }
    Counter[][] vertical = new Counter[h][w];
    for (int i = 0; i < w; i++) {
      Counter c = new Counter();
      for (int j = 0; j < h; j++) {
        if (cell[j][i]) {
          c.val += 1;
          vertical[j][i] = c;
        } else {
          c = new Counter();
        }
      }
    }
    int max = 0;
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (cell[i][j]) {
          max = Math.max(max, horizontal[i][j].val + vertical[i][j].val - 1);
        }
      }
    }
    System.out.println(max);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] hw = sc.nextLine().split(" ");
    int h = Integer.parseInt(hw[0]);
    int w = Integer.parseInt(hw[1]);
    boolean[][] cell = new boolean[h][w];
    for (int i = 0; i < h; i++) {
      String row = sc.nextLine();
      for (int j = 0; j < w; j++) {
        cell[i][j] = row.charAt(j) == '.';
      }
    }
    solve(h, w, cell);
    sc.close();
  }
}
