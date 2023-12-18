import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    char[][] graph = new char[H][W];
    for (int i = 0; i < H; i++) {
      graph[i] = scanner.next().toCharArray();
    }

    int[][] groups = new int[H][W];
    int gid = 0;
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (groups[i][j] == 0) {
          gid++;
          groups[i][j] = gid;
          dfs(H, W, graph, groups, gid, i, j);
        }
      }
    }

    long[][] numcolor = new long[gid + 1][2];
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if (graph[i][j] == '.') numcolor[groups[i][j]][0]++;
        else numcolor[groups[i][j]][1]++;
      }
    }

    long res = 0;
    for (int i = 0; i <= gid; i++) res += numcolor[i][0] * numcolor[i][1];
    System.out.println(res);
  }

  private static void dfs(int H, int W, char[][] graph, int[][] groups, int gid, int i, int j) {
    for(int[] d : new int[][]{ {-1, 0}, {1, 0}, {0, -1}, {0, 1}}) {
      int ni = i + d[0];
      int nj = j + d[1];
      if (ni >= 0 && ni < H && nj >= 0 && nj < W) {
        if (graph[i][j] != graph[ni][nj] && groups[ni][nj] == 0) {
          groups[ni][nj] = gid;
          dfs(H, W, graph, groups, gid, ni, nj);
        }
      }
    }

  }
}
