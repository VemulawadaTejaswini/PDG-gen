import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }

    Arrays.sort(a);

    long x = 0;
    long y = 0;
    int k = 0;

    for (int i = n-1; i > 0; i--) {
      if (a[i] == a[i-1]) {
        x = a[i];
        k = i;
        break;
      }
    }

    for (int i = k-2; i > 0; i--) {
      if (a[i] == a[i-1]) {
        y = a[i];
        break;
      }
    }

    System.out.println(x*y);
    
  }

}
