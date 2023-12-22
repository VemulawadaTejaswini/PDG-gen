import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		double a = r * r * Math.PI;
		double b = r * 2 * Math.PI;
		System.out.println(a + " " + b);
	}
}