
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int X = Integer.parseInt(scan.next());

		int[] x = new int[N];
		for (int i = 0; i < N; i++) {
			x[i] = Integer.parseInt(scan.next());
		}
		int[] distance = new int[N];
		for (int i = 0; i < N; i++) {
			distance[i] = Math.abs(x[i] - X);
		}
		int result = distance[0];
		for (int i = 1; i < N; i++) {
			result = gcd(distance[i], result);
		}
		System.out.println(result);
	}

	public static int gcd(int x, int y) {
		if (x < y) {
			return gcd(y, x);
		}
		int r = x % y;
		if (r == 0) {
			return y;
		}
		return gcd(y, r);

	}
}
