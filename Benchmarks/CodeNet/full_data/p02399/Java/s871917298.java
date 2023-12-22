import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		int d,r;
		double f;

		a = scan.nextInt();
		b = scan.nextInt();

		d = a / b;
		r = a % b;
		f = (double)a / (double)b;

		System.out.printf("%d %d %.5f\n", d, r, f);
	}
}