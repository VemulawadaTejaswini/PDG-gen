import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        sc.close();

        Double res = A * B;
        String val = BigDecimal.valueOf(res).toPlainString();
        int index = val.indexOf(".");
        val = val.substring(0, index);

        System.out.println(val);

    }
}