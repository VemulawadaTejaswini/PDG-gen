
import java.util.Scanner;

public class Main {
	int parent(int i) {
		return i / 2;
	}

	int left(int i) {
		return 2 * i;
	}

	int right(int i) {
		return 2 * i + 1;
	}

	public static void main(String[] args) {
		new Main().run();

	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] A = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			A[i] = scanner.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			System.out.printf("node %d: key = %d, ", i, A[i]);
			if (parent(i) >= 1)
				System.out.printf("parent key = %d, ", A[parent(i)]);
			if (left(i) <= n)
				System.out.printf("left key = %d, ", A[left(i)]);
			if (right(i) <= n)
				System.out.printf("right key = %d, ", A[right(i)]);
			System.out.println();
		}

	}

}