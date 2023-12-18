import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int a[] = new int[n + 2];

		int sumCost = 0;

		for (int i = 1; i < n + 1; i++) {
			a[i] = sc.nextInt();
			sumCost += Math.abs(a[i] - a[i - 1]);
		}
		sumCost += Math.abs(a[n]);
		a[n + 1] = 0;

		for (int i = 1; i < n + 1; i++) {
			if ((a[i] - a[i - 1]) * (a[i] - a[i + 1]) > 0) {

				System.out.println(sumCost - 2 * Math.min(Math.abs(a[i] - a[i - 1]), Math.abs(a[i] - a[i + 1])));
			} else {
				System.out.println(sumCost);
			}

		}

	}

}
