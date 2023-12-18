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
        BigDecimal div = new BigDecimal("0.08");
        BigDecimal x = noTax.divide(div, RoundingMode.DOWN);

        List<BigDecimal> list = new ArrayList<>();
        list.add(x);

        for (int i = 1, len = (100 - x.intValue()); i <= len; i++) {
            BigDecimal maybe = x.add(BigDecimal.valueOf(i));
            BigDecimal maybeNoTax = maybe.multiply(div).setScale(0, RoundingMode.DOWN);
            if (noTax.compareTo(maybeNoTax) == 0) {
                list.add(maybe);
            }
        }
        return list;
    }

    static List<BigDecimal> calc10(BigDecimal noTax) {
        BigDecimal div = new BigDecimal("0.1");
        BigDecimal x = noTax.divide(div, RoundingMode.DOWN);

        List<BigDecimal> list = new ArrayList<>();
        list.add(x);
        for (int i = 1, len = (100 - x.intValue()); i <= len; i++) {
            BigDecimal maybe = x.add(BigDecimal.valueOf(i));
            BigDecimal maybeNoTax = maybe.multiply(div).setScale(0, RoundingMode.DOWN);
            if (noTax.compareTo(maybeNoTax) == 0) {
                list.add(maybe);
            }
        }
        return list;
    }
}