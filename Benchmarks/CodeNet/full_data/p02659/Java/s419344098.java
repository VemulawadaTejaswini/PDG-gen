import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		
		double math = A*B;
		BigDecimal bd = new BigDecimal(String.valueOf(math));
		BigDecimal bd1 = bd.setScale(0,RoundingMode.DOWN);
		System.out.println(bd1);
	}

}
