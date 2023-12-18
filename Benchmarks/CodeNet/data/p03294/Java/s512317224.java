import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        BigInteger tlc = BigInteger.valueOf(0l);
        BigInteger[] as = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            as[i] = BigInteger.valueOf(sc.nextLong());
            tlc = i == 0 ? as[i] : tlc(tlc, as[i]);
        }

        BigInteger ans = BigInteger.valueOf(0);
        for (int i = 0; i < n; i++) {
            ans = ans.add(tlc.subtract(BigInteger.valueOf(1)).mod(as[i]));
        }

        System.out.println(ans);
    }

    static BigInteger tlc(BigInteger a, BigInteger b) {
        BigInteger gcd = a.gcd(b);
        return a.divide(gcd).multiply(b);
    }
}