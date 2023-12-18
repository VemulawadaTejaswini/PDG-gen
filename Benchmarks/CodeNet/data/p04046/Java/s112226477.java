import java.util.Scanner;

public class Main {

    private static int H;
    private static int W;
    private static int A;
    private static int B;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        System.out.println( solve() );
    }

    private static int solve() {
        Comb comb = new Comb(H + W);

        // first
        // (0, 0) to [(B, H-A-1)..(W-1, H-A-1)]
        // second
        // [(B, H-A)..(W-1, H-A)] to (W-1, H-1)
        int ans = 0;
        for (int i = 0; i < W-B; i++) {
            int x = B + i;
            int y_first = H-A-1;
            int first = calcWay(x, y_first, comb);

            int y_second = y_first+1;
            int second = calcWay(W-1 - x, H-1 - y_second, comb);

            ans = sum(ans, mul(first, second));
        }
        return ans;
    }

    private static int calcWay(int dw, int dh, Comb comb) {
        if( dw < 0 || dh < 0 ) throw new IllegalArgumentException("wtf : " + dw + " " + dh);
        if( dw == 0 || dh == 0 ) return 1;
        return comb.get(sum(dw, dh), dw);
    }

    private static final int MOD = 1_000_000_007;

    private static int mul(int a, int b) {
        long ab = (long)a * b;
        return (int)(ab % MOD);
    }

    private static int sum(int a, int b) {
        long ab = (long)a + b;
        return (int)(ab % MOD);
    }

    private static int pow(int base, int exp) {
        if( exp == 0 ) return 1;

        int ans = 1;
        base %= MOD;
        while( exp > 0 ) {
            if( (exp & 1) == 1 ) {
                ans = mul(ans, base);
            }

            base = mul(base, base);
            exp = exp >> 1;
        }
        return ans;
    }

    private static class Comb {

        private int[] factorial;
        private int[] factorialInverse;

        Comb(int size) {
            factorial = new int[size + 1];
            factorialInverse = new int[size + 1];
            factorial[1] = 1;
            factorialInverse[1] = 1;
            for (int i = 2; i <= size; i++) {
                factorial[i] = mul(factorial[i-1], i);
                factorialInverse[i] = pow(factorial[i], MOD-2);
            }
        }


        int get(int n, int k) {
            return mul(mul(factorial[n], factorialInverse[k]), factorialInverse[n - k]);
        }
    }
}