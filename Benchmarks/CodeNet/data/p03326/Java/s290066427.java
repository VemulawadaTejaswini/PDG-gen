import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    long[] X = new long[N];
    long[] Y = new long[N];
    long[] Z = new long[N];
    
    for (int i=0; i<N; i++) {
      X[i] = sc.nextLong();
      Y[i] = sc.nextLong();
      Z[i] = sc.nextLong();
    }

    long ans = 0;
    List<Long> list = new ArrayList<>();
    for (int a=-1;a<=1;a+=2) {
      for (int b=-1;b<=1;b+=2) {
        for (int c=-1;c<=1;c+=2) {
          long tmp = 0;
          list.clear();
          for (int i=0; i<N; i++) {
            list.add(a*X[i] + b*Y[i] + c*Z[i]);
          }
          list.sort(Comparator.reverseOrder());
          for (int i=0; i<M; i++) {
            tmp += list.get(i);
          }
          ans = Math.max(ans, tmp);
        }
      }
    }
    System.out.println(ans);
  }

  private static final long MOD = 998244353;
  private static long FACT[];
  private static long IFACT[];

  // Pre-calculate factorial and its mod_inverse for calculate nCr in O(1)
  private static void create_fact(int N) {
    FACT = new long[N+1];
    IFACT = new long[N+1];
    FACT[0] = 1;
    IFACT[0] = 1;
    for (int i=1; i<=N; i++) {
      FACT[i] = FACT[i-1] * i % MOD;
      IFACT[i] = mod_inverse(FACT[i]);
    }
  }

  // Return nCr
  private static long comb(int n, int r) {
    if (n < 0 || r < 0 || n < r) {
      return 0;
    }
    if (r > n/2) {
      r = n - r;
    }
    return FACT[n]*IFACT[n-r]%MOD*IFACT[r]%MOD;
  }

  // Fast mod inverse
  private static long mod_inverse(long a) {
    long b = MOD;
    long p = 1, q = 0;
    while (b > 0) {
      long c = a / b;
      long d;
      d = a;
      a = b;
      b = d % b;
      d = p;
      p = q;
      q = d - c * q;
    }
    return p < 0 ? p + MOD : p;
  }
}
