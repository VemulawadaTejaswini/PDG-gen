import java.util.Scanner;
import java.math.*;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		BigDecimal x = new BigDecimal(a*a*Math.PI);
		x = x.setScale(6, BigDecimal.ROUND_HALF_UP);
		BigDecimal y = new BigDecimal(2*a*Math.PI);
		y = y.setScale(6, BigDecimal.ROUND_HALF_UP);
		System.out.println(x +" "+ y);
	}
}