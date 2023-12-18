import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();
    int k = sc.nextInt();

    int[] a = new int[n];

    int sum = 0;
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      sum += a[i];
    }

    for (int divS = 1; divS <= sum; divS++) {
      if (sum % divS != 0) continue;
      int divL = sum / divS;
      List<Integer> rest = new LinkedList<>();
      for (int i = 0; i < n; i++) {
        int r = a[i] % divL;
        rest.add(r);
      }
      int count = 0;
      Collections.sort(rest);
      int remain = 0;
      while(!rest.isEmpty()) {
        if (0 <= remain) {
          int val = rest.remove(rest.size() - 1);
          remain += val - divL;
          count += divL - val;
        } else {
          int val = rest.remove(0);
          remain += val;
          count += val;
        }
      }
      if (count <= 2 * k) {
        os.println(divL);
        return;
      }
    }
  }
}