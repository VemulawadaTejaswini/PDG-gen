import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double loan = 100000;
		int week;

		while ((scan.hasNext())) {
			week = Integer.parseInt(scan.next());
			for (int i = 0; i < week; i++) {
				loan = loan * 1.05;

				loan = loan / 1000.0;
				BigDecimal bi = new BigDecimal(String.valueOf(loan));
				loan = (bi.setScale(0, BigDecimal.ROUND_UP).doubleValue()) * 1000.0;
			}
			System.out.println((int) loan);

		}
	}
}