import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		int min_arg = -1, max_arg = -1;
		ArrayList<Integer> add_sub = new ArrayList<>();
		ArrayList<Integer> add = new ArrayList<>();

		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextLong();
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
			if (max == a[i])
				max_arg = i;
			if (min == a[i]) {
				min_arg = i;
			}
		}
		if (max + min >= 0) {
			for (int i = 0; i < n; ++i) {
				if (a[i] < 0) {
					a[i] += max;
					add.add(max_arg);
					add_sub.add(i);
				}
			}
			for (int i = 1; i < n; ++i) {
				if (a[i - 1] > a[i]) {
					a[i] += max;
					add.add(max_arg);
					add_sub.add(i);
					if (a[i] > max) {
						max = a[i];
						max_arg = i;
					}
				}
			}
		} else if (min + max < 0) {
			for (int i = 0; i < n; ++i) {
				if (a[i] > 0) {
					a[i] += min;
					add.add(min_arg);
					add_sub.add(i);
				}
			}
			for (int i = n - 2; i >= 0; --i) {
				if (a[i] > a[i + 1]) {
					a[i] += min;
					add.add(min_arg);
					add_sub.add(i);
					if (a[i] < min) {
						min = a[i];
						min_arg = i;
					}
				}
			}
		}
		System.out.println(add.size());
		for (int i = 0; i < add.size(); ++i) {
			System.out.println((add.get(i) + 1) + " " + (add_sub.get(i) + 1));
		}

	}
}
