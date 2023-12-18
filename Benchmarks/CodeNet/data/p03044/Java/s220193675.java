import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<List<Integer>> to = new ArrayList<>();
    List<List<Integer>> cost = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      to.add(new ArrayList<>());
      cost.add(new ArrayList<>());
    }
    for (int i = 0; i < N-1; i++) {
      int u = sc.nextInt();
      int v = sc.nextInt();
      int w = sc.nextInt();
      u--;
      v--;
      to.get(u).add(v);
      to.get(v).add(u);
      cost.get(u).add(w);
      cost.get(v).add(w);
    }
    
    // BFS
    int[] ans = new int[N];
    Arrays.fill(ans, -1);
    LinkedList<Integer> q = new LinkedList<>();
    q.offer(0);
    ans[0] = 0;
    while (!q.isEmpty()) {
      int v = q.poll();
      for (int i = 0; i < to.get(v).size(); i++) {
        int vv = to.get(v).get(i);
        if (ans[vv] == -1) {
          ans[vv] = cost.get(v).get(i)%2 == 0 ? ans[v] : ans[v]^1;
          q.offer(vv);
        }
      }
    }
    
    for (int i = 0; i < N; i++) {
      System.out.println(ans[i]);
    }
  }
}

