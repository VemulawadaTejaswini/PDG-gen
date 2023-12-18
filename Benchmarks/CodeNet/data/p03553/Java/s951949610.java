import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();

		int a[] = new int[n + 1];
		long sum = 0;

		for (int i = 1; i < n + 1; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}

		for (int i = n; i > 0; i--) {

			long ssum = 0;
			for (int j = i; j < n+1; j += i) {
				ssum += a[j];
			}
//			System.out.println(i+" , " + ssum);

			if (ssum < 0) {
				for (int j = i; j < n+1; j += i) {
					sum -= a[j];
					a[j] = 0;
				}
			}
		}
		
		System.out.println(sum);

	}
}
