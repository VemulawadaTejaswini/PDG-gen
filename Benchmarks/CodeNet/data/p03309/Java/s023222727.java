import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt() - i - 1;
		}
		sc.close();

		Arrays.parallelSort(a);
		int mid = a[n / 2];

		long ans = 0L;
		for (int i = 0; i < a.length; i++) {
			ans += Math.abs(a[i] - mid);
		}
		System.out.println(ans);
	}
}
