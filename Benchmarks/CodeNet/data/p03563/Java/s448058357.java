import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextInt();
		double g = scan.nextInt();
		double point = g - r;
		point = r + (2 * point);
		System.out.println((int)point);
	}
}