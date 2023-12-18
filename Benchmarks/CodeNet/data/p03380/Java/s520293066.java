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
    Arrays.sort(a);

    int max = a[n - 1];
    int il = Arrays.binarySearch(a, max / 2);
    int ir = Arrays.binarySearch(a, (max + 1) / 2);
    if (0 <= il) {
      os.println(max + " " + a[il]);
      return;
    }
    if (0 <= ir) {
      os.println(max + " " + a[ir]);
      return;
    }
    int min = Integer.MAX_VALUE;
    int i = 0;
    il = ~il;
    ir = ~ir;
    if (0 <= il - 1 && il - 1 != n - 1) {
      if (Math.abs(a[il - 1] - max / 2) < min) i = il - 1;
      if (Math.abs(a[il - 1] - (max + 1) / 2) < min) i = il - 1;
    }
    if (0 <= il && il != n - 1) {
      if (Math.abs(a[il] - max / 2) < min) i = il;
      if (Math.abs(a[il] - (max + 1) / 2) < min) i = il;
    }
    if (ir <= n - 1 && ir != n - 1) {
      if (Math.abs(a[ir] - max / 2) < min) i = ir;
      if (Math.abs(a[ir] - (max + 1) / 2) < min) i = ir;
    }
    if (ir + 1 <= n - 1 && ir + 1 != n - 1) {
      if (Math.abs(a[ir + 1] - max / 2) < min) i = ir + 1;
      if (Math.abs(a[ir + 1] - (max + 1) / 2) < min) i = ir + 1;
    }
    os.println(max + " " + a[i]);
  }
}
