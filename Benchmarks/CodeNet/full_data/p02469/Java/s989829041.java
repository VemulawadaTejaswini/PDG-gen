import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[]a = new int[n];
		int p = 1;
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();

		for(int i = 0; i < n; i++) {
			p = lcm(p, a[i]);
		}
		System.out.println(p);
	}
	static int gcd(int n, int m) {
		if(n > m) {
			return gcd(m, n);
		}
		int k = m % n;
		if(k == 0) {
			return n;
		}else {
			return gcd(n, k);
		}
	}
	static int lcm(int n, int m) {
		return n * m / gcd(n, m);
	}
}
