
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		int N = R;
		if (R - L > 2018) {
			N = L + 2018;
		}
		int ans = 2018;
		for (int i = L; i <= N; i++) {
			for (int j = L + 1; j <= N; j++) {
				int tmp = (i * j) % 2019;
				if (tmp < ans) {
					ans = tmp;
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}
}