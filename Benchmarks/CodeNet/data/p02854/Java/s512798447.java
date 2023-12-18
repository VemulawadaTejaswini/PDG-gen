import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		int tot = 0;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			tot += a[i];
		}
		if (tot % 2 == 1) {
			cnt++;
		}

		int l_sum = 0;
		int r_sum = 0;

		for (int i = 0; i < n; i++) {
			if (l_sum < tot / 2) {
				l_sum += a[i];

			} else {
				r_sum = l_sum + a[i];
				break;
			}
		}
//		System.out.println(l_sum + " " + r_sum);
		cnt += Math.min(Math.abs(tot / 2 - l_sum), Math.abs(r_sum - tot / 2));
		System.out.println(cnt);
		sc.close();
	}
}