import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    double max = 0;
    int ai = 0;
    int aj = 0;
    for (int i = 0; i < n; i++) {
      ArrayList<Integer> same = new ArrayList<Integer>();
      for (int ii = 0; ii < n; ii++) {
        int ta = a[i];
        if (ta > a[ii] && !same.contains(ta - a[ii])) {
          double c = 1;
          same.add(a[ii]);
          for (double iii = Math.min(ta - a[ii], a[ii]); iii > 0; iii--) {
            c = c * ta / iii;
            ta -= 1;
          }
          if (c > max) {
            ai = a[i];
            aj = a[ii];
            max = c;
          }
        }
      }
    }
    System.out.println(String.format("%d %d", ai, aj));
  }
}
