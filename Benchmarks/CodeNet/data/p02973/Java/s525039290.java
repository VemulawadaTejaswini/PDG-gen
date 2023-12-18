import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
			b[i] = a[i];
		}
		sc.close();
		int ans = 1;
		boolean ismax = false;
		Arrays.sort(b);
		int max = b[n - 1];
		int min = b[0];
		if (min == max)
			ans = n;
		else {
			for (int i = 0; i < n; ++i) {
				if (a[i] == max) {
					if (i == 0) {
						ismax = true;
						++ans;
					} else {
						if (ismax)
							++ans;
					}
				} else {
					ismax = false;
					if (a[i] == min) {

						if (i != 0)
							++ans;
					}
				}
			}
		}
		System.out.println(ans);

	}
}
