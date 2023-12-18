import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int h = sc.nextInt();
    int w = sc.nextInt();

    boolean[][] blocked = new boolean[h][w];

    for (int i = 0; i < h; i++) {
      String s = sc.next();
      for(int j = 0; j < w; j++) {
        if (s.charAt(j) == '#') blocked[i][j] = true;
      }
    }


    int[][] vertConnected = new int[h][w];
    int[][] hrznConnected = new int[h][w];
    // count continuous non-blocked
    for (int i = 0; i < h; i++) {
      for (int start = 0; start < w; start++) {
        if (blocked[i][start]) continue;
        int end = start + 1;
        while (end < w && !blocked[i][end]) end++;
        for (int j = start; j < end; j++) {
          vertConnected[i][j] = Math.max(vertConnected[i][j], end - start);
        }
      }
    }

    // count continuous non-blocked
    for (int j = 0; j < w; j++) {
      for (int start = 0; start < h; start++) {
        if (blocked[start][j]) continue;
        int end = start + 1;
        while (end < h && !blocked[end][j]) end++;
        for (int i = start; i < end; i++) {
          hrznConnected[i][j] = Math.max(hrznConnected[i][j], end - start);
        }
      }
    }
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        max = Math.max(max, (vertConnected[i][j] + hrznConnected[i][j]) - 1);
      }
    }
    os.println(max);
  }
}