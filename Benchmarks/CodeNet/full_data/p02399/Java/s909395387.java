import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int d;
		int r;
		float f;

		d = x / y;
		r = x % y;
		f = (float)x / y;

		System.out.printf("%d %d %f", d, r, f);

	}
}