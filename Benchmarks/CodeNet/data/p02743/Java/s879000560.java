import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String a = scan.next();
	String b = scan.next();
	String c = scan.next();
	BigDecimal a0 = sqrt(new BigDecimal(a), 50);
	BigDecimal b0 = sqrt(new BigDecimal(b), 50);
	BigDecimal c0 = sqrt(new BigDecimal(c), 50);
        if(a0.add(b0).compareTo(c0)==-1)System.out.println("Yes\n");
	else System.out.println("No\n");
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
