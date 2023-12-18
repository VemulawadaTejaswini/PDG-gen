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
		Arrays.sort(b);
		int max = b[n - 1];
		int max2 = b[n - 2];
		int ans = max;
		for (int i = 0; i < n; ++i) {
			if (max != a[i])
				ans = max;
			else
				ans = max2;

			System.out.println(ans);
		}
	}
}
