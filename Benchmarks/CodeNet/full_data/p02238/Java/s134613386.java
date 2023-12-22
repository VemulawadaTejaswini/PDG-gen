import java.util.*;
import java.io.*;

class Main{
  public static StringBuilder bl = new StringBuilder();
  public static final int WHITE = 0;
  public static final int BLACK = 2;
  public static final int GRAY = 1;
  static int color[];
  static int time;
  static int M[][];
  static int nt[];
  static  int d[]; // 行きの時間 discover;
  static  int f[]; // 帰りの時間 finishing;
  static int n;
  // static Deque<Integer> stack = new ArrayDeque<Integer>();

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    M = new int[n][n];
    color = new int[n];
    d = new int[n];
    f = new int[n];
    nt = new int[n];
    int u, k, v;

    for(int i = 0; i<n; i++){
      for(int j = 0; j<n; j++){
        M[i][j] = 0;
      }
    }

    for(int i = 0; i<n; i++){
      u = sc.nextInt();
      k = sc.nextInt();
      for(int j = 0; j<k; j++){
        v =sc.nextInt();
        M[u-1][v-1] = 1;
      }
    }
    dfs_init();
    System.out.print(bl);
  }

  static void dfs_init(){
    for(int i =0; i<n; i++){
      color[i] = WHITE;
      nt[i] = 0;
    }
    time = 0;
    //  //dfs(0);

    for(int u = 0; u<n; u++){
      if(color[u] == WHITE)dfs(u);
    }

    for(int i = 0; i<n; i++){
      bl.append(i+1).append(" ").append(d[i]).append(" ").append(f[i]).append("\n");
      // System.out.println((i+1)+" "+d[i]+" "+f[i]);
    }

  }

  static void dfs(int r){

    for(int i =0; i<n; i++){
      nt[i] = 0;
    }
    Deque<Integer> stack = new ArrayDeque<Integer>();
    stack.offerFirst(r);
    color[r] = GRAY;
    d[r] = ++time;

    while(stack.peek()!=null){
      int u = stack.getFirst();
      int v = next(u);
      if(v != -1){
        if(color[v] == WHITE){
          color[v] = GRAY;
          d[v] = ++time;
          stack.offerFirst(v);
        }
      }else{
        stack.removeFirst();
        color[u] = BLACK;
        f[u] = ++time;
      }
    }

  }

  //ノードuに隣接しているノードを返す 隣接行列で表現されているのでuの行を探索して1があればその列の添字を返す。
  static int next(int u){
    for(int v = nt[u]; v <n; v++){
      nt[u] = v+1;
      if(M[u][v] == 1) return v;
    }
    return -1;
  }

}
