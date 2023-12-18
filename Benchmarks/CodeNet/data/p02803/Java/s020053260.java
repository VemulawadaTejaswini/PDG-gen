import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();

    char[][] mtx = new char[H][W];

    for (int i = 0; i < H; i++) {
      mtx[i]= sc.next().toCharArray();
    }

//    System.out.println(bfs(mtx,2,0,0,4));
//    if(mtx !=null) return;
    int ans = H-1+W-1;
    for (int i = 0; i < H*W ; i++) {//Start
      int r1 = i/W;int c1 = i%W;
      if(mtx[r1][c1]=='#') continue;
      for (int j = 0; j < H*W; j++) {//Goal
        int r2 = j/W;int c2 = j%W;
        if(mtx[r2][c2]=='#') continue;

        int steps = bfs(mtx,r1,c1,r2,c2);
        ans= Math.max(steps,ans);
      }
    }

    System.out.println(ans);
  }
  static
  int bfs(char[][] mtx, int r1,int c1, int r2,int c2){
    int[][] adj = {{-1,0},{1,0},{0,-1},{0,1}};
    Queue<String> q = new LinkedList<>();
    Map<String,Integer> m = new HashMap<>();
    Set<String> visited = new HashSet<>();
    String start = r1+" "+c1;
    String goal = r2+" "+c2;
    visited.add(start);
    q.offer(start);
    m.put(start,0);

    int steps=0;
    while(!q.isEmpty()){
      String s = q.remove();
      int step = m.get(s);

      if(s.equals(goal)) return step;
      String[]  rc = s.split(" ");
      int r = Integer.parseInt(rc[0]);
      int c = Integer.parseInt(rc[1]);


      for (int i = 0; i < adj.length; i++) {
        int rr = r + adj[i][0];
        int cc = c + adj[i][1];

        if(rr>=0 && rr<mtx.length && cc >=0 && cc <mtx[0].length && !visited.contains(rc) && mtx[rr][cc]=='.'){
          int[] newPath = new int[2];
          newPath[0]= rr;
          newPath[1]= cc;
          String rrcc =rr+" "+cc;
          q.offer(rrcc);
          visited.add(rrcc);
          m.put(rrcc,step+1);
        }


      }


    }

    return -1;
  }


}
