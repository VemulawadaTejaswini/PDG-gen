import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BigDecimal l = new BigDecimal(scan.next());
		l = l.divide(new BigDecimal("3"), 6, RoundingMode.HALF_UP);

		System.out.println(l.multiply(l).multiply(l));
	}
}