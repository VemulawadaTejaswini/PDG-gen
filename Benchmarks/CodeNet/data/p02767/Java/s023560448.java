import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int x[] = new int[N];

		for (int i = 0; i < N; i++) {
			x[i] = scan.nextInt();
		}

		int ans = Integer.MAX_VALUE;

		for (int j = 1; j <= 100; j++) {
			
			int cost = 0;
			
			for (int i : x) {
				cost += (i - j) * (i - j);
			}
			ans = Math.min(ans, cost);
		}
		System.out.println(ans);
	}
}