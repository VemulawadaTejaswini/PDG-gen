import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    int K = scanner.nextInt();

    LimitedPriorityQueue queue = new LimitedPriorityQueue(K, Comparator.reverseOrder());
    for (int l = 1; l <= s.length(); l++) {
      for (int i = 0; i <= s.length() - l; i++) {
        queue.add(s.substring(i, i + l));
      }
    }
    System.out.println(queue.remove());
  }

  static class LimitedPriorityQueue {
    final int size;
    final PriorityQueue<String> queue;

    LimitedPriorityQueue(int size, Comparator<String> comparator) {
      this.size = size;
      this.queue = new PriorityQueue<>(comparator);
    }

    public void add(String s) {
      if (!queue.contains(s)) {
        queue.add(s);
        if (queue.size() > size) {
          queue.remove();
        }
      }
    }

    public String remove() {
      return queue.remove();
    }
  }
}
