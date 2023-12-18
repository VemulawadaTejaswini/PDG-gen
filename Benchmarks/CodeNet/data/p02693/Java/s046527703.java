import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		String ans = "NG";

		if (A / K > 0 && B / K > 0) {

			int b = B / K;

			for (int i = 1; i <= b; i++) {

				int n = K * i;

				if (A <= n && n <= B) {
					ans = "OK";
					break;
				}
			}

		}

		// 出力
		System.out.println(ans);
	}
}