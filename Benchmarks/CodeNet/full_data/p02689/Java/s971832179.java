import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long[] h = new long[n];
    int[] a = new int[m];
    int[] b = new int[m];

    for (int i = 0; i < n; i++) {
      h[i] = sc.nextLong();
    }

    for (int i = 0; i < m; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }

    int ans = 0;
    int count = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (a[j] == i+1) {
          if (h[b[j]-1] >= h[i]) {
            count++;
          }
        } else if (b[j] == i+1) {
          if (h[a[j]-1] >= h[i]) {
            count++;
          }
        }
      }
      if (count == 0) {
        ans++;
      }
      count = 0;
    }

    System.out.println(ans);

  }

}
