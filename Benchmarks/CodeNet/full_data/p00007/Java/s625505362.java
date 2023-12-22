import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main{
	public static void main(String[] a){
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
        scanner.close();
		if (input > 100) return;
		long loan = 100000;
		double interest = 0.05;
		for (int i = 0; i < input; i++) {
			loan += (loan*interest);
			loan = new BigDecimal(loan).setScale(-3, RoundingMode.UP).longValue();
		}
		System.out.println(loan);
	}
}