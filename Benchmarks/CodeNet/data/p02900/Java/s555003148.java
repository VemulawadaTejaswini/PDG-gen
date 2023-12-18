import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long gcd = gcd(Math.max(A, B), Math.min(A, B));
    // count(prime <= gcd && gcd % prime == 0);
    int ans = 1; // include '1'.
    boolean[] isPrime = new boolean[1000001];
    Arrays.fill(isPrime, true);
    isPrime[0] = isPrime[1] = false;
    for (int i = 2; i <= isPrime.length; i++) {
      if (isPrime[i] && gcd % i == 0) ans++;
      for (int j = i; j <= isPrime.length; j += i) {
        isPrime[j] = false;
      }
    }
    System.out.println(ans);
  }

  static long gcd(long a, long b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }
}
