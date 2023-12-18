import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long C = scanner.nextLong();
    long[] h = new long[N];
    for (int i = 0; i < N; i++) h[i] = scanner.nextInt();

    long[] dp = new long[N + 1];
    Deque<Line> deque = new LinkedList<>();

    for (int i = 1; i <= N; i++) {
      long hi = h[i - 1];
      while (deque.size() > 1) {
        Line last = deque.removeLast();
        if (deque.peekLast().y(hi) > last.y(hi)) {
          deque.addLast(last);
          break;
        }
      }
      if (!deque.isEmpty()) dp[i] = deque.peekLast().y(hi) + hi * hi + C;
      Line line = new Line(-2 * hi, hi * hi + dp[i]);
      while (deque.size() > 1) {
        Line first = deque.removeFirst();
        Line next = deque.peekFirst();
        if ((first.a - next.a) * (line.b - first.b) < (line.a - first.a) * (first.b - next.b)) {
          deque.addFirst(first);
          break;
        }
      }
      deque.addFirst(line);
    }

    System.out.println(dp[N]);
  }

  private static class Line {
    public final long a;
    public final long b;

    private Line(long a, long b) {
      this.a = a;
      this.b = b;
    }

    public long y(long x) {
      return x * a + b;
    }
  }
}
