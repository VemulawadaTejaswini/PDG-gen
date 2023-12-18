import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      
      int[][] edges = new int[n][2];
      Set<Integer> xs = new HashSet<>();
      Set<Integer> ys = new HashSet<>();
      for(int i = 0; i < n; i++) {
        edges[i][0] = sc.nextInt();
        edges[i][1] = sc.nextInt();
        xs.add(edges[i][0]);
        ys.add(edges[i][1]);
      }

      long area = Long.MAX_VALUE;
      int cnt = 0;

      for(int xP : xs) {
          for(int yP: ys) {
              for(int j = 0; j < edges.length; j++) {
                  cnt = 0;
                  long sX = Math.min(xP,  edges[j][0]), sY = Math.min(yP, edges[j][1]);
                  long eX = Math.max(xP, edges[j][0]), eY = Math.max(yP, edges[j][1]);
                  for(int m = 0; m < edges.length; m++) {
                      long x = edges[m][0], y = edges[m][1];
                      if(sX <= x && x <= eX && sY <= y && y <= eY)
                        cnt++;
                  }
                  if(cnt >= k)
                      area = Math.min(area, (long)(eX - sX) * (long)(eY - sY));
              }
          }

      }

      System.out.println(area);
  }
}

