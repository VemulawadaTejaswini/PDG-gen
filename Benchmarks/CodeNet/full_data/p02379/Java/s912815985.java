
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		
		System.out.println(Math.sqrt(Math.pow(x1+y1, 2)+Math.pow(x2+y2, 2)));
	}
}