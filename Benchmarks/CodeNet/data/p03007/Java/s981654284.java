import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();

    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    List<Long> remain = new LinkedList<>();
    for (long num : a) {
      remain.add(num);
    }
    remain.sort(Long::compareTo);

    List<long[]> operations = new ArrayList<>(n - 1);
    while (remain.size() > 1) {
      long min = remain.remove(0);
      long max = remain.remove(remain.size() - 1);

      int opNum = remain.size();
      boolean findPositive = (opNum) % 2 == 0;
      long[] operation = new long[2];
      long val;
      if (findPositive) {
        operation[0] = max;
        operation[1] = min;
        val = max - min;
      } else {
        operation[0] = min;
        operation[1] = max;
        val = min - max;
      }
      operations.add(operation);
//      int index = Collections.binarySearch(remain, val);
//      if (index < 0) index = -(index + 1);
//      remain.add(-index, val);
      remain.add(val);
      remain.sort(Long::compareTo);
    }
    os.println(remain.get(0));
    for (long[] operation : operations) {
      os.println(operation[0] + " " + operation[1]);
    }
  }
}