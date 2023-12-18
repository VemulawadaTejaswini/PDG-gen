import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] min = new int[2];
		int[] max = new int[2];

		min[0] = Integer.MAX_VALUE;
		max[0] = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (min[0] > a[i]) {
				min[0] = a[i];
				min[1] = i;
			}
			if (max[0] < a[i]) {
				max[0] = a[i];
				max[i] = i;
			}
		}

		List<int[]> answer = new ArrayList<>();
		if (min[0] >= 0) {
			for (int i = 1; i < n; i++) {
				answer.add(new int[]{i - 1, i});
			}
		} else if (max[0] <= 0) {
			for (int i = n; i > 0; i--) {
				answer.add(new int[]{i, i - 1});
			}
		} else {
			if (Math.abs(min[0]) > Math.abs(max[0])) {
				for (int i = 0; i < n; i++) {
					if (a[i] > 0) answer.add(new int[]{min[1], i});
				}
				for (int i = n; i > 0; i--) {
					answer.add(new int[]{i, i - 1});
				}
			} else {
				for (int i = 0; i < n; i++) {
					if (a[i] < 0) answer.add(new int[]{max[1], i});
				}
				for (int i = 1; i < n; i++) {
					answer.add(new int[]{i - 1, i});
				}
			}
		}

		System.out.println(answer.size());
		for (int[] x : answer) {
			System.out.println(x[0] + " " + x[1]);
		}

	}
}
