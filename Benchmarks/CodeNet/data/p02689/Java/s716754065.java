import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		int ans = 0;
		int[] H = new int[N+1];
		int[] x = new int[N+1];
		int a = 0;
		int b = 0;
		for (int i = 1; i < N+1; i++) {
			H[i] = scan.nextInt();
		}

		for (int i = 0; i < M; i++) {
			a = scan.nextInt();
			b = scan.nextInt();

			if (H[a] <= H[b]) {
				x[a]++;
			}
			if (H[a] >= H[b]) {
				x[b]++;
			}
		}

		for (int i = 1; i < N+1; i++) {
			if (x[i] == 0) ans++;
		}

		System.out.println(ans);
	}

}