import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[3 * n];
		for(int i = 0 ; i < 3 * n ; i++) a[i] = sc.nextInt();
		long ans = 0;
		for(int i = 0 ; i < n ; i++) {
			int[] x = new int[3];
			x[0] = a[3 * i];
			x[1] = a[3 * i + 1];
			x[2] = a[3 * i + 2];
			Arrays.sort(x);
			ans += x[1];
		}
		System.out.println(ans);
	}
}
