import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		long R = sc.nextLong();
		long N = R;
		if (R - L > 2018) {
			N = L + 2019;
		}
		int ans = 2018;
		for (long i = L; i <= N; i++) {
			for (long j = L; j <= N; j++) {
				long tmp = (i * j) % 2019;
				if (tmp < ans) {
					ans = (int) tmp;
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}