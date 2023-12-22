import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] r = new int[n];
		for (int t = 0; t < n; t++) {
			r[t] = sc.nextInt();
		}

		int min = Integer.MAX_VALUE;
		int ans = Integer.MIN_VALUE;


		for (int i = 0; i < n-1; i++) {
			// 最小値を求める
			if (min > r[i]) {
				min = r[i];
				int[] r2 = r.clone();
				Arrays.sort(r2, i+1, r2.length);
				ans = Math.max(ans, r2[r2.length-1] - min);
			}
		}
		System.out.println(ans);
	}

}

