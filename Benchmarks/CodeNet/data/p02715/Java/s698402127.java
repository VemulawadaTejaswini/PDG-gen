import java.util.Scanner;

public class Main {
  public static int mod = 1000000007;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    scan.close();

    long[] count = new long[K+1];

    for(int j=K; j>=1; j--) {
      count[j] = power((long)K/j, (long)N);

      int multi = 2;
      while(j*multi <= K) {
        count[j] -= count[j*multi];
        multi++;
      }
    }

    long sum = 0;
    for(int j=1; j<=K; j++) {
      sum += j * count[j] % mod;
      sum = sum % mod;
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
}