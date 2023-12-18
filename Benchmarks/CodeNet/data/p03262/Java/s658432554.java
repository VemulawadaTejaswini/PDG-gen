import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int X = sc.nextInt();
		int[] x = new int[N+1];
		x[0] = X;
		for (int i = 1; i <=N; i++) {
			x[i] = sc.nextInt();
		}
		// 最大公約数を求める
		Arrays.sort(x);
		int[] y = new int[N];
		for (int i = 0; i < N; i++) {
			y[i] = x[i+1] - x[i];
		}
		int d = y[0];
		if (y.length != 1) {
			for (int i = 1; i < y.length; i++) {
				d = gcd(d, y[i]);
			}
		}
		System.out.println(d);
	}
	private static int gcd(int m, int n) {
	    if(m < n) return gcd(n, m);
	    if(n == 0) return m;
	    return gcd(n, m % n);
	}
}