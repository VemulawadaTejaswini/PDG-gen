import java.util.*;
import java.util.function.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = sc.nextInt();
    sc.close();

    long lcm = 1;
    for (int i = 0; i < N; i++) lcm = lcm(lcm, a[i] / 2);

    for (int i = 0; lcm != 0 && i < N; i++)
      if (lcm / a[i] % 2 == 0) lcm = 0;

    long ans = lcm == 0 ? 0 : ((long) M / lcm + 1L) / 2L;
    System.out.println(ans);
  }
  
  private static long lcm(long a, long b) {
    return a / gcd(a, b) * b;
  }
  private static long gcd(long a, long b) {
//    return a < b ? gcd(b, a) : b == 0 ? a : gcd(b, a % b);
    long l = a < b ? b : a;
    long s = a < b ? a : b;
    long c = l % s;
    while (c != 0) {
      l = s;
      s = c;
      c = l % s;
    }
    return s;
  }
}