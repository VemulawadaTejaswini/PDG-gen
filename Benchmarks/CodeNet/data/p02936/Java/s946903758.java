import java.util.*;
import java.io.*;
 
public class Main {
 
  private static void solve() {
    int n = nextInt();
    int q = nextInt();
    
    Map<Integer, List<Integer>> map = new HashMap<>();
    
    for (int i = 0; i < n; i++) {
      int a = nextInt() - 1;
      int b = nextInt() - 1;
      
      map.computeIfAbsent(a, (k) -> new ArrayList<>()).add(b);
      map.computeIfAbsent(b, (k) -> new ArrayList<>()).add(a);
    }
    
    long[] value = new long[n];
    long[] ans = new long[n];
    
    for (int i = 0; i < n - 1; i++) {
      int p = nextInt() - 1;
      int x = nextInt();
      
      value[p] += x;
    }
    
    
    preOrder(0, -1, map, value, ans, 0);
    
    for (int i = 0; i < q; i++) {
      out.print(ans[i] + " ");
    }
    out.println();
  }
  
  private static void preOrder(int root, 
                               int parent, 
                               Map<Integer, List<Integer>> map, 
                               long[] value,
                               long[] ans, long curValue) {
    ans[root] = curValue + value[root];
    
    List<Integer> ch = map.get(root);
    
    if (ch == null || ch.isEmpty()) return;
    
    for (int chId : ch) {
      if (chId != parent) {
        preOrder(chId, root, map, value, ans, ans[root]);
      }
    }   
  }
                               
  private static void run() {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out);
 
    solve();
 
    out.close();
  }
 
  private static StringTokenizer st;
  private static BufferedReader br;
  private static PrintWriter out;
 
  private static String next() {
    while (st == null || !st.hasMoreElements()) {
      String s;
      try {
        s = br.readLine();
      } catch (IOException e) {
        return null;
      }
      st = new StringTokenizer(s);
    }
    return st.nextToken();
  }
 
  private static int nextInt() {
    return Integer.parseInt(next())a;
  }
 
  private static long nextLong() {
    return Long.parseLong(next());
  }
 
  public static void main(String[] args) {
    run();
  }
}