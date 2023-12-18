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

    int maxDepth = 0;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (map[i][j] == '.') {
          maxDepth = Math.max(maxDepth, bfs(H, W, map, i, j));
        }
      }
    }
    System.out.println(maxDepth);
  }

  private static int bfs(int H, int W, char[][] map, int i, int j) {
    boolean[][] visited = new boolean[H][W];
    Queue<Pos> queue = new LinkedList<>();
    queue.add(new Pos(0, i, j));
    int maxDepth = 0;
    while (!queue.isEmpty()) {
      Pos p = queue.poll();
      if (visited[p.i][p.j]) continue;
      visited[p.i][p.j] = true;
      maxDepth = Math.max(maxDepth, p.level);
      for (int[] d : new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
        int ni = p.i + d[0];
        int nj = p.j + d[1];
        if (ni >= 0 && ni < H && nj >= 0 && nj < W && map[ni][nj] == '.' && !visited[ni][nj]) {
          queue.add(new Pos(p.level + 1, ni, nj));
        }
      }
    }
    return maxDepth;
  }

  private static class Pos {
    private final int level;
    private final int i;
    private final int j;

    private Pos(int level, int i, int j) {
      this.level = level;
      this.i = i;
      this.j = j;
    }
  }
}
