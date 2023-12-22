import java.util.*;
import java.math.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<String> list = new ArrayList<String>();

		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			BigDecimal x1 = scan.nextBigDecimal();
			BigDecimal y1 = scan.nextBigDecimal();
			BigDecimal x2 = scan.nextBigDecimal();
			BigDecimal y2 = scan.nextBigDecimal();
			BigDecimal x3 = scan.nextBigDecimal();
			BigDecimal y3 = scan.nextBigDecimal();
			BigDecimal x4 = scan.nextBigDecimal();
			BigDecimal y4 = scan.nextBigDecimal();

			BigDecimal ax = x2.subtract(x1);
			BigDecimal ay = y2.subtract(y1);

			BigDecimal bx = x4.subtract(x3);
			BigDecimal by = y4.subtract(y3);

			BigDecimal thetaA = ax.multiply(Math.tan(ay.divide(ax)));
			BigDecimal thetaB = bx.multiply(Math.tan(by.divide(bx)));
			
			if(thetaA == thetaB){
				list.add("YES");
			} else{
				list.add("NO");
			}
		}

		for(String s : list){
			System.out.printf("%s\n", s);
		}
	}
}