package hello;
import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
				Scanner input = new Scanner(System.in);	
				BigDecimal a = input.nextBigDecimal();
				BigDecimal b=input.nextBigDecimal();
				BigDecimal c=input.nextBigDecimal();
				BigDecimal r1 = sqrt(a);
				BigDecimal r2 = sqrt(b);
				BigDecimal r3 = sqrt(c);
				r1= r1.add(r2);
				if(r1.compareTo(r3)==-1) System.out.print("Yes");
				else System.out.print("No");
				input.close();
	}
	public static BigDecimal sqrt(BigDecimal num) {
        if(num.compareTo(BigDecimal.ZERO) < 0) {
            return BigDecimal.ZERO;
        }
        BigDecimal x = num.divide(new BigDecimal("2"), MathContext.DECIMAL128);
        while(x.subtract(x = sqrtIteration(x, num)).abs().compareTo(new BigDecimal("0.00000000000000000000001")) > 0);
        return x;
    }
     
    private static BigDecimal sqrtIteration(BigDecimal x, BigDecimal n) {
        return x.add(n.divide(x, MathContext.DECIMAL128)).divide(new BigDecimal("2"), MathContext.DECIMAL128);
    }

}
