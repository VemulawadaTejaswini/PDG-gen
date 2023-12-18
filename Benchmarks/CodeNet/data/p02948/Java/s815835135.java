import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    AB[] ab = new AB[N];
    PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
    for (int i = 0; i < N; i++) {
      ab[i] = new AB(sc.nextInt(), sc.nextInt());
    }
    Arrays.sort(ab, (a, b) -> a.a - b.a);
    int ans = 0;
    int ptr = 0;
    for (int i = 1; i <= M; i++) {
      while (ptr < ab.length && ab[ptr].a <= i) {
        queue.add(ab[ptr].b);
        ptr++;
      }
      if (queue.isEmpty()) continue;
      ans += queue.poll();
    }

    System.out.println(ans);
  }

  static class AB {
    int a, b;

    AB(int a, int b) {
      this.a = a;
      this.b = b;
    }
  }
}