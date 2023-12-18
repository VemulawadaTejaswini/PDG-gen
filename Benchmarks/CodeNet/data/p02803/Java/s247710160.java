import java.util.*;

public class Main {
  public static String[][] maze;
  public static int[][] kyori;
  public static int[][] seen;
  public static int h;
  public static int w;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    h = sc.nextInt();
    w = sc.nextInt();
    maze = new String[h][w];
    for(int i = 0; i < h; i++) {
      String s = sc.next();
      for(int j = 0; j < w; j++) {
        maze[i][j] = String.valueOf(s.charAt(j));
      }
    }
    kyori = new int[h][w];
    seen = new int[h][w];
    int ans = 0;
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        for(int k = 0; k < h; k++) {
          for(int l = 0; l < w; l++) {
            if((i != k) || (j != l)) {
              if((maze[i][j].equals(".")) && (maze[k][l].equals("."))) {
                int[] s = new int[2];
                int[] t = new int[2];
                s[0] = i;
                s[1] = j;
                t[0] = k;
                t[1] = l;
                ans = Math.max(ans, bfs(s, t));
              }
            }
          }
        }
      }
    }
    System.out.println(ans);
  }
  public static int bfs(int[] st, int[] gl) {
    Queue<int[]> que = new LinkedList<int[]>();
    que.add(st);
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        kyori[i][j] = 1000;
      }
    }
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        seen[i][j] = 0;
      }
    }
    kyori[st[0]][st[1]] = 0;
    seen[st[0]][st[1]] = 1;
    while(!que.isEmpty()) {
      int[] a = que.poll();
      for(int i = -1; i <= 1; i++) {
        for(int j = -1; j <= 1; j++) {
          int x = a[0] + i;
          int y = a[1] + j;
          int d = kyori[a[0]][a[1]];
          int[] b = new int[2];
          b[0] = x;
          b[1] = y;
          if((x >= 0) && (x < h) && (y >= 0) && (y < w) && (seen[x][y] == 0) && (maze[x][y].equals("."))) {
            if(i == -1) {
              if(j == 0) {
                seen[x][y] = 1;
                kyori[x][y] = d + 1;
                que.add(b);
              }
            } else if(i == 0) {
              if(j != 0) {
                seen[x][y] = 1;
                kyori[x][y] = d + 1;
                que.add(b);
              }
            } else {
              if(j == 0) {
                seen[x][y] = 1;
                kyori[x][y] = d + 1;
                que.add(b);
              }
            } 
          }
        }
      }
    }
    return kyori[gl[0]][gl[1]];
  }
}
