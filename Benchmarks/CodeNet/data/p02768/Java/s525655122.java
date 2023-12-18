import java.util.Scanner;

public class Main {
  static long mod = 1000000007;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int a = scan.nextInt();
    int b = scan.nextInt();
    scan.close();

    if(power(2, n) - nCk(n, a) - nCk(n, b) -1 > 0) {
      System.out.println(power(2, n) - nCk(n, a) - nCk(n, b) -1);
    }
    else {
      System.out.println(power(2, n) - nCk(n, a) - nCk(n, b) -1 + mod);
    }
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