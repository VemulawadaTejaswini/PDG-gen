import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numN = scan.nextInt();

		List<BigDecimal> numA = new ArrayList<>();

		for (int i = 0; i < numN; i++) {
			numA.add((BigDecimal.ONE).divide(scan.nextBigDecimal()).setScale(7));
		}

		BigDecimal sum = BigDecimal.ZERO;

		for (BigDecimal num: numA) {
			sum = sum.add(num);
		}

		System.out.println((BigDecimal.ONE).divide(sum).setScale(7));
	}
}
