import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer[] a = new Integer[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    double max = 0;
    int ai = a[a.length - 1];
    int aj = a[a.length - 2];
    for (int i = n - 1; i > 0; i--) {
      int an = a[i];
      int lan = an - 1;
      int target = 0;
      for (int ii = 0; ii < lan / 2; ii++) {
        if (Arrays.asList(a).contains(lan / 2 + 1 - ii)) target = lan / 2 + 1 - ii;
        if (Arrays.asList(a).contains(lan / 2 + 1 + ii)) target = lan / 2 + 1 + ii;
        if (target > 0) {
          double c = 1;
          double tan = an;
          for (int iii = target; iii > 0; iii--) {
            c = c * tan / iii;
            tan -= 1;
          }
          if (c > max) {
            max = c;
            ai = an;
            aj = target;
          }
          break;
        }
      }
    }
    System.out.println(String.format("%d %d", ai, aj));
  }
}
