import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			BigDecimal ar = sqrt(new BigDecimal(a), 300);
			BigDecimal br = sqrt(new BigDecimal(b), 300);
			BigDecimal cr = sqrt(new BigDecimal(c), 300);

			if(ar.add(br).compareTo(cr) < 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

    private static BigDecimal sqrt(BigDecimal a, int scale){
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
