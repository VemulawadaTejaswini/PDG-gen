import java.io.*;
import java.util.*;
public class Main {
 
  public static void main(String[] args) { 
        solve();
      out.close();
  }

  private static void solve() {
      int a = sc.nextInt();
      int res = 1000 - a % 1000;
      out.println(res == 1000 ? 0 : res);
  }

  static int mod = 1_000_000_007;

  public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
 
  public static FastScanner sc = new FastScanner();

  static class FastScanner {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st=new StringTokenizer("");
      String next() {
        while (!st.hasMoreTokens())
          try {
            st=new StringTokenizer(br.readLine());
          } catch (IOException e) {
            e.printStackTrace();
          }
        return st.nextToken();
      }
      
      int nextInt() {
        return Integer.parseInt(next());
      }
      int[] readArray(int n) {
        int[] a=new int[n];
        for (int i=0; i<n; i++) a[i]=nextInt();
        return a;
      }
      long nextLong() {
        return Long.parseLong(next());
      }
  }

  static long pow(long a, long N) {
    if (N == 0) return 1;
    else if (N == 1) return a;
    else {
      long R = pow(a,N/2);
      if (N % 2 == 0) {
        return R*R;
      }
      else {
        return R*R*a;
      }
    }
  }
   
  static long powMod(long a, long N) {
    if (N == 0) return 1;
    else if (N == 1) return a % mod;
    else {
      long R = powMod(a,N/2) % mod;
      R *= R % mod;
      if (N % 2 == 1) {
        R *= a % mod;
      }
        return R % mod;
    }
  }

  static void mergeSort(int[] A){ // low to hi sort, single array only
    int n = A.length;
    if (n < 2) return;
    int[] l = new int[n/2];
    int[] r = new int[n - n/2];

    for (int i = 0; i < n/2; i++){
      l[i] = A[i];
    }

    for (int j = n/2; j < n; j++){
      r[j-n/2] = A[j];
    }

    mergeSort(l);
    mergeSort(r);
    merge(l, r, A);
  }
 
  static void merge(int[] l, int[] r, int[] a){
    int i = 0, j = 0, k = 0;
    while (i < l.length && j < r.length && k < a.length){
      if (l[i] < r[j]){
        a[k] = l[i];
        i++;
      }
      else{
        a[k] = r[j];
        j++;
      }
      k++;
    }
    while (i < l.length){
      a[k] = l[i];
      i++;
      k++;
    }

    while (j < r.length){
      a[k] = r[j];
      j++;
      k++;
    }
  }

  private static class Edge {
    int src;
    int dest;
    int weight;
    public Edge(int s, int d, int w) {
      this.src = s;
      this.dest = d;
      this.weight = w;
    }
  }
  private static int[] prim(Map<Integer, List<Edge>> graph) {
      int n = graph.size(); // number of the nodes
      Edge[] edges = new Edge[n];
      for(int i = 0; i < n; i++)
        edges[i] = new Edge(-1, i, Integer.MAX_VALUE);
      edges[0].weight = 0;

      int[] parents = new int[n];
      parents[0] = -1;

      TreeSet<Edge> treeSet = new TreeSet<>((a, b) -> a.weight - b.weight);
      treeSet.add(edges[0]);

      boolean[] visited = new boolean[n];
      while(treeSet.size() > 0) {
        Edge e = treeSet.pollFirst();
        visited[e.dest] = true;
        for(Edge child : graph.get(e.dest)) {
          if(visited[child.dest]) continue;
          if(edges[child.dest].weight > child.weight) {
            treeSet.remove(edges[child.dest]);
            edges[child.dest].weight = child.weight;
            treeSet.add(edges[child.dest]);
            parents[child.dest] = e.dest;
          }
        }
      }
      return parents;
  }

  private static Edge[] kruskal(int v, Edge[] edges) {
    Edge[] res = new Edge[v-1];

    int[] p = new int[v];
    for(int i = 0; i < v; i++) 
      p[i] = i;

    int[] rank = new int[v];
    Arrays.fill(rank, 1);

    Arrays.sort(edges, (e1, e2) -> e1.weight - e2.weight);
    for(int i = 0, idx = 0; i < res.length;) {
      Edge e = edges[idx++];
      if(union(p, rank, e.src, e.dest)) {
        res[i++] = e;
      }
    }
    return res;
  }

  private static boolean union(int[] root, int[] rank, int u, int v) {
      int rootA = find(root, u);
      int rootB = find(root, v);
      if(rootA == rootB) return false;

      if(rank[rootA] > rank[rootB]) {
        rank[rootA] += rank[rootB];
        root[rootB] = rootA;
      } else {
        rank[rootB] += rank[rootA];
        root[rootA] = rootB;
      }
      return true;
  }

  private static int find(int[] root, int node) {
    if(root[node] != node) {
      root[node] = find(root, root[node]);
    }
    return root[node];
  }
}