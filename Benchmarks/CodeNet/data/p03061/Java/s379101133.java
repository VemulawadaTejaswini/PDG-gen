import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();

    long[] a = new long[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int candidate1 = 0;
    int candidate2 = 1;

    long gcd;

    gcd = gcd(a[0], a[1]);
    for (int i = 2; i < n; i++) {
      long nextGcd = gcd(gcd, a[i]);
      if (nextGcd < gcd) {
        candidate1 = candidate2;
        candidate2 = i;
        gcd = nextGcd;
      }
    }

    long candidate1Result = Long.MAX_VALUE;
    if (candidate1 == 0) {
      gcd = a[1];
    } else {
      gcd = a[0];
    }
    for (int i = 0; i < n; i++) {
      if (i == candidate1) {
        continue;
      }
      long g = gcd(gcd, a[i]);
      if (g < candidate1Result) {
        candidate1Result = g;
      }
    }

    long candidate2Result = Long.MAX_VALUE;
    if (candidate2 == 0) {
      gcd = a[1];
    } else {
      gcd = a[0];
    }
    for (int i = 0; i < n; i++) {
      if (i == candidate2) {
        continue;
      }
      long g = gcd(gcd, a[i]);
      if (g < candidate2Result) {
        candidate2Result = g;
      }
    }

    os.println(Math.max(candidate1Result, candidate2Result));

    /**
     long globalMinGcd = Long.MAX_VALUE;
     int globalMinGcdRoot = Integer.MAX_VALUE;
     for (int i = 0; i < n; i++) {
     long minGcd = Long.MAX_VALUE;
     for (int j = i; j < n; j++) {
     long g = gcd(a[i], a[j]);
     if (g <= minGcd) {
     minGcd = g;
     }
     }
     if (minGcd <= globalMinGcd) {
     globalMinGcd = minGcd;
     globalMinGcdRoot = i;
     }
     }

     globalMinGcd = Long.MAX_VALUE;

     for (int i = 0; i < n; i++) {
     if (i == globalMinGcdRoot) {
     continue;
     }
     long minGcd = Long.MAX_VALUE;
     for (int j = i; j < n; j++) {

     if (j == globalMinGcdRoot) {
     continue;
     }
     long g = gcd(a[i], a[j]);
     if (g < minGcd) {
     minGcd = g;
     }
     }
     if (minGcd < globalMinGcd) {
     globalMinGcd = minGcd;
     }
     }

     os.println(globalMinGcd);
     */
  }

  private static long gcd(long m, long n) {
    if (m < n) {
      return gcd(n, m);
    }
    if (n == 0) {
      return m;
    }
    return gcd(n, m % n);
  }

}