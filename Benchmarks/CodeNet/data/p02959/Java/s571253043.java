import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n+1];
    int[] b = new int[n];

    for (int i = 0; i < n+1; i++) {
      a[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      b[i] = sc.nextInt();
    }

    int count = 0;

    for (int i = 0; i < n; i++) {
      if (a[i] < 0) {
        a[i] = 0;
      }
      if (a[i] < b[i]) {
        a[i+1] -= (b[i]-a[i]);
        count += a[i];
        if (a[i+1] <= 0) {
          count += a[i+1]+(b[i]-a[i]);
          // System.out.println(count);
        } else {
          count += b[i]-a[i];
        }
        // System.out.println(count);
      } else {
        count += b[i];
      }

    }

    System.out.println(count);

  }

}
