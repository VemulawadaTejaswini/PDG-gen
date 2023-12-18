import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		double b;

		if (d == 0) {
			b = ((double) (m - 1)) / ((double)n);
		} else {
			b = ((double) (2 * (n - d) * (m - 1))) / ((double)Math.pow(n, 2));
		}

		System.out.println(b);

		return;
	}
}
