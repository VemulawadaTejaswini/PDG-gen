import java.util.*;

public class Main {
  static boolean[] flg;
  static ArrayList[] edge;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    flg = new boolean[N + 1];
    edge = new ArrayList[N + 1];
    for(int i = 1; i < N + 1; i++) {
      edge[i] = new ArrayList<Integer>();
    }
    for(int i = 0; i < N - 1; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      edge[x].add(y);
      edge[y].add(x);
    }
    String ans = "Alice";
    if(dfs(1) == 0) ans = "Bob";
    System.out.println(ans);
  }

  public static int dfs(int v) {
    flg[v] = true;
    ArrayList<Integer> list = edge[v];
    int num = 0;
    int ret = 0;
    int w = 0;
    for(int i = 0; i < list.size(); i++) {
      int u = list.get(i);
      if(!flg[u]) {
        num++;
        w = u;
        ret = (ret ^ (dfs(u) + 1));
      }
    }
    if(num == 0) {
      return 0;
    } else if(num == 1) {
      return dfs(w) + 1;
    } else {
      return ret;
    }
  }
}