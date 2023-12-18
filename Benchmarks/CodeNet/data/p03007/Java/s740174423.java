import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  private static final long MOD = 1000000007L;


  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();

    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    List<Integer> remain = new LinkedList<>();
    for (int num : a) {
      remain.add(num);
    }
    remain.sort(Integer::compareTo);

    List<int[]> operations = new ArrayList<>(n - 1);
    while (remain.size() > 1) {
      int min = remain.remove(0);
      int max = remain.remove(remain.size() - 1);

      int opNum = remain.size();
      boolean findPositive = (opNum) % 2 == 0;
      int[] operation = new int[2];
      int val;
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
      int index = Collections.binarySearch(remain, val);
      if (index < 0) index = -(index + 1);
      remain.add(-index, val);
    }
    os.println(remain.get(0));
    for (int[] operation : operations) {
      os.println(operation[0] + " " + operation[1]);
    }
  }
}