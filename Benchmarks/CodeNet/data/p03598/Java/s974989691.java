import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] x = new int[n];//ボールのx座標。y座標はインデックス＋1
		for(int i=0;i<n;i++) {
			x[i]=scan.nextInt();
		}
		int kyoriSum =0;
		//nとkのうちどちらがx[i]に近いか出す
		//近いほうの距離＊2の合計が求める答え。

		for (int i=0;i<n;i++) {
			int tikai = Math.min(k-x[i], x[i]);
					kyoriSum = kyoriSum + tikai*2;
		}
		System.out.println(kyoriSum);

	}

}
