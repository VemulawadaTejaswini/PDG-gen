import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] p = new int[n];
		int[] q = new int[n];
		int b = 0;

		for (int i = 0; i < n; i++) {
			p[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			q[i] = scanner.nextInt();
		}

		int result = num(p, n) - num(q, n);
		System.out.println(Math.abs(result));
	}

	private static int num(int[] p, int n) {
		int a = 0;
		int inversion;
		for (int i = 0; i < n - 1; i++) {
			inversion = 0;
			for (int j = i + 1; j < n; j++) {
				if (p[i] > p[j]) {
					inversion++;
				}
			}
			a += inversion;
			a *= (n - i - 1);
		}
		return a;
	}

}
