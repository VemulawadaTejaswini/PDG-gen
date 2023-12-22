import java.util.*;
import java.math.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			BigDecimal x1 = scan.nextBigDecimal();
			BigDecimal y1 = scan.nextBigDecimal();
			BigDecimal ax = scan.nextBigDecimal().subtract(x1);
			BigDecimal ay = scan.nextBigDecimal().subtract(y1);
			BigDecimal x3 = scan.nextBigDecimal();
			BigDecimal y3 = scan.nextBigDecimal();
			BigDecimal bx = scan.nextBigDecimal().subtract(x3);
			BigDecimal by = scan.nextBigDecimal().subtract(y3);
			boolean flag = false;
			flag = ax.multiply(by).compareTo(ay.multiply(bx)) == 0;
			System.out.printf("%s\n", flag? "YES" : "NO");
		}
	}
}