import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        double m = sc.nextDouble();

        BigDecimal b = BigDecimal.valueOf(n);
        BigDecimal c = BigDecimal.valueOf(m);
        System.out.println(b.multiply(c).setScale(0, BigDecimal.ROUND_DOWN));
    }
}