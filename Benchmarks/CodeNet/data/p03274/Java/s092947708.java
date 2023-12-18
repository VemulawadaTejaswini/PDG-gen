import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] x = new int[n];
		int[] time = new int[n - k + 1];
		int ans = 0;

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}

		for (int i = 0; i < n - k + 1; i++) {
			for (int j = 0; j < k; j++) {
				time[i] += x[j + i];
			}
			if (x[i] < x[i+k-1]) {
				time[i] += x[i];
			} else {
				time[i] += x[i+k-1];
			}
		}

		Arrays.sort(time);
		
		ans = time[0];

		System.out.println(ans);
		sc.close();
	}
}