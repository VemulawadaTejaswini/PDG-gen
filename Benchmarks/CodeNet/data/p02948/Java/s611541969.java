import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] ab = new int[n][2];

		for (int i = 0; i < n; i++) {
			ab[i][1] = sc.nextInt();
			ab[i][0] = sc.nextInt();
		}
		Arrays.sort(ab, (a, b) -> Integer.compare(a[0], b[0]));

		int sum = 0;

		int day = m;
		for (int i = n - 1; i >= Math.max(n - m, 0); i--) {
			if (ab[i][1] <= day) {
				sum += ab[i][0];
				day--;
				if (day == 0) {
					break;
				}
			}
		}
		System.out.println(sum);
		sc.close();

	}
}
