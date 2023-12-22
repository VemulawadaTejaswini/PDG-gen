import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String  N = sc.next();

	String k = sc.next();
	BigDecimal b1 = new BigDecimal(N);
	BigDecimal b2 = new BigDecimal(k);
	
	BigDecimal b3 = b1.multiply(b2);
	System.out.printf("%.0f\n",b3);
}
}
