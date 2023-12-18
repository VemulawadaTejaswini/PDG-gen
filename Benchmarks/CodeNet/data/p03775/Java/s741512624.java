import java.math.BigDecimal;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long N = sc.nextLong();

        long div = 1;
        HashSet<Long> multiple = new HashSet<>();
        long ans = Long.MAX_VALUE;

        while (true) {
            if (N % div == 0) {
                long muti = N / div;
                if (multiple.contains(div)) {
                    System.out.println(ans);
                    return;
                }
                multiple.add(muti);
                ans = Math.min(ans, digit(muti));
            }
            div++;
        }
    }

    private static int digit(long n) {
        return String.valueOf(n).length();
    }
}