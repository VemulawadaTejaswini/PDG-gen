import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] r = new int[n];
		for (int t = 0; t < n; t++) {
			r[t] = sc.nextInt();
		}

		int min = Integer.MIN_VALUE;
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (min > r[i]) {
				for (int j = i + 1; j < r.length; j++) {
					ans = Math.max(ans, r[j] - r[i]);
				}
			}
		}
		System.out.println(ans);
	}

}

