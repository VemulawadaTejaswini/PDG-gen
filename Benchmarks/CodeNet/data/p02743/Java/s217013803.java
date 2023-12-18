import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();


        BigDecimal as = BigDecimal.valueOf(a);
        BigDecimal bs = BigDecimal.valueOf(b);
        BigDecimal cs = BigDecimal.valueOf(c);

        if ((as.sqrt(MathContext.DECIMAL128).add(bs.sqrt(MathContext.DECIMAL128))).compareTo(cs.sqrt(MathContext.DECIMAL128)) == -1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }


}
