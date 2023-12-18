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
            if (a+2*b == Y) {
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
        long[] fac = new long[MAX];
        long[] finv= new long[MAX];
        long[] inv= new long[MAX];
        fac[0] = 1;
        fac[1] = 1;
        finv[0] = 1;
        finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < MAX; i++) {
            fac[i] = fac[i-1]*i % MOD;
            inv[i] = MOD-inv[MOD%i]*(MOD/i) % MOD;
            finv[i] = finv[i-1]*inv[i]%MOD;
        }

        if (n < k) {
            return 0;
        }
        if (n < 0 || k < 0) {
            return 0;
        }
        return fac[n]*(finv[k]*finv[n-k]%MOD)%MOD;
    }
}
