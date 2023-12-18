import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            final int n = sc.nextInt();
            final int a = sc.nextInt();
            final int b = sc.nextInt();

            // System.out.println(pow(2, 16, 1000000007));
            // System.out.println(nCr(5, 2, 1000000007));

            long pow = pow(2, n, 1000000007);
            long nca = nCr(n, a, 1000000007);
            long ncb = nCr(n, b, 1000000007);

            long result = pow - 1;
            result = result - nca;
            if (result < 0) {
                result += 1000000007;
            }
            result = result - ncb;
            if (result < 0) {
                result += 1000000007;
            }
            System.out.println(result);

        } finally {
            sc.close();
        }
    }

    public static long nCr(int n, int r, int mod){
        long num = 1;
        for (int i=1; i<=r; i++) {
            num *= n;
            num %= mod;
            n--;
        }

        long invr = pow(r, mod - 2, mod);

        return num * invr % mod;
    }

    public static long pow(int a, int x, int mod) {
        if (x == 0) {
            return 1;
        } else if (x % 2 == 0) {
            long tmp = pow(a, x/2, mod);
            return (tmp * tmp) % mod;
        } else {
            return (a * pow(a, x-1, mod)) % mod;
        }
    }

    public static long factorial(int n, int mod) {
        long result = 1;
        for (int i=n; i>0; i++) {
            result *= i;
            result %= mod;
        }
        return result;
    }
}
