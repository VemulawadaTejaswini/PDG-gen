import java.io.*;
import java.util.*;
public class Main {
 
  public static void main(String[] args) { 
        solve();
      out.close();
  }

  private static void solve() {
      int h = sc.nextInt();
      int w = sc.nextInt();
      int sx = sc.nextInt() - 1;      
      int sy = sc.nextInt() - 1;
      int tx = sc.nextInt() - 1;
      int ty = sc.nextInt() - 1;

      char[][] grid = new char[h][w];
      int[][] dp = new int[h][w];
      for(int i = 0; i < h; i++) {
        grid[i] = sc.next().toCharArray();
        Arrays.fill(dp[i], 1_000_000_000);
      }

      if(grid[sx][sy] == '#' || grid[tx][ty] == '#') {
        out.println(-1);
        return;
      }
      dp[sx][sy] = 0;
      int[] rows = new int[]{-1, 1, 0, 0};
      int[] cols = new int[]{0, 0, -1, 1};  
      Queue<int[]> queue = new LinkedList<>();
      queue.offer(new int[]{sx, sy});
      while(queue.size() > 0) {
        int[] pos = queue.poll();

        for(int j = 0; j < 4; j++) {
          int next_x = pos[0] + rows[j];
          int next_y = pos[1] + cols[j];
          if(!isValid(grid, dp, next_x, next_y, dp[pos[0]][pos[1]]))
            continue;
          if(dp[next_x][next_y] > dp[pos[0]][pos[1]]) {
               dp[next_x][next_y] = dp[pos[0]][pos[1]];
               queue.offer(new int[]{next_x, next_y});
          }
        }

        for(int i = -2; i <= 2; i++) {
          for(int j = -2; j <= 2; j++) {
            int next_x = pos[0] + i;
            int next_y = pos[1] + j;
            if(!isValid(grid, dp, next_x, next_y, dp[pos[0]][pos[1]] + 1))
              continue;
            if(dp[next_x][next_y] > dp[pos[0]][pos[1]] + 1) {
               dp[next_x][next_y] = dp[pos[0]][pos[1]] + 1;
               queue.offer(new int[]{next_x, next_y});
            }
          }
        }
      }
      out.println(dp[tx][ty] >= 1_000_000_000 ? -1 : dp[tx][ty]);
  }

  private static boolean isValid(char[][] grid, int[][] dp, int row, int col, int cnt) {
    if(row < 0 || row >= grid.length || col < 0 || col >= grid[row].length || grid[row][col] == '#')
      return false;
 
    return true;
  }

  public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
 
  public static FastScanner sc = new FastScanner();

  static class FastScanner {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st=new StringTokenizer("");
      String next() {
        while (!st.hasMoreTokens())
          try {
            st=new StringTokenizer(br.readLine());
          } catch (IOException e) {
            e.printStackTrace();
          }
        return st.nextToken();
      }
      
      int nextInt() {
        return Integer.parseInt(next());
      }
      int[] readArray(int n) {
        int[] a=new int[n];
        for (int i=0; i<n; i++) a[i]=nextInt();
        return a;
      }
      long nextLong() {
        return Long.parseLong(next());
      }
  }

}
