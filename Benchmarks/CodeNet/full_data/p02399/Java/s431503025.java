import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		int d = a / b;
		int r = a % b;
		double da = (double)a;
		double db = (double)b;
		double f = da / db;
		System.out.println(d + " " + r + " " + f);
	}
}