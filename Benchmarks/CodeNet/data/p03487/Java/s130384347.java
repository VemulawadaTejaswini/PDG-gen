import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), a[] = new int[n];
		for (int i = 0; i < n; ++i)
			a[i] = sc.nextInt();
		int ans = 0, count = 0;
		sc.close();
		Arrays.sort(a);
		int tmp = a[0];
		for (int i = 0; i < n; ++i) {
			if (tmp == a[i])
				++count;
			else {
				if (tmp < count)
					ans += (count - tmp);
				else if (tmp > count)
					ans += count;
				tmp = a[i];
				count = 1;
			}
			if (i == n - 1) {
				if (tmp != count) {
					if (tmp > count)
						ans += count;
					else ans += (count - tmp);
				}
			}
		}
		System.out.println(ans);

	}

}
