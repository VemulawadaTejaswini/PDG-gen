import java.io.IOException;
import java.util.Scanner;

public class Main {
	private static final int debt = 100000;

	public static void main(String[] a) throws IOException {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		sc.close();
		int debtSum = debt;
		for (int i = 0; i < len; i++) {
			int no = 1000;
			debtSum = (int) (Math.ceil((debtSum * 1.05) / no) * no);
		}
		System.out.println(debtSum);
	}
}