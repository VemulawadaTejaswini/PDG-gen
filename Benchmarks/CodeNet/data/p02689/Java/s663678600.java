import java.util.*;
import java.util.stream.*;
import java.io.*;

class Graph {
  public ArrayList<Integer>[] adjacency;

  Graph(int n){
    adjacency = new ArrayList[n];
    for(int i = 0; i < n; i++){
      adjacency[i] = new ArrayList<Integer>();
    }
  }

  public void add_edge(int from, int to, boolean is_directed){
    adjacency[from].add(to);
    if(!is_directed){
      adjacency[to].add(from);
    }        
  }
}

public class Main {

  static int n, m, ans;
  static int[] h;

  static Graph g;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    m = Integer.parseInt(in[1]);

    in = br.readLine().split(" ");
    h = Stream.of(in).mapToInt(Integer::parseInt).toArray();

    g = new Graph(n);

    for(int i = 0; i < m; i++){
      in = br.readLine().split(" ");
      g.add_edge(Integer.parseInt(in[0]) - 1, Integer.parseInt(in[1]) - 1, false);
    }
    
    br.close();

    ans = 0;

    for(int i = 0; i < n; i++){
      boolean good = true;
      for(int nex : g.adjacency[i]){
        if(h[i] <= h[nex]) good = false;
      }

      if(good) ans++;
    }

    PrintWriter out = new PrintWriter(System.out);
    out.println(ans);
    out.flush();

  }
}