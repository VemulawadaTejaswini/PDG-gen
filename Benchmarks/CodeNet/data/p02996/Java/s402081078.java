import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    PriorityQueue<Task> queue = new PriorityQueue<>();
    for (int i = 0; i < N; i++) queue.add(new Task(scanner.nextInt(), scanner.nextInt()));

    if (possible(queue)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  private static boolean possible(Queue<Task> queue) {
    long current = 1_000_000_000_000_000L;
    while (!queue.isEmpty()) {
      Task t = queue.remove();
      if (t.end < current) current = t.end;
      current -= t.duration;
      if (current < 0) return false;
    }
    return true;
  }

  private static class Task implements Comparable<Task> {
    private final int end;
    private final int duration;

    private Task(int duration, int end) {
      this.end = end;
      this.duration = duration;
    }

    @Override public int compareTo(Task task) {
      if (end != task.end) return task.end - end;
      return task.duration - duration;
    }
  }
}
