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
    Queue<Integer> q = new LinkedList<>();
    q.offer(0);
    while (!q.isEmpty()) {
      int now = q.poll();
      visit[now] = true;
      d[now] = c[idx--];
      int tmp = idx;
      for (int next : from.get(now)) {
        if (!visit[next]) {
          M += Math.min(d[now], c[tmp--]);
          q.offer(next);
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
}