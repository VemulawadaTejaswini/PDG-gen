
import java.util.Scanner;

public class Main {

	public static int gcd(int a, int b) {
		int r = a % b;
		while ((r = a % b) != 0) {
			a = b;
			b = r;
		}
		return b;
	}

	public static void main(String[] args) {
		int n, X, min = 0;
		int x[];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		X = sc.nextInt();
		x = new int[n];

		for (int i = 0; i < n; ++i) {
			x[i] = sc.nextInt();
			if (i > 0) {
				min = gcd(min, Math.abs(x[i] - X));
			} else {
				min = Math.abs(x[i] - X);
			}
		}

		System.out.println(min);
		sc.close();
	}

}
