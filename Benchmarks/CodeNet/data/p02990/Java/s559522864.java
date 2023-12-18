import java.util.*;
import java.math.*;

public class Main {

    static long MOD = 1000000007;

    public static long k(long a) {
        long ret = 1;
        while(a >= 2) {
            ret *= a;
            ret %= MOD;
            a--;
        }
        return ret;
    }

    public static long comb(long a, long b) {
        BigInteger mod = new BigInteger(String.valueOf(MOD));
        BigInteger up = new BigInteger(String.valueOf(k(a)));
        BigInteger down = new BigInteger(String.valueOf(k(b))).multiply(new BigInteger(String.valueOf(k(a - b))));
        return up.multiply(down.modInverse(mod)).mod(mod).longValue();
    }


    public static void main(String[] args) {
        BigInteger mod = new BigInteger(String.valueOf(MOD));
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        for(int i = 1 ; i <= k; i++) {
            System.out.println(new BigInteger(String.valueOf(comb(k - 1,i-1))).multiply( new BigInteger(String.valueOf(comb(n - k + 1, i)))).mod(mod).longValue());
        }



    }
}