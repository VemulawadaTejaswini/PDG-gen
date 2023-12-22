import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[];

		n = sc.nextInt();
		while (n != 0) {
			a = new int[n];
			f(n, a, 0);
			n = sc.nextInt();
		}
	}

	public static void f(int n, int a[], int k) {
		if (n == 0) {
			for (int i = 0; i < k; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
		for (int i = n; 0 < i; i--) {
			if (k == 0 || i <= a[k - 1]) {
				a[k] = i;
				f(n - i, a, k + 1);
				a[k] = 0;
			}
		}
	}
}