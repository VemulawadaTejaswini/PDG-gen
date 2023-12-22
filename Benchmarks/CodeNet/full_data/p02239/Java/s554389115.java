import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      Graph graph = new Graph(n);
      int[] ajacent;
      String[] vInfo;
      int id,degree;

      for(int i=0; i<n; i++) {
        vInfo  = br.readLine().split(" ");
        id     = Integer.parseInt(vInfo[0]);
        degree = Integer.parseInt(vInfo[1]);
        ajacent = new int[degree];
        for(int j=0; j<degree; j++) {
          ajacent[j] = graph.convIdToIndex( Integer.parseInt(vInfo[j+2]) );
        }
        graph.setVertex(id, ajacent);
      }

      graph.vertexSearch();

      graph.dispReport();
    }
    catch (IOException e) {
      System.err.println(e);
    }
  }

  class Graph {

    Vertex[] vertices;
    Queue<Vertex> queue;
    int time;

    public Graph(int size ) {
      vertices  = new Vertex[size];
      queue = new ArrayDeque<>(size);
      time = 0;
    }

    public void setVertex(int id) {
      vertices[convIdToIndex(id)] = new Vertex(id);
    }
    public void setVertex(int id, int[] ajacent) {
      setVertex(id);
      setAjacent(id, ajacent);
    }
    public void setAjacent(int id, int[] ajacent) {
      vertices[convIdToIndex(id)].ajacent = ajacent;
    }
    public void vertexSearch() {
      breadthFirstSearch(0);
    }
    public void dispReport() {
      StringBuilder buf = new StringBuilder();

      for (Vertex v : vertices) {
          buf.append(v.id).append(" ")
             .append(v.distance).append("\n");
      }

      System.out.print(buf);
    }
    public int convIdToIndex(int id) {
      return id-1;
    }

    private void breadthFirstSearch(int index) {
      vertices[index].state = Vertex.GRAY;
      vertices[index].distance = 0;
      queue.offer(vertices[index]);

      Vertex v;
      while(queue.size() != 0) {
        v = queue.poll();
        for (int ajcIndex : v.ajacent) {
          if(vertices[ajcIndex].state == Vertex.WHITE) {
            vertices[ajcIndex].state = Vertex.GRAY;
            vertices[ajcIndex].distance = v.distance + 1;
            queue.offer(vertices[ajcIndex]);
          }
        }
        v.state = Vertex.BLACK;
      }
    }

    class Vertex {

      static final int WHITE = 0;
      static final int GRAY  = 1;
      static final int BLACK = 2;
      int id;
      int index;
      int state;
      int[] ajacent;
      int findTime;
      int doneTime;
      int distance;

      public Vertex(int id) {
        this.id = id;
        index = id-1;
        state = WHITE;
        distance = -1;
      }
    }
  }
}
