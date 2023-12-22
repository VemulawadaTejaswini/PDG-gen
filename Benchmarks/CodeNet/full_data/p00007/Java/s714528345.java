import java.io.IOException;
import java.util.Scanner;

public class Main {
	private static final int debt = 100000;
	public static void main(String[] a) throws IOException {
		Scanner sc = new Scanner(System.in);
		int debtSum;
		int interest = (int) (debt * 0.05); // ??????
		int duration = sc.nextInt();
		debtSum = duration * interest + debt;
		System.out.println((int) Math.ceil((double) debtSum / 10000) * 10000);
	}
}