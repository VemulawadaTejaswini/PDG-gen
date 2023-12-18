import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = Integer.parseInt(sc.next());
    int W = Integer.parseInt(sc.next());
    sc.nextLine();
    int[][] map = new int[H+2][W+2];
    for(int i=1;i<=H;i++){
      String str = sc.nextLine();
      for(int j=1;j<=W;j++){
        map[i][j] = str.charAt(j-1)=='#'?0:1;
      }
    }
    int ans = 0;
    int[] nexts = new int[]{0,1,0,-1,0};
    for(int i=1;i<=H;i++){
      for(int j=1;j<=W;j++){
        if(map[i][j] == 1){
          int[][] costs = new int[H+2][W+2];
          PriorityQueue<Point> pq = new PriorityQueue<Point>((a,b)->{
            return a.c-b.c;
          });
          pq.add(new Point(i,j,1));
          costs[i][j] = 1;
          while(!pq.isEmpty()){
            Point now = pq.poll();
            for(int n=0;n<4;n++){
              int nexth = now.h+nexts[n];
              int nextw = now.w+nexts[n+1];
              if(map[nexth][nextw] == 1){
                if(costs[nexth][nextw] == 0 || costs[nexth][nextw] > now.c+1){
                  costs[nexth][nextw] = now.c+1;
                  pq.add(new Point(nexth, nextw, now.c+1));
                  ans = Math.max(ans, now.c+1);
                }
              }
            }
          }
        }
      }
    }
    System.out.println(ans-1);
  }

  static class Point{
    public int h,w,c;
    Point(int h, int w, int c){
      this.h = h;
      this.w = w;
      this.c = c;
    }
  }

}
