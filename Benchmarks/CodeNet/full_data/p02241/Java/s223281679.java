import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      Graph graph = new Graph(n);
      String[] vInfo;
      int[][] weight = new int[n][n];

      for(int i=0, j=0; i<n; i++, j=0) {
        vInfo = br.readLine().split(" ");
        for (String var : vInfo) {
          if(var.equals("")) continue;
          else weight[i][j++] = Integer.parseInt(var);
        }
        graph.setVertex(i, weight[i]);
      }

      System.out.println(graph.calcMSTWeightSum());
    }
    catch (IOException e) {
      System.err.println(e);
    }
  }


  class Graph {

    Vertex[] vertices;
    int cost;

    public Graph(int size ) {
      vertices  = new Vertex[size];
      cost = 0;
    }

    public void setVertex(int id) {
      vertices[id] = new Vertex(id);
    }
    public void setVertex(int id, int[] distance) {
      setVertex(id);
      setAjacent(id, distance);
    }
    public void setAjacent(int id, int[] distance) {
      vertices[id].distance = distance;
    }

    public int calcMSTWeightSum() {
      prim();

      return cost;
    }

    private void prim() {
      int mincost;
      int u;
      vertices[0].d = 0;
      vertices[0].p = -1;

      while( true ) {
        mincost = Integer.MAX_VALUE;
        u = -1;
        for (Vertex v : vertices) {
          if( (v.state != Vertex.BLACK) && (v.d < mincost) ) {
            u = v.id;
            mincost = v.d;
          }
        }

        if(u == -1) break;

        vertices[u].state = Vertex.BLACK;

        for (Vertex v : vertices) {
          if((v.state != Vertex.BLACK) && (v.distance[u] != -1)) {
            if( v.distance[u] < v.d ) {
              v.d = v.distance[u];
              v.p = u;
              v.state = Vertex.GRAY;
            }
          }
        }
        // System.out.println(u);
      }
      for (Vertex v: vertices) {
        if( v.p != -1 ) {
          cost += v.d;
          // System.out.println(v.id + " " + v.distance[v.p] + " " + v.d + " " + v.p);
        }

      }
    }

    class Vertex {

      static final int WHITE = 0;
      static final int GRAY  = 1;
      static final int BLACK = 2;
      int id;
      int state;
      int d;
      int p;
      int[] distance;

      public Vertex(int id) {
        this.id = id;
        state = WHITE;
        d = Integer.MAX_VALUE;
      }
    }
  }
}
