import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int max = -1;
		for(int i = 0 ; i < n ; i++) {
			max = Math.max(max, a[i]);
		}
		int gcd = 0;
		for(int i = 0 ; i < n ; i++) {
			gcd = gcd(a[i], gcd);
		}
		System.out.println(max >= k && k % gcd == 0 ? "POSSIBLE" : "IMPOSSIBLE");
	}

	static int gcd(int x, int y) {
		while(y > 0) {
			int w = x;
			x = y;
			y = w % y;
		}
		return x;
	}

}
