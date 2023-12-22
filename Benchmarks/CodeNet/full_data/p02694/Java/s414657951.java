import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigDecimal N =new BigDecimal(sc.nextLine());
		BigDecimal money =new BigDecimal(100);
		BigDecimal r = new BigDecimal("100");
		int con = 0;
		while (money.compareTo(N) < 0) {
			money =money.add(money.divide(r, RoundingMode.FLOOR));
			con++;
		}

		System.out.println(con);

	}
}