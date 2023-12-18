import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int[] a = new int[N + 1];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = N - 1; i > 0; i -= 2) {
			System.out.print(a[i] + " ");
		}

		System.out.print(a[0] + " ");
		
		if ((N % 2) == 0) {
			for (int i = 2; i <= N - 2; i += 2) {
				System.out.print(a[i] + " ");
			}
		} else {
			for (int i = 1; i <= N - 2; i += 2) {
				System.out.print(a[i] + " ");
			}
		}

		System.out.println();

		sc.close();
	}
}