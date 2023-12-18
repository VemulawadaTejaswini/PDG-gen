import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] input = new int[N];
		for (int i = 0; i < N; i++) {
			int inputInt = sc.nextInt();
			input[i] = Math.abs(inputInt - X);
		}
		int res = input[0];
		for (int i = 1; i < N; i++) {
			res = gcd(res, input[i]);
		}
		System.out.print(res);
	}

	private static int gcd(int res, int input) {
		int m = res;
		int n = input;
		while (m * n != 0) {
			if (m <= n) {
				n = n % m;
			} else {
				m = m % n;
			}
		}
		return Math.max(m, n);
	}
}
