import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt() - i;
		}
		sc.close();

		Arrays.sort(a);
		int b = a[n / 2];
		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans += Math.abs(a[i] - b);
		}
		System.out.println(ans);
	}
}
