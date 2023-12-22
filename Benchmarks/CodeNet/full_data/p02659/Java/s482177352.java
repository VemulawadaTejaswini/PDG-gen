
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        BigDecimal b1 = new BigDecimal(a);
        BigDecimal b2 = new BigDecimal(b);
        BigDecimal b3 = b1.multiply(b2);
        BigDecimal ans = b3.setScale(0, RoundingMode.DOWN);
        System.out.println(ans);
    }
}
