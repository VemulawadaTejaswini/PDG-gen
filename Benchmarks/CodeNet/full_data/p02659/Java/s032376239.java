import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		int a = std.nextInt();
		double b = std.nextDouble();
		double c = a * b;
		
		BigDecimal bd = new BigDecimal(String.valueOf(c));
		
		BigDecimal bd1 = bd.setScale(0, RoundingMode.DOWN);
		System.out.println(bd1.toPlainString());
	}

}
