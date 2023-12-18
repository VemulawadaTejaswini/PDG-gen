
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for(int i = 0 ; i < N ; i++) a[i] = sc.nextInt();
		long total = 0; long avg ;
		for(int i = 0 ; i < N ; i++) {
			total += a[i];
		}
		avg = total / N;
		long avg1 = avg - 1; long avg2 = avg; long avg3 = avg + 1;
		long ans = 0;
		long ans1 = 0; long ans2 = 0; long ans3 = 0;
		for(int i = 0 ; i < N ; i++) {
			if(avg1 == a[i] || avg2 == a[i] || avg3 == a[i]) ans++;
		}
		if(ans == 0) {
			System.out.println(1);
			return;
		}
		for(int i = 0 ; i < N ; i++) {
			if(a[i] - 1 == avg1) ans1++;
			if(a[i] == avg1) ans1++;
			if(a[i] + 1 == avg1) ans1++;
		}
		for(int i = 0 ; i < N ; i++) {
			if(a[i] - 1 == avg2) ans2++;
			if(a[i] == avg2) ans2++;
			if(a[i] + 1 == avg2) ans2++;
		}
		for(int i = 0 ; i < N ; i++) {
			if(a[i] - 1 == avg3) ans3++;
			if(a[i] == avg3) ans3++;
			if(a[i] + 1 == avg3) ans3++;
		}
		System.out.println(Math.max(Math.max(ans1, ans2),ans3));
	}
}