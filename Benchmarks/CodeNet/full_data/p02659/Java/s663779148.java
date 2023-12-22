import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        sc.close();

        BigDecimal bd1 = new BigDecimal(A);
        BigDecimal bd2 = new BigDecimal(B);

        DecimalFormat format = new DecimalFormat("#");
        // 小数点以下の最小値
        format.setMinimumFractionDigits(0);
        // 小数点以下の最大値
        format.setMaximumFractionDigits(0);

        System.out.println(format.format(bd2.multiply(bd1)));
    }
}
