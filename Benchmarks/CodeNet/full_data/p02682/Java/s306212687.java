
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int K = scan.nextInt();
		int ans = 0;

		int point1 = Math.min(A, K);
		int point0 = 0;
		int pointMinus1 = 0;


		if(K - point1 > 0) {
			point0 = Math.min(B, K-point1);

			if(K - point1 - point0 > 0) {
				pointMinus1 = K - point1 - point0;
			}

		}

		ans = point1 * 1 + point0 * 0 - pointMinus1 * 1;

		System.out.println(ans);
		scan.close();

	}
}
