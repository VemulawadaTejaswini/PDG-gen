import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

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
    Queue<IntTuple> queue;

    public Graph(int size ) {
      vertices  = new Vertex[size];
      queue = new PriorityQueue<>(size);
    }

    public void setVertex(int id) {
      vertices[id] = new Vertex(id);
    }
    public void setVertex(int id, IntTuple[] ajacent) {
      setVertex(id);
      setAjacent(id, ajacent);
    }
    public void setAjacent(int id, IntTuple[] ajasent) {
      vertices[id].ajacent = ajasent;
    }

    public void calcSSSPWeightSum() {
      algorithmDijkstra(0);
    }

    private void algorithmDijkstra(int s) {
      vertices[s].minPathCost = 0;
      Vertex current,next;
      queue.offer(new IntTuple(vertices[s].id, vertices[s].minPathCost));
      vertices[s].state = Vertex.GRAY;

      IntTuple v;
      while( (v = queue.poll()) != null ) {
        vertices[v.key].state = Vertex.BLACK;

        if(vertices[v.key].minPathCost < v.val) continue;
        
        current = vertices[v.key];
        for (IntTuple w: current.ajacent) {
          next = vertices[w.key];
          if( (next.state != Vertex.BLACK) &&
              (current.minPathCost + w.val < next.minPathCost) ) {
            next.minPathCost = current.minPathCost + w.val;
            queue.offer(new IntTuple(next.id, next.minPathCost));
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
    IntTuple[] ajacent;

    public Vertex(int id) {
      this.id = id;
      state = WHITE;
      minPathCost = Integer.MAX_VALUE;
    }
  }

  class IntTuple implements Comparable<IntTuple> {
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
    @Override
    public int compareTo(IntTuple obj) {
      if(this.val == obj.val) return 0;

      return this.val > obj.val ? 1 : -1;
    }
  }
}
