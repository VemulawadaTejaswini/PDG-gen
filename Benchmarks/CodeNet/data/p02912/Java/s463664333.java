import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int M = sc.nextInt();
    PriorityQueue<Integer> A = new PriorityQueue<>(Collections.reverseOrder());

    for (int i = 0; i < N; i++) {
      A.add(sc.nextInt());
    }

    sc.close();

    while (0 < M) {
      int max = A.poll();
      max = max / 2;
      A.offer(max);
      M--;
    }

    long sum = 0;

    for (int i = 0; i < N; i++) {
      sum += A.poll();
    }

    System.out.println(sum);

  }

}