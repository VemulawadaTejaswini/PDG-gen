import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        BigDecimal a = new BigDecimal(scanner.nextInt());
        BigDecimal b = new BigDecimal(scanner.nextInt());

        List<BigDecimal> resultA = calc8(a);
        List<BigDecimal> resultB = calc10(b);

        for (BigDecimal decimal : resultA) {
            BigDecimal sameValue = resultB.stream()
                    .filter(e -> e.compareTo(decimal) == 0)
                    .findFirst()
                    .orElse(null);
            if (sameValue != null) {
                System.out.println(sameValue.toPlainString());
                return;
            }
        }
        System.out.println(-1);
    }

    static List<BigDecimal> calc8(BigDecimal noTax) {
        int max = 1250; // (int) (100d / 0.08d);
        BigDecimal div = new BigDecimal("0.08");

        List<BigDecimal> list = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            BigDecimal maybe = new BigDecimal(i);
            BigDecimal maybeNoTax = maybe.multiply(div).setScale(0, RoundingMode.DOWN);

            int result = noTax.compareTo(maybeNoTax);
            if (result < 0) {
                break; // もう見てもしょうがない
            }
            if (result == 0) {
                list.add(maybe);
            }
        }
        return list;
    }

    static List<BigDecimal> calc10(BigDecimal noTax) {
        int max = 1000; // (int) (100d / 0.1d);
        BigDecimal div = new BigDecimal("0.1");

        List<BigDecimal> list = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            BigDecimal maybe = new BigDecimal(i);
            BigDecimal maybeNoTax = maybe.multiply(div).setScale(0, RoundingMode.DOWN);
            int result = noTax.compareTo(maybeNoTax);
            if (result < 0) {
                break; // もう見てもしょうがない
            }
            if (result == 0) {
                list.add(maybe);
            }
        }
        return list;
    }
}