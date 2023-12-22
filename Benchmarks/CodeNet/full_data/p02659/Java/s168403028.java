import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal a = new BigDecimal(scanner.nextLong());
        BigDecimal b = new BigDecimal((long) (scanner.nextDouble() * 100));

        System.out.println(a.multiply(b).divide(new BigDecimal(100)).longValue());

    }
}