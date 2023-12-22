import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		String s = "";
		double ml = a * b ;
		BigDecimal bd = new BigDecimal(String.valueOf(ml));
		BigDecimal bd1 = bd.setScale(0, RoundingMode.DOWN);
		s = bd1.toPlainString();
			System.out.println(s);


	}

}
