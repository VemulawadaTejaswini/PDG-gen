import java.util.*;
import java.io.*;

class Main{
  static final int INF = 2147483647;
   public static void main(String args[]){
     int[][] adj;
     int i,j,k=0,n,num,ans,e,v;
     int s=0;
     int[] g;
     Scanner scan = new Scanner(System.in);
     n = scan.nextInt();
     adj = new int[n*n][3];
     @SuppressWarnings("unchecked")
     List<Edge>[] edges = new List[n*n];
     g = new int[n];

       for(i=0;i<n;i++){
         g[i] = scan.nextInt();
         e = scan.nextInt();
         for(j=0;j<e;j++){
           v = scan.nextInt();
           num = scan.nextInt();
             adj[k][0] = i;
             adj[k][1] = v;
             adj[k][2] = num;
             k++;
         }
       }
        for(i=0;i<k;i++) {
            edges[i] = new ArrayList<Edge>();
        }

        for(i=0;i<k;i++) {
            edges[adj[i][0]].add(new Edge(adj[i][0], adj[i][1], adj[i][2]));
          //  edges[adj[i][1]].add(new Edge(adj[i][1], adj[i][0], adj[i][2]));
        }
        for(i=0;i<n;i++){
        ans = dij(n, edges,s,g[i]);
        System.out.println(g[i]+" "+ans);
      }
  }

    static int dij(int n, List<Edge>[] edges, int s, int g) {

      int[] distance = new int[n];
        Arrays.fill(distance, INF);
        distance[s] = 0;

        Queue<Edge> q = new PriorityQueue<Edge>();
        q.add(new Edge(s, s, 0));

        while (!q.isEmpty()) {
            Edge e = q.poll();
            if (distance[e.target] < e.cost) {
                continue;
            }
            for (Edge v : edges[e.target]) {
                if (distance[v.target] > distance[e.target] + v.cost) {
                    distance[v.target] = distance[e.target] + v.cost;
                    q.add(new Edge(e.target, v.target, distance[v.target]));
                }
            }
        }
        return distance[g];
    }

  static class Edge implements Comparable<Edge> {
          public int source = 0;
          public int target = 0;
          public int cost = 0;

          public Edge(int source, int target, int cost) {
              this.source = source;
              this.target = target;
              this.cost = cost;
          }

        public int compareTo(Edge o) {
              return this.cost - o.cost;
          }
      }
}

