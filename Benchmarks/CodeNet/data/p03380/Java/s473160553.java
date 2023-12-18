import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] x = new int[n];

		for(int i=0;i<x.length;i++) {
			x[i] = sc.nextInt();
		}

		Arrays.sort(x);

		int v = x[x.length-1];
		if(v%2==1) {
			v+=1;
		}

		System.out.println(x[x.length-1]+" "+x[getNearestValue(x, v/2)]);

	}

	// 最も近い値を格納した配列の添え字を求める
	//http://talavax.com/nearestvalue.html より拝借
		public static int getNearestValue( int[] list, int v )
		{
			// 変数の宣言
			int i;		// ループ用
			int num;	// 配列の添え字
			int minv;	// 配列値-指定値vの絶対値

			// 配列の個数が1未満の処理
			if ( 1 >list.length ) return -1;

			// 指定値と全ての配列値の差を比較
			num = 0;
			minv = Math.abs( list[ 0 ] - v );
			for ( i = 1; i < list.length; ++ i ) {
				if ( Math.abs( list[ i ] - v ) < minv ) {
					num = i;
					minv = Math.abs( list[ i ] - v );
				}
			}

			return num;
		}

}
