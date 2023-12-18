import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(solve() ? "Yes" : "No");
    }

    private static boolean solve() {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if (c - a - b <= 0) {
            return true;
        }

        BigDecimal right = BigDecimal.valueOf(c - a - b).multiply(BigDecimal.valueOf(c - a - b));
        BigDecimal left = BigDecimal.valueOf(4).multiply(BigDecimal.valueOf(a)).multiply(BigDecimal.valueOf(b));
        if (left.compareTo(right) < 0) {
            return true;
        }
        return false;
    }
}
