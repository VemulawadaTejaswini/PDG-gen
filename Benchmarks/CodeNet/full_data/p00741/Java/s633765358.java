import java.util.*;

public class Main {
  public static int w;
  public static int h;
  public static int[][] c = new int[50][50];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      w = sc.nextInt();
      h = sc.nextInt();
      if (w == 0 && h == 0) {
        return;
      }
      for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
          c[i][j] = sc.nextInt();
        }
      }
      int count = 0;
      for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
          if (c[i][j] == 1) {
            dfs(i, j);
            count++;
          }
        }
      }
      System.out.println(count);
    }
  }

  public static void dfs(int y, int x) {
    if (y >= 0 && y < h && x >= 0 && x < w && c[y][x] == 1) {
      c[y][x] = 0;
      for (int dy = -1; dy <= 1; dy++) {
        for (int dx = -1; dx <= 1; dx++) {
          dfs(dy + y, dx + x);
        }
      }
    }
  }
}
