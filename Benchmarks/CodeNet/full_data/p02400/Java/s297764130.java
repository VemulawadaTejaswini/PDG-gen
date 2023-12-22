import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        double cir = (r * 2) * Math.PI;
        //r???2???*?????¨???
        double area = Math.pow(r, 2) * Math.PI;
        BigDecimal bigDecimalCir = new BigDecimal(cir);
        BigDecimal bigDecimal1Area = new BigDecimal(area);
        BigDecimal roundUpCir = bigDecimalCir.setScale(6, BigDecimal.ROUND_UP);
        BigDecimal roundUpArea = bigDecimal1Area.setScale(6, BigDecimal.ROUND_UP);

        System.out.println(roundUpCir + " " + roundUpArea);
    }
}