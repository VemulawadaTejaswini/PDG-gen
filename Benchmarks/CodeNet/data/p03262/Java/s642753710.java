import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] point = new int[n + 1];
		int[] diff = new int[n];
		int ans = 1000000000;

		point[n] = x;

		for (int i = 0; i < n; i++) {
			point[i] = sc.nextInt();
		}

		Arrays.sort(point);

		for (int i = 0; i < n; i++) {
			diff[i] = point[i + 1] - point[i];
			if (diff[i] < ans) {
				ans = diff[i];
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (diff[i] % ans != 0) {
				ans = 1;
				break;
			}
		}

		System.out.println(ans);

		sc.close();
	}
}