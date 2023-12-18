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
    
    int[][] node = new int[N][3];
    for (int i = 0; i < N; i++) {
      node[i][0] = i;
      node[i][1] = from.get(i).size();
    }
    Arrays.sort(node, (a,b)->a[1]-b[1]);
    
    for (int i = 0; i < N; i++) {
      node[i][2] = c[i];
    }
    
    Arrays.sort(node, (a,b)->a[0]-b[0]);

    boolean[] visit = new boolean[N];
    long sum = 0;
    Queue<Integer> q = new LinkedList<>();
    q.offer(0);
    while (!q.isEmpty()) {
      int now = q.poll();
      visit[now] = true;
      for (int next : from.get(now)) {
        if (!visit[next]) {
          sum += Math.min(node[now][2], node[next][2]);
          q.offer(next);
        }
      }
    }
      
    StringBuilder ans = new StringBuilder();
    ans.append(sum+"\n");
    for (int i = 0; i < N; i++) {
      ans.append(node[i][2]);
      if (i < N-1) {
        ans.append(' ');
      } else {
        ans.append('\n');
      }
    }
    System.out.print(ans.toString());
  }
}