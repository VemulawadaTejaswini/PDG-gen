import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	/*Scanner = テキスト入力を扱うためのクラス
		 *キーボードからの入力を受けつける場合は
		 *System.inを使って下記のように記述
		 */
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		//int型の配列を作成。
		//データ型[] 変数名 = new データ型[サイズ]
		int[] a = new int[n];
		int i;

		//for文で回す。a[i]番目に入力した値を順番に入れる。
		for(i=0; i<n; i++){
			a[i] =scan.nextInt();
			//System.out.println(a[i] + "番目" + " " + a[i] +" ");
		}
		/*順番入れ替えfor文。先ほどのfor文で値がiに入ってるので
		 * こちらではiの指定を行わない。
		 * 配列はa[0]から始まってるのでi-1を行い一番後ろを取り出し表示。
		 */
		for(; i>0; i--){
			System.out.print(a[i-1]);
			if(i-1 != 0) System.out.print(" ");
			else System.out.println();

		}
    }
}