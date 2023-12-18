import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		System.out.println(Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c) ? "Yes" : "No");
	}
}