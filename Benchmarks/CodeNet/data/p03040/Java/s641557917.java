import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int Q = scanner.nextInt();
    PriorityQueue<Integer> left = new PriorityQueue<>(Comparator.comparingInt(a -> -a));
    PriorityQueue<Integer> right = new PriorityQueue<>();
    long bsum = 0;
    long ymin = 0;
    for (int i = 0; i < Q; i++) {
      int op = scanner.nextInt();
      if (op == 1) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        bsum += b;
        if (left.isEmpty()) left.add(a);
        else if (a < left.peek()) {
          left.add(a);
          ymin += left.peek() - a;
        } else {
          right.add(a);
          ymin += a - left.peek();
        }
        if (left.size() - right.size() > 1) {
          right.add(left.poll());
          int o = right.peek();
          int n = left.peek();
          ymin += (o - n) * (right.size() - left.size());
        } else if (right.size() > left.size()) {
          int o = left.peek();
          int n = right.peek();
          ymin += (n - o) * (left.size() - right.size());
          left.add(right.poll());
        }
      } else {
        System.out.printf("%d %d\n", left.peek(), bsum + ymin);
      }
    }
  }
}
