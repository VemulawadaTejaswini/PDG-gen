import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        BigDecimal max = new BigDecimal(Math.pow(10, 18));
        BigDecimal decimal = null;
        boolean overflow = false;

        for (int i = 0; i < n; i++) {
            long val = scanner.nextLong();
            if (val == 0) {
                System.out.println("0");
                System.exit(0);
            }
            if (decimal == null) {
                decimal = new BigDecimal(val);
            } else if (!overflow) {
                decimal = decimal.multiply(new BigDecimal(val));
                if (decimal.compareTo(max) > 0) {
                    overflow = true;
                }
            }
        }

        if (overflow) {
            System.out.println("-1");
        } else {
            System.out.println(decimal);
        }

    }
}