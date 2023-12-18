import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt(), m = sc.nextInt(), c = sc.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < m; j++) {
				sum += sc.nextInt() * b[j];

			}
			if (sum + c > 0) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}