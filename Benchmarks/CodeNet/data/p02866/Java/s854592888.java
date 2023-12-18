import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] array = new long[n];

        for (int i = 0; i < n; i++) {
            array[scanner.nextInt()]++;
        }

        if (n < 2 || array[2] == 0) {
            System.out.println(0);
            return;
        }

        long ans = 1;

        for (int i = 2; i < n; i++) {
            if (array[i - 1] == 0 && array[i] > 0) {
                System.out.println(0);
                return;
            }
            long v = pow(array[i - 1], array[i], 998244353);
            ans *= v;
            ans %= 998244353;
        }

        System.out.println(ans);
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