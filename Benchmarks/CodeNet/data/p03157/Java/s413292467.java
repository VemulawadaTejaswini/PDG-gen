import java.util.*;
import java.io.*;

public class Main {

  private static void solve() {
    int h = nextInt();
    int w = nextInt();

    char[][] g = new char[h][w];

    for (int i = 0; i < h; i++) {
      g[i] = next().toCharArray();
    }

    boolean[][] visit = new boolean[h][w];

    long ans = 0;
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (g[i][j] == '#' && !visit[i][j]) {
          ans += bfs(i, j, visit, g, h, w);
        }
      }
    }

    System.out.println(ans);
  }

  private static long bfs(int i, int j, boolean[][] visit, char[][] g, int h, int w) {
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[] {i, j, 0});
    visit[i][j] = true;

    long black = 1;
    long white = 0;
    while (!queue.isEmpty()) {
      int[] first = queue.poll();

      for (int k = 0; k < dx.length; k++) {
        int nx = first[0] + dx[k];
        int ny = first[1] + dy[k];

        int expected = (first[2] == 0 ? 1 : 0);
        char expectedChar = '#';
        if (expected == 1) {
          expectedChar = '.';
        }

        if (nx >= 0 && nx < h && ny >= 0 && ny < w && expectedChar == g[nx][ny] && !visit[nx][ny]) {
          visit[nx][ny] = true;
          if (g[nx][ny] == '#') {
            black++;
          } else {
            white++;
          }
          queue.offer(new int[] {nx, ny, expected});
        }
      }
    }
    return black * white;
  }

  private static void run() {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out);

    solve();

    out.close();
  }

  private static StringTokenizer st;
  private static BufferedReader br;
  private static PrintWriter out;

  private static String next() {
    while (st == null || !st.hasMoreElements()) {
      String s;
      try {
        s = br.readLine();
      } catch (IOException e) {
        return null;
      }
      st = new StringTokenizer(s);
    }
    return st.nextToken();
  }

  private static int nextInt() {
    return Integer.parseInt(next());
  }

  private static long nextLong() {
    return Long.parseLong(next());
  }

  public static void main(String[] args) {
    run();
  }
}