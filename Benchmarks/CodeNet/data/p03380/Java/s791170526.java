import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    double max = 1;
    int ai = a[a.length - 1];
    int aj = a[a.length - 2];
    for (int i = n - 1; i > 0; i--) {
      for (int ii = i - 1; ii > 0; ii--) {
        int ta = a[i];
        double d = Math.min(a[ii], a[i] - a[ii]);
        double c = 1;
        for (double iii = d; iii > 0; iii--) {
          c = c * ta / iii;
          ta -= 1;
        }
        if (c >= max) {
          max = c;
          ai = a[i];
          aj = a[ii];
        }
      }
    }
    System.out.println(String.format("%d %d", ai, aj));
  }
}
