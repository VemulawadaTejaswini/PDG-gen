import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long x = sc.nextLong();
		long[] a = new long[N];
		for(int i = 0 ; i < N; i++) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);
		int ans = 0;
		for(int i = 0 ; i < N; i++) {
			if(x >= a[i]) {
				x = x - a[i];
				ans++;
			} else {
				break;
			}
		}
		System.out.println(ans);
	}
}