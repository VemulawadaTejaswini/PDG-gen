import java.util.Scanner;
import java.math.BigInteger;

class Main {
    private static BigInteger gcd(BigInteger a, BigInteger b) {
        if (a.mod(b).equals(BigInteger.ZERO)) {
            return b;
        } else {
            return gcd(b, a.mod(b));
        }
    }

    private static BigInteger lcm(BigInteger a, BigInteger b) {
        BigInteger gcd = gcd(a, b);
        return a.multiply(b).divide(gcd);
    }

    private static void solve() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            BigInteger[][] dv = new BigInteger[n][2];
            for (int i = 0; i < n; i++) {
                dv[i][0] = BigInteger.valueOf(scanner.nextInt());
                dv[i][1] = BigInteger.valueOf(scanner.nextInt());
            }
            BigInteger lcmV = dv[0][1];
            for (int i = 1; i < n; i++) {
                lcmV = lcm(dv[i][1], lcmV);
            }
            for (int i = 0; i < n; i++) {
                dv[i][0] = dv[i][0].multiply(lcmV).divide(dv[i][1]);
            }
            BigInteger lcmD = dv[0][0];
            for (int i = 1; i < n; i++) {
                lcmD = lcm(dv[i][0], lcmD);
            }
            for (int i = 0; i < n; i++) {
                System.out.println(lcmD.divide(dv[i][0]));
            }
        }
    }

    public static void main(String... args) {
        solve();
    }
}