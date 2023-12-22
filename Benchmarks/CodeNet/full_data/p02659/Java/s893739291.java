import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        BigDecimal c = new BigDecimal(a * b);
        BigDecimal result = c.setScale(0, BigDecimal.ROUND_UP);

        System.out.println(result.longValue());
    }
}