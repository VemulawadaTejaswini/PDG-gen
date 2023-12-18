import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int max = 0;
		int min = 0;
		int maxidx = 0;
		int minidx = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > 0) {
				if (a[i] > max) {
					max = a[i];
					maxidx = i + 1;
				}
			} else {
				if (a[i] < min) {
					min = a[i];
					minidx = i + 1;
				}
			}
		}

		int ans = 0;
		List<Integer> x = new ArrayList<>();
		List<Integer> y = new ArrayList<>();
		if (max > -min) {
			for (int i = 0; i < n; i++) {
				if (a[i] < 0) {
					x.add(maxidx);
					y.add(i + 1);
					ans++;
				}
			}
			for (int i = 1; i < n; i++) {
				x.add(i);
				y.add(i + 1);
				ans++;
			}
		} else {
			for (int i = 0; i < n; i++) {
				if (a[i] > 0) {
					x.add(minidx);
					y.add(i + 1);
					ans++;
				}
			}
			for (int i = n; i > 1; i--) {
				x.add(i);
				y.add(i - 1);
				ans++;
			}
		}
		System.out.println(ans);
		for (int i = 0; i < ans; i++) {
			System.out.println(x.get(i) + " " + y.get(i));
		}
	}
}
