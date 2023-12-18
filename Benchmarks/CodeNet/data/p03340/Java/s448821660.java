import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int l = 0, r = 0, ans = 0, sum = 0;
		while(l < n) {
			while(r < n && sum + a[r] == (sum^a[r])) {
				sum += a[r];
				r++;
			}
			ans += r - l;
			sum -= a[l];
			l++;
			if(l > r) r = l;
		}
		System.out.println(ans);
	}
}
