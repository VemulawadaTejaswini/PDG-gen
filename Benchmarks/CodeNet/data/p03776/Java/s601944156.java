import java.util.*;

public class Main {

	public static void main (String[] args)  {
		long[][] comb = new long[51][51];
		for (int i = 1; i <= 50; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					comb[i][j] = 1;
				} else {
					comb[i][j] = comb[i - 1][j - 1] + comb[i - 1][j];
				}
			}
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		Arrays.sort(arr);
		long max = arr[n - 1];
		double total = 0;
		long target = arr[n - a];
		for (int i = 0; i < a; i++) {
			total += arr[n - i - 1];
		}
		int count = 0;
		int aCount = 0;
		int bCount = 0;
		int minIdx = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] == target) {
				count++;
				if (i >= n - a) {
					aCount++;
				} else if (i >= n - b) {
					bCount++;
				}
			}
		}
		long ans = 0;
		if (target == max) {
			for (int i = 0; i <= bCount; i++) {
				ans += comb[count][aCount + i];
			}
		} else {
			ans = comb[count][aCount];
		}
		System.out.println(java.math.BigDecimal.valueOf(total / a).toPlainString());
		System.out.println(ans);
	}
}
