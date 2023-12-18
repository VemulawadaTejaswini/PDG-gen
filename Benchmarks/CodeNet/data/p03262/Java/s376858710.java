import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		int[]x = new int[N + 1];
		for(int i = 0; i < N; i++) {
			x[i] = scan.nextInt();
		}
		scan.close();
		if(N == 1) {
			int ans = Math.abs(X - x[0]);
			System.out.println(ans);
			System.exit(0);
		}
		x[N] = X;
		Arrays.sort(x);
		int[] k = new int[N];
		for(int i = 0; i < N; i++) {
			k[i] = x[i + 1] - x[i];
		}
		Arrays.sort(k);
		int t = k[0];

		for(int i = 1; i < N; i++) {
			if(k[i] % t != 0) {
				System.out.println(1);
				System.exit(0);
			}
		}
		System.out.println(t);

	}
}