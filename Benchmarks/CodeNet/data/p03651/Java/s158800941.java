import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		int max = -1;
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
			max = Math.max(max, a[i]);
		}
		int gcd = max;
		for(int i = 0 ; i < n ; i++) {
			gcd = gcd(gcd, a[i]);
		}
		while(max > 0) {
			if(max == k) {
				System.out.println("POSSIBLE");
				return;
			}
			max -= gcd;
		}
		System.out.println("IMPOSSIBLE");
	}

	static int gcd(int x, int y) {
		if(x < y) {
			x ^= y;
			y ^= x;
			x ^= y;
		}
		if(x % y == 0) return y;
		else return gcd(y, x % y);
	}

}
