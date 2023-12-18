import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		// 標準入力をするための準備
		Scanner stdin = new Scanner(System.in);
		
		// A枚のクッキーが入った缶
		int A;
		// B枚のクッキーが入った缶
		int B;
		
		// ヤギの数
		int yagi = 3;
		
		// クッキー缶Aにクッキーを入れる
		A = stdin.nextInt();
		
		// クッキー缶Bにクッキーを入れる
		B = stdin.nextInt();
		
		
		
		String outputStr = "Impossible";
		
		/**
		 * クッキー缶A,Bのクッキーをyagiの数で
		 * 割り切れるかどうかの判定
		 */
		if (A % yagi == 0 || B % yagi == 0) {
			outputStr = "Possible";
		}
		
		/**
		 * クッキー缶A,Bのクッキーの数の合計が
		 * yagiの数で割り切れるかどうかの判定
		 */
		if ((A + B) % yagi == 0) {
			outputStr = "Possible";
		}
		
		System.out.println(outputStr);
	}
	
}