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

    int q = sc.nextInt();
    String s = sc.next();

    // zero-origin
    int[] l = new int[q];
    int[] r = new int[q];

    for (int i = 0; i < q; i++) {
      l[i] = sc.nextInt() - 1;
      r[i] = sc.nextInt() - 1;
    }

    List<Integer> acLeftIndexes = new ArrayList<>();

    boolean[] acLeftIndex = new boolean[n];

    for (int i = 0; i < n - 1; i++) {
      if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'C') {
        // acLeftIndex[i] = true;
        acLeftIndexes.add(i);
      }
    }

    for (int i = 0; i < q; i++) {
      int count = 0;
      for (int acLeft : acLeftIndexes) {
        if (r[i] <= acLeft) {
          break;
        }
        if (l[i] <= acLeft) {
          count++;
        }
      }
      /*
      for (int j = l[i]; j < r[i]; j++) {
        if (acLeftIndex[j]) {
          count++;
        }
      }
      */
      os.println(count);
    }
  }

}