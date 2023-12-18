import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	double a = sc.nextDouble();
    	double b = sc.nextDouble();
    	double c = sc.nextDouble();
    	sc.close();
    	BigDecimal aa = sqrt(new BigDecimal(a), 50);
    	BigDecimal bb = sqrt(new BigDecimal(b), 50);
    	BigDecimal cc = sqrt(new BigDecimal(c), 50);
    	boolean ans = false;
    	if(aa.add(bb).compareTo(cc) == -1){
    		ans = true;
    	}
    	System.out.println(ans?"Yes":"No");
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