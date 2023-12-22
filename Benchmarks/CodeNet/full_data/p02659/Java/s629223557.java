import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        sc.close();

        BigDecimal bd1 = new BigDecimal(A);
        BigDecimal bd2 = new BigDecimal(B);

        System.out.println(bd2.multiply(bd1).setScale(0, BigDecimal.ROUND_HALF_UP));

    }
}
