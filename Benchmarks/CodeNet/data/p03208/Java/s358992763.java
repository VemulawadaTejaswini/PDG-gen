import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(h);
		int ans = Integer.MAX_VALUE;
		for (int i = k - 1; i < n; i++) {
			int d = h[i] - h[i - k + 1];
			ans = Math.min(ans, d);
		}
		System.out.println(ans);
	}
}
