import java.io.*;
import java.util.*;
 
public class Main {
  private static boolean debug = false;
  private static boolean elapsed = false;
 
  private static PrintWriter _err = new PrintWriter(System.err);
 
  private int N;
  private long[] T;
  private int M;
  private int[] P;
  private long[] X;
 
  private void solve(Scanner sc, PrintWriter out) {
    N = sc.nextInt();
    T = new long[N];
    Map<Integer, Long> map = new HashMap<>();
    long total = 0;
    for (int i = 0; i < N; ++i) {
      T[i] = sc.nextLong();
      total += T[i];
      map.put(i + 1, T[i]);
    }
    M = sc.nextInt();
    P = new int[M];
    X = new long[M];
    for (int i = 0; i < M; ++i) {
      P[i] = sc.nextInt();
      X[i] = sc.nextLong();
 
      long newTotal = total - map.get(P[i]) + X[i];
      out.println(newTotal);
    }
  }
  private long C(long n, long r) {
    long res = 1;
    for (long i = n; i > n - r; --i) {
      res *= i;
    }
    for (long i = r; i > 1; --i) {
      res /= i;
    }
    return res;
  }
  private long P(long n, long r) {
    long res = 1;
    for (long i = n; i > n - r; --i) {
      res *= i;
    }
    return res;
  }
  private long ceil2pow(long n) {
    if (n == 0) {
      return 1;
    }
    n--;
    n |= (n >>> 1);
    n |= (n >>> 2);
    n |= (n >>> 4);
    n |= (n >>> 8);
    n |= (n >>> 16);
    n++;
    return n;
  }
  /*
   * 10^10 > Integer.MAX_VALUE = 2147483647 > 10^9
   * 10^19 > Long.MAX_VALUE = 9223372036854775807L > 10^18
   */
  public static void main(String[] args) {
    long S = System.currentTimeMillis();
 
    Scanner sc = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(sc, out);
    out.flush();
 
    long G = System.currentTimeMillis();
    if (elapsed) {
      _err.println((G - S) + "ms");
    }
    _err.flush();
  }
}