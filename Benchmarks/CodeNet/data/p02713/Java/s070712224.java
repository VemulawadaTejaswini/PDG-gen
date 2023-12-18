import java.util.Scanner;

public class Main {

	private static int gcd(int a, int b, int c) {
		// 最小値を探す
		int min = 201;
		if(a <= b && a <= c) {
			min = a;
		}
		if(b <= a && b <= c) {
			min = b;
		}
		if(c <= a && c <= b) {
			min = c;
		}
		int gcd = 1;

		for(int i = min; i > 1; i--) {
			if(a % i == 0 && b % i == 0 && c % i == 0) {
				gcd = i;
				break;
			}
		}
		return gcd;
	}

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int k = sca.nextInt();
		long ans = 0L;
		for(int i = 1; i <= k; i++) {
			for(int j = 1; j <= k; j++) {
				for(int l = 1; l <= k; l++) {
					ans += gcd(i, j, l);
				}
			}
		}
		System.out.println(ans);

		// 後始末
		sca.close();
	}
}