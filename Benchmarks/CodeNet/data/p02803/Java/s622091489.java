import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    ABC151D solver = new ABC151D();
    solver.solve(1, in, out);
    out.close();
  }

  static class ABC151D {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      int h = in.nextInt();
      int w = in.nextInt();
      char[][] c = new char[h][w];
      int[] dh = {-1, 0, 0, 1};
      int[] dw = {0, 1, -1, 0};
      int[][] dist = new int[h * w][h * w];
      for (int i = 0; i < h; i++) {
        c[i] = in.next().toCharArray();
      }

      for (int i = 0; i < h * w; i++) {
        for (int j = 0; j < h * w; j++) {
          if (i == j) {
            dist[i][j] = 0;
          } else {
            dist[i][j] = 114514;
          }
        }
      }

      for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
          for (int k = 0; k < 4; k++) {
            int di = i + dh[k];
            int dj = j + dw[k];
            if (di < h && di >= 0 && dj < w && dj >= 0) {
              if (c[i][j] == '.' && c[di][dj] == '.') {
                dist[i * w + j][di * w + dj] = 1;
                // out.println(i + " " + j + " " + di + " " + dj);
              }
            }
          }
        }
      }

      for (int k = 0; k < h * w; k++) {
        for (int i = 0; i < h * w; i++) {
          for (int j = 0; j < h * w; j++) {
            if (dist[i][j] > dist[i][k] + dist[k][j]) {
              dist[i][j] = dist[i][k] + dist[k][j];
            }
          }
        }
      }

      int res = 0;
      for (int i = 0; i < h * w; i++) {
        for (int j = 0; j < h * w; j++) {
          if (dist[i][j] >= 114514) {

          } else {
            res = Math.max(res, dist[i][j]);
          }
        }
      }
      out.println(res);
    }

  }
}

