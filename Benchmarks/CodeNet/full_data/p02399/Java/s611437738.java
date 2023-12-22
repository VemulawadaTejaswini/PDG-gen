import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int intA = scan.nextInt();
		int intB = scan.nextInt();
		int d = intA / intB;
		int r = intA % intB;
		double f = (intA/(double)intB);
		BigDecimal x = new BigDecimal(f);
		x = x.setScale(6, BigDecimal.ROUND_HALF_UP);

		System.out.println(d + " " + r + " " + x);
	}
}