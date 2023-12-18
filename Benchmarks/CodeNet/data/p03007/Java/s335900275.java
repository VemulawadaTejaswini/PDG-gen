import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		long sum = 0;
		for (int i = 0; i < n / 2; i++) {
			sum -= a[i];
		}
		for (int i = n / 2; i < n; i++) {
			sum += a[i];
		}
		System.out.println(sum);
		int now = -1;
		int start = 0;
		int end = n - 1;
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			if (now == 1) {
				ans[i] = a[start];
				start++;
			} else {
				ans[i] = a[end];
				end--;
			}
			now *= -1;
		}
		int tmp = ans[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			System.out.println(ans[i] + " " + tmp);
			tmp = ans[i] - tmp;
		}
	}
}

