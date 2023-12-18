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
      A[i] = scan.nextLong();
    }
    scan.close();

    Arrays.sort(A);

    long[] nCkArray = new long[N+1];
    long maxSum = 0;
    for(int i=K-1; i<N; i++) {
      if(nCkArray[i] == 0) {
        nCkArray[i] = nCk(i, K-1);
      }

      maxSum += A[i] * nCkArray[i];
      maxSum %= mod;
    }

    long minSum = 0;
    for(int i=0; i<N-K+1; i++) {
      if(nCkArray[N-i-1] == 0) {
        nCkArray[N-i-1] = nCk(N-i-1, K-1);
      }

      minSum += A[i] * nCkArray[N-i-1];
      minSum %= mod;
    }

    System.out.println(maxSum - minSum);
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