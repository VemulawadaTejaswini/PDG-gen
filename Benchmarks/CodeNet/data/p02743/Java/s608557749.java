import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		BigDecimal bdA = new BigDecimal(Math.sqrt(a));
		BigDecimal bdB = new BigDecimal(Math.sqrt(b));
		BigDecimal bdC = new BigDecimal(Math.sqrt(c));

		BigDecimal total = bdA.add(bdB);

		if(bdC.compareTo(total) == 1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}
}
