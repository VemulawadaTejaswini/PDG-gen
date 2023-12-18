import java.util.*;
import java.util.stream.*;
import java.io.*;

class Edge implements Comparable<Edge> {

  int to;
  int fee;
  long time;

  Edge(int to, int fee, long time){
    this.to = to;
    this.fee = fee;
    this.time = time;
  }

  @Override
  public int compareTo(Edge o) {
    if(time > o.time) return 1;
    if(time < o.time) return -1;
    return 0;
  }

}

class Graph {
  public ArrayList<Edge>[] adjacency;

  Graph(int n){
    adjacency = new ArrayList[n];
    for(int i = 0; i < n; i++){
      adjacency[i] = new ArrayList<Edge>();
    }
  }

  public void add_edge(int from, int to, int fee, int time){
    adjacency[from].add(new Edge(to, fee, time));
    adjacency[to].add(new Edge(from, fee, time));        
  }
}

public class Main {

  static int n, m, s, maxFee;
  static int[] c, d;
  static long[] ans;
  static long[][] dp;

  static final long INFL = 0xfffffffffffffffL;

  static Graph g;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    m = Integer.parseInt(in[1]);
    s = Integer.parseInt(in[2]);

    g = new Graph(n);

    int[] a;
    for(int i = 0; i < m; i++){
      in = br.readLine().split(" ");
      a = Stream.of(in).mapToInt(Integer::parseInt).toArray();
      g.add_edge(a[0]-1, a[1]-1, a[2], a[3]);
    }

    c = new int[n];
    d = new int[n];

    for(int i = 0; i < n; i++){
      in = br.readLine().split(" ");
      c[i] = Integer.parseInt(in[0]);
      d[i] = Integer.parseInt(in[1]);
    }
    
    br.close();

    maxFee = (n-1) * 50;
    s = Math.min(maxFee, s);

    dp = new long[n][2525];

    for(int i = 0; i < n; i++){
      Arrays.fill(dp[i], INFL);
    }

    PriorityQueue<Edge> pq = new PriorityQueue<>();
    pq.add(new Edge(0, s, 0));

    while(!pq.isEmpty()){
      Edge e = pq.poll();
      if(dp[e.to][e.fee] <= e.time) continue;

      for(int i = e.fee; i >= 0 && dp[e.to][i] > e.time; i--){
        dp[e.to][i] = e.time;
      }

      int nextFee = Math.min(e.fee + c[e.to], maxFee);
      pq.add(new Edge(e.to, nextFee, e.time + d[e.to]));
      for(Edge nextEdge : g.adjacency[e.to]){
        if(nextEdge.fee > e.fee) continue;
        pq.add(new Edge(nextEdge.to, e.fee - nextEdge.fee, e.time + nextEdge.time));
      }
    }

    for(int i = 1; i < n; i++){
      System.out.println(dp[i][0]);
    }
    
  }

}