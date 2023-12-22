import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());

		long[] a = new long[n];
		long[] b = new long[m];
		a[0] = Long.parseLong(sc.next());
		for (int i = 1; i < n; i++)
			a[i] = a[i - 1] + Long.parseLong(sc.next());
		b[0] = Long.parseLong(sc.next());
		for (int i = 1; i < m; i++)
			b[i] = b[i - 1] + Long.parseLong(sc.next());

		int max_a = -1;
		for (int i = 0; i < n; i++) {
			if (a[i] > k)
				break;
			else
				max_a = i;
		}
		int max_b = -1;
		for (int i = 0; i < m; i++) {
			if (b[i] > k)
				break;
			else
				max_b = i;
		}

		int count = 0;
		if (max_a != -1)
			count = max_a + 1;
		if (max_b != -1) {
			for (int i = 0; i <= max_b; i++) {
				if (max_a != -1) {
					while (b[i] + a[max_a] > k) {
						max_a--;
						if (max_a == -1)
							break;
					}
				}

				int tmp_count = i + 1;
				if (max_a != -1)
					tmp_count += max_a + 1;

				if (count < tmp_count)
					count = tmp_count;
			}
		}
		System.out.println(count);
	}

}
