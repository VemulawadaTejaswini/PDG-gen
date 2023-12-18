import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = (sc.nextLong() - (long)(i + 1));
    }
    Arrays.sort(a);
    long ans = 0;
    long b = a[n / 2];
    for(int i = 0; i < n; i++) {
      ans += (long)Math.abs(a[i] - b);
    }
    System.out.println(ans);
  }
}