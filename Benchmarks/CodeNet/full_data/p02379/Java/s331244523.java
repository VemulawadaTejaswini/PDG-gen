
import java.text.MessageFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double x;
		double y;
		double c;
		double c2;
		if (x1 > x2) {
			x = x1 - x2;
		} else {
			x = x2 - x1;
		}
		if (y1 > y2) {
			y = y1 - y2;
		} else {
			y = y2 - y1;
		}
		c2 = x * x + y * y;
		c = Math.sqrt(c2);
		System.out.println(MessageFormat.format("{0,number,0.00000000} ", c));
		scanner.close();
	}
}

