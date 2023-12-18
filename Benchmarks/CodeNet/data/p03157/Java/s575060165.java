import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    char[][] m = new char[H][W];
    for (int i = 0; i < H; i++) {
      String s = sc.next();
      for (int j = 0; j < W; j++) {
        m[i][j] = s.charAt(j);
      }
    }
    
    int count = 0;
    for (int s = 0; s < H*W; s++) {
      int si = s/W;
      int sj = s%W;
      boolean[][] visit = new boolean[H][W];
      LinkedList<Point> q = new LinkedList<>();
      q.offer(new Point(si,sj));
      visit[si][sj] = true;
      while (!q.isEmpty()) {
        Point p = q.poll();
        for (int d = 0; d < 4; d++) {
          int i = p.i+di[d];
          int j = p.j+dj[d];
          if (0 <= i && i < H
             && 0 <= j && j < W
             && !visit[i][j]) {
            visit[i][j] = true;
            if (m[p.i][p.j] != m[i][j]) {
              if (m[si][sj] != m[i][j]) {
                count++;
              }
              //System.out.println(si+","+sj+" "+i+","+j);
              q.add(new Point(i,j));
            }
          }
        }
      }
    }
    System.out.println(count/2);
  }
  private static int[] di = {0,0,1,-1};
  private static int[] dj = {1,-1,0,0};
  private static class Point {
    private final int i;
    private final int j;
    Point(int i, int j) {
      this.i = i;
      this.j = j;
    }
  }
}