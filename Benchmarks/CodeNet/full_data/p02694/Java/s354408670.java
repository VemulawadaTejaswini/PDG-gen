import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = Long.parseLong(sc.next());
		sc.close();

		BigDecimal bd1 = new BigDecimal("100");
		BigDecimal bd2 = new BigDecimal("1.01");
		BigDecimal bd3 = new BigDecimal(String.valueOf(X));

		int year = 0;
		while(bd1.compareTo(bd3) == -1) {
			bd1 = bd1.multiply(bd2);
			bd1 = bd1.setScale(0, RoundingMode.DOWN);
			year++;
		}
		System.out.println(year);
	}

}