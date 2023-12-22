import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        int mod = 1000000007;

        long ans = pow(10, n, mod) - pow(9, n, mod) - pow(9, n, mod) + pow(8, n, mod);

        System.out.println(ans % mod);
    }

    //return a^b mod M O(logB)
    private static long pow(long a, long b, int M) {
        long ret = 1;
        long tmp = a;
        while (b > 0) {
            if ((b & 1) == 1) ret = (ret * tmp) % M;
            tmp = (tmp * tmp) % M;
            b = b >> 1;
        }
        return ret;
    }
}