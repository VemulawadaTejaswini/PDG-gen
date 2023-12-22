import java.util.*;
import java.io.*;

class Main{
  static boolean found = false;
  static int _ops = 10000000;
  public static void main(String[] args) throws IOException {
    PrintWriter out = new PrintWriter(System.out);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st  = new StringTokenizer(br.readLine());

    int h = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());
    
    st  = new StringTokenizer(br.readLine());

    int cx = Integer.parseInt(st.nextToken())-1;
    int cy = Integer.parseInt(st.nextToken())-1;

    st  = new StringTokenizer(br.readLine());

    int dx = Integer.parseInt(st.nextToken())-1;
    int dy = Integer.parseInt(st.nextToken())-1;


    char[][] grid = new char[h][w];

    for (int i=0; i<h; i++) {
      String s  = (br.readLine());
      for (int j=0; j<w; j++) {
        grid[i][j] = s.charAt(j);
      }
    }

    boolean[][] vis = new boolean[h][w];

    dfs(grid, vis, cx, cy, dx, dy, 0);

    if (!found) {
      _ops = -1;
    }
    out.println(_ops);

    out.close();
  }

  public static void dfs(char[][] grid, boolean[][] vis, int cx, int cy, int dx, int dy, int ops) {
    
    if (cx == dx && cy == dy) {
      found = true;
      _ops = Math.min(ops, _ops);
      return;
    }

    //first check walk
    int[][] dirs = new int[][]{{0,1}, {0,-1}, {-1,0}, {1,0}};

    for (int[] dir: dirs) {
      int cxnew = dir[0]+cx, cynew = dir[1]+cy;
      if (cxnew<0 || cynew<0 || cxnew>=grid.length || cynew>=grid[0].length || grid[cxnew][cynew]=='#' || vis[cxnew][cynew]) {
        continue;
      }
      vis[cxnew][cynew] = true;
      dfs(grid, vis, cxnew, cynew, dx, dy, ops);
      if (found && _ops==0) {
        return;
      }
      vis[cxnew][cynew] = false;

    }
    if (found && _ops<=ops) {
        return;
      }
    //check with magic
    for (int i=cx-2; i<=cx+2; i++) {
      for (int j=cy-2; j<=cy+2; j++) {
        if (i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='#' || vis[i][j]) {
          continue;
        }
        vis[i][j] = true;
        dfs(grid, vis, i, j, dx, dy, ops+1);
        if (found && _ops==0) {
          return;
        }
        vis[i][j] = false;

      }
    }


  }

  
}








