import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long k = sc.nextLong();
    int n = sc.nextInt();

    long[] a = new long[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }

    Arrays.sort(a);

    long sum1 = 0;

    for (int i = n-1; i > 0; i--) {
      sum1 += a[i]-a[i-1];
    }

    long sum2 = 0;

    for (int i = n-1; i > 0; i--) {
      if (a[i] >= k/2) {
        sum2 += k-a[i];
        continue;
      }
      sum2 += a[i]-a[i-1];
    }

    System.out.println(Math.min(sum1,sum2));

  }

}
