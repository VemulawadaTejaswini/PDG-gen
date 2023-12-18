import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Nの入力
		long N = sc.nextLong();
		
		// 愚直に計算
		long a = 1;
		long b = N;
		
		for (long i = 1; i <= Math.sqrt(N); i++) {
			if (N % i == 0) {
				a = i;
				b = N / i;
				if ( a >= b) {
					break;
				}
			}
		}
		
		// 結果の出力
		System.out.println(a + b - 2);
		
		sc.close();
	}
}
