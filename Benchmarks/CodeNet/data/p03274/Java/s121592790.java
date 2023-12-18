import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N];
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < N - K + 1; i++) {
			int dist = Math.abs(x[i]) + Math.abs(x[i + K - 1] - x[i]);
			ans = Math.min(ans, dist);
		}

		System.out.println(ans);
	}
}