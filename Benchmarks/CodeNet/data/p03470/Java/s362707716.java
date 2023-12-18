import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Main instance = new Main();
		instance.solve();
	}

	private void solve() {
		try {
			int n = sc.nextInt();
			int[] d = new int[n];
			for (int i = 0; i < n; i++) {
				d[i] = sc.nextInt();
			}
			Arrays.sort(d);

			int count = 1;
			for (int i = 1; i < n; i++) {
				if (d[i - 1] != d[i]) {
					count++;
				}
			}
			System.out.println(count);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
