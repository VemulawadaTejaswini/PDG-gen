import java.util.*;
public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<List<Integer>> from = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      from.add(new ArrayList<>());
    }
    
    for (int i = 0; i < N-1; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      from.get(a-1).add(b-1);
      from.get(b-1).add(a-1);
    }
    int[] c = new int[N];
    for (int i = 0; i < N; i++) {
      c[i] = sc.nextInt();
    }
    Arrays.sort(c);
    
    int idx = N-1;
    int[] d = new int[N];
    boolean[] visit = new boolean[N];
    long M = 0;
    PriorityQueue<Pair> q = new PriorityQueue<>((a,b)->b.b-a.b);
    d[0] = c[idx--];
    q.offer(new Pair(0, d[0]));
    visit[0] = true;
    while (!q.isEmpty()) {
      Pair now = q.poll();
      for (int to : from.get(now.a)) {
        if (!visit[to]) {
          visit[to] = true;
          d[to] = c[idx--];
          Pair next = new Pair(to, d[to]);
          q.offer(next);
          M += Math.min(now.b, next.b);
        }
      }
    }
      
    StringBuilder ans = new StringBuilder();
    ans.append(M+"\n");
    for (int i = 0; i < N; i++) {
      ans.append(d[i]);
      if (i < N-1) {
        ans.append(' ');
      } else {
        ans.append('\n');
      }
    }
    System.out.print(ans.toString());
  }
  
  private static class Pair {
    private final int a;
    private final int b;
    private Pair(int a, int b) {
      this.a = a;
      this.b = b;
    }
  }
}