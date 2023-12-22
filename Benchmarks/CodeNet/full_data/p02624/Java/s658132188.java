import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long result = 0;

        for (int k = 1; k <= n; k++) {
            int cnt = numOfDivisor(k);
            result = result + (k * cnt);
        }

        System.out.println(result);
    }

    static int numOfDivisor(int num) {
        int cnt = 1;
        for (int i = 2; i <= num; i++) {
            if (!isPrime(i)) continue;
            int c = 0;
            while ((num % i) == 0) {
                num = num / i;
                c += 1;
            }
            cnt *= c + 1;
        }
        return cnt;
    }

    static boolean isPrime (long l) {
        return BigInteger.valueOf(l).isProbablePrime(1);
    }
}