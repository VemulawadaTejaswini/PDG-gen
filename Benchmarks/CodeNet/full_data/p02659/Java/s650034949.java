import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble() * a;
		BigDecimal bd = new BigDecimal(String.valueOf(b));
		
		BigDecimal bd1 = bd.setScale(0, RoundingMode.DOWN);
        System.out.println(bd1.toPlainString());
    }
}