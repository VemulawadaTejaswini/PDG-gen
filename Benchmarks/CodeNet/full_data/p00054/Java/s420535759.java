import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {

		while (sc.hasNext()) {

			double a = sc.nextDouble();
			double b = sc.nextDouble();
			int n = sc.nextInt();

			double c = a / b;

			double kei = 0;
			int kei2 =0;


			int ans = 0;

			for (int i = 1; i <= n; i++) {
				kei = (c * (Math.pow(10, i)));
				BigDecimal bd = new BigDecimal(kei);
				BigDecimal bd3 = bd.setScale(0, BigDecimal.ROUND_DOWN);
				kei2=bd3.intValue()%10;
				ans = ans + kei2;
			}
			System.out.println(ans);
		}

	}

}