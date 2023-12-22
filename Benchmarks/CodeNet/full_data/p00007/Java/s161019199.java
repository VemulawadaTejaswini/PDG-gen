import java.math.BigDecimal;
import java.util.Scanner;

 class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int week = scanner.nextInt();

		BigDecimal debt = new BigDecimal(100000);
		BigDecimal rate = new BigDecimal(1.05);

		for (int i = 0; i < week; i++) {

			debt = debt.multiply(rate);
			BigDecimal amari = debt.remainder(new BigDecimal(1000));

			if(amari !=new BigDecimal(0)){

				debt = debt.add(new BigDecimal(1000)).subtract(amari);
			}
		}

		System.out.println(debt);

		scanner.close();
	}
}