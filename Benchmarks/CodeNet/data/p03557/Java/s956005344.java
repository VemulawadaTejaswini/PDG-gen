import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			b[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			c[i] = sc.nextInt();
		}
		long ans = 0;
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		for(int i  = 0 ; i < n ; i++) {
			long cnt1 = 0;
			long cnt2 = 0;
			for(int j = 0 ; j < n ; j++) {
				if(a[j] < b[i]) {
					cnt1++;
				}
			}
			for(int j = 0 ; j < n ; j++) {
				if(b[i] < c[j]) {
					cnt2++;
				}
			}
			ans += cnt1 * cnt2;
		}
		System.out.println(ans);
	}
}
