import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		double ans = 0.0;
		for (int i = 1; i <= N; i++) {
			int cnt = 0;
			double p = i;
			while (p < K) {
				cnt++;
				p *= 2.0;
			}
			ans += 1.0 / N * Math.pow(0.5, cnt);
		}
		System.out.println(ans);
	}
}