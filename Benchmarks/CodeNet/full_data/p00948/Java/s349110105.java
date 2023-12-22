//61511457
import java.util.*;
public class C {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String[] div = str.split(" ", 0);
    int n = Integer.parseInt(div[0]);
    int m = Integer.parseInt(div[1]);
    boolean[][] map = new boolean[n][n];
    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    for(int i = 0; i < n; i++) {
      map[i][i] = true;
    }
    for(int i = 0; i < m; i++) {
      scan = new Scanner(System.in);
      str = scan.nextLine();
      div = str.split(" ", 0);
      int x = Integer.parseInt(div[0]);
      int y = Integer.parseInt(div[1]);
      hm.put(x,y);
      pq.add(x);
    }
    for(int i = 0; i < m; i++) {
      int x = pq.poll();
      int y = hm.get(x);
      //System.out.println(x + " " + y);
      y--;
      for(int j = 0; j < n; j++) {
        map[y][j] = map[y][j] || map[y+1][j];
        map[y+1][j] = map[y][j];
      }
    }
    /*
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        System.out.print(map[i][j]);
      }
      System.out.println();
    }
    */

    for(int i = 0; i < n; i++) {
      int cnt = 0;
      for(int j = 0; j < n; j++) {
        if(map[i][j] == true) {
          cnt++;
        }
      }
      System.out.print(cnt + " ");
    }
    System.out.println();
  }
}