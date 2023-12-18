import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  static long mod = 1000000007;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    long[] A = new long[N];
    for(int i=0; i<N; i++) {
      A[i] = scan.nextInt();
    }
    scan.close();

    Arrays.sort(A);

    long sum = 0;
    long[] nCkArray = new long[N];
    for(int i=0; i<N-K+1; i++) {
      for(int j=i+K-1; j<N; j++) {
        if(nCkArray[j-i-1+1] == 0) {
          nCkArray[j-i-1+1] = nCk(j-i-1, K-2);
        }

        sum += (A[j] - A[i]) * nCkArray[j-i-1+1];
        sum %= mod;
      }
    }
    System.out.println(sum);
  }

  public static long power(long x, long n) {
    long result = 1;
    while(n > 0) {
      if(n%2 == 1) {
        result *= x;
        result %= mod;
      }
      x = x*x;
      x %= mod;

      n >>= 1;
    }

    return result;
  }

  public static long nCk(long n, long k) {
    long up = 1;
    for(long i=n-k+1; i<=n; i++) {
      up *= i;
      up %= mod;
    }
    long bottom = 1;
    for(long i=1; i<=k; i++) {
      bottom *= i;
      bottom %= mod;
    }

    return up * power(bottom, mod-2) % mod;
  }
}