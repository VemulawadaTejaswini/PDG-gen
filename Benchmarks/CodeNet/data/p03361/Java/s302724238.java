import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    char[][] grid = new char[H][W];

    for (int i = 0; i < H; i++) {
      grid[i] = scanner.next().toCharArray();
    }

    int[][] ds = new int[][] {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (grid[i][j] == '#') {
          boolean valid = false;
          for (int[] d : ds) {
            int y = i + d[0];
            int x = j + d[1];
            if (y >= 0 && y < H && x >= 0 && x < W && grid[y][x] == '#') valid = true;
          }
          if (!valid) {
            System.out.println("No");
            return;
          }
        }
      }
    }
    System.out.println("Yes");
  }
}
