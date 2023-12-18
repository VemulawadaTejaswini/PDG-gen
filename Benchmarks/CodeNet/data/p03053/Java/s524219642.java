import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    char[][] a = new char[H][W];
    PriorityQueue<Cell> queue = new PriorityQueue<>(Comparator.comparingInt(cell -> cell.depth));
    for (int i = 0; i < H; i++) {
      a[i] = scanner.next().toCharArray();
      for (int j = 0; j < W; j++) {
        if (a[i][j] == '#') {
          queue.add(new Cell(i, j, 0));
        }
      }
    }
    int max = 0;
    while (!queue.isEmpty()) {
      Cell c = queue.poll();
      if (a[c.x][c.y] == '.') {
        max = Math.max(max, c.depth);
        a[c.x][c.y] = '#';
      }
      for (int[] d : new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
        int x = c.x + d[0];
        int y = c.y + d[1];
        if (x < 0 || x >= H || y < 0 || y >= W) continue;
        if (a[x][y] == '.') {
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
