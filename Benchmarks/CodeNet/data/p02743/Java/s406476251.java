import java.util.*;
import java.math.BigDecimal;
import java.math.MathContext;
public class Main {
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        
        final int a = sc.nextInt();
        final int b = sc.nextInt();
        final int c = sc.nextInt();
        sc.close();

        int scale = 50;
        BigDecimal ad = sqrt(new BigDecimal(a), scale);
        BigDecimal bd = sqrt(new BigDecimal(b), scale);
        BigDecimal cd = sqrt(new BigDecimal(c), scale);
        if (cd.compareTo(ad.add(bd)) == 1) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }

    public static BigDecimal sqrt(BigDecimal a, int scale){
        BigDecimal x = new BigDecimal(
                Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
        if(scale < 17) return x;

        BigDecimal b2 = new BigDecimal(2);
        for(int tempScale = 16; tempScale < scale; tempScale *= 2){
            x = x.subtract(
                    x.multiply(x).subtract(a).divide(
                    x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN));
        }
        return x;
    }
}