import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();

		int[] y = new int[n];
		System.arraycopy(x, 0, y, 0, n);
		Arrays.parallelSort(y);

		int y1 = y[n / 2 - 1];
		int y2 = y[n / 2];
		for (int i = 0; i < n; i++) {
			if (y1 == y2) {
				System.out.println(y1);
			} else if (x[i] <= y1) {
				System.out.println(y2);
			} else {
				System.out.println(y1);
			}
		}
	}
}
