import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int Q = scanner.nextInt();
    PriorityQueue<Integer> left = new PriorityQueue<>((i1, i2) -> i2 - i1);
    PriorityQueue<Integer> right = new PriorityQueue<>();
    StringBuilder sb = new StringBuilder();
    long min = 0;
    for (int i = 0; i < Q; i++) {
      int op = scanner.nextInt();
      if (op == 1) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (!left.isEmpty()) min += Math.abs(a - left.peek());
        min += b;
        if (left.isEmpty() || a < left.peek()) left.add(a);
        else right.add(a);
        if (right.size() > left.size()) {
          min += (right.peek() - left.peek()) * (left.size() - right.size());
          left.add(right.remove());
        } else if (left.size() - right.size() > 1) {
          right.add(left.remove());
        }
      } else {
        sb.append(left.peek()).append(' ').append(min).append('\n');
      }
    }
    System.out.print(sb.toString());
  }
}
