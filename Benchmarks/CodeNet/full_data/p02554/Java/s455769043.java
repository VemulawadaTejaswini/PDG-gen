import java.util.Scanner;

public class Main {
	static final long DIVISOR = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		sc.close();
		
		// 結果の出力
		long answer = (powmod(10, N) - powmod(9, N)) % DIVISOR;
		answer = (answer - powmod(9, N)) % DIVISOR;
		answer = (answer + powmod(8, N)) % DIVISOR;
		System.out.println(answer);
	}
	
	static long powmod(long x, long y) {
		long res = 1;
		for (long i = 0; i < y; i++) {
			res = res * x % DIVISOR;
		}
		return res % DIVISOR;
	}
}