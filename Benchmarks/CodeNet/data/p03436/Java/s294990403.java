import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();

    char[][] graph = new char[H][W];
    int white = 0;
    for (int i = 0; i < H; i++) {
      graph[i] = scanner.next().toCharArray();
      for (int j = 0; j < W; j++) {
        if (graph[i][j] == '.') white++;
      }
    }

    int d = bfs(graph, H, W);
    if (d < 0) {
      System.out.println("-1");
    } else {
      System.out.println(white - d);
    }
  }

  private static int bfs(char[][] graph, int H, int W) {
    final Queue<Cell> queue = new LinkedList<>();
    final boolean[][] visited = new boolean[H][W];
    queue.offer(new Cell(0, 0, 0));
    visited[0][0] = true;

    int[][] ds = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    while (!queue.isEmpty()) {
      final Cell c = queue.poll();
      if (c.i == H - 1 && c.j == W - 1) {
        return c.level + 1;
      }
      for(int[] d : ds) {
        int i = c.i + d[0];
        int j = c.j + d[1];
        if (i >= 0 && i < H && j >= 0 && j < W && graph[i][j] == '.' && !visited[i][j]) {
          visited[i][j] = true;
          queue.offer(new Cell(i, j, c.level + 1));
        }
      }
    }
    return -1;
  }

  private static class Cell {
    public final int i;
    public final int j;
    public final int level;

    private Cell(int i, int j, int level) {
      this.i = i;
      this.j = j;
      this.level = level;
    }
  }
}
