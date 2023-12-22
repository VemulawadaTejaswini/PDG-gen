import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        BigDecimal a = new BigDecimal(scn.nextDouble());
        BigDecimal b = new BigDecimal(scn.nextDouble());

        a = a.multiply(b);

        long ans = a.longValue();

        System.out.println(ans);

        scn.close();


    }


}
