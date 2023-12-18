import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    PriorityQueue pq = new PriorityQueue<>(Collections.reverseOrder());
    for (int i = 0; i < N; i++) {
      pq.add(Long.parseLong(sc.next()));
    }
    for (int i = 0; i < M; i++) {
      long max = (Long)pq.peek(); 
      pq.poll();
      pq.add(max/2);
    }
    long total = 0;
    for (Object q : pq.toArray()) {
		 total += (Long) q;
    }
    System.out.println(total);
  }
}