import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int xySum = x + y;

        long ans = 0;

        if ((xySum) % 3 == 0) {
            long b = (2 * x - y) / 3;
            long a = x - 2 * b;
            if (a < 0 || b < 0) {
                return;
            }
            long bunshi = 1;
            for (long i = a + b; i > a + b - Math.min(a , b); i--) {
                bunshi = bunshi * i % 1000000007;
            }
            long bunbo = 1;
            for (long i = Math.min(a, b); i > 0; i--) {
                bunbo = bunbo * i % 1000000007;
            }
            double gyakugenL = new BigInteger(String.valueOf(bunbo)).modInverse(new BigInteger("1000000007")).doubleValue();
            double ansD = gyakugenL * bunshi % 1000000007;
            ans = (long)Math.floor(ansD);
        }

        System.out.println(ans);
    }
}