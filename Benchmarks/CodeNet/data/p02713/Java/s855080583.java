import java.util.Scanner;

public class Main {
	static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	static int gcd(int a, int b, int c) {
		return gcd(a, gcd(b, c));
	}
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long r = 0;
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				for (int k=1;k<=n;k++) {
					r += gcd(i, j, k);
				}
			}
		}
		
		System.out.println(r);
	}
}
