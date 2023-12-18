import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    PriorityQueue<Long> pq = new PriorityQueue<>();
    for (int i = 0; i < N; i++) {
      pq.offer(sc.nextLong());
    }
    for (int i = 0; i < M; i++) {
      int b = sc.nextInt();
      long c = sc.nextLong();
      for (int j = 0; j < b; j++) {
        pq.offer(c);
        pq.poll();
      }
    }
    //System.out.println(pq);
    long sum = 0;
    for (int i = 0; i < N; i++) {
      sum += pq.poll();
    }
    System.out.println(sum);
  }
}
