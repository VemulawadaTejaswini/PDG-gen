import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		// 結果の出力
		System.out.println((N / (A+B)) * A + Math.min(A, N % (A+B)));

		sc.close();
	}
}
