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

    long sum = 0;

    for (int i = n-1; i > 0; i--) {
      if (a[i]-a[i-1] > k-a[i]) {
        sum += k-a[i];
      } else {
        sum += a[i]-a[i-1];
      }
    }

    System.out.println(sum);


  }

}
