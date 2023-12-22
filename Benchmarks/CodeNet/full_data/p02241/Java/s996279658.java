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
          if(j=0) j++;
          else weight[i][j++] = Integer.parseInt(var);
        }
        graph.setVertex(i, weight[i]);
      }
/* 
      StringBuilder buf = new StringBuilder();
      for (int[] vector : weight) {
        for (int i : vector) {
          if(i < 0) buf.append(i).append(" ");
          else buf.append(" ").append(i).append(" ");
        }
        buf.append("\n");
      }

      System.out.print(buf); */

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
    public void vertexSearch() {
      for (Vertex v : vertices) {
        if(v.state == Vertex.WHITE)
          depthFirstSearch(v.id);
      }
    }

    public int calcMSTWeightSum() {
      depthFirstSearch(0);
      depthFirstSearch(0);

      return cost;
    }

    private void depthFirstSearch(int id) {
      vertices[id].state = Vertex.GRAY;
      int min = Integer.MAX_VALUE;
      int ajacent=-1;
      int cnt=0;
      boolean exsit = false;
      
      for(int d: vertices[id].distance) {
        if( ( d!=-1 ) && ( d<min ) ) {
          if( vertices[cnt].state == Vertex.WHITE ){
            min = d;
            ajacent = cnt;
            exsit = true;
          }
          else if(vertices[id].state == Vertex.WHITE) {
            min = d;
            ajacent = id;
            exsit = true;
          }
        }
        cnt++;
      }
      if(exsit){
        cost += min;
        depthFirstSearch(ajacent);
      }
      vertices[id].state = Vertex.BLACK;
    }

/*     public void prim() {
      int mincost;

      while( true ) {
        mincost = Integer.MAX_VALUE;
        for(Vertex v: vertices) {
          if( (v.state != Vertex.BLACK) && (v.distance < mincost) ) {
            mincost = v.distance;
          }
        }
      }
    } */

    class Vertex {

      static final int WHITE = 0;
      static final int GRAY  = 1;
      static final int BLACK = 2;
      int id;
      int state;
      int[] distance;

      public Vertex(int id) {
        this.id = id;
        state = WHITE;
      }
    }
  }
}
