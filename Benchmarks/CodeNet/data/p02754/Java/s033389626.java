import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double N = sc.nextDouble();
		double A = sc.nextDouble();
		double B = sc.nextDouble();

		double ballCount = 0;
		double blueBallCount = 0;

		double i = 1;
		while (true) {
			if (i % 2 != 0) {
				ballCount += A;
				blueBallCount += A;
			} else {
				ballCount += B;
			}

			if (ballCount >= N) {
				if (i % 2 != 0) {
					blueBallCount = blueBallCount - (ballCount - N);
				}
				break;
			}
			i++;
		}

		BigDecimal result = new BigDecimal(blueBallCount);
		System.out.println(result);

		sc.close();
	}
}