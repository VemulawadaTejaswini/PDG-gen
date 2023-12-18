import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			sum += a[i];
		}

		long[] answer = new long[n];
		for (int i = 1; i < n; i += 2) {
			answer[0] += a[i];
		}
		answer[0] *= -2;
		answer[0] += sum;
		for (int i = 1; i < n; i++) {
			answer[i] = 2 * a[i - 1] - answer[i - 1];
		}

		for (int i = 0; i < n; i++) {
			System.out.print(answer[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
}
