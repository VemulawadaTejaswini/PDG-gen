import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b;
		int d,r;
		float f;

		a = scan.nextInt();
		b = scan.nextInt();

		d = a / b;
		r = a % b;
		f = (float)a / (float)b;

		System.out.printf("%d %d %.5f\n", d, r, f);
	}
}