import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		double ans = 0;
		int n = sc.nextInt();
		double[] a = new double[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextDouble();
			ans += 1 / a[i];
		}
		ans = 1 / ans;
		System.out.println(ans);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}