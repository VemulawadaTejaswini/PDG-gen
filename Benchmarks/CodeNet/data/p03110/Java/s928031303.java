import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        BigDecimal rit = new BigDecimal("380000");
        BigDecimal ans = new BigDecimal("0");
        for (int i = 0; i < x; i++) {
            BigDecimal y = sc.nextBigDecimal();
            String z = sc.next();
            if (z.equals("JPY")) {
                ans = ans.add(y);
            } else {
                ans = ans.add(y.multiply(rit));
            }
        }
        System.out.println(ans.toString());
    }
}