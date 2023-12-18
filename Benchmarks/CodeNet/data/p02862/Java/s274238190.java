import java.util.*;
 
public class Main {

    private static final int MOD = 1_000_000_007;
    private static final int MAX = 1000000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int A = -1, B = -1;
        for (int a = 0; a <= X; a++) {
            int b = X - 2*a;
            if (b >= 0 && a+2*b == Y) {
                A = a;
                B = b;
                break;
            }
        }
        if (A == -1) {
            System.out.println(0);
        } else {
            System.out.println(combMod(A+B, A));
        }
    }
  private static long combMod(int n, int k) {  
    long[] fac = new long[n+1];
    fac[0] = 1;
    for (int i = 1; i <= n; i++) {
      fac[i] = fac[i-1]*i % MOD;
    }
    return ((fac[n]*power(fac[k], MOD-2))%MOD)*power(fac[n-k], MOD-2)%MOD;
  }
  private static long power(long a, int n) {
    if (n == 0) {
      return 1;
    }
    if (n%2 == 1) {
      return power(a, n-1)*a%MOD;
    }
    long half = power(a, n/2);
    return half*half%MOD;
  }
}
