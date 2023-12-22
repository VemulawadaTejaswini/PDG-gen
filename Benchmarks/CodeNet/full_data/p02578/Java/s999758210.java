import java.util.Scanner;

public class Main {

	static long solve(int n, int[] a) {
		long sum = 0;
		for (int i = 1; i < n; i++) {
			if (a[i] < a[i - 1]) {
				int num = a[i - 1] - a[i];
				sum += num;
				a[i] += num;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		long result = solve(n, a);
		System.out.println(result);

		stdIn.close();
	}
}
