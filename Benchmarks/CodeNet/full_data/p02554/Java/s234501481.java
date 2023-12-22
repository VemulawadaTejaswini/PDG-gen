import java.math.BigDecimal;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigDecimal a = BigDecimal.TEN.pow(n);
        BigDecimal b = BigDecimal.valueOf(9).pow(n).multiply(BigDecimal.valueOf(2));
        BigDecimal c = BigDecimal.valueOf(8).pow(n);
        BigDecimal d = BigDecimal.TEN.pow(9).add(BigDecimal.valueOf(7));

        System.out.println(
                c.subtract(b).add(a).remainder(d)
        );
    }
}