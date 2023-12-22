import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str_x1 = scan.next();
		String str_y1 = scan.next();
		String str_x2 = scan.next();
		String str_y2 = scan.next();
		BigDecimal str_x1_big = new BigDecimal(str_x1);
		BigDecimal str_y1_big = new BigDecimal(str_y1);
		BigDecimal str_x2_big = new BigDecimal(str_x2);
		BigDecimal str_y2_big = new BigDecimal(str_y2);
		BigDecimal a = str_x2_big.subtract(str_x1_big);
		BigDecimal b = a.multiply(a);
		BigDecimal c = str_y2_big.subtract(str_y1_big);
		BigDecimal d = c.multiply(c);
		BigDecimal e = b.add(d);
		int f = e.intValue();
		double g = Math.sqrt(f);
		System.out.println(g);
	}
}


		

	