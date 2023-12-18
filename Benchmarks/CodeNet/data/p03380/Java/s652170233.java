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
    double min = 1000000000;
    int target = 0;
    int an = a[n - 1];
    double h = an / 2 + 1;
    for (int i = n - 2; i >= 0; i--) {
      if (min > Math.abs(h - (double)a[i])) {
        min = Math.abs(h - (double)a[i]);
        target = a[i];
      }
    }
    System.out.println(String.format("%d %d", an, target));
  }
}
