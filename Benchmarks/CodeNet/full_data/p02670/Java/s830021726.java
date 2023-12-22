import java.io.*;
import java.util.*;


public class Main {

  void solve() throws IOException {
    int n = nextInt();
    int[] p = new int[n * n];
    for (int i = 0; i < n * n; i++) {
      p[i] = nextInt() - 1;
    }
    int[][] hatred = new int[n][n];
    int[][] hall = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        hall[i][j] = 1;
        hatred[i][j] = Math.min(Math.min(i, j), Math.min(n - i - 1, n - j - 1));
      }
    }
    int ans = 0;
    for (int i = 0 ; i < n * n; i++) {
      int x = p[i] % n;
      int y = p[i] / n;
      LinkedList<Point> q = new LinkedList<>();
      q.add(new Point(x, y));
      ans += hatred[x][y];
      hall[x][y] = 0;
      while (!q.isEmpty()) {
        Point current = q.pollFirst();
        int nextHatred = hatred[current.x][current.y] + hall[current.x][current.y];
        for (int j = 0; j < 4; j++) {
          Point next = current.shift(j);
          if (next.isGood(n) && nextHatred < hatred[next.x][next.y]) {
            hatred[next.x][next.y] = nextHatred;
            q.addLast(next);
          }
        }
      }
    }
    out.println(ans);
  }

  int[] dx = {-1, 1, 0, 0};
  int[] dy = {0, 0, -1, 1};

  class Point {
    int x,y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    Point shift(int dir) {
      return new Point(x + dx[dir], y + dy[dir]);
    }

    boolean isGood(int n) {
      return x >= 0 && x < n && y >= 0 && y < n;
    }
  }

  public static void main(String[] args) throws IOException {
    new Main().run();
  }

  void run() throws IOException {
    reader = new BufferedReader(new InputStreamReader(System.in));
//		reader = new BufferedReader(new FileReader("input.txt"));
    tokenizer = null;
    out = new PrintWriter(new OutputStreamWriter(System.out));
//		out = new PrintWriter(new FileWriter("output.txt"));
    solve();
    reader.close();
    out.flush();

  }

  BufferedReader reader;
  StringTokenizer tokenizer;
  PrintWriter out;

  int nextInt() throws IOException {
    return Integer.parseInt(nextToken());
  }

  long nextLong() throws IOException {
    return Long.parseLong(nextToken());
  }

  double nextDouble() throws IOException {
    return Double.parseDouble(nextToken());
  }

  String nextToken() throws IOException {
    while (tokenizer == null || !tokenizer.hasMoreTokens()) {
      tokenizer = new StringTokenizer(reader.readLine());
    }
    return tokenizer.nextToken();
  }
}
