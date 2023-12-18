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
    int k = sc.nextInt();

    int[] values = new int[n];
    for (int i = 0; i < n; i++) {
      values[i] = sc.nextInt();
    }

    int[] leftMax = new int[k + 1]; // left[i] : left side max uses operation i times
    for (int i = 0; i <= k; i++) {
      int max = 0;
      for (int taking = 0; taking <= i; taking++) {
        List<Integer> list = new ArrayList<>(taking);
        for (int take = 0; take < taking; take++) {
          list.add(values[take]);
        }
        Collections.sort(list);
        int removable = i - taking;
        while (removable > 0 && list.size() > 0) {
          if (list.get(0) < 0) {
            list.remove(0);
          }
          removable--;
        }
        int sum = 0;
        for (int val : list) {
          sum += val;
        }
        max = Math.max(max, sum);
      }
      leftMax[i] = max;
    }

    int[] rightMax = new int[k + 1]; // right[i] : right side max uses operation i times
    for (int i = 0; i <= k; i++) {
      int max = 0;
      for (int taking = 0; taking <= i; taking++) {
        List<Integer> list = new ArrayList<>(taking);
        for (int take = 0; take < taking; take++) {
          list.add(values[n - 1 - take]);
        }
        Collections.sort(list);
        int removable = i - taking;
        while (removable > 0 && list.size() > 0) {
          if (list.get(0) < 0) {
            list.remove(0);
          }
          removable--;
        }
        int sum = 0;
        for (int val : list) {
          sum += val;
        }
        max = Math.max(max, sum);
      }
      rightMax[i] = max;
    }

    int max = 0;
    for (int left = 0; left <= k ; left++) {
      int right = k - left;
      max = Math.max(leftMax[left] + rightMax[right], max);
    }

    os.println(max);
  }
}