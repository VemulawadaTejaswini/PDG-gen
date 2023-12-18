
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long total = sc.nextLong();
        BigDecimal l = BigDecimal.valueOf(total).divide(BigDecimal.valueOf(3L), 8, RoundingMode.HALF_DOWN);

        System.out.println(l.pow(3).toPlainString());
    }
}
