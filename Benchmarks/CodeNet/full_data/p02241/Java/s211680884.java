import java.util.*;
import java.io.*;

class Main{

  public static int n;
  public static int M[][];
  public static final int WHITE = 0;
  public static final int GRAY = 1;
  public static final int BLACK = 2;
  public static final int INF = (int)Double.POSITIVE_INFINITY;

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int e=0;
    n = sc.nextInt();
    M = new int[n][n];
    // int color[] = new int[n];
    // int d[] = new int[n];
    // int p[] = new int[n];

    for(int i = 0; i<n; i++){
      for(int j = 0; j<n; j++){
        e = sc.nextInt();
        M[i][j] = (e == -1) ? INF : e;
      }
    }

    System.out.println(prim());

  }
  static int prim(){
    int u, minv =  INF;
    int d[] = new int[n];//Tに属する頂点とV-Tに属する頂点をつなぐ編の中で、重みが最小の編の重みを記録する。
    int p[] = new int[n];//MSTにおける頂点vの親を記録していく。
    int color[] = new int[n];

    for(int i = 0; i<n; i++){
      d[i] = INF;
      p[i] = -1;
      color[i] = WHITE;
    }
    d[0] = 0;

    while(true){
      minv = INF;
      u = -1;

      for(int i = 0; i<n; i++){
        if(minv > d[i] && color[i] != BLACK){//最小の辺を見つける。初めはd[0]=0の点が始点となる。すでに探索しておらず。一番小さいものかつINFになっていない、つまりグレイになっていないということ。
          u = i;
          minv = d[i];
        }
      }

      if( u == -1)break;//見つからなければループ終了。
      color[u] = BLACK;//見つかればその辺を黒にする。

      for(int v = 0; v <n; v++){
        if(color[v] !=BLACK && M[u][v] != INF){//黒くしたノードに繋がっているかつ黒じゃない//見つけた最小の辺の後続点につながる小さい辺を見つけ、親に見つけた最小の辺の後続点を記録し、GRAYにする。
          if(d[v] > M[u][v]){
            d[v] = M[u][v];
            p[v] = u;
            color[v] = GRAY;
          }
        }
      }

    }
    int sum = 0;
    for(int i = 0; i<n; i++){
      if(p[i] != -1) sum += M[i][p[i]];
    }
    return sum;
  }
}
