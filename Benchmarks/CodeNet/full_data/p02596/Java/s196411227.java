import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        String s = String.valueOf(n);
        char c = s.charAt(s.length() - 1);
        if (c != '1' && c != '3' && c != '7' && c != '9') {
            System.out.println(-1);
            return;
        }
        if (!isPrime(n)) {
            System.out.println(-1);
            return;
        }
        if (n >= 1019) {
            System.out.println(n - 1);
            return;
        }
        var nn = new BigDecimal(n);
        var seven = new StringBuilder();
        seven.append(7);
        int cnt = 1;
        while(true) {
            BigDecimal num = new BigDecimal(seven.toString());
            if (num.remainder(nn).equals(BigDecimal.ZERO)) {
                System.out.println(cnt);
                return;
            }
            seven.append(7);
            cnt++;
            if (seven.length() > 9999820) {
                System.out.println(-1);
                return;
            }
        }
    }

    private static boolean isPrime(long n) {
        for (long i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n != 1;
    }
}