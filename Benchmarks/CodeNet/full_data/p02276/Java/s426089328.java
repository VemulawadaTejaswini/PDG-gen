
import java.util.Scanner;

public class Main {
	long count = 0;

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = scanner.nextInt();
		}
		int part = partition(A, 0, n - 1);
		for (int i = 0; i < n; i++) {
			if (part == i) {
				System.out.print("[" + A[i] + "]");
			} else {
				System.out.print(A[i]);
			}
			System.out.print(i == n - 1 ? "\n" : " ");
		}
	}

	private int partition(int[] a, int p, int r) {
		int work;
		int i = p - 1;
		for (int j = p; j < r ; j++) {
			if (a[j] < a[r]) {
				i++;
				work = a[i];
				a[i] = a[j];
				a[j] = work;
			}
		}
		work = a[i + 1];
		a[i + 1] = a[r];
		a[r] = work;
		return i + 1;
	}
}