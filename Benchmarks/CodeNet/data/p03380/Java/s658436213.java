import java.util.*;

public class Main {

	public static int half(int a[], int k) {
		int l = 0, r = a.length;
		int m = (l + r) / 2;
		while (l + 1 < r) {
			m = (l + r) / 2;
			if (a[m] > k)
				r = m;
			else
				l = m;
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a[] = new int[n];
		for (int i = 0; i < n; ++i)
			a[i] = sc.nextInt();
		sc.close();
		Arrays.sort(a);
		int ans = a[n - 1];
		int tmp = half(a, ans / 2);
		int ans2 = a[tmp];
		if (tmp != 0) {
			if (a[tmp] - ((ans / 2) + ans % 2) > Math.abs(a[tmp - 1] - (ans / 2)))
				ans2 = a[tmp - 1];
		}
		if (ans2 == ans)
			ans2 = a[tmp - 1];

		System.out.println(ans + " " + ans2);
	}

}
