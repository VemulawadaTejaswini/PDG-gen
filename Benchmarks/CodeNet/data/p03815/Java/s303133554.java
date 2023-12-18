import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal x = sc.nextBigDecimal();
        BigDecimal xx = x.divide(new BigDecimal("5.5"), 0, BigDecimal.ROUND_UP);
        System.out.println(xx);
    }
}