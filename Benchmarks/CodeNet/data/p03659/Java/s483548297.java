import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int[] sum = new int[n + 1];
		for(int i = 0 ; i < n ; i++) sum[i + 1] = sum[i] + a[i];
		System.out.println(Arrays.toString(sum));
		long ans = Long.MAX_VALUE;
		for(int i = 1 ; i < n ; i++) {
			long x = sum[i];
			ans = Math.min(ans, Math.abs(2 * x - sum[n]));
		}
		System.out.println(ans);
	}
}
