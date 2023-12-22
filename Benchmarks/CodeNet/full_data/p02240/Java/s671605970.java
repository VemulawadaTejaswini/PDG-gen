import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String[] nm = br.readLine().split(" ");
      int n = Integer.parseInt(nm[0]);
      int m = Integer.parseInt(nm[1]);
      Graph graph = new Graph(n);
      String[] vInfo;
      int idS,idT;

      for(int i=0; i<m; i++) {
        vInfo = br.readLine().split(" ");
        idS   = Integer.parseInt(vInfo[0]);
        idT   = Integer.parseInt(vInfo[1]);
        graph.setAjacentList(idS, idT);
        graph.setAjacentList(idT, idS);
      }
      graph.vertexSearch();

      int q = Integer.parseInt(br.readLine());
      StringBuilder buf = new StringBuilder();
      for(int i=0; i<q; i++) {
        vInfo = br.readLine().split(" ");
        idS   = Integer.parseInt(vInfo[0]);
        idT   = Integer.parseInt(vInfo[1]);
        buf.append(graph.isConnected(idS, idT) ? "yes" : "no")
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
    Queue<Vertex> queue;
    int time;

    public Graph(int size ) {
      vertices  = new Vertex[size];
      queue = new ArrayDeque<>(size);
      time = 0;
      for (int i=0; i<size; i++) {
        vertices[i] = new Vertex(i);
      }
    }

    public void setVertex(int id) {
      vertices[convIdToIndex(id)] = new Vertex(id);
    }
    public void setAjacentList(int id, int ajacent) {
      vertices[convIdToIndex(id)].ajacent
      .add(convIdToIndex(ajacent));
    }
    public void vertexSearch() {
      int color = 10;

      for (Vertex v : vertices) {
        if(v.state == Vertex.WHITE)
        GroupingByBFS(v.index,color++);
      }
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
      return id - Vertex. DIFF_ID_INDEX;
    }
    public boolean isConnected(int idS, int idT) {
      return vertices[idS].state == vertices[idT].state;
    }

    private void GroupingByBFS(int index, int color) {
      vertices[index].state = Vertex.GRAY;
      vertices[index].distance = 0;
      queue.offer(vertices[index]);

      Vertex v;
      while(queue.peek() != null) {
        v = queue.poll();
        for (int ajcIndex : v.ajacent) {
          if(vertices[ajcIndex].state == Vertex.WHITE) {
            vertices[ajcIndex].state = Vertex.GRAY;
            vertices[ajcIndex].distance = v.distance + 1;
            queue.offer(vertices[ajcIndex]);
          }
        }
        v.state =color;
      }
    }

    class Vertex {

      static final int WHITE = 0;
      static final int GRAY  = 1;
      static final int BLACK = 2;
      static final int DIFF_ID_INDEX = 0;
      int id;
      int index;
      int state;
      List<Integer> ajacent;
      int findTime;
      int doneTime;
      int distance;

      public Vertex(int id) {
        this.id = id;
        index = id-DIFF_ID_INDEX;
        state = WHITE;
        distance = -1;
        ajacent = new LinkedList<>();
      }
    }
  }
}
