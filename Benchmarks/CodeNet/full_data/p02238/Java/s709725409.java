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
    int time;

    public Graph(int size ) {
      vertices  = new Vertex[size];
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
      for (Vertex v : vertices) {
        if(v.state == Vertex.WHITE)
          depthFirstSearch(v.index);
      }
    }
    public void dispReport() {
      StringBuilder buf = new StringBuilder();

      for (Vertex v : vertices) {
          buf.append(v.id).append(" ")
             .append(v.findTime).append(" ")
             .append(v.doneTime).append("\n");
      }

      System.out.print(buf);
    }
    public int convIdToIndex(int id) {
      return id-1;
    }

    private void depthFirstSearch(int index) {
      vertices[index].state = Vertex.GRAY;
      vertices[index].findTime = ++time;
      
      for(int ajcIndex: vertices[index].ajacent) {
        if(vertices[ajcIndex].state == Vertex.WHITE)
          depthFirstSearch(ajcIndex);
      }
      vertices[index].state = Vertex.BLACK;
      vertices[index].doneTime = ++time;
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

      public Vertex(int id) {
        this.id = id;
        index = id-1;
        state = WHITE;
      }
    }
  }
}
