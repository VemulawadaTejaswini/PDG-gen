
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			double a = scanner.nextDouble();
			if (a == -1) {
				break;
			}
			double result =  a / 2;
			while (true) {
				if (Math.abs(Math.pow(result, 3)- a ) < 0.0001 * a) {
					break;
				}
				double b = (Math.pow(result, 3) - a) / (3 * result * result);
				result -= b;
			
			}
			System.out.println(result);
		}

	}
}