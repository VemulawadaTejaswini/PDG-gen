import java.util.*;
import java.util.stream.*;

/**
 * (X,Y) の距離 |X|+|Y|
 * |X|+|Y| ＝ nK - 2m となる n, m (n=1,.. m=0,1,..) が存在すれば到達可能
 * 注意が必要なパターン
 *  K=3, |X|+|Y|=4 では n=1 とできない。
 *  n=2 とすると、m=1 として解がある。(n = (|X|+|Y|)/K ではない )
 *  n = (|X|+|Y|)/(K/2*2) とする必要がある。
 *
 * 例示方針：(X,Y) まで距離が2K以内のところに行く(X軸優先)。
 *           最後の二打で距離を調整。
 */
public class Main {
	Scanner sc;

	int X, Y, K;
	
//=============
// constructor
//
	public Main() {
		sc = new Scanner(System.in);
	}
	
//==================
// instance methods
//
	/**
	 * アルゴリズム本体
	 * 
	 * (0) 残り距離がK以下の場合特殊処理
	 * (1) X軸優先で残り距離が K より大きく 2K 以下になるようにする。
	 * (2) 残り 2 打で調整
	 */
	private void calc() {
		K = sc.nextInt();
		X = sc.nextInt();
		Y = sc.nextInt();

		int D = d(X, Y);
		if (D == K) {
			// 一発でいける特例
			out(1);
			out(X+" "+Y);
			return;
		}
		//
		if ((D%2 == 1) && (K%2==0)) { // できない場合
			out(-1);
			return;
		}

		boolean near = false; // もともと近くかつ K 未満の距離の場合、1 発目はイレギュラー
		int n = (D + (K-1)) / K; // 打数(繰り上げ)
		if (n == 1) {
			near = true;
			n++;
		}

		int m;
		boolean added = false;
		while (true) {
			m = K * n - D;
			if (m%2 == 0) break;
			n++;
			added = true;
		}
		m = m / 2; // 無駄にする量の半分
		out(n); // 確定した打数を出力

		// 2 打残して X 軸優先で近づく
		int dx = (X >= 0)?1:-1;
		int dy = (Y >= 0)?1:-1;

		// 第一象限に限定(XX, YY)がゴール
		int XX = dx * X;
		int YY = dy * Y; 

		//
		int lx = 0;
		int ly = 0;
		if (near && added) {
			lx -= K;
			out(dx*lx + " " + dy*ly);
			n--;
			m -= K;
		}

		for (int i = 0; i < n-2; i++) {
			if (XX > lx) {
				lx += K;
				if (lx > XX) {
					ly += (lx - XX);
					lx = XX;
				}
			} else {
				ly += K;
			}
			out(dx*lx + " " + dy*ly); // 象限を戻して出力
		}

		// あと 2 打でゴール
		if (lx == XX) {
			// 真下に来たパターン
			lx += m; ly += K-m;
			out( dx*lx + " " + dy*ly );
			lx -= m; ly += K-m;
			out( dx*lx + " " + dy*ly );
			return;
		} else if (ly == YY) {
			// 真左に来たパターン
			lx += K-m; ly += m;
			out( dx*lx + " " + dy*ly );
			lx += K-m; ly -= m;
			out( dx*lx + " " + dy*ly );
			return;
		} else {
			// 左下に来たパターン
			int rmove = (int)Math.min(K-m, XX - lx - m);
			lx += rmove;
			ly -= m;
			out( dx*lx + " " + dy*ly );
			out( XX + " " + YY );
		}
	}
	
	/**
	 *  マンハッタン距離
	 */
	private int d(int x, int y) {
		return d(x) + d(y);
	}
	private int d(int x) {
		return (x>=0)?x:-x;
	}

	private void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
//======
// main
//
	public static void main(String[] args) {
		Main m = new Main();
		m.calc();
	}

}