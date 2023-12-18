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

  public void add_edge(int from, int to, boolean isDirected){
    adjacency[from].add(to);
    if(!isDirected){
      adjacency[to].add(from);
    }        
  }
}

public class Main {

  static Graph g;

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");
    int n = Integer.parseInt(in[0]);
    int m = Integer.parseInt(in[1]);
    int e = n + m - 1;

    g = new Graph(n);
    int[] inCnt = new int[n];

    for(int i = 0; i < e; i++){
      in = br.readLine().split(" ");
      int a = Integer.parseInt(in[0])-1;
      int b = Integer.parseInt(in[1])-1;
      g.add_edge(a, b, true);
      inCnt[b]++;
    }
    
    br.close();

    Queue<Integer> que = new ArrayDeque<>();

    int[] parent = new int[n];

    for(int i = 0; i < n; i++){
      if(inCnt[i] == 0){
        parent[i] = -1;
        que.add(i);
        break;
      }
    }

    while(!que.isEmpty()){
      int cur = que.poll();
      for(int nex : g.adjacency[cur]){
        inCnt[nex]--;
        if(inCnt[nex] == 0){
          que.add(nex);
          parent[nex] = cur;
        }
      }
    }

    for(int i = 0; i < n; i++){
      System.out.println(parent[i]+1);
    }
  }
}