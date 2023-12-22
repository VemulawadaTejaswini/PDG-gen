import java.util.Scanner;
import java.math.*;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		double b = a;
		BigDecimal x = new BigDecimal(b*b*Math.PI);
		x = x.setScale(6, BigDecimal.ROUND_HALF_UP);
		BigDecimal y = new BigDecimal(2*b*Math.PI);
		y = y.setScale(6, BigDecimal.ROUND_HALF_UP);
		System.out.println(x +" "+ y);
	}
}