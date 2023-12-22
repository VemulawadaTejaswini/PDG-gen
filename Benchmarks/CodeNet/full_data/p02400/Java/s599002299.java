import java.util.Scanner;
import java.math.*;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		BigDecimal x = new BigDecimal(a*a*3.14159265359);
		x = x.setScale(6, BigDecimal.ROUND_HALF_UP);
		BigDecimal y = new BigDecimal(2*a*3.14159265359);
		y = y.setScale(6, BigDecimal.ROUND_HALF_UP);
		System.out.println(x +" "+ y);
	}
}