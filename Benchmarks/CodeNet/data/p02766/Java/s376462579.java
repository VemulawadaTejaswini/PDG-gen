import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		long N = sc.nextLong();
		int K = sc.nextInt();
		
		int digits = 0;
		while (N >= Math.pow(K, digits)) {
			digits++;
		}

		// 結果の出力
		System.out.println(digits);

		sc.close();
	}
}
