import java.math.*;
import java.util.Scanner;

public class Main {

    public static BigInteger lcm(BigInteger a, BigInteger b) {
        return a.multiply(b).divide(a.gcd(b));
    }

    public static void main(String[] args) {
        BigInteger last = BigInteger.valueOf(1);
        long a[];
        Scanner in = new Scanner(System.in);
        long mod = 1000000007;
        int n = in.nextInt();
        a = new long[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
            last = lcm(BigInteger.valueOf(a[i]), last);
        }
        BigInteger ans = BigInteger.valueOf(0);
        for (int i = 0; i < n; ++i)
            ans = ans.add(last.divide(BigInteger.valueOf(a[i])));
        System.out.println(ans.mod(BigInteger.valueOf(mod)));
    }
}
