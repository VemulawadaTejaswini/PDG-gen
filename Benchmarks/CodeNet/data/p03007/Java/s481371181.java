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
		if (n % 2 == 0) {
			int tmp = a[0];
			for (int i = 1; i < n; i++) {
				System.out.println(a[n - i] + " " + tmp);
				tmp = a[i] - tmp;
			}
		} else {
			int tmp = a[n - 1];
			for (int i = 0; i < n - 1; i++) {
				System.out.println(a[i] + " " + tmp);
				tmp = a[i] - tmp;
			}
		}
	}
}

