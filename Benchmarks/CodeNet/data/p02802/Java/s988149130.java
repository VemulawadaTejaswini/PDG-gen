import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);

		// 問題数
		int n = sc.nextInt();
		// 提出数
		int m = sc.nextInt();

		// 正当数
		int sei = 0;
		// ペナ数
		int pena = 0;

		// 正当マップ
		boolean[] bArr = new boolean[n+1];

		for (int i = 0; i < m; i++) {
			// 問題番号
			int nm = sc.nextInt();
			// WA or AC
			String kekka = sc.next();

			if ("AC".equals(kekka)) {
				if (!bArr[nm]) {
					sei++;
					bArr[nm] = true;
				}
			} else {
				if (!bArr[nm]) {
					pena++;
				}
			}
		}

		System.out.println(sei + " " + pena);

	}

}