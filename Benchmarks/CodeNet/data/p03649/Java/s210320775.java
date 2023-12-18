import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    long sum = 0;
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      sum += (a[i] / (long)n);
    }
    long ans = 0;
    while(sum > 0) {
      long t = sum;
      ans += sum;
      sum = 0;
      for(int i = 0; i < n; i++) {
        long s = a[i] / (long)n;
        a[i] -= (s * (long)n);
        a[i] += (t - s);
        sum += (a[i] / (long)n);
      }
    }
    System.out.println(ans);
  }
}