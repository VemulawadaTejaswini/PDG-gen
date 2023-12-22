import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		int t1 = a / b;
		int t2 = a % b;
		double t3 = (double) a / b;
		if(b == 1) {
			System.out.println(t1 + " " + t2 + " " + t1);
		}else {
			System.out.println(t1 + " " + t2 + " " + BigDecimal.valueOf(t3).toPlainString());
		}
	}
}
