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
      int id,degree,key,val;
      IntTuple[] ajacent;

      for(int i=0; i<n; i++) {
        vInfo = br.readLine().split(" ");
        id     = Integer.parseInt(vInfo[0]);
        degree = Integer.parseInt(vInfo[1]);
        ajacent = new IntTuple[degree];
        for (int j=0,k=2; j<degree; j++) {
          key = Integer.parseInt(vInfo[k++]);
          val = Integer.parseInt(vInfo[k++]);
          ajacent[j] = new IntTuple(key, val);
        }
        graph.setVertex(id, ajacent);
      }

      graph.calcSSSPWeightSum();

      StringBuilder buf = new StringBuilder();
      for (Vertex v : graph.vertices) {
        buf.append(v.id).append(" ").append(v.minPathCost)
           .append("\n");
      }
      System.out.print(buf);
    }
    catch (IOException e) {
      System.err.println(e);
    }
  }


  class Graph {

    Vertex[] vertices;

    public Graph(int size ) {
      vertices  = new Vertex[size];
    }

    public void setVertex(int id) {
      vertices[id] = new Vertex(id);
    }
    public void setVertex(int id, int[] distance) {
      setVertex(id);
      setAjacent(id, distance);
    }
    public void setVertex(int id, IntTuple[] ajacent) {
      setVertex(id);
      setAjacent(id, ajacent);
    }
    public void setAjacent(int id, int[] distance) {
      vertices[id].distance = distance;
    }
    public void setAjacent(int id, IntTuple[] ajasent) {
      vertices[id].ajacent = ajasent;
    }

    public void calcSSSPWeightSum() {
      algorithmDijkstra(0);
    }

    private void algorithmDijkstra(int s) {
      int minCost;
      int minV;
      vertices[s].minPathCost = 0;
      vertices[s].parent = Vertex.NILL;
      Vertex parent,next;
      IntTuple w;

      while( true ) {
        minCost = Integer.MAX_VALUE;
        minV = Vertex.NILL;

        for (Vertex v : vertices) {
          if( (v.state != Vertex.BLACK) && (v.minPathCost < minCost) ) {
            minV = v.id;
            minCost = v.minPathCost;
          }
        }

        if(minV == Vertex.NILL) break;

        vertices[minV].state = Vertex.BLACK;

        parent = vertices[minV];
        for (int i=0; i<parent.ajacent.length; i++) {
          w = parent.ajacent[i];
          next = vertices[w.key];
          if( (next.state != Vertex.BLACK) &&
              (parent.minPathCost + w.val < next.minPathCost) ) {
            next.minPathCost = parent.minPathCost + w.val;
            next.parent = parent.id;
            next.state = Vertex.GRAY;
          }
        }
        continue;
      }
    }
  }

  class Vertex {

    static final int NILL  =-1;
    static final int WHITE = 0;
    static final int GRAY  = 1;
    static final int BLACK = 2;
    int id;
    int state;
    int minPathCost;
    int parent;
    int[] distance;
    IntTuple[] ajacent;

    public Vertex(int id) {
      this.id = id;
      state = WHITE;
      minPathCost = Integer.MAX_VALUE;
    }
  }

  class IntTuple {
    public int key;
    public int val;

    public IntTuple(int key, int val) {
      this.key = key;
      this.val = val;
    }

    @Override
    public String toString() {
      return "[" + key + "," + val + "]";
    }
  }
}
