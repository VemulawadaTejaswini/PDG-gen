import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		for ( int n = 0 ; n < N ; n++ ) {
			X[n] = sc.nextInt();
		}

		int mind = Integer.MAX_VALUE;
		for ( int x = 1 ; x <= 100 ; x++ ) {
			int d = 0;
			for ( int n = 0 ; n < N ; n++ ) {
				d += (X[n] - x) * (X[n] - x);
			}
			mind = Math.min(d, mind);
		}
		System.out.println(mind);
	}
}
