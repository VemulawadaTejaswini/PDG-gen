/** goto 文は、C/C++言語などで使うことのできる文で、実行されると無条件に指定されたラベルに処理が飛びます。
 * 例えば goto CHECK_NUM; という文が実行されると、プログラムの中で CHECK_NUM: と書かれた行に処理が移ります。
 * この機能を使って、繰り返し処理なども実現することができます。
 * 一方、goto 文は自由度が高すぎ、プログラムの可読性に影響するため、可能な限り使わないことが推奨されています。
 * 次のC++言語のプログラムと同じ動作をするプログラムを作成してください。ただし、goto 文は使わないで実装してみましょう。
 */

/*sucannerクラス使うためにインポート*/
import java.util.Scanner;

class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成
		Scanner sc = new Scanner(System.in);
		// 処理を繰り返す
		// 数字を受け取る
		int inti = sc.nextInt();
		int[] array;
		int i = 0;
		array = new int[inti];

		for (i = 0; i < inti; i++) {
			array[i] = sc.nextInt();
			// System.out.print(array[i]);
		}
		for (; i > 0; i--) {
			System.out.print(array[i - 1]);
			if (i - 1 != 0)
				System.out.print(" ");
		}
		System.out.println();
	}
}