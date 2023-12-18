import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] a = new int[n + 1];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		long ans = 0;
		for(int i = 0 ; i < n ; i++) {
			if(i == n - 1) ans += t;
			else ans += Math.min(t, a[i + 1] - a[i]);
		}
		System.out.println(ans);
	}
}