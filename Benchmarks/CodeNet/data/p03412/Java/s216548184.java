
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long[] b = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextLong();
		}
		long ans = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				ans = ans ^ (a[i] + b[j]);
			}
		}
		System.out.println(ans);
	}

}
