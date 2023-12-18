import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    char[][] map = new char[H][W];
    for (int i = 0; i < H; i++) map[i] = scanner.next().toCharArray();

    int[][] level = new int[H][W];
    Queue<Cell> queue = new LinkedList<>();
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (map[i][j] == '#') {
          queue.add(new Cell(i, j, 0));
        }
      }
    }
    int max = 0;
    while (!queue.isEmpty()) {
      Cell c = queue.remove();
      max = Math.max(max, c.depth);
      for (int[] df : new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
        int x = c.x + df[0];
        int y = c.y + df[1];
        if (x >= 0 && x < H && y >= 0 && y < W && map[x][y] == '.') {
          map[x][y] = '#';
          queue.add(new Cell(x, y, c.depth + 1));
        }
      }
    }
    System.out.println(max);
  }

  private static class Cell {
    private final int x;
    private final int y;
    private final int depth;

    private Cell(int x, int y, int depth) {
      this.x = x;
      this.y = y;
      this.depth = depth;
    }
  }
}
