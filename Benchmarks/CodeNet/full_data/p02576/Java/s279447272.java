import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// AtCoder_A
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int X = sc.nextInt();
		int T = sc.nextInt();
		// 出力
		int times = (N-1)/ X + 1;
		System.out.println(times * T);
	    // Scannerクラスのインスタンスをクローズ
		sc.close();
	}
}
