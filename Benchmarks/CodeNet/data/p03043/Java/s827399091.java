
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		double anser = 0;

		for (int i = 1; i <= N; i++) {

			// サイコロの出た目
			int a = i;
			// コインを振った回数
			int c = 0;

			// K-1点まで繰り返しコインを振る
			for (int j = 1; j <= 4; j++) {
				if (!(a >= K-1)) {
					a = a * 2;
					c++;
				}
			}


			double b = Math.pow(0.5, c);
			anser +=  b/N;

		}

		System.out.print(anser);

	}
}
