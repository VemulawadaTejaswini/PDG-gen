
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        BigDecimal a = cin.nextBigDecimal();
        BigDecimal b = cin.nextBigDecimal();
        BigDecimal c = cin.nextBigDecimal();

        BigDecimal ab = sqrt(a, 50).add(sqrt(b, 50));
        if(ab.compareTo(sqrt(c,50)) < 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
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
