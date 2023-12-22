import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        BigDecimal hourY =new BigDecimal(a * Math.sin(Math.toRadians((double)((60 * h) + m) * 0.5)));
        BigDecimal hourX = new BigDecimal(a * Math.cos(Math.toRadians((double)((60 * h) + m) * 0.5)));
        BigDecimal minuteY = new BigDecimal(b * Math.sin(Math.toRadians(6 * m)));
        BigDecimal minuteX = new BigDecimal(b * Math.cos(Math.toRadians(6 * m)));
        BigDecimal x = hourX.subtract(minuteX);
        BigDecimal y = hourY.subtract(minuteY);
        BigDecimal xx = x.multiply(x);
        BigDecimal yy = y.multiply(y);
        BigDecimal preResult = xx.add(yy);
        System.out.println(Math.sqrt(preResult.doubleValue()));



    }
}
