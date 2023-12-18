import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		double sum = 0;
		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			String u = sc.next();
			if (u.equals("JPY")) {
				sum += x;
			} else {
				sum += x * 380000;
			}
		}
		System.out.println(sum);
	}
}