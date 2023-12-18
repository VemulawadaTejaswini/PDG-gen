import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 140_A
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
	    // Scannerクラスのインスタンスをクローズ
		sc.close();
		// 出力
		System.out.println((int) Math.pow(N,3));
	}
}
