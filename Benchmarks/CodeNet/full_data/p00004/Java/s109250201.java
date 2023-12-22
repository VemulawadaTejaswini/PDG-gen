import java.math.BigDecimal;
import java.util.Scanner;

   class Main{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        double e = scan.nextDouble();
        double f = scan.nextDouble();

        double y = (c * d - a * f) / (b * d - a * e);

        double x = (c - b * y) / a;
        BigDecimal big1 = new BigDecimal(y);
        BigDecimal big2 = new BigDecimal(x);

        BigDecimal bigY = big1.setScale(3, BigDecimal.ROUND_HALF_UP);
        BigDecimal bigX = big2.setScale(3, BigDecimal.ROUND_HALF_UP);

        System.out.println(bigX + " " + bigY);

        scan.close();

    }

}