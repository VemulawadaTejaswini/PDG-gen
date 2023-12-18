import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  private static class Change {

    int times;
    int toValue;

  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();
    int m = sc.nextInt();

    PriorityQueue<Integer> queue = new PriorityQueue<>(Integer::compareTo);
    List<Change> changes = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      queue.add(sc.nextInt());
    }

    for (int i = 0; i < m; i++) {
      Change change = new Change();
      change.times = sc.nextInt();
      change.toValue = sc.nextInt();
      changes.add(change);
    }

    // logic
    for (Change change : changes) {
      List<Integer> toBack = new ArrayList<>();
      for (int i = 0; i < change.times; i++) {
        int value = queue.remove();
        if (value < change.toValue) {
          toBack.add(change.toValue);
        } else {
          toBack.add(value);
          break;
        }
      }
      queue.addAll(toBack);
    }

    long sum = 0;
    while (!queue.isEmpty()) {
      sum += queue.remove();
    }

    os.println(sum);
  }
}