import java.io.InputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int max = Integer.MIN_VALUE;
    NumberQueue scanQueue = new NumberQueue(k);
    for (int i = 0; i < n; i++) {
      scanQueue.add(Integer.valueOf(sc.next()));
      if (max < scanQueue.sum()) {
        max = scanQueue.sum();
      }
    }
    pw.println(
      ((double) k * 0.5) + ((double) max * 0.5)
    );
  }

  static class NumberQueue {

    private int k;
    int sum;
    private Queue<Integer> queue;

    public NumberQueue(int k) {
      this.k = k;
      this.queue = new LinkedList<>();
    }

    private void add(Integer i) {
      if (queue.size() < k) {
        queue.add(i);
        sum += i;
        return;
      }
      sum -= queue.poll();
      sum += i;
      queue.add(i);
    }

    private int sum() {
      return sum;
    }

    double sumOfMeanValue() {
      return queue.stream()
        .mapToDouble(this::mean)
        .sum();
    }

    double mean(int i) {
      return (double) i * (1 + i) / 2 / i;
    }
  }
}
