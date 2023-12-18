
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		// N面のサイコロ
		int N = sc.nextInt();
		
		// 点数
		int K = sc.nextInt();

		double anser = 0;

		// サイコロの目数分回す
		for (int i = 1; i <= N; i++) {

			// サイコロの目
			int a = i;
			// コインを振った回数
			int c = 0;

			// K-1点を超えるまで繰り返しコインを振る
			while(true) {
				if (!(a > K-1)) {
					a = a * 2;
					c++;
				} else {
					break;
				}
			}

			// 確率を求める式
			double b = Math.pow(0.5, c);
			anser +=  b/N;

		}

		// 出力
		System.out.print(anser);

	}
}
