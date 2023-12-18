import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] values = new int[n];
		for (int i = 0; i < n; i++) {
			values[i] = sc.nextInt();
		}
		ArrayList<Integer> leftList = new ArrayList<>();
		long leftSum = 0;
		long max = Long.MIN_VALUE;
		for (int i = 0; i <= n && i <= k; i++) {
			if (i != 0) {
				if (values[i - 1] < 0) {
					leftList.add(values[i - 1]);
				} else {
					leftSum += values[i - 1];
				}
			}
			long sum = leftSum;
			ArrayList<Integer> list = new ArrayList<Integer>(leftList);
			for (int j = 0; i + j < n && i + j <= k; j++) {
				if (j != 0) {
					if (values[n - j] < 0) {
						list.add(values[n - j]);
					} else {
						sum += values[n - j];
					}
				}
				Collections.sort(list);
				long ans = sum;
				for (int l = k - i - j; l < list.size(); l++) {
					ans += list.get(l);
				}
				max = Math.max(max, ans);
			}
		}
		System.out.println(max);
	}
}
