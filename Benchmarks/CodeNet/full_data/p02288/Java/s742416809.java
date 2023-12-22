
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			num[i] = scanner.nextInt();
		}
		for (int i = n / 2; i >= 1; i--) {
			maxHeapify(i, num);
		}
		for (int i = 1; i <= n; i++) {
			System.out.print(" " + num[i]);
		}
		System.out.println();
	}

	private void maxHeapify(int i, int[] num) {
		int l = i * 2;
		int r = i * 2 + 1;
		int H = num.length - 1;
		int largest = -1;
		if (l <= H && num[l] > num[i])
			largest = l;
		else
			largest = i;

		if (r <= H && num[r] > num[largest])
			largest = r;

		if (largest != i) {
			swap(i, largest, num);
			maxHeapify(largest, num);
		}
	}

	private void swap(int i, int largest, int[] num) {
		int t = num[i];
		num[i] = num[largest];
		num[largest] = t;
	}
}