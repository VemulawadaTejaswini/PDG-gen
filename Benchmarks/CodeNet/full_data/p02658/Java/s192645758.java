import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      if (a[i] == 0) {
        System.out.println(0);
        return;
      }
    }

    Arrays.sort(a);

    long sum = 1;

    for (int i = 0; i < n; i++) {
      sum *= a[i];
      if (sum > (long)Math.pow(10,18)) {
        System.out.println(-1);
        return;
      }
    }

    System.out.println(sum);
  }

}
