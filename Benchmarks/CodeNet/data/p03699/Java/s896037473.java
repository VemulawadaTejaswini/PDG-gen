import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int ans = 0;
		for(int i = 0 ; i < n ; i++) ans += a[i];
		Arrays.sort(a);
		for(int i = 0 ; i < n ; i++) {
			if(ans % 10 == 0) {
				ans -= a[i];
			} else {
				break;
			}
		}
		System.out.println(ans);
	}
}
