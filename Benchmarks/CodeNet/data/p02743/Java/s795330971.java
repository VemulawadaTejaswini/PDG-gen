import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        BigDecimal aa = sqrt(new BigDecimal(a), 50);
        BigDecimal bb = sqrt(new BigDecimal(b), 50);
        BigDecimal cc = sqrt(new BigDecimal(c), 50);
        aa = aa.add(bb);
        if (aa.compareTo(cc) == -1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static BigDecimal sqrt(BigDecimal a, int scale){

        BigDecimal x = new BigDecimal(Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
        if(scale < 17){
            x = x.setScale(scale, BigDecimal.ROUND_HALF_EVEN);
            return x;
        }

        BigDecimal b2 = new BigDecimal(2);
        for(int tempScale = 16; tempScale < scale; tempScale *= 2){
            x = x.subtract(
                    x.multiply(x).subtract(a).divide(
                            x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN));
        }
        return x;
    }
}