import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int gcd = gcd(Math.max(A, B), Math.min(A, B));
    // count(prime <= gcd && gcd % prime == 0);
    int ans = 1; // include '1'.
    boolean[] isPrime = new boolean[gcd + 1];
    Arrays.fill(isPrime, true);
    isPrime[0] = isPrime[1] = false;
    for (int i = 2; i <= gcd; i++) {
      if (isPrime[i] && gcd % i == 0) ans++;
      for (int j = i; j <= gcd; j += i) {
        isPrime[j] = false;
      }
    }
    System.out.println(ans);
  }

  static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }
}
