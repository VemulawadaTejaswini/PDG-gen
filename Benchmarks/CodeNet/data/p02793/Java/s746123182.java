import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = sc.nextInt();
    sc.close();

    long lcm = 1;
    for (int i = 0; i < N; i++)
      lcm = lcm(lcm, A[i]);
    
    long mod = 1000000007;
    long ans = 0;
    for (int i = 0; i < N; i++)
      ans = (ans + lcm / A[i]) % mod;
    System.out.println(ans);
  }

  private static long lcm(long a, long b) {
    return a / gcd(a, b) * b;
  }

  private static long gcd(long a, long b) {
    long l = a < b ? a : b;
    long s = a < b ? b : a;
    for (long c = l % s; c != 0; c = l % s) {
        l = s;
        s = c;
    };
    return s;
  }
}