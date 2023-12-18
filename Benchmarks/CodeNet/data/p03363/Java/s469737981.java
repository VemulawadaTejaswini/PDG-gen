import java.util.Scanner;

public class Main {

	int n;
	int[] a;

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println(fnc());
		}
	}

	String fnc() {
		long cnt = 0L;

		for (int i = 0; i < n; i++) {
			long sum = a[i];
			if (sum == 0L) {
				cnt++;
			}
			for (int j = i + 1; j < n; j++) {
				sum += a[j];
				if (sum == 0L) {
					cnt++;
				}
			}
		}

		return "" + cnt;
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
