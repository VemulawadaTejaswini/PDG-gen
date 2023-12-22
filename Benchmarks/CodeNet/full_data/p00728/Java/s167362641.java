import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Main().run();

	}

	void run() {
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int ss[] = new int[n];
			for (int i = 0; i < n; i++) {

				ss[i] = sc.nextInt();
			}
			Arrays.sort(ss);
			int sum = 0;
			for (int i = 1; i <= n - 2; i++) {
				sum += ss[i];
			}
			System.out.println(sum / (n - 2));
		}
	}
}