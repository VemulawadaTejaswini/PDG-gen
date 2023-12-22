import java.util.*;
import java.io.*;

class Main{
  public static final int WHITE = 0;
  public static final int BLACK = 2;
  public static final int GRAY =1;
  public static final int INFTY = (int)Double.POSITIVE_INFINITY;
  static int n;
  static int M[][];
  static int d[];
  static StringBuilder bl = new StringBuilder();
  static Queue<Integer>  queue = new ArrayDeque<Integer>();
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    M = new int[n][n];
    d  = new int[n];
    int u,v,k;
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        M[i][j] = 0;
      }
    }

    for(int i =0; i<n; i++){
      u = sc.nextInt();
      k = sc.nextInt();
      for(int j = 0; j<k; j++){
        v = sc.nextInt();
        M[u-1][v-1] = 1;
      }
    }
    bfs(0);
  }

  static void bfs(int s){
    queue.add(s);
    for(int i = 0; i<n; i++){
      d[i] = -1;
    }
    d[s] = 0;
    int u;
    while(queue.peek() != null){
      u = queue.peek();
      queue.remove();
      for(int v = 0; v<n; v++){
        if(M[u][v] == 0)continue;
        if( d[v] != -1)continue;
        d[v] = d[u]+1;
        queue.add(v);
      }
    }

    for(int i = 0; i<n; i++){
      bl.append(i+1).append(" ").append(d[i]).append("\n");
    }
    System.out.print(bl);
  }

}
