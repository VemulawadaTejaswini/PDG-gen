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
    }

    long sum = 1;

    for (int i = 0; i < n; i++) {
      sum *= a[i];
    }

    if (sum <= (long)Math.pow(10,18) && sum >= 0) {
      System.out.println(sum);
    } else {
      System.out.println(-1);
    }
  }

}
