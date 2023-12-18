import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        BigDecimal bda = new BigDecimal(a);
        BigDecimal bdb = new BigDecimal(b);
        BigDecimal bdc = new BigDecimal(c);
        BigDecimal ab = sqrt(bda,50).add(sqrt(bdb,50));
        System.out.println(sqrt(bdc,50).compareTo(ab) == 1 ? "Yes" : "No");
        sc.close();

    }
    public static BigDecimal sqrt(BigDecimal a, int scale){
        //とりあえずdoubleのsqrtを求める
        BigDecimal x = new BigDecimal(
                Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
        if(scale < 17) return x;

        BigDecimal b2 = new BigDecimal(2);
        for(int tempScale = 16; tempScale < scale; tempScale *= 2){
            //x = x - (x * x - a) / (2 * x);
            x = x.subtract(
                    x.multiply(x).subtract(a).divide(
                    x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN));
        }
        return x;
    }

}
