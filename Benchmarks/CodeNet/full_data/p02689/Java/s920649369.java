import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] height = new int[n];

		for (int i = 0; i < n; i++) {
			height[i] = sc.nextInt();
		}

		int[] ma = new int[n];
		for (int i = 0; i < m; i++) {
			int a, b;
			a = sc.nextInt();
			b = sc.nextInt();
			ma[a - 1] = Math.max(ma[a - 1], height[b - 1]);
			ma[b - 1] = Math.max(ma[b - 1], height[a - 1]);
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (height[i] > ma[i]) {
				ans++;
			}
		}
		System.out.println(ans);
		sc.close();

	}

}
