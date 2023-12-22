

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String S = sc.next();

			if (S.equals("-")) {
				break;
			}

			int K = sc.nextInt();

			for (int i = 0; i < K; i++) {
				int M = sc.nextInt();
				//１文字目からMの手前まで
				String A = S.substring(0, M);
				//指定したところ(M)から最後まで
				String Z = S.substring(M);

				S = Z + A;
			}
			System.out.println(S);
		}

	}
}

