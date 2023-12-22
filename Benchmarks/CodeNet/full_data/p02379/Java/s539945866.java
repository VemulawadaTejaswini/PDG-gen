
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double x1 = scn.nextDouble();
		double y1 = scn.nextDouble();
		double x2 = scn.nextDouble();
		double y2 = scn.nextDouble();
		double a = (x2 - x1) * (x2 - x1);
		double b = (y2 - y1) * (y2 - y1);
		System.out.println(Math.sqrt(a + b));
	}
}
