import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int X = scan.nextInt();
		int[]x = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = scan.nextInt();
		}
		scan.close();
		if(N == 1) {
			int ans = Math.abs(X - x[0]);
			System.out.println(ans);
			System.exit(0);
		}else if(N == 2) {
			int l = Math.abs(x[0] - x[1]);
			int l1 = Math.abs(x[0] - X);
			int l2 = Math.abs(x[1] - X);
			if(l1 % l != 0 && l2 % l != 0) {
				System.out.println(1);
			}else {
				System.out.println(l);
			}
		}
		Arrays.sort(x);
		int[] k = new int[N - 1];
		for(int i = 0; i < N - 1; i++) {
			k[i] = x[i + 1] - x[i];
		}
		int g = gcd(k[0], k[1]);
		for(int i = 2; i < N - 1; i++) {
			g = gcd(g, k[i]);
		}

		int m = g;
		int []r = new int[N];
		for(int i = 0; i < N; i++) {
			r[i] = Math.abs(X - x[i]);
		}

		for(int i = 0; i < N; i++) {
			if(r[i] % m != 0) {
				System.out.println(1);
				System.exit(0);
			}
		}
		System.out.println(m);


	}
	static int gcd(int m, int n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}