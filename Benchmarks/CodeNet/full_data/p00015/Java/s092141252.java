import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int dataSet = scan.nextInt();
		BigDecimal[] ans = new BigDecimal[dataSet];

		for (int i = 0; i < dataSet; i++) {
			ans[i] = scan.nextBigDecimal().add(scan.nextBigDecimal());
		}

		for (int i = 0; i < dataSet; i++) {
			System.out.println(ans[i]);
		}
	}
}