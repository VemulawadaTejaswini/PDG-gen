import java.util.*;
import java.math.*;

public class Main {

  // // 最大公約数
  // public static long gcd (long m,long n) {
  //   if (m < n) return gcd(n,m);
  //   if (n == 0) return m;
  //   return gcd(n,m%n);
  // }
  //
  // // 最小公倍数
  // public static long lcm (long m,long n) {
  //   return m*n/gcd(m,n);
  // }
  //
  // // 素数判定
  // public static boolean isPrime (long n) {
  //   if (n == 2) return true;
  //   if (n < 2 || n%2 == 0) return false;
  //   double d = Math.sqrt(n);
  //   for (int i = 3; i <= d; i+=2) {
  //     if (n%i == 0) {
  //       return false;
  //     }
  //   }
  //   return true;
  // }
  //
  // public static final long gcd3(long[] param) {
  //   int len = param.length;
  //   long g = gcd(param[0], param[1]);    //gcd(a, b) は以前作ったもの
  //   for (int i = 1; i < len - 1; i++) {
  //       g = gcd(g, param[i + 1]);       //gcd(a, b) は以前作ったもの
  //   }
  //   return g;
  // }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    long[] h = new long[n];

    for (int i = 0; i < n; i++) {
      h[i] = sc.nextLong();
    }

    Arrays.sort(h);

    long[] data = new long[n];

    long min = h[k-1]-h[0];

    for (int i = 0; i < n-k+1; i++) {
      data[i] = h[i+k-1]-h[i];
      min = Math.min(min,data[i]);
    }

    System.out.println(min);

  }

}
