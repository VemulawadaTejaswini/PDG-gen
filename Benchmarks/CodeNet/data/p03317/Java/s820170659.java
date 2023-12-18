import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		int[] a = new int[N];
		int indexOf1 = 0; // あらかじめ最小値1の位置を取得しておく
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (a[i] == 1) {
				indexOf1 = i;
			}
		}
		/* ひとつの配列を揃えるためには、Nの中の連続したK個の中でも最小値が含まれているものを選んで
		 * 最初の操作の対象にすればよい。あとは場合分け。
		 * 試す。Nを(K-1)で割った結果に1を足せば答えになりそう。
		 * Aの中で重複するものは存在しないのでこれより低くはならないはず
		 * */
		// これは誤り
//		int ans = N / (K-1) + 1;
//		System.out.println(ans);
		/* WA。おそらくKに対する最小値の位置で場合分けをしなければならない。
		 * Nの最小値は常に1なので1をサーチして両端からの位置で場合分けをすればOKか。 */
		/* Nの中からKを選ぶ = Ai間の境界(N-1)個の中から(K-1)個を選ぶ？
		 * 更に分割。最小値を境に分かれる前後j,l個の境界（j+l=N-1)の中から(K-1)で割ればいい？*/
		/* 1をサーチするまでもなく入力を受け付けた時点で保存しておけばいいことに気づく
		 * j == indexOf1 なので l == N-1 - indexOf1 */
		int j = indexOf1;
		int l = N-1 - indexOf1;
		// 最小値と両端の距離がK以下だった場合は(N-1)/(K-1)を答えにすればいいのでそう場合分けする
		if (j < K-1 || l < K-1) {
			j = N - 1;
			l = 0;
		}
		int ans = j/(K-1) + l/(K-1);
		if (j%(K-1) != 0) { ans++; } // 端数が出たら切り上げる
		if (l%(K-1) != 0) { ans++; } // 同上
		System.out.println(ans);
	}
}
