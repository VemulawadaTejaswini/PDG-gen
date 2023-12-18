import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.stream.Collectors;

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

    List<Integer> values = new ArrayList<>(n);
    List<Change> changes = new ArrayList<>(m);

    for (int i = 0; i < n; i++) {
      values.add(sc.nextInt());
    }

    Collections.sort(values);

    for (int i = 0; i < m; i++) {
      Change change = new Change();
      change.times = sc.nextInt();
      change.toValue = sc.nextInt();
      changes.add(change);
    }

    // logic
    for (Change change : changes) {
      int pos = Collections.binarySearch(values, change.toValue, new LowerBoundComparator<>());
      if (pos < 0) pos = -pos - 1;
      if (pos < change.times) {
        for (int i = 0; i < pos; i++) {
          values.set(i, change.toValue);
        }
      } else {
        for (int i = change.times - 1; 0 <= i; i--) {
          values.set(i, values.get(pos - change.times + i));
          values.set(pos - change.times + i, change.toValue);
        }
      }
    }

    long sum = 0;
    for (int val : values) {
      sum += val;
    }
    os.println(sum);
  }

  static class LowerBoundComparator<T extends Comparable<? super T>>
      implements Comparator<T>
  {
    public int compare(T x, T y)
    {
      return (x.compareTo(y) >= 0) ? 1 : -1;
    }
  }
}