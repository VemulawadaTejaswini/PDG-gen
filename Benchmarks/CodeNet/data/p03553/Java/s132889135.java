import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveE();
	}

	private void solveE() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N + 1];
		long sum = 0L;
		for (int i = 1; i <= N; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		int min_x = -1;
		while (min_x != 0) {
			min_x = 0;
			long min = 0L;
			for (int x = 1; x <= 100; x++) {
				long tmp = 0L;
				for (int i = 1; i <= N; i++) {
					if (i % x == 0) {
						tmp += a[i];
					}
				}
				if (min > tmp) {
					min = tmp;
					min_x = x;
				}
			}
			if (min_x != 0) {
				for (int i = 1; i <= N; i++) {
					if (i % min_x == 0) {
						a[i] = 0;
					}
				}
				sum -= min;
			}
		}
		System.out.println(sum);
	}
}