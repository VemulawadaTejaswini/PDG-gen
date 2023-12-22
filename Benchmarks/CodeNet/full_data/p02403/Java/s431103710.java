import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	/*Scanner = テキスト入力を扱うためのクラス
		 *キーボードからの入力を受けつける場合は
		 *System.inを使って下記のように記述
		 */
		Scanner scan = new Scanner(System.in);

		//forループ文用に変数準備
		int i;
		int j;

		/*while文で無限ループ設定
		 * if文でbreakをかける
		 * 求められている通りになったがコードが無駄に多いように思える
		 * 後程修正を行えるか試す
		 */

		while(true){
			int H = scan.nextInt();
			int W = scan.nextInt();
			if(H == 0 && W == 0)break;
			for(j = 0; j < H; j++){
				for(i = 0; i < W; i++){
					System.out.print("#");
				}
			System.out.println();
			}
			System.out.println();
		}
    }
}