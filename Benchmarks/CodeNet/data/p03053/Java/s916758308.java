import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {

    try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lines = in.readLine().split(" ");
      int H = Integer.parseInt(lines[0]);
      int W = Integer.parseInt(lines[1]);
      int N = H * W;

      int[][] arr = new int[H][W];
      for (int i = 0; i < H; i++) {
        Arrays.fill(arr[i], N);
        String line = in.readLine();
        for (int j = 0; j < W; j++) {
          if (line.charAt(j) == '#') {
            arr[i][j] = 0;
          }
        }
      }

      int ans = bfs(arr, H, W, N);
      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  private boolean inside(int H, int W, int y, int x) {
    return 0 <= y && y < H && 0 <= x && x < W;
  }

  private int bfs(int[][] grid, int H, int W, int N) {
    int distMax = 0;
    int[] dy = { 1, 0,-1, 0};
    int[] dx = { 0, 1, 0,-1};

    Deque<Point> que = new ArrayDeque<Point>();
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        if(grid[i][j] == 0) que.offer(new Point(i, j));
      }
    }

    while(!que.isEmpty()) {
      Point cur = que.poll();

      for (int i = 0; i < 4; i++) {
        int ny = cur.y + dy[i];
        int nx = cur.x + dx[i];
        if(inside(H, W, ny, nx) && grid[ny][nx] == N) {
          int d = grid[cur.y][cur.x] + 1;
          grid[ny][nx] = d;
          que.offer(new Point(ny, nx));
          if(distMax < d) distMax = d;
        }
      }
    }

    return distMax;
  }

  class Point {
    public int y, x;

    public Point(int y, int x) {
      this.y = y;
      this.x = x;
    }
  }
}