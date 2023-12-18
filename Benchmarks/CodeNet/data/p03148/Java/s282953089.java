import java.util.*;

public class Main {
   
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[][] td = new int[N][2];
    for (int i = 0; i < N; i++) {
      td[i][0] = sc.nextInt();
      td[i][1] = sc.nextInt();
    }
    Arrays.sort(td, (a,b)->b[1]-a[1]);
    
    boolean[] found = new boolean[N+1];
    PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
    for (int i = 0; i < N; i++) {
      int t = td[i][0];
      int d = td[i][1];
      if (found[t]) {
        pq2.offer(d);
      } else {
        pq1.offer(d);
        found[t] = true;
      }
    }
    
    long stack1Sum = 0;
    Stack<Integer> stack1 = new Stack<>();
    while (!pq1.isEmpty() && stack1.size() < K) {
      int d = pq1.poll();
      stack1.push(d);
      stack1Sum += d;
    }
    
    long rSum = 0;
    int r = 0;
    while (stack1.size()+r < K) {
      int q = pq2.poll();
      rSum += q;
      r++;
    }
    
    int x = stack1.size();
    long ans = stack1Sum+rSum+(long)x*x;
    while (stack1.size() > 0 && !pq2.isEmpty()) {
      int h = stack1.pop();
      stack1Sum -= h;
      rSum += pq2.poll();
      x = stack1.size();
      long tmp = stack1Sum+rSum+(long)x*x;
      ans = Math.max(ans, tmp);
    }

    System.out.println(ans);
  }
}