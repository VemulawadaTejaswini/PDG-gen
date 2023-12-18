import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int ans = 0;

		if (K >= A) {
			ans = ans + A;
			K = K - A;
		} else {
			ans = ans + K;
			K = 0;
		}

		if (K >= B) {
			K = K - B;
		} else {
			K = 0;
		}

		ans = ans - K;

		System.out.println(ans);
	}
}
