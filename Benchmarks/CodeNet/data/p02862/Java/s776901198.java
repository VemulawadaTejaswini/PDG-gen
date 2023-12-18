import java.util.Scanner;

public class Main {
  private static final long MOD = 1000_000_000 + 7;
  // Pascal's triangle.
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    if ((X + Y) % 3 != 0) {
      System.out.println(0);
      return;
    }
    // v1=(1,2) * b // Use b times.
    // v2=(2,1) * a // Use a times.
    // (x,y)=(2a+b,a+2b)
    int a = (2 * X - Y) / 3;
    int b = (2 * Y - X) / 3;
    if (a < 0 || b < 0) { // ref. Knight's tour: covers all board if negative vector is allowed.
      System.out.println(0);
      return;
    }
    // a+b C a = (a+b)!/((a+b - a)! a!) = (a+b)! / (b! a!)
    System.out.print(combi(a, b));
  }

  private static long combi(int a, int b) {
    long ab = 1;
    int large = Math.min(a, b);
    int small = Math.max(a, b);
    for (int i = large + 1; i < a + b; i++) {
      ab *= i;
      ab %= MOD;
    }
    int div = 1;
    for (int i = 1; i <= small; i++) {
      div *= i;
      div %= MOD;
    }
    return (ab * inv(div)) % MOD;
  }

  // Fermit's small theorem:
  // https://www.geeksforgeeks.org/compute-ncr-p-set-3-using-fermat-little-theorem/
  // http://hos.ac/slides/20130319_enumeration.pdf
  // https://discuss.codechef.com/t/best-known-algos-for-calculating-ncr-m/896/2
  private static long combi0(int a, int b) {
    long[] f = new long[a + b + 1];
    f[1] = 1;
    for (int i = 2; i <= a + b; i++) {
      f[i] = (f[i - 1] * i) % MOD;
    }

    return ((f[a + b] * inv(f[a])) % MOD) * inv(f[b]) % MOD;
  }
  // Inverse of n in modular MOD (using Fermat's small theorem).
  // returns n^(MOD-2)
  private static long inv(long n) {
    long rem = MOD - 2;
    long res = 1;
    while (rem > 0) {
      if ((rem & 1) == 1) {
        res *= n;
        res %= MOD;
      }
      rem >>= 1;
      n *= n;
      n %= MOD;
    }
    return res;
  }
}
