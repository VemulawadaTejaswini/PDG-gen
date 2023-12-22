import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();
		int q = sc.nextInt();
		int ns[] = new int[300001];
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			ns[a] = a;
		}
		int ans = 0;
		for (int i = 0; i < q; i++) {

			int mod = sc.nextInt();
			for (int j = 1; (j * mod - 1) <= 300000; j++) {
				ans = Math.max(ans, ns[j * mod - 1] % mod);
			}
			System.out.println(ans);
		}

	}

	public static void main(String[] args) {

		new Main().run();
	}
}