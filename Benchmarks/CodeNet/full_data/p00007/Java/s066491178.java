import java.io.IOException;
import java.util.Scanner;

public class Main {
	private static final int debt = 100000;

	public static void main(String[] a) throws IOException {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int debtSum = debt;
		for (int i = 0; i < len; i++) {
			debtSum = (int) (Math.ceil((debtSum * 1.05) / 1000) * 1000);
		}
		System.out.println(debtSum);
	}
}