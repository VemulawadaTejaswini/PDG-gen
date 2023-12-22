import java.math.BigDecimal;
import java.util.Scanner;


class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		double f = 1.0 * x / y;
		BigDecimal g = new BigDecimal(f);
		g = g.setScale(3,BigDecimal.ROUND_HALF_UP);
		System.out.printf(x/y + " " + x%y + " " + "%.3f",g);
	}
}