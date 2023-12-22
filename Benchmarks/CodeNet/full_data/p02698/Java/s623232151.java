import java.util.*;
import java.util.stream.*;
import java.io.*;

class Ele {
  int ori;
  int idx;

  Ele(int ori, int idx){
    this.ori = ori;
    this.idx = idx;
  }
}

class Graph {
  public ArrayList< ArrayList<Integer> > adjacency;

  Graph(int n){
    adjacency = new ArrayList< ArrayList<Integer> >();
    for(int i = 0; i < n; i++){
      adjacency.add(new ArrayList<Integer>());
    }
  }

  public void add_edge(int from, int to, boolean is_directed){
    adjacency.get(from).add(to);
    if(!is_directed){
      adjacency.get(to).add(from);
    }
  }
}


public class Main {
  
  static final int INF = 1000000001;

  static int n;
  static int[] a, lis, ans;
  static boolean[] seen;

  static Deque<Ele> st = new ArrayDeque<>();

  static Graph g;
  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);

    g = new Graph(n);

    in = br.readLine().split(" ");
    a = Stream.of(in).mapToInt(Integer::parseInt).toArray();

    for(int i = 0; i < n-1; i++){
      in = br.readLine().split(" ");
      g.add_edge(Integer.parseInt(in[0]) - 1, Integer.parseInt(in[1]) - 1, false);
    }

    br.close();

    lis = new int[n+1];
    ans = new int[n];
    seen = new boolean[n];

    Arrays.fill(lis, INF);
    lis[0] = -INF;

    dfs(0, 0);

    PrintWriter out = new PrintWriter(System.out);

    for(int i = 0; i < n; i++){
      out.println(ans[i]);
    }
    out.flush();
  }

  static int binarySearch(int x, int maxIdx){
    int left = 0; int right = maxIdx + 1;
    while(right - left > 1){
      int mid = (right + left) / 2;
      if(lis[mid] < x) left = mid;
      else right = mid;
    }
    st.push(new Ele(lis[right], right));
    lis[right] = x;
    
    return right;
  }

  static void dfs(int now, int idx){
    
    idx = Math.max(idx, binarySearch(a[now], idx));

    ans[now] = idx;
    seen[now] = true;

    for(int nex : g.adjacency.get(now)){
      if(seen[nex]) continue;
      dfs(nex, idx);
    }

    Ele forRet = st.poll();
    lis[forRet.idx] = forRet.ori;
    
    return;
  }

}