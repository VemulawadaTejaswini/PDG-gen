import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		long max = arr[0];
		for (int a = n - 2; a >= (n + 1) / 2; a--) {
			for (int b = a - 1; b >= 1; b--) {
				int[] test = (int[])(arr.clone());
				int idx = 0;
				boolean flag = true;
				long point = 0;
				while (idx != n - 1) {
					point += test[idx];
					test[idx] = Integer.MIN_VALUE;
					idx += a;
					if (idx >= n || test[idx] == Integer.MIN_VALUE) {
						flag = false;
						break;
					}
					if (idx == n - 1) {
						break;
					}
					point += test[idx];
					test[idx] = Integer.MIN_VALUE;
					idx -= b;
					if (idx < 0 || test[idx] == Integer.MIN_VALUE) {
						flag = false;
						break;
					}
				}
				if (!flag) {
					break;
				}
				max = Math.max(point, max);
			}
		}
		System.out.println(max);
	}
}
