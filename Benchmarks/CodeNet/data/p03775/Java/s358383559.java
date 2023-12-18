import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long digits = Long.MAX_VALUE;
        double sqrt = Math.sqrt(n);
        for (long i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                long a = n / i;
                digits = Math.min(digits, f(a, i));
            }
        }

        System.out.print(digits);
    }

    static long f(long a, long b) {
        return Math.max(Long.toString(a).length(), Long.toString(b).length());
    }
}