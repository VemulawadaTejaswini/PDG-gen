import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n+1];
    long[] b = new long[n];

    for (int i = 0; i < n+1; i++) {
      a[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      b[i] = sc.nextInt();
    }

    long[] data = new int[n];

    long ans = 0;

    for (int i = 0; i < n; i++) {
      data[i] += a[i]+a[i+1];
      if (data[i] >= b[i]) {
        ans += b[i];
        data[i] -= b[i];
      } else {
        ans += data[i];
        data[i] = 0;
      }
    }

    System.out.println(ans);

  }

}
