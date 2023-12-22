import java.util.Scanner;

public class Main {

	static int n;			// 探す折れ線の本数
	static int m0;		// 基準の折れ線頂点数
	static int mt;		// 対象の折れ線頂点数
	static int[][] p0;	// 基準の折れ線座標
	static int[][] pt;	// 対象の折れ線座標
	static int[] l0;		// 基準の折れ線を生成する長さ
	static int[] lt;		// 対象の降り戦を生成する長さ
	static int[] v0;	// 基準の折れ線を生成するベクトル(向きのみ)
	static int[] vt;		// 対象の折れ線を生成するベクトル(向きのみ)

	// 二頂点の座標から長さを返す
	static int length(int x1, int y1, int x2, int y2){
		if(y1==y2){
			// 上下方向の直線
			if(x1>x2){
				// 上方向
				return x1-x2;
			}
			else{
				// 下方向
				return x2-x1;
			}
		}
		else{
			if(y1>y2){
				// 左方向
				return y1-y2;
			}
			else{
				// 右方向
				return y2-y1;
			}
		}
	}

	// 二頂点の座標から向きを返す。
	static int vector(int x1, int y1, int x2, int y2){
		if(y1==y2){
			// 上下方向の直線
			if(x1>x2){
				// 上方向
				return 2;
			}
			else{
				// 下方向
				return 4;
			}
		}
		else{
			if(y1>y2){
				// 左方向
				return 1;
			}
			else{
				// 右方向
				return 3;
			}
		}
	}

	// 折れ線の頂点座標から長さと向きを計算する
	static void len_vecMake(int f){
		if(f==0){
			// フラグが0ならば基準折れ線の設定
			l0 = new int[m0-1];
			v0 = new int[m0-1];
			for(int i=0;i<m0-1;i++){
				l0[i] = length(p0[i][0],p0[i][1],p0[i+1][0],p0[i+1][1]);
				v0[i] = vector(p0[i][0],p0[i][1],p0[i+1][0],p0[i+1][1]);
			}
		}
		else{
			// フラグが0以外ならば対象折れ線の設定
			lt = new int[mt-1];
			vt = new int[mt-1];
			for(int i=0;i<mt-1;i++){
				lt[i] = length(pt[i][0],pt[i][1],pt[i+1][0],pt[i+1][1]);
				vt[i] = vector(pt[i][0],pt[i][1],pt[i+1][0],pt[i+1][1]);
			}
		}
	}

	// 基準の向きと対象の向きが一致しているか判定する
	static boolean vecMatch(){
		for(int i=0;i<m0-i;i++){
			if(v0[i]!=vt[i]){
				return false;
			}
		}
		return true;
	}

	// 時計回り90度回転させる
	static void turnVec(){
		for(int i=0;i<m0-1;i++){
			vt[i]++;
			if(vt[i]==5){
				vt[i] = 1;
			}
		}
		return;
	}

	// 順方向の向きから逆方向の向き設定する
	static void reverse(){
		// 向きを逆向きにする(2インクリメント)
		for(int i=0;i<mt-1;i++){
			vt[i]+=2;
			if(vt[i]==5){
				vt[i] = 1;
			}
			else if(vt[i]==6){
				vt[i] = 2;
			}
		}
		// 始点から終点まで入れ替える
		int[] tmp = new int[mt-1];
		for(int i=0;i<mt-1;i++){
			tmp[i] = vt[i];
		}
		for(int i=0;i<mt-1;i++){
			vt[i] = tmp[mt-2-i];
		}
	}

	// 判定メソッド
	static boolean judgeMatch(){
		// 折り曲げる回数(正式には折れ線頂点数)の不一致
		if(m0!=mt){
			return false;
		}

		// 折り曲げる個々の箇所までの長さ不一致
		boolean flag = true;		// 端点両方チェック用
		for(int i=0;i<m0-1;i++){
			if(l0[i]!=lt[i]){
				// 順方向で長さ不一致
				flag = false;
				break;
			}
		}
		if(flag){
			// 順方向での長さ一致、ベクトル(向き)の確認
			int i = 0;
			while(true){
				boolean tmp = vecMatch();
				if(tmp){
					// 答えとしての一致
					return true;
				}
				else if(i==3){		// 回転は3回試す
					break;
				}
				else{
					i++;
					turnVec();		// 回転実行
				}
			}
		}
		// 一方の端点長さで不一致(折り曲げる長さ)
		for(int i=0;i<m0-1;i++){
			if(l0[i]!=lt[m0-2-i]){
				// 逆方向長さ不一致
				return false;
			}
		}
		// 逆方向での長さ一致、ベクトル(向き)の確認
		reverse();		// 逆順に並べ替えておく(turnVecに依存の為)
		int i = 0;
		while(true){
			boolean tmp = vecMatch();
			if(tmp){
				// 答えとしての一致
				return true;
			}
			else if(i==3){		// 回転は3回試す
				return false;
			}
			else{
				i++;
				turnVec();
			}
		}
	}

	// メインメソッド
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(true){
			n = stdIn.nextInt();
			if(n==0){
				return;
			}

			// 基準0の処理
			m0 = stdIn.nextInt();
			p0 = new int[m0][2];
			for(int i=0;i<m0;i++){
				for(int j=0;j<2;j++){
					p0[i][j] = stdIn.nextInt();
				}
			}
			// 基準0の頂点から長さと向きを計算
			len_vecMake(0);

			// 対象targetの処理
			for(int i=1;i<=n;i++){
				mt = stdIn.nextInt();
				pt = new int[mt][2];
				for(int j=0;j<mt;j++){
					for(int k=0;k<2;k++){
						pt[j][k] = stdIn.nextInt();
					}
				}
				// 基準targetの頂点から長さと向きを計算
				len_vecMake(1);

				// 判定メソッド
				boolean ans = judgeMatch();
				if(ans){
					System.out.println(i);
				}
			}
			System.out.println("+++++");
		}
	}
}