import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long ans = 0;
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextLong();
			ans += a[i];
		}
		int[] cnt = {0, 0};
		int[] min = {Integer.MAX_VALUE, Integer.MAX_VALUE};
		for(int i = 0 ; i < n ; i++) {
			if(a[i] - (i + 1) > 0) {
				cnt[0]++;
				min[0] = Math.min(min[0], i + 1);
			}
			else {
				cnt[1]++;
				min[1] = Math.min(min[1], i + 1);
			}
		}
		if(cnt[0] >= cnt[1]) {
			ans -= cnt[0] * (long)n;
		} else {
			ans += cnt[1] * (long)n;
		}
		System.out.println(ans);
	}
}
