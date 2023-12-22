/**
n×m  の行列 A  と、m×1  の列ベクトルb  を読み込み、A  と b  の積を出力するプログラムを作成してください。

次のように m  個の数を縦に並べたものを m×1 の列ベクトルと呼びます。

b=? ? ? ? ? b 1 b 2 :b m  ? ? ? ? ?

次のように n  個の数を含む列ベクトルを m  個横に並べたものを n×m  の行列と呼びます。

A=? ? ? ? ? a 11 a 21 :a n1  a 12 a 22 :a n2  ......:... a 1m a 2m :a nm  ? ? ? ? ?

ベクトルまたは行列の中に含まれる数のことを要素と呼び、m×1  の列ベクトル b  の上から i  番目の要素は b i (i=1,2,...,m) 、n×m  の行列 A  には n×m  個の要素が含まれ、i  行 j  列目の要素は a ij (i=1,2,...,n,j=1,2,...,m) で示されます。

n×m の行列 A  とm×1 の列ベクトル b  の積は、n×1 の列ベクトル c  となり、c  の i  番目の要素 c i   は次の式で得られます：

 */

/*sucannerクラス使うためにインポート*/
import java.util.Scanner;

class Main {
	// プログラムのエントリポイント
	public static void main(String[] args) {
		// 入力ストリームの生成
		int i = 0;
		int j = 0;
		int k = 0;

		Scanner sc = new Scanner(System.in);
		// 縦と横の数字を受け取る
		int n = sc.nextInt();
		int m = sc.nextInt();

		// 行列AとBの配列を作る
		int[][] A = new int[n][m];
		int[] B = new int[m];
		int[] C = new int[n];

		//受け取った縦＊横の数だけ処理を繰り返す
		for ( i = 0; i < n; i++) {
			for ( j = 0; j < m; j++) {
				//数字を受け取って配列に入れる
				A[i][j] = sc.nextInt();
				//配列確認用
				//System.out.print(A[i][j]);
			}
			//System.out.println();
		}
		//受け取った縦の数だけ処理を繰り返す
		for ( k = 0; k < m; k++){
			//数字を受け取って配列にいれる
			B[k] = sc.nextInt();
			//配列確認用
			//System.out.println(B[k]);
		}
		//計算
		for ( i = 0;  i < n ; i++){
			for ( j = 0; j < m ;j++){
				C[i] += A[i][j] * B[j] ;


		}
			//縦の回数だけ配列の中身を表示
			System.out.println(C[i]);
		}
	}
}