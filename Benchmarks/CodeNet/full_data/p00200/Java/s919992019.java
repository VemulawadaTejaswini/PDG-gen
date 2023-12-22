import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
public class Main{
  public void run(java.io.InputStream in,java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    java.util.List<Edge>[] g;
    int n, m, k, i, j, a, b, c, t, p, q, r;
    Edge e;
    Vertex now;
    Vertex[] v;

    n = sc.nextInt(); m = sc.nextInt();
    g = new java.util.List[m];
    v = new Vertex[m];
    for(i = 0;i < m;i++)v[i] = new Vertex(i, 0, false);

    for(i = 0;i < g.length;++i){
      g[i] = new java.util.ArrayList<Edge>();
      g[i].add(new Edge(i, 0, 0));
    }

    for(i = 0;i < n;++i){
      a = sc.nextInt() - 1; b = sc.nextInt() - 1;
      c = sc.nextInt(); t = sc.nextInt();
      g[a].add(new Edge(b, c, t));
      g[b].add(new Edge(a, c, t));
    }

    k = sc.nextInt();
    for(j = 0;j < k;++j){
      p = sc.nextInt() - 1; q = sc.nextInt() - 1; r = sc.nextInt();
      PriorityQueue<Vertex> lis = new PriorityQueue<Vertex>(new MyComp());
      for(i = 0;i < m;i++){
        v[i].x = 314159265; v[i].visited = false;
      }
      v[p].x = 0;
      lis.add(v[p]);
      now = new Vertex(0, 0, false);
      if(r == 0){
        for(;!lis.isEmpty();){
          now = lis.poll();
          if(now.visited)continue;
          if(now.id == q)break;
          e = g[now.id].get(0);
          v[e.d].visited = true;
          for(i = 1;i < g[now.id].size();i++){
            e = g[now.id].get(i);
            if(v[e.d].x > now.x + e.c)v[e.d].x = now.x + e.c;
            lis.add(v[e.d]);
          }
        }
      }else{
        for(;!lis.isEmpty();){
          now = lis.poll();
          if(now.visited)continue;
          if(now.id == q)break;
          e = g[now.id].get(0);
          v[e.d].visited = true;
          for(i = 1;i < g[now.id].size();i++){
            e = g[now.id].get(i);
            if(v[e.d].x > now.x + e.t)v[e.d].x = now.x + e.t;
            lis.add(v[e.d]);
          }
        }
      }
      out.println(now.x);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static class Edge{
    public int d, c ,t;
    public Edge(int d, int c, int t){
      this.d = d; this.c = c; this.t = t;
    }
  }
  private static class Vertex{
    public int id, x;
    public boolean visited;
    public Vertex(int id, int x, boolean visited){
      this.id = id; this.x = x; this.visited = visited;
    }
  }
  private static class MyComp implements Comparator<Vertex>{
    public int compare(Vertex v1, Vertex v2){
      if(v1.x > v2.x)return 1;
      if(v1.x < v2.x)return -1;
      return 0;
    }
  }
}