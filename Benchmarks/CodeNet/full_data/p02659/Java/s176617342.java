import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        double ans = A * B;
        BigDecimal bd = new BigDecimal(ans);
        bd = bd.setScale(0, BigDecimal.ROUND_FLOOR);
        
        System.out.println(String.format("%.0f", bd));
    }
}
