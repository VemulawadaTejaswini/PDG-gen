import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = (int)sc.nextLong();
		long x = sc.nextLong();
		long a[] = new long[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
		}
		
		long ans = 0;
		
		for(int i = 0; i < N - 1; i++) {
			long sum = a[i] + a[i + 1];
			if(sum > x) {
				if(a[i] > x) {
					ans += a[i + 1];
					a[i + 1] = 0;
					ans += a[i] - (x - a[i + 1]);
				} else {
					ans += a[i + 1] - (x - a[i]);
					a[i + 1] = x - a[i];
				}
			}
		}
		System.out.println(ans);
	}
}
